// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p.j.a;

// Referenced classes of package p.cc:
//            d, g, f, e, 
//            a, c

public class p.cc.b
{
    public static interface a
    {

        public abstract void a(e e1, p.cc.c c1);
    }

    public static interface b
    {

        public abstract void a(List list, List list1);
    }

    public static interface c
    {

        public abstract void a(p.cc.c c1);
    }

    public static interface d
    {

        public abstract void a(p.cc.c c1, e e1);
    }


    boolean a;
    boolean b;
    boolean c;
    String d;
    Context e;
    p.j.a f;
    ServiceConnection g;
    int h;
    String i;
    String j;
    d k;

    public p.cc.b(Context context, String s)
    {
        a = false;
        b = false;
        c = false;
        d = "";
        j = null;
        e = context.getApplicationContext();
        j = s;
        c("IAB helper created.");
    }

    public static String a(int l)
    {
        String as[] = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String as1[] = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (l <= -1000)
        {
            int i1 = -1000 - l;
            if (i1 >= 0 && i1 < as1.length)
            {
                return as1[i1];
            } else
            {
                return (new StringBuilder()).append(String.valueOf(l)).append(":Unknown IAB Helper Error").toString();
            }
        }
        if (l < 0 || l >= as.length)
        {
            return (new StringBuilder()).append(String.valueOf(l)).append(":Unknown").toString();
        } else
        {
            return as[l];
        }
    }

