// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

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
import android.util.Log;
import com.android.a.a.a;
import com.cardinalblue.android.piccollage.a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            h, g, f, i, 
//            c, e

public class com.cardinalblue.android.piccollage.iab.util.d
{
    public static interface a
    {

        public abstract void a(g g1, com.cardinalblue.android.piccollage.iab.util.e e1);
    }

    public static interface b
    {

        public abstract void a(List list, List list1);
    }

    public static interface c
    {

        public abstract void a(com.cardinalblue.android.piccollage.iab.util.e e1, g g1);
    }

    public static interface d
    {

        public abstract void a(com.cardinalblue.android.piccollage.iab.util.e e1);
    }

    public static interface e
    {

        public abstract void a(com.cardinalblue.android.piccollage.iab.util.e e1, com.cardinalblue.android.piccollage.iab.util.f f1);
    }


    boolean a;
    String b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    String g;
    Context h;
    com.android.a.a.a i;
    ServiceConnection j;
    int k;
    String l;
    String m;
    boolean n;
    c o;

    public com.cardinalblue.android.piccollage.iab.util.d(Context context, String s)
    {
        a = false;
        b = "IabHelper";
        c = false;
        d = false;
        e = false;
        f = false;
        g = "";
        k = -1;
        m = null;
        n = false;
        h = context.getApplicationContext();
        m = s;
        c("IAB helper created.");
    }

