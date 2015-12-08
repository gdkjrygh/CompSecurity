// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import android.widget.Toast;
import com.a.a.a.a.g;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.e.ak;
import com.tinder.e.am;
import com.tinder.e.an;
import com.tinder.enums.StatusCode;
import com.tinder.events.EventPurchaseFlowComplete;
import com.tinder.events.EventPurchaseFlowError;
import com.tinder.events.EventPurchaseRestoreConfirmed;
import com.tinder.events.EventPurchaseRestoreFailed;
import com.tinder.events.iab.EventBillingError;
import com.tinder.events.iab.EventPurchaseConfirmed;
import com.tinder.events.iab.EventPurchaseRestored;
import com.tinder.events.iab.errors.EventBillingAPIUnavailable;
import com.tinder.events.iab.errors.EventBillingResultError;
import com.tinder.events.iab.errors.EventDeveloperWTF;
import com.tinder.events.iab.errors.EventItemAlreadyOwned;
import com.tinder.events.iab.errors.EventItemNotOwned;
import com.tinder.events.iab.errors.EventItemUnavailable;
import com.tinder.events.iab.errors.EventPurchaseTampered;
import com.tinder.events.iab.errors.EventResetContext;
import com.tinder.events.iab.errors.EventUserCancelled;
import com.tinder.model.ProductGroup;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.TinderPurchase;
import com.tinder.model.UserMeta;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d, ManagerApp, h, ae, 
//            ab

public final class aa
{
    public static final class a
    {
    }

    public static final class a.a
    {