    int a(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            d("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (intent instanceof Integer)
        {
            return ((Integer)intent).intValue();
        }
        if (intent instanceof Long)
        {
            return (int)((Long)intent).longValue();
        } else
        {
            d("Unexpected type for intent response code.");
            d(intent.getClass().getName());
            throw new RuntimeException((new StringBuilder()).append("Unexpected type for intent response code: ").append(intent.getClass().getName()).toString());
        }
    }

    int a(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (bundle instanceof Integer)
        {
            return ((Integer)bundle).intValue();
        }
        if (bundle instanceof Long)
        {
            return (int)((Long)bundle).longValue();
        } else
        {
            d("Unexpected type for bundle response code.");
            d(bundle.getClass().getName());
            throw new RuntimeException((new StringBuilder()).append("Unexpected type for bundle response code: ").append(bundle.getClass().getName()).toString());
        }
    }

    int a(String s, p.cc.d d1, List list)
        throws RemoteException, JSONException
    {
        c("Querying SKU details.");
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(d1.c(s));
        if (list != null)
        {
            arraylist.addAll(list);
        }
        if (arraylist.size() == 0)
        {
            c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        list = new Bundle();
        list.putStringArrayList("ITEM_ID_LIST", arraylist);
        list = f.a(3, e.getPackageName(), s, list);
        if (!list.containsKey("DETAILS_LIST"))
        {
            int l = a(((Bundle) (list)));
            if (l != 0)
            {
                c((new StringBuilder()).append("getSkuDetails() failed: ").append(a(l)).toString());
                return l;
            } else
            {
                d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
        }
        g g1;
        for (list = list.getStringArrayList("DETAILS_LIST").iterator(); list.hasNext(); d1.a(g1))
        {
            g1 = new g(s, (String)list.next());
            c((new StringBuilder()).append("Got sku details: ").append(g1).toString());
        }

        return 0;
    }

    int a(p.cc.d d1, String s)
        throws JSONException, RemoteException
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        c((new StringBuilder()).append("Querying owned items, item type: ").append(s).toString());
        c((new StringBuilder()).append("Package name: ").append(e.getPackageName()).toString());
        obj = null;
        flag = false;
_L2:
        c((new StringBuilder()).append("Calling getPurchases with continuation token: ").append(((String) (obj))).toString());
        obj = f.a(3, e.getPackageName(), s, ((String) (obj)));
        int l = a(((Bundle) (obj)));
        c((new StringBuilder()).append("Owned items response: ").append(String.valueOf(l)).toString());
        if (l != 0)
        {
            c((new StringBuilder()).append("getPurchases() failed: ").append(a(l)).toString());
        } else
        {
            if (!((Bundle) (obj)).containsKey("INAPP_PURCHASE_ITEM_LIST") || !((Bundle) (obj)).containsKey("INAPP_PURCHASE_DATA_LIST") || !((Bundle) (obj)).containsKey("INAPP_DATA_SIGNATURE_LIST"))
            {
                d("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            }
            ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            l = 0;
            while (l < arraylist1.size()) 
            {
                String s1 = (String)arraylist1.get(l);
                Object obj1 = (String)arraylist2.get(l);
                String s2 = (String)arraylist.get(l);
                if (p.cc.f.a(j, s1, ((String) (obj1))))
                {
                    c((new StringBuilder()).append("Sku is owned: ").append(s2).toString());
                    obj1 = new e(s, s1, ((String) (obj1)));
                    if (TextUtils.isEmpty(((e) (obj1)).f()))
                    {
                        e("BUG: empty/null token!");
                        c((new StringBuilder()).append("Purchase data: ").append(s1).toString());
                    }
                    d1.a(((e) (obj1)));
                } else
                {
                    e("Purchase signature verification **FAILED**. Not adding item.");
                    c((new StringBuilder()).append("   Purchase data: ").append(s1).toString());
                    c((new StringBuilder()).append("   Signature: ").append(((String) (obj1))).toString());
                    flag = true;
                }
                l++;
            }
            obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            c((new StringBuilder()).append("Continuation token: ").append(((String) (obj))).toString());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                continue; /* Loop/switch isn't completed */
            }
            l = ((flag1) ? 1 : 0);
            if (flag)
            {
                return -1003;
            }
        }
        return l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public p.cc.d a(boolean flag, List list, List list1)
        throws p.cc.a
    {
        a("queryInventory");
        list1 = new p.cc.d();
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        c("queryInventory: mService null");
        return list1;
        int l;
        try
        {
            l = a(((p.cc.d) (list1)), "inapp");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new p.cc.a(-1001, "Remote exception while refreshing inventory.", list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new p.cc.a(-1002, "Error parsing JSON response while refreshing inventory.", list);
        }
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        throw new p.cc.a(l, "Error refreshing inventory (querying owned items).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        l = a("inapp", ((p.cc.d) (list1)), list);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        throw new p.cc.a(l, "Error refreshing inventory (querying prices of items).");
        int i1;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        i1 = a(((p.cc.d) (list1)), "subs");
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        throw new p.cc.a(i1, "Error refreshing inventory (querying owned subscriptions).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        i1 = a("subs", ((p.cc.d) (list1)), list);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        throw new p.cc.a(i1, "Error refreshing inventory (querying prices of subscriptions).");
        return list1;
    }

    public void a()
    {
        c("Disposing.");
        a = false;
        if (g != null)
        {
            c("Unbinding from service.");
            if (e != null && f != null)
            {
                e.unbindService(g);
            }
            g = null;
            f = null;
            k = null;
        }
    }

    public void a(Activity activity, String s, String s1, int l, d d1, String s2)
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        c("launchPurchaseFlow: mService null");
        activity = new p.cc.c(-1002, "mService null");
        if (d1 != null)
        {
            d1.a(activity, null);
        }
_L4:
        return;
_L2:
        a("launchPurchaseFlow");
        if (!s1.equals("subs") || b)
        {
            break; /* Loop/switch isn't completed */
        }
        activity = new p.cc.c(-1009, "Subscriptions are not available.");
        if (d1 != null)
        {
            d1.a(activity, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        b("launchPurchaseFlow");
        int i1;
        c((new StringBuilder()).append("Constructing buy intent for ").append(s).append(", item type: ").append(s1).toString());
        s2 = f.a(3, e.getPackageName(), s, s1, s2);
        i1 = a(((Bundle) (s2)));
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        d((new StringBuilder()).append("Unable to buy item, Error response: ").append(a(i1)).toString());
        activity = new p.cc.c(i1, "Unable to buy item");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        d1.a(activity, null);
        c();
        return;
        s2 = (PendingIntent)s2.getParcelable("BUY_INTENT");
        c((new StringBuilder()).append("Launching buy intent for ").append(s).append(". Request code: ").append(l).toString());
        h = l;
        k = d1;
        i = s1;
        activity.startIntentSenderForResult(s2.getIntentSender(), l, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        activity;
        d((new StringBuilder()).append("SendIntentException while launching purchase flow for sku ").append(s).toString());
        activity.printStackTrace();
        activity = new p.cc.c(-1004, "Failed to send intent.");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        d1.a(activity, null);
        c();
        return;
        activity;
        d((new StringBuilder()).append("RemoteException while launching purchase flow for sku ").append(s).toString());
        activity.printStackTrace();
        activity = new p.cc.c(-1001, "Remote exception while starting purchase flow");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        d1.a(activity, null);
        c();
        return;
        activity;
        c();
        throw activity;
    }

    void a(String s)
    {
        if (!a)
        {
            d((new StringBuilder()).append("Illegal state for operation (").append(s).append("): IAB helper is not set up.").toString());
            throw new IllegalStateException((new StringBuilder()).append("IAB helper is not set up. Can't perform operation: ").append(s).toString());
        } else
        {
            return;
        }
    }

    void a(List list, a a1, b b1)
    {
        Handler handler = new Handler();
        b("consume");
        (new Thread(new Runnable(list, a1, handler, b1) {

            final List a;
            final a b;
            final Handler c;
            final b d;
            final p.cc.b e;

            public void run()
            {
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator = a.iterator(); iterator.hasNext();)
                {
                    e e1 = (e)iterator.next();
                    try
                    {
                        e.a(e1);
                        arraylist.add(new p.cc.c(0, (new StringBuilder()).append("Successful consume of sku ").append(e1.c()).toString()));
                    }
                    catch (p.cc.a a2)
                    {
                        arraylist.add(a2.a());
                    }
                }

                e.c();
                if (b != null)
                {
                    c.post(new Runnable(this, arraylist) {

                        final List a;
                        final _cls2 b;

                        public void run()
                        {
                            b.b.a((e)b.a.get(0), (p.cc.c)a.get(0));
                        }

            
            {
                b = _pcls2;
                a = list;
                super();
            }
                    });
                }
                if (d != null)
                {
                    c.post(new Runnable(this, arraylist) {

                        final List a;
                        final _cls2 b;

                        public void run()
                        {
                            b.d.a(b.a, a);
                        }

            
            {
                b = _pcls2;
                a = list;
                super();
            }
                    });
                }
            }

            
            {
                e = p.cc.b.this;
                a = list;
                b = a1;
                c = handler;
                d = b2;
                super();
            }
        }, (new StringBuilder()).append(getClass().getSimpleName()).append("-consumeAsyncInternal").toString())).start();
    }

    public void a(c c1)
    {
        if (a)
        {
            throw new IllegalStateException("IapHelper already set up!");
        }
        c("Starting in-app billing setup.");
        g = new ServiceConnection(c1) {

            final c a;
            final p.cc.b b;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                b.c("Billing service connected.");
                b.f = p.j.a.a.a(ibinder);
                componentname = b.e.getPackageName();
                int l;
                b.c("Checking for in-app billing 3 support.");
                l = b.f.a(3, componentname, "inapp");
                if (l != 0)
                {
                    try
                    {
                        if (a != null)
                        {
                            a.a(new p.cc.c(l, "Error checking for billing v3 support."));
                        }
                        b.b = false;
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ComponentName componentname) { }
                    break MISSING_BLOCK_LABEL_233;
                }
                b.c((new StringBuilder()).append("In-app billing version 3 supported for ").append(componentname).toString());
                l = b.f.a(3, componentname, "subs");
                if (l != 0)
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                b.c("Subscriptions AVAILABLE.");
                b.b = true;
_L1:
                b.a = true;
                if (a != null)
                {
                    a.a(new p.cc.c(0, "Setup successful."));
                    return;
                }
                break MISSING_BLOCK_LABEL_265;
                b.b = false;
                b.c((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(l).toString());
                  goto _L1
                if (a != null)
                {
                    a.a(new p.cc.c(-1001, "RemoteException while setting up in-app billing."));
                }
                componentname.printStackTrace();
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                b.c("Billing service disconnected.");
                b.f = null;
            }

            
            {
                b = p.cc.b.this;
                a = c1;
                super();
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List list = e.getPackageManager().queryIntentServices(intent, 0);
        if (list != null && !list.isEmpty())
        {
            e.bindService(intent, g, 1);
        } else
        if (c1 != null)
        {
            c1.a(new p.cc.c(3, "Billing service unavailable on device."));
            return;
        }
    }

    public void a(e e1)
        throws p.cc.a
    {
        Object obj;
        String s;
        a("consume");
        if (!e1.a.equals("inapp"))
        {
            throw new p.cc.a(-1010, (new StringBuilder()).append("Items of type '").append(e1.a).append("' can't be consumed.").toString());
        }
        try
        {
            obj = e1.f();
            s = e1.c();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new p.cc.a(-1001, (new StringBuilder()).append("Remote exception while consuming. PurchaseInfo: ").append(e1).toString(), ((Exception) (obj)));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!((String) (obj)).equals(""))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        d((new StringBuilder()).append("Can't consume ").append(s).append(". No token.").toString());
        throw new p.cc.a(-1007, (new StringBuilder()).append("PurchaseInfo is missing token for sku: ").append(s).append(" ").append(e1).toString());
        int l;
        c((new StringBuilder()).append("Consuming sku: ").append(s).append(", token: ").append(((String) (obj))).toString());
        l = f.b(3, e.getPackageName(), ((String) (obj)));
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        c((new StringBuilder()).append("Successfully consumed sku: ").append(s).toString());
        return;
        c((new StringBuilder()).append("Error consuming consuming sku ").append(s).append(". ").append(a(l)).toString());
        throw new p.cc.a(l, (new StringBuilder()).append("Error consuming sku ").append(s).toString());
    }

    public void a(e e1, a a1)
    {
        a("consume");
        ArrayList arraylist = new ArrayList();
        arraylist.add(e1);
        a(((List) (arraylist)), a1, ((b) (null)));
    }

    public boolean a(int l, int i1, Intent intent)
    {
        String s;
        String s1;
        if (l != h)
        {
            return false;
        }
        a("handleActivityResult");
        c();
        if (intent == null)
        {
            d("Null data in IAB activity result.");
            intent = new p.cc.c(-1002, "Null data in IAB result");
            if (k != null)
            {
                k.a(intent, null);
            }
            return true;
        }
        l = a(intent);
        s = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i1 != -1 || l != 0) goto _L2; else goto _L1
_L1:
        c("Successful resultcode from purchase activity.");
        c((new StringBuilder()).append("Purchase data: ").append(s).toString());
        c((new StringBuilder()).append("Data signature: ").append(s1).toString());
        c((new StringBuilder()).append("Extras: ").append(intent.getExtras()).toString());
        c((new StringBuilder()).append("Expected item type: ").append(i).toString());
        if (s == null || s1 == null)
        {
            d("BUG: either purchaseData or dataSignature is null.");
            c((new StringBuilder()).append("Extras: ").append(intent.getExtras().toString()).toString());
            intent = new p.cc.c(-1008, "IAB returned null purchaseData or dataSignature");
            if (k != null)
            {
                k.a(intent, null);
            }
            return true;
        }
        String s2;
        intent = new e(i, s, s1);
        s2 = intent.c();
        if (p.cc.f.a(j, s, s1)) goto _L4; else goto _L3
_L3:
        d((new StringBuilder()).append("Purchase signature verification FAILED for sku ").append(s2).toString());
        p.cc.c c1 = new p.cc.c(-1003, (new StringBuilder()).append("Signature verification failed for sku ").append(s2).toString());
        if (k != null)
        {
            k.a(c1, intent);
        }
          goto _L5
_L4:
        try
        {
            c("Purchase signature successfully verified.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            d("Failed to parse purchase data.");
            intent.printStackTrace();
            intent = new p.cc.c(-1002, "Failed to parse purchase data.");
            if (k != null)
            {
                k.a(intent, null);
            }
            return true;
        }
        if (k != null)
        {
            k.a(new p.cc.c(0, "Success"), intent);
        }
_L6:
        return true;
_L2:
        if (i1 == -1)
        {
            c((new StringBuilder()).append("Result code was OK but in-app billing response was not OK: ").append(a(l)).toString());
            if (k != null)
            {
                intent = new p.cc.c(l, "Problem purchashing item.");
                k.a(intent, null);
            }
        } else
        if (i1 == 0)
        {
            c((new StringBuilder()).append("Purchase canceled - Response: ").append(a(l)).toString());
            if (l == 2)
            {
                intent = new p.cc.c(l, "Item unknown.");
            } else
            {
                intent = new p.cc.c(-1005, "User canceled.");
            }
            if (k != null)
            {
                k.a(intent, null);
            }
        } else
        {
            d((new StringBuilder()).append("Purchase failed. Result code: ").append(Integer.toString(i1)).append(". Response: ").append(a(l)).toString());
            intent = new p.cc.c(-1006, "Unknown purchase response.");
            if (k != null)
            {
                k.a(intent, null);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    public boolean a(String s, String s1)
    {
        Bundle bundle;
        c((new StringBuilder()).append("isSkuValid checking: ").append(s1).toString());
        if (f == null)
        {
            c("isValidSku: mService null");
            return false;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arraylist);
        Object obj;
        int l;
        obj = f.a(3, e.getPackageName(), s, bundle);
        if (((Bundle) (obj)).containsKey("DETAILS_LIST"))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        l = a(((Bundle) (obj)));
        if (l != 0)
        {
            try
            {
                c((new StringBuilder()).append("getSkuDetails() failed: ").append(a(l)).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                c((new StringBuilder()).append("getSkuDetails() failed: ").append(s.getMessage()).toString());
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                c((new StringBuilder()).append("getSkuDetails() failed: ").append(s.getMessage()).toString());
                return false;
            }
            return false;
        }
        d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
        return false;
        obj = ((Bundle) (obj)).getStringArrayList("DETAILS_LIST");
        if (((ArrayList) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        s = new g(s, (String)((ArrayList) (obj)).get(0));
        c((new StringBuilder()).append("sku valid: ").append(s.a()).toString());
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_299;
        c((new StringBuilder()).append("sku NOT valid: ").append(s1).toString());
        flag = false;
        return flag;
    }

    void b(String s)
    {
        if (c)
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't start async operation (").append(s).append(") because another async operation(").append(d).append(") is in progress.").toString());
        } else
        {
            d = s;
            c = true;
            c((new StringBuilder()).append("Starting async operation: ").append(s).toString());
            return;
        }
    }

    public boolean b()
    {
        return b;
    }

    void c()
    {
        c((new StringBuilder()).append("Ending async operation: ").append(d).toString());
        d = "";
        c = false;
    }

    void c(String s)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Helper: ").append(s).toString());
    }

    void d(String s)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Helper Error: ").append(s).toString());
    }

    void e(String s)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Helper Warning: ").append(s).toString());
    }
}