    public static String a(int i1)
    {
        String as[] = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String as1[] = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i1 <= -1000)
        {
            int j1 = -1000 - i1;
            if (j1 >= 0 && j1 < as1.length)
            {
                return as1[j1];
            } else
            {
                return (new StringBuilder()).append(String.valueOf(i1)).append(":Unknown IAB Helper Error").toString();
            }
        }
        if (i1 < 0 || i1 >= as.length)
        {
            return (new StringBuilder()).append(String.valueOf(i1)).append(":Unknown").toString();
        } else
        {
            return as[i1];
        }
    }

    private void d()
    {
        if (d)
        {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        } else
        {
            return;
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

    int a(com.cardinalblue.android.piccollage.iab.util.f f1, String s)
        throws JSONException, RemoteException
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        c((new StringBuilder()).append("Querying owned items, item type: ").append(s).toString());
        c((new StringBuilder()).append("Package name: ").append(h.getPackageName()).toString());
        obj = null;
        flag = false;
_L2:
        c((new StringBuilder()).append("Calling getPurchases with continuation token: ").append(((String) (obj))).toString());
        obj = i.a(3, h.getPackageName(), s, ((String) (obj)));
        int i1 = a(((Bundle) (obj)));
        c((new StringBuilder()).append("Owned items response: ").append(String.valueOf(i1)).toString());
        if (i1 != 0)
        {
            c((new StringBuilder()).append("getPurchases() failed: ").append(a(i1)).toString());
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
            i1 = 0;
            while (i1 < arraylist1.size()) 
            {
                String s1 = (String)arraylist1.get(i1);
                Object obj1 = (String)arraylist2.get(i1);
                String s2 = (String)arraylist.get(i1);
                if (com.cardinalblue.android.piccollage.iab.util.h.a(m, s1, ((String) (obj1))))
                {
                    c((new StringBuilder()).append("Sku is owned: ").append(s2).toString());
                    obj1 = new g(s, s1, ((String) (obj1)));
                    if (TextUtils.isEmpty(((g) (obj1)).e()))
                    {
                        e("BUG: empty/null token!");
                        c((new StringBuilder()).append("Purchase data: ").append(s1).toString());
                    }
                    f1.a(((g) (obj1)));
                } else
                {
                    e("Purchase signature verification **FAILED**. Not adding item.");
                    c((new StringBuilder()).append("   Purchase data: ").append(s1).toString());
                    c((new StringBuilder()).append("   Signature: ").append(((String) (obj1))).toString());
                    flag = true;
                }
                i1++;
            }
            obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            c((new StringBuilder()).append("Continuation token: ").append(((String) (obj))).toString());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                continue; /* Loop/switch isn't completed */
            }
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                return -1003;
            }
        }
        return i1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    int a(String s, com.cardinalblue.android.piccollage.iab.util.f f1, List list)
        throws RemoteException, JSONException
    {
        c("Querying SKU details.");
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(f1.b(s));
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                String s1 = (String)list.next();
                if (!arraylist.contains(s1))
                {
                    arraylist.add(s1);
                }
            } while (true);
        }
        if (arraylist.size() == 0)
        {
            c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        list = new Bundle();
        list.putStringArrayList("ITEM_ID_LIST", arraylist);
        list = i.a(3, h.getPackageName(), s, list);
        if (!list.containsKey("DETAILS_LIST"))
        {
            int j1 = a(((Bundle) (list)));
            if (j1 != 0)
            {
                c((new StringBuilder()).append("getSkuDetails() failed: ").append(a(j1)).toString());
                return j1;
            } else
            {
                d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
        }
        i i1;
        for (list = list.getStringArrayList("DETAILS_LIST").iterator(); list.hasNext(); f1.a(i1))
        {
            i1 = new i(s, (String)list.next());
            c((new StringBuilder()).append("Got sku details: ").append(i1).toString());
        }

        return 0;
    }

    public com.cardinalblue.android.piccollage.iab.util.f a(boolean flag, List list)
        throws com.cardinalblue.android.piccollage.iab.util.c
    {
        return a(flag, list, ((List) (null)));
    }

    public com.cardinalblue.android.piccollage.iab.util.f a(boolean flag, List list, List list1)
        throws com.cardinalblue.android.piccollage.iab.util.c
    {
        d();
        a("queryInventory");
        int i1;
        try
        {
            list1 = new com.cardinalblue.android.piccollage.iab.util.f();
            i1 = a(((com.cardinalblue.android.piccollage.iab.util.f) (list1)), "inapp");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new com.cardinalblue.android.piccollage.iab.util.c(-1001, "Remote exception while refreshing inventory.", list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new com.cardinalblue.android.piccollage.iab.util.c(-1002, "Error parsing JSON response while refreshing inventory.", list);
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new com.cardinalblue.android.piccollage.iab.util.c(i1, "Error refreshing inventory (querying owned items).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        i1 = a("inapp", ((com.cardinalblue.android.piccollage.iab.util.f) (list1)), list);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        throw new com.cardinalblue.android.piccollage.iab.util.c(i1, "Error refreshing inventory (querying prices of items).");
        int j1;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        j1 = a(((com.cardinalblue.android.piccollage.iab.util.f) (list1)), "subs");
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        throw new com.cardinalblue.android.piccollage.iab.util.c(j1, "Error refreshing inventory (querying owned subscriptions).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        j1 = a("subs", ((com.cardinalblue.android.piccollage.iab.util.f) (list1)), list);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        throw new com.cardinalblue.android.piccollage.iab.util.c(j1, "Error refreshing inventory (querying prices of subscriptions).");
        return list1;
    }

    public void a()
    {
        c("Disposing.");
        c = false;
        if (n && j != null)
        {
            c("Unbinding from service.");
            if (h != null)
            {
                h.unbindService(j);
            }
        }
        d = true;
        h = null;
        j = null;
        i = null;
        o = null;
    }

    public void a(Activity activity, String s, int i1, c c1)
    {
        a(activity, s, i1, c1, "");
    }

    public void a(Activity activity, String s, int i1, c c1, String s1)
    {
        a(activity, s, "inapp", i1, c1, s1);
    }

    public void a(Activity activity, String s, String s1, int i1, c c1, String s2)
    {
        d();
        a("launchPurchaseFlow");
        b("launchPurchaseFlow");
        if (!s1.equals("subs") || e) goto _L2; else goto _L1
_L1:
        activity = new com.cardinalblue.android.piccollage.iab.util.e(-1009, "Subscriptions are not available.");
        b();
        if (c1 != null)
        {
            c1.a(activity, null);
        }
_L4:
        return;
_L2:
        if (h == null || i == null)
        {
            activity = new com.cardinalblue.android.piccollage.iab.util.e(-1000, (new StringBuilder()).append("IabHelper.launchPurchaseFlow failed cause : mContext=").append(h).append(", mService=").append(i).toString());
            com.cardinalblue.android.piccollage.a.f.a(new com.cardinalblue.android.piccollage.iab.util.c(activity));
            if (c1 != null)
            {
                c1.a(activity, null);
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        int j1;
        c((new StringBuilder()).append("Constructing buy intent for ").append(s).append(", item type: ").append(s1).toString());
        s2 = i.a(3, h.getPackageName(), s, s1, s2);
        j1 = a(((Bundle) (s2)));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        d((new StringBuilder()).append("Unable to buy item, Error response: ").append(a(j1)).toString());
        b();
        activity = new com.cardinalblue.android.piccollage.iab.util.e(j1, "Unable to buy item");
        if (c1 != null)
        {
            try
            {
                c1.a(activity, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                d((new StringBuilder()).append("SendIntentException while launching purchase flow for sku ").append(s).toString());
                activity.printStackTrace();
                b();
                activity = new com.cardinalblue.android.piccollage.iab.util.e(-1004, "Failed to send intent.");
                if (c1 != null)
                {
                    c1.a(activity, null);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                d((new StringBuilder()).append("RemoteException while launching purchase flow for sku ").append(s).toString());
                activity.printStackTrace();
                b();
                activity = new com.cardinalblue.android.piccollage.iab.util.e(-1001, "Remote exception while starting purchase flow");
                if (c1 != null)
                {
                    c1.a(activity, null);
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        s2 = (PendingIntent)s2.getParcelable("BUY_INTENT");
        c((new StringBuilder()).append("Launching buy intent for ").append(s).append(". Request code: ").append(i1).toString());
        k = i1;
        o = c1;
        l = s1;
        activity.startIntentSenderForResult(s2.getIntentSender(), i1, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(d d1)
    {
        d();
        if (c)
        {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        c("Starting in-app billing setup.");
        j = new ServiceConnection(d1) {

            final d a;
            final com.cardinalblue.android.piccollage.iab.util.d b;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                if (!b.d) goto _L2; else goto _L1
_L1:
                return;
_L2:
                b.c("Billing service connected.");
                b.i = com.android.a.a.a.a.a(ibinder);
                componentname = b.h.getPackageName();
                b.n = true;
                int i1;
                b.c("Checking for in-app billing 3 support.");
                i1 = b.i.a(3, componentname, "inapp");
                if (i1 != 0)
                {
                    try
                    {
                        if (a != null)
                        {
                            a.a(new com.cardinalblue.android.piccollage.iab.util.e(i1, "Error checking for billing v3 support."));
                        }
                        b.e = false;
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ComponentName componentname) { }
                    if (a != null)
                    {
                        a.a(new com.cardinalblue.android.piccollage.iab.util.e(-1001, "RemoteException while setting up in-app billing."));
                    }
                    componentname.printStackTrace();
                    return;
                }
                b.c((new StringBuilder()).append("In-app billing version 3 supported for ").append(componentname).toString());
                i1 = b.i.a(3, componentname, "subs");
                if (i1 != 0)
                {
                    break MISSING_BLOCK_LABEL_248;
                }
                b.c("Subscriptions AVAILABLE.");
                b.e = true;
_L4:
                b.c = true;
                if (a == null) goto _L1; else goto _L3
_L3:
                a.a(new com.cardinalblue.android.piccollage.iab.util.e(0, "Setup successful."));
                return;
                b.c((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(i1).toString());
                  goto _L4
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                b.c("Billing service disconnected.");
                b.i = null;
                b.n = false;
            }

            
            {
                b = com.cardinalblue.android.piccollage.iab.util.d.this;
                a = d2;
                super();
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List list = h.getPackageManager().queryIntentServices(intent, 0);
        if (list != null && !list.isEmpty())
        {
            h.bindService(intent, j, 1);
        } else
        if (d1 != null)
        {
            d1.a(new com.cardinalblue.android.piccollage.iab.util.e(3, "Billing service unavailable on device."));
            return;
        }
    }

    public void a(e e1)
    {
        a(true, ((List) (null)), e1);
    }

    void a(g g1)
        throws com.cardinalblue.android.piccollage.iab.util.c
    {
        Object obj;
        String s;
        d();
        a("consume");
        if (!g1.a.equals("inapp"))
        {
            throw new com.cardinalblue.android.piccollage.iab.util.c(-1010, (new StringBuilder()).append("Items of type '").append(g1.a).append("' can't be consumed.").toString());
        }
        try
        {
            obj = g1.e();
            s = g1.d();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.cardinalblue.android.piccollage.iab.util.c(-1001, (new StringBuilder()).append("Remote exception while consuming. PurchaseInfo: ").append(g1).toString(), ((Exception) (obj)));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!((String) (obj)).equals(""))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        d((new StringBuilder()).append("Can't consume ").append(s).append(". No token.").toString());
        throw new com.cardinalblue.android.piccollage.iab.util.c(-1007, (new StringBuilder()).append("PurchaseInfo is missing token for sku: ").append(s).append(" ").append(g1).toString());
        int i1;
        c((new StringBuilder()).append("Consuming sku: ").append(s).append(", token: ").append(((String) (obj))).toString());
        i1 = i.b(3, h.getPackageName(), ((String) (obj)));
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        c((new StringBuilder()).append("Successfully consumed sku: ").append(s).toString());
        return;
        c((new StringBuilder()).append("Error consuming consuming sku ").append(s).append(". ").append(a(i1)).toString());
        throw new com.cardinalblue.android.piccollage.iab.util.c(i1, (new StringBuilder()).append("Error consuming sku ").append(s).toString());
    }

    public void a(g g1, a a1)
    {
        d();
        a("consume");
        ArrayList arraylist = new ArrayList();
        arraylist.add(g1);
        a(((List) (arraylist)), a1, ((b) (null)));
    }

    void a(String s)
    {
        if (!c)
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
        (new Thread(new IabHelper._cls3(list, a1, handler, b1))).start();
    }

    public void a(List list, b b1)
    {
        d();
        a("consume");
        a(list, ((a) (null)), b1);
    }

    public void a(boolean flag)
    {
        d();
        a = flag;
    }

    public void a(boolean flag, e e1)
    {
        a(flag, ((List) (null)), e1);
    }

    public void a(boolean flag, List list, e e1)
    {
        Handler handler = new Handler();
        d();
        a("queryInventory");
        b("refresh inventory");
        (new Thread(new IabHelper._cls2(flag, list, e1, handler))).start();
    }

    public boolean a(int i1, int j1, Intent intent)
    {
        String s;
        String s1;
        if (i1 != k)
        {
            return false;
        }
        d();
        a("handleActivityResult");
        b();
        if (intent == null)
        {
            d("Null data in IAB activity result.");
            intent = new com.cardinalblue.android.piccollage.iab.util.e(-1002, "Null data in IAB result");
            if (o != null)
            {
                o.a(intent, null);
            }
            return true;
        }
        i1 = a(intent);
        s = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (j1 != -1 || i1 != 0) goto _L2; else goto _L1
_L1:
        c("Successful resultcode from purchase activity.");
        c((new StringBuilder()).append("Purchase data: ").append(s).toString());
        c((new StringBuilder()).append("Data signature: ").append(s1).toString());
        c((new StringBuilder()).append("Extras: ").append(intent.getExtras()).toString());
        c((new StringBuilder()).append("Expected item type: ").append(l).toString());
        if (s == null || s1 == null)
        {
            d("BUG: either purchaseData or dataSignature is null.");
            c((new StringBuilder()).append("Extras: ").append(intent.getExtras().toString()).toString());
            intent = new com.cardinalblue.android.piccollage.iab.util.e(-1008, "IAB returned null purchaseData or dataSignature");
            if (o != null)
            {
                o.a(intent, null);
            }
            return true;
        }
        String s2;
        intent = new g(l, s, s1);
        s2 = intent.d();
        if (com.cardinalblue.android.piccollage.iab.util.h.a(m, s, s1)) goto _L4; else goto _L3
_L3:
        d((new StringBuilder()).append("Purchase signature verification FAILED for sku ").append(s2).toString());
        com.cardinalblue.android.piccollage.iab.util.e e1 = new com.cardinalblue.android.piccollage.iab.util.e(-1003, (new StringBuilder()).append("Signature verification failed for sku ").append(s2).toString());
        if (o != null)
        {
            o.a(e1, intent);
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
            intent = new com.cardinalblue.android.piccollage.iab.util.e(-1002, "Failed to parse purchase data.");
            if (o != null)
            {
                o.a(intent, null);
            }
            return true;
        }
        if (o != null)
        {
            o.a(new com.cardinalblue.android.piccollage.iab.util.e(0, "Success"), intent);
        }
_L6:
        return true;
_L2:
        if (j1 == -1)
        {
            c((new StringBuilder()).append("Result code was OK but in-app billing response was not OK: ").append(a(i1)).toString());
            if (o != null)
            {
                intent = new com.cardinalblue.android.piccollage.iab.util.e(i1, "Problem purchashing item.");
                o.a(intent, null);
            }
        } else
        if (j1 == 0)
        {
            c((new StringBuilder()).append("Purchase canceled - Response: ").append(a(i1)).toString());
            intent = new com.cardinalblue.android.piccollage.iab.util.e(i1, "User canceled.");
            if (o != null)
            {
                o.a(intent, null);
            }
        } else
        {
            d((new StringBuilder()).append("Purchase failed. Result code: ").append(Integer.toString(j1)).append(". Response: ").append(a(i1)).toString());
            intent = new com.cardinalblue.android.piccollage.iab.util.e(-1006, "Unknown purchase response.");
            if (o != null)
            {
                o.a(intent, null);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    void b()
    {
        c((new StringBuilder()).append("Ending async operation: ").append(g).toString());
        g = "";
        f = false;
    }

    void b(String s)
    {
        if (f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't start async operation (").append(s).append(") because another async operation(").append(g).append(") is in progress.").toString());
        } else
        {
            g = s;
            f = true;
            c((new StringBuilder()).append("Starting async operation: ").append(s).toString());
            return;
        }
    }

    void c(String s)
    {
        if (a)
        {
            Log.d(b, s);
        }
    }

    public boolean c()
    {
        return c;
    }

    void d(String s)
    {
        Log.e(b, (new StringBuilder()).append("In-app billing error: ").append(s).toString());
    }

    void e(String s)
    {
        Log.w(b, (new StringBuilder()).append("In-app billing warning: ").append(s).toString());
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$2

/* anonymous class */
    class IabHelper._cls2
        implements Runnable
    {

        final boolean a;
        final List b;
        final e c;
        final Handler d;
        final com.cardinalblue.android.piccollage.iab.util.d e;

        public void run()
        {
            com.cardinalblue.android.piccollage.iab.util.f f1;
            com.cardinalblue.android.piccollage.iab.util.e e1;
            e1 = new com.cardinalblue.android.piccollage.iab.util.e(0, "Inventory refresh successful.");
            f1 = null;
            com.cardinalblue.android.piccollage.iab.util.f f2 = e.a(a, b);
            f1 = f2;
_L2:
            e.b();
            if (!e.d && c != null)
            {
                d.post(new IabHelper._cls2._cls1(this, e1, f1));
            }
            return;
            com.cardinalblue.android.piccollage.iab.util.c c1;
            c1;
            c1 = c1.a();
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                e = com.cardinalblue.android.piccollage.iab.util.d.this;
                a = flag;
                b = list;
                c = e1;
                d = handler;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$2$1

/* anonymous class */
    class IabHelper._cls2._cls1
        implements Runnable
    {

        final com.cardinalblue.android.piccollage.iab.util.e a;
        final com.cardinalblue.android.piccollage.iab.util.f b;
        final IabHelper._cls2 c;

        public void run()
        {
            c.c.a(a, b);
        }

            
            {
                c = _pcls2;
                a = e1;
                b = f1;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$3

/* anonymous class */
    class IabHelper._cls3
        implements Runnable
    {

        final List a;
        final a b;
        final Handler c;
        final b d;
        final com.cardinalblue.android.piccollage.iab.util.d e;

        public void run()
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                g g1 = (g)iterator.next();
                try
                {
                    e.a(g1);
                    arraylist.add(new com.cardinalblue.android.piccollage.iab.util.e(0, (new StringBuilder()).append("Successful consume of sku ").append(g1.d()).toString()));
                }
                catch (com.cardinalblue.android.piccollage.iab.util.c c1)
                {
                    arraylist.add(c1.a());
                }
            }

            e.b();
            if (!e.d && b != null)
            {
                c.post(new IabHelper._cls3._cls1(this, arraylist));
            }
            if (!e.d && d != null)
            {
                c.post(new IabHelper._cls3._cls2(this, arraylist));
            }
        }

            
            {
                e = com.cardinalblue.android.piccollage.iab.util.d.this;
                a = list;
                b = a1;
                c = handler;
                d = b1;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$3$1

/* anonymous class */
    class IabHelper._cls3._cls1
        implements Runnable
    {

        final List a;
        final IabHelper._cls3 b;

        public void run()
        {
            b.b.a((g)b.a.get(0), (com.cardinalblue.android.piccollage.iab.util.e)a.get(0));
        }

            
            {
                b = _pcls3;
                a = list;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$3$2

/* anonymous class */
    class IabHelper._cls3._cls2
        implements Runnable
    {

        final List a;
        final IabHelper._cls3 b;

        public void run()
        {
            b.d.a(b.a, a);
        }

            
            {
                b = _pcls3;
                a = list;
                super();
            }
    }

}
