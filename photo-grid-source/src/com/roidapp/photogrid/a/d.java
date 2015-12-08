// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.a.d.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.roidapp.photogrid.a:
//            p, o, n, q, 
//            c, l, i, e, 
//            j, g, k

public final class d
{

    boolean a;
    String b;
    boolean c;
    boolean d;
    boolean e;
    String f;
    Context g;
    a h;
    ServiceConnection i;
    int j;
    String k;
    String l;
    i m;

    public d(Context context, String s)
    {
        a = false;
        b = "IabHelper";
        c = false;
        d = false;
        e = false;
        f = "";
        l = null;
        g = context.getApplicationContext();
        l = s;
        a("IAB helper created.");
    }

    private int a(Bundle bundle)
    {
        if (bundle == null)
        {
            return -1;
        }
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            a("Bundle with null response code, assuming OK (known issue)");
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
            throw new RuntimeException((new StringBuilder("Unexpected type for bundle response code: ")).append(bundle.getClass().getName()).toString());
        }
    }

    private int a(n n1, String s)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        a((new StringBuilder("Querying owned items, item type: ")).append(s).toString());
        a((new StringBuilder("Package name: ")).append(g.getPackageName()).toString());
        obj = null;
        flag = false;
_L2:
        a((new StringBuilder("Calling getPurchases with continuation token: ")).append(((String) (obj))).toString());
        int i1;
        if (h == null)
        {
            i1 = -1008;
        } else
        {
            obj = h.a(3, g.getPackageName(), s, ((String) (obj)));
            i1 = a(((Bundle) (obj)));
            a((new StringBuilder("Owned items response: ")).append(String.valueOf(i1)).toString());
            if (i1 != 0)
            {
                a((new StringBuilder("getPurchases() failed: ")).append(a(i1)).toString());
                return i1;
            }
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
                if (com.roidapp.photogrid.a.p.a(l, s1, ((String) (obj1))))
                {
                    a((new StringBuilder("Sku is owned: ")).append(s2).toString());
                    obj1 = new o(s, s1, ((String) (obj1)));
                    if (TextUtils.isEmpty(((o) (obj1)).h))
                    {
                        e("BUG: empty/null token!");
                        a((new StringBuilder("Purchase data: ")).append(s1).toString());
                    }
                    n1.b.put(((o) (obj1)).d, obj1);
                } else
                {
                    e("Purchase signature verification **FAILED**. Not adding item.");
                    a((new StringBuilder("   Purchase data: ")).append(s1).toString());
                    a((new StringBuilder("   Signature: ")).append(((String) (obj1))).toString());
                    flag = true;
                }
                i1++;
            }
            obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            a((new StringBuilder("Continuation token: ")).append(((String) (obj))).toString());
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

    private int a(String s, n n1, List list)
    {
        a("Querying SKU details.");
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(n1.b(s));
        if (list != null)
        {
            arraylist.addAll(list);
        }
        if (arraylist.size() == 0)
        {
            a("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        list = new Bundle();
        list.putStringArrayList("ITEM_ID_LIST", arraylist);
        list = h.a(3, g.getPackageName(), s, list);
        if (!list.containsKey("DETAILS_LIST"))
        {
            int i1 = a(((Bundle) (list)));
            if (i1 != 0)
            {
                a((new StringBuilder("getSkuDetails() failed: ")).append(a(i1)).toString());
                return i1;
            } else
            {
                d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
        }
        q q1;
        for (list = list.getStringArrayList("DETAILS_LIST").iterator(); list.hasNext(); n1.a.put(q1.b, q1))
        {
            q1 = new q(s, (String)list.next());
            a((new StringBuilder("Got sku details: ")).append(q1).toString());
        }

        return 0;
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

    private void b(String s)
    {
        if (!c)
        {
            d((new StringBuilder("Illegal state for operation (")).append(s).append("): IAB helper is not set up.").toString());
            throw new IllegalStateException((new StringBuilder("IAB helper is not set up. Can't perform operation: ")).append(s).toString());
        } else
        {
            return;
        }
    }

    private void c(String s)
    {
        if (e)
        {
            throw new IllegalStateException((new StringBuilder("Can't start async operation (")).append(s).append(") because another async operation(").append(f).append(") is in progress.").toString());
        } else
        {
            f = s;
            e = true;
            a((new StringBuilder("Starting async operation: ")).append(s).toString());
            return;
        }
    }

    private void d(String s)
    {
        Log.e(b, (new StringBuilder("In-app billing error: ")).append(s).toString());
    }

    private void e(String s)
    {
        Log.w(b, (new StringBuilder("In-app billing warning: ")).append(s).toString());
    }

    public final n a(boolean flag, List list)
    {
        n n1;
        int i1;
        b("queryInventory");
        n1 = new n();
        i1 = a(n1, "inapp");
        if (i1 != 0)
        {
            try
            {
                throw new c(i1, "Error refreshing inventory (querying owned items).");
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
                throw new c(-1001, "Remote exception while refreshing inventory.", list);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
                throw new c(-1002, "Error parsing JSON response while refreshing inventory.", list);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_156;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        i1 = a("inapp", n1, list);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        throw new c(i1, "Error refreshing inventory (querying prices of items).");
        if (!d)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        i1 = a(n1, "subs");
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        throw new c(i1, "Error refreshing inventory (querying owned subscriptions).");
        throw new c(-1008, "Error refreshing inventory (querying prices of subscriptions).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        i1 = a("subs", n1, list);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        throw new c(i1, "Error refreshing inventory (querying prices of subscriptions).");
        return n1;
    }

    public final void a()
    {
        a("Disposing.");
        c = false;
        if (i != null)
        {
            a("Unbinding from service.");
            if (g != null)
            {
                try
                {
                    g.unbindService(i);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    illegalargumentexception.printStackTrace();
                }
            }
            i = null;
            h = null;
            m = null;
        }
    }

    public final void a(Activity activity, String s, String s1, int i1, i j1, String s2)
    {
        if (!c)
        {
            d("Illegal state for operation (launchPurchaseFlow): IAB helper is not set up.");
            j1.a(new l(-1001, "IAB helper is not set up."), null);
            return;
        }
        try
        {
            c("launchPurchaseFlow");
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            return;
        }
        if (s1.equals("subs") && !d)
        {
            j1.a(new l(-1009, "Subscriptions are not available."), null);
            return;
        }
        int k1;
        a((new StringBuilder("Constructing buy intent for ")).append(s).append(", item type: ").append(s1).toString());
        s2 = h.a(3, g.getPackageName(), s, s1, s2);
        k1 = a(((Bundle) (s2)));
        if (k1 != 0)
        {
            try
            {
                d((new StringBuilder("Unable to buy item, Error response: ")).append(a(k1)).toString());
                j1.a(new l(k1, "Unable to buy item"), null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                d((new StringBuilder("SendIntentException while launching purchase flow for sku ")).append(s).toString());
                activity.printStackTrace();
                j1.a(new l(-1004, "Failed to send intent."), null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                d((new StringBuilder("RemoteException while launching purchase flow for sku ")).append(s).toString());
            }
            break MISSING_BLOCK_LABEL_373;
        }
        s2 = (PendingIntent)s2.getParcelable("BUY_INTENT");
        a((new StringBuilder("Launching buy intent for ")).append(s).append(". Request code: ").append(i1).toString());
        j = i1;
        m = j1;
        k = s1;
        activity.startIntentSenderForResult(s2.getIntentSender(), i1, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        activity.printStackTrace();
        j1.a(new l(-1001, "Remote exception while starting purchase flow"), null);
        return;
    }

    public final void a(j j1)
    {
        if (c)
        {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        a("Starting in-app billing setup.");
        i = new e(this, j1);
        Intent intent = new Intent();
        intent.setAction("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        Object obj = null;
        List list = obj;
        if (g != null)
        {
            list = obj;
            if (g.getPackageManager() != null)
            {
                list = g.getPackageManager().queryIntentServices(intent, 0);
            }
        }
        if (list != null && !list.isEmpty())
        {
            g.bindService(intent, i, 1);
            return;
        } else
        {
            j1.a(new l(3, "Billing service unavailable on device."));
            return;
        }
    }

    public final void a(k k1)
    {
        Handler handler = new Handler();
        b("queryInventory");
        c("refresh inventory");
        (new Thread(new g(this, handler, k1))).start();
    }

    final void a(String s)
    {
        if (a)
        {
            Log.e(b, s);
        }
    }

    public final boolean a(int i1, int j1, Intent intent)
    {
        Object obj;
        String s;
        if (i1 != j)
        {
            return false;
        }
        b("handleActivityResult");
        b();
        if (intent == null)
        {
            d("Null data in IAB activity result.");
            intent = new l(-1002, "Null data in IAB result");
            if (m != null)
            {
                m.a(intent, null);
            }
            return true;
        }
        obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null)
        {
            d("Intent with no response code, assuming OK (known issue)");
            i1 = 0;
        } else
        if (obj instanceof Integer)
        {
            i1 = ((Integer)obj).intValue();
        } else
        if (obj instanceof Long)
        {
            i1 = (int)((Long)obj).longValue();
        } else
        {
            d("Unexpected type for intent response code.");
            d(obj.getClass().getName());
            throw new RuntimeException((new StringBuilder("Unexpected type for intent response code: ")).append(obj.getClass().getName()).toString());
        }
        obj = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (j1 != -1 || i1 != 0) goto _L2; else goto _L1
_L1:
        a("Successful resultcode from purchase activity.");
        a((new StringBuilder("Purchase data: ")).append(((String) (obj))).toString());
        a((new StringBuilder("Data signature: ")).append(s).toString());
        a((new StringBuilder("Extras: ")).append(intent.getExtras()).toString());
        a((new StringBuilder("Expected item type: ")).append(k).toString());
        if (obj == null || s == null)
        {
            d("BUG: either purchaseData or dataSignature is null.");
            a((new StringBuilder("Extras: ")).append(intent.getExtras().toString()).toString());
            intent = new l(-1008, "IAB returned null purchaseData or dataSignature");
            if (m != null)
            {
                m.a(intent, null);
            }
            return true;
        }
        String s1;
        intent = new o(k, ((String) (obj)), s);
        s1 = ((o) (intent)).d;
        if (com.roidapp.photogrid.a.p.a(l, ((String) (obj)), s)) goto _L4; else goto _L3
_L3:
        d((new StringBuilder("Purchase signature verification FAILED for sku ")).append(s1).toString());
        l l1 = new l(-1003, (new StringBuilder("Signature verification failed for sku ")).append(s1).toString());
        if (m != null)
        {
            m.a(l1, intent);
        }
          goto _L5
_L4:
        try
        {
            a("Purchase signature successfully verified.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            d("Failed to parse purchase data.");
            intent.printStackTrace();
            intent = new l(-1002, "Failed to parse purchase data.");
            if (m != null)
            {
                m.a(intent, null);
            }
            return true;
        }
        if (m != null)
        {
            m.a(new l(0, "Success"), intent);
        }
_L6:
        return true;
_L2:
        if (j1 == -1)
        {
            a((new StringBuilder("Result code was OK but in-app billing response was not OK: ")).append(a(i1)).toString());
            if (m != null)
            {
                intent = new l(i1, "Problem purchashing item.");
                m.a(intent, null);
            }
        } else
        if (j1 == 0)
        {
            a((new StringBuilder("Purchase canceled - Response: ")).append(a(i1)).toString());
            intent = new l(-1005, "User canceled.");
            if (m != null)
            {
                m.a(intent, null);
            }
        } else
        {
            d((new StringBuilder("Purchase failed. Result code: ")).append(Integer.toString(j1)).append(". Response: ").append(a(i1)).toString());
            intent = new l(-1006, "Unknown purchase response.");
            if (m != null)
            {
                m.a(intent, null);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    final void b()
    {
        a((new StringBuilder("Ending async operation: ")).append(f).toString());
        f = "";
        e = false;
    }
}