        public static JSONObject a(g g1)
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("receipt", g1.e.a);
                jsonobject.put("signature", g1.e.b);
                String.format("Translated subscription purchase to JSON: [%s]", new Object[] {
                    jsonobject.toString()
                });
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                g1.getMessage();
                return jsonobject;
            }
            return jsonobject;
        }
    }


    public h a;
    c b;
    ab c;
    private com.tinder.managers.d d;
    private ae e;
    private f f;

    public aa(com.tinder.managers.d d1, ae ae1, h h1, f f1, ab ab, c c1)
    {
        d = d1;
        e = ae1;
        a = h1;
        f = f1;
        c = ab;
        b = c1;
        b.a(this, false);
    }

    public static String a()
    {
label0:
        {
            Object obj = com.tinder.managers.d.c();
            if (obj == null)
            {
                break label0;
            }
            obj = ((UserMeta) (obj)).groups.iterator();
            ProductGroup productgroup;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                productgroup = (ProductGroup)((Iterator) (obj)).next();
            } while (!a(productgroup.key));
            return productgroup.key;
        }
        return "";
    }

    private void a(g g, am am)
    {
        JSONObject jsonobject = a.a.a(g);
        g = new d(1, f.z, jsonobject, new com.android.volley.i.b(g, am) {

            final g a;
            final am b;
            final aa c;

            public final void a(Object obj)
            {
                Object obj2 = (JSONObject)obj;
                Object obj1;
                obj1 = a;
                obj = b;
                (new StringBuilder("purchase onResponse: ")).append(obj2);
                int i;
                try
                {
                    i = ((JSONObject) (obj2)).getInt("status");
                }
                catch (JSONException jsonexception)
                {
                    try
                    {
                        v.a("Failed to parse status code from purchase response.", jsonexception);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        v.a("Failed to deliver purchase details from Tinder API", ((Throwable) (obj)));
                        b.a(a.a, "Exception");
                        return;
                    }
                    i = 0;
                }
                if (i != StatusCode.OK.getCode())
                {
                    break MISSING_BLOCK_LABEL_228;
                }
                obj2 = com.tinder.parse.f.a(((JSONObject) (obj2)));
                if (!TextUtils.isEmpty(((com.tinder.parse.f.a) (obj2)).a) || ((com.tinder.parse.f.a) (obj2)).b != null && ((com.tinder.parse.f.a) (obj2)).b.isEmpty())
                {
                    v.b("ManagerPurchases handlePurchaseResponse : either has error or empty TinderPurchases list");
                    ((am) (obj)).a(((g) (obj1)).a, (new StringBuilder("status: ")).append(i).toString());
                    return;
                }
                obj1 = ((com.tinder.parse.f.a) (obj2)).b.iterator();
_L1:
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break MISSING_BLOCK_LABEL_255;
                    }
                    obj2 = (TinderPurchase)((Iterator) (obj1)).next();
                    if (!aa.a(((TinderPurchase) (obj2))))
                    {
                        break MISSING_BLOCK_LABEL_206;
                    }
                    com.tinder.managers.ae.c(true);
                    ((am) (obj)).a(((TinderPurchase) (obj2)));
                } while (true);
                v.b((new StringBuilder("Restored a purchase, but not a tinder plus subscription? ")).append(obj2).toString());
                  goto _L1
                ((am) (obj)).a(((g) (obj1)).a, (new StringBuilder("status: ")).append(i).toString());
            }

            
            {
                c = aa.this;
                a = g1;
                b = am1;
                super();
            }
        }, new com.android.volley.i.a(am, g) {

            final am a;
            final g b;
            final aa c;

            public final void a(VolleyError volleyerror)
            {
                a.a(b.a, volleyerror.getMessage());
            }

            
            {
                c = aa.this;
                a = am1;
                b = g1;
                super();
            }
        }, com.tinder.managers.d.b());
        g.j = new com.android.volley.c(5000, 3, 1.0F);
        ManagerApp.b().a(g);
    }

    private void a(String s, boolean flag)
    {
        Object obj = a;
        if (((h) (obj)).b != null)
        {
            obj = ((h) (obj)).b.a(s);
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            v.b((new StringBuilder("Thought we bought this product and could restore, but have no record of it: ")).append(s).toString());
            return;
        } else
        {
            a(((g) (obj)), new am(((g) (obj)), flag) {

                final g a;
                final boolean b;
                final aa c;

                public final void a(TinderPurchase tinderpurchase)
                {
                    c.c.i.reset();
                    c.b.c(new EventPurchaseRestoreConfirmed(a, b));
                }

                public final void a(String s1, String s2)
                {
                    v.b((new StringBuilder("Purchase or restore failed api verification, sku: ")).append(s1).toString());
                    if (!ae.a())
                    {
                        c.b.c(new EventPurchaseRestoreFailed(s1, s2, b));
                    }
                }

            
            {
                c = aa.this;
                a = g;
                b = flag;
                super();
            }
            });
            return;
        }
    }

    public static boolean a(TinderPurchase tinderpurchase)
    {
        return TextUtils.equals("plus", tinderpurchase.productType) && TextUtils.equals("subscription", tinderpurchase.purchaseType);
    }

    public static boolean a(String s)
    {
        s = s.split("_");
        return TextUtils.equals("plus", s[0]) && TextUtils.equals("subscription", s[1]);
    }

    static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            TinderPurchase tinderpurchase = (TinderPurchase)list.next();
            if (a(tinderpurchase))
            {
                (new StringBuilder("found plus subscription: ")).append(tinderpurchase.toString());
                return true;
            }
        }

        return false;
    }

    public final void a(ak ak1)
    {
        if (ae.a())
        {
            ak1.a();
            return;
        } else
        {
            ak1 = new an(ak1) {

                final ak a;
                final aa b;

                public final void a()
                {
                    if (ae.a())
                    {
                        a.a();
                        return;
                    } else
                    {
                        a.b();
                        return;
                    }
                }

                public final void b()
                {
                    a.c();
                }

            
            {
                b = aa.this;
                a = ak1;
                super();
            }
            };
            ak1 = new d(0, f.y, null, new com.android.volley.i.b(ak1) {

                final an a;
                final aa b;

                public final void a(Object obj)
                {
                    Object obj1 = (JSONObject)obj;
                    obj = a;
                    int i;
                    try
                    {
                        (new StringBuilder("response: ")).append(obj1);
                        i = ((JSONObject) (obj1)).getInt("status");
                        if (i == StatusCode.OK.getCode())
                        {
                            obj1 = com.tinder.parse.f.b(((JSONObject) (obj1)));
                            (new StringBuilder("status OK; purchases: ")).append(obj1.toString());
                            com.tinder.managers.ae.c(aa.a(((List) (obj1))));
                            ((an) (obj)).a();
                            return;
                        }
                    }
                    catch (Exception exception)
                    {
                        com.tinder.managers.ae.c(false);
                        v.a("Failed to retrieve purchase data from shared prefs", exception);
                        exception.getMessage();
                        ((an) (obj)).b();
                        return;
                    }
                    v.b((new StringBuilder("Tinder purchase status not OK: ")).append(i).toString());
                    com.tinder.managers.ae.c(false);
                    ((JSONObject) (obj1)).toString();
                    ((an) (obj)).b();
                    return;
                }

            
            {
                b = aa.this;
                a = an1;
                super();
            }
            }, new com.android.volley.i.a(ak1) {

                final an a;
                final aa b;

                public final void a(VolleyError volleyerror)
                {
                    com.tinder.managers.ae.c(false);
                    an an1 = a;
                    volleyerror.getMessage();
                    an1.b();
                }

            
            {
                b = aa.this;
                a = an1;
                super();
            }
            }, com.tinder.managers.d.b());
            ak1.j = new com.android.volley.c(5000, 3, 1.0F);
            ManagerApp.b().a(ak1);
            return;
        }
    }

    public final void onEvent(EventBillingError eventbillingerror)
    {
        v.a((new StringBuilder("Failed to complete billing process: ")).append(eventbillingerror.getCode()).toString(), eventbillingerror.getException());
        switch (eventbillingerror.getCode())
        {
        default:
            v.b((new StringBuilder("Other fatal billing error =( ")).append(eventbillingerror).toString());
            return;

        case 1: // '\001'
            v.b("User pressed back or canceled a dialog");
            b.c(new EventUserCancelled());
            return;

        case 3: // '\003'
            v.b("Billing API version is not supported for the type requested");
            b.c(new EventBillingAPIUnavailable());
            return;

        case 4: // '\004'
            v.b("Requested product is not available for purchase");
            b.c(new EventItemUnavailable());
            return;

        case 5: // '\005'
            v.b("Invalid arguments provided to the API.");
            b.c(new EventDeveloperWTF());
            return;

        case 6: // '\006'
            v.b("Fatal error during the API action");
            b.c(new EventBillingResultError());
            return;

        case 7: // '\007'
            v.b("Failure to purchase since item is already owned");
            b.c(new EventItemAlreadyOwned());
            return;

        case 8: // '\b'
            v.b("Failure to consume since item is not owned");
            b.c(new EventItemNotOwned());
            return;

        case 100: // 'd'
            v.b("restore purchase failed");
            Toast.makeText(com.tinder.managers.ManagerApp.c(), 0x7f0600b9, 0).show();
            return;

        case 102: // 'f'
            v.b("Purchase verification failed.");
            b.c(new EventPurchaseTampered());
            return;

        case 104: // 'h'
            v.b("Purchase verification failed.");
            b.c(new EventPurchaseTampered());
            return;

        case 103: // 'g'
            b.c(new EventResetContext());
            return;
        }
    }

    public final void onEvent(EventPurchaseConfirmed eventpurchaseconfirmed)
    {
        a(eventpurchaseconfirmed.getTransactionDetails(), new am() {

            final aa a;

            public final void a(TinderPurchase tinderpurchase)
            {
                a.c.i.reset();
                a.b.c(new EventPurchaseFlowComplete(tinderpurchase));
            }

            public final void a(String s, String s1)
            {
                a.b.c(new EventPurchaseFlowError(s, s1));
            }

            
            {
                a = aa.this;
                super();
            }
        });
    }

    public final void onEvent(EventPurchaseRestored eventpurchaserestored)
    {
        if (eventpurchaserestored.getProductSkus().isEmpty() && eventpurchaserestored.getSubscriptionSkus().isEmpty())
        {
            b.c(new EventPurchaseRestoreFailed("No purchases exist in inventory", eventpurchaserestored.showStrings()));
        } else
        {
            for (Iterator iterator = eventpurchaserestored.getProductSkus().iterator(); iterator.hasNext(); a((String)iterator.next(), eventpurchaserestored.showStrings())) { }
            Iterator iterator1 = eventpurchaserestored.getSubscriptionSkus().iterator();
            while (iterator1.hasNext()) 
            {
                a((String)iterator1.next(), eventpurchaserestored.showStrings());
            }
        }
    }
}
