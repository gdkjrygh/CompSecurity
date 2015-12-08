// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.widget.Toast;
import com.a.a.a.a.c;
import com.a.a.a.a.f;
import com.a.a.a.a.g;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.b.k;
import com.tinder.b.l;
import com.tinder.c.ak;
import com.tinder.c.n;
import com.tinder.e.x;
import com.tinder.enums.PaywallPerk;
import com.tinder.enums.PurchaseType;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.EventPurchaseFlowError;
import com.tinder.events.EventPurchaseRestoreConfirmed;
import com.tinder.events.EventPurchaseRestoreFailed;
import com.tinder.events.iab.EventBillingError;
import com.tinder.events.iab.EventBillingReady;
import com.tinder.events.iab.EventInventoryLoaded;
import com.tinder.events.iab.EventPurchaseConfirmed;
import com.tinder.events.iab.EventPurchaseFailure;
import com.tinder.events.iab.errors.EventBillingAPIUnavailable;
import com.tinder.events.iab.errors.EventBillingResultError;
import com.tinder.events.iab.errors.EventDeveloperWTF;
import com.tinder.events.iab.errors.EventItemAlreadyOwned;
import com.tinder.events.iab.errors.EventItemNotOwned;
import com.tinder.events.iab.errors.EventItemUnavailable;
import com.tinder.events.iab.errors.EventPurchaseTampered;
import com.tinder.events.iab.errors.EventResetContext;
import com.tinder.events.iab.errors.EventUserCancelled;
import com.tinder.fragments.FragmentSideMenu;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.ai;
import com.tinder.managers.d;
import com.tinder.managers.h;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.model.ClientConfig;
import com.tinder.model.FacebookAnalyticsUtils;
import com.tinder.model.GlobalConfig;
import com.tinder.model.Paywall;
import com.tinder.model.ProductGroup;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.RateCardConfig;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.services.GCMRegistrationIntentService;
import com.tinder.utils.ac;
import com.tinder.utils.ad;
import com.tinder.utils.e;
import com.tinder.utils.r;
import com.tinder.utils.t;
import com.tinder.utils.v;
import com.tinder.views.CircleTransformation;
import com.tinder.views.CustomActionBar;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.tinder.base:
//            a

public class ActivitySignedInBase extends com.tinder.base.a
    implements com.tinder.c.x.a, x, Paywall
{
    private final class a
        implements Runnable
    {

        final ActivitySignedInBase a;
        private boolean b;

        public final void run()
        {
            aa aa1 = a.x;
            boolean flag = b;
            com.tinder.utils.e.a(new com.tinder.managers.h._cls2(aa1.a, flag)).a(false);
        }

        public a(boolean flag)
        {
            a = ActivitySignedInBase.this;
            super();
            b = flag;
        }
    }

    private final class b
        implements Runnable
    {

        final ActivitySignedInBase a;
        private WeakReference b;
        private f c;

        public final void run()
        {
            if (b.get() != null)
            {
                PurchaseType purchasetype = PurchaseType.getTypeFromSku(c.a);
                Object obj = a.x;
                Activity activity = (Activity)b.get();
                String s1 = c.a;
                obj = ((aa) (obj)).a;
                if (((h) (obj)).b != null && !TextUtils.isEmpty(s1))
                {
                    switch (com.tinder.managers.h._cls3.a[purchasetype.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                        ((h) (obj)).b.a(activity, s1, "subs");
                        return;

                    case 2: // '\002'
                        ((h) (obj)).b.a(activity, s1, "inapp");
                        break;
                    }
                    return;
                } else
                {
                    com.tinder.utils.v.b("IAB helper is null or sku is empty");
                    return;
                }
            } else
            {
                com.tinder.base.ActivitySignedInBase.a(a);
                return;
            }
        }

        public b(Activity activity, f f1)
        {
            a = ActivitySignedInBase.this;
            super();
            b = new WeakReference(activity);
            c = f1;
        }
    }

    private final class c
        implements Runnable
    {

        final ActivitySignedInBase a;
        private ArrayList b;

        public final void run()
        {
            com.tinder.utils.e.a(new com.tinder.managers.h._cls1(a.w, b)).a(false);
        }

        c(ArrayList arraylist)
        {
            a = ActivitySignedInBase.this;
            super();
            b = arraylist;
        }
    }


    public List A;
    public Dialog B;
    private CustomActionBar a;
    private List b;
    private com.tinder.c.n.a c;
    private boolean d;
    private Runnable e;
    private ArrayList f;
    private boolean g;
    private com.tinder.c.x h;
    private ak i;
    private com.squareup.picasso.x j;
    public n q;
    ae r;
    public ab s;
    z t;
    i u;
    com.tinder.utils.n v;
    h w;
    aa x;
    ai y;
    public com.tinder.d.a z;

    public ActivitySignedInBase()
    {
        super(false);
        c = null;
        d = false;
        e = null;
    }

    public ActivitySignedInBase(boolean flag)
    {
        super(flag);
        c = null;
        d = false;
        e = null;
    }

    static com.tinder.c.n.a a(ActivitySignedInBase activitysignedinbase)
    {
        activitysignedinbase.c = null;
        return null;
    }

    private void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L2; else goto _L1
_L1:
        com.tinder.utils.v.b("Already setting up billing. Not doing it again.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = runnable;
        if (!w.c())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        com.tinder.utils.v.b((new StringBuilder("Already initilized, short cutting to runable: ")).append(runnable.getClass()).toString());
        runnable.run();
          goto _L3
        runnable;
        throw runnable;
        w.a(this);
          goto _L3
    }

    static ak b(ActivitySignedInBase activitysignedinbase)
    {
        return activitysignedinbase.i;
    }

    private f c(String s1)
    {
        if (A == null)
        {
            return null;
        }
        for (Iterator iterator = A.iterator(); iterator.hasNext();)
        {
            f f1 = (f)iterator.next();
            if (s1.equals(f1.a))
            {
                return f1;
            }
        }

        return null;
    }

    public final CustomActionBar H()
    {
        if (a == null)
        {
            a = new CustomActionBar(this);
        }
        return a;
    }

    public final boolean I()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (h != null)
        {
            flag = flag1;
            if (h.isShowing())
            {
                h.dismiss();
                h = null;
                flag = true;
            }
        }
        flag1 = flag;
        if (i != null)
        {
            flag1 = flag;
            if (i.isShowing())
            {
                i.dismiss();
                i = null;
                flag1 = true;
            }
        }
        flag = flag1;
        if (q != null)
        {
            flag = flag1;
            if (q.isShowing())
            {
                q.dismiss();
                q = null;
                flag = true;
            }
        }
        return flag;
    }

    public final void J()
    {
        launchPlusSubscriptionPaywall(3, PaywallPerk.UNLIMITED_LIKES);
    }

    public final void a(f f1)
    {
        if (c != null || q == null && h == null && i == null)
        {
            return;
        }
        if (q != null)
        {
            c = q.a;
        } else
        if (h != null)
        {
            c = h.e;
        } else
        {
            c = i.e;
        }
        if (ae.a())
        {
            com.tinder.utils.v.b("User was shown paywall, opted to pay, but already had plus subscription");
            I();
            Toast.makeText(this, 0x7f06017d, 1).show();
            a(false);
            c = null;
            return;
        }
        if (w.c())
        {
            (new b(this, f1)).run();
            return;
        } else
        {
            a(((Runnable) (new b(this, f1))));
            return;
        }
    }

    public final void a(User user, int i1, com.tinder.c.ak.a a1, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        UserMeta usermeta = com.tinder.managers.d.c();
        int j1 = 0;
        if (usermeta != null)
        {
            j1 = usermeta.superlikeStatus.numAllotted;
        }
        i = new ak(this, user, i1, j1, z, this, A);
        i.d = a1;
        i.setOnDismissListener(ondismisslistener);
        j1 = ad.a(this) / 2;
        user = ((ProfilePhoto)user.getPhotos().get(i1)).imageUrl;
        j = new com.squareup.picasso.x() {

            final ActivitySignedInBase a;

            public final void onBitmapFailed(Drawable drawable)
            {
                if (ActivitySignedInBase.b(a) != null && !a.isFinishing())
                {
                    ActivitySignedInBase.b(a).show();
                }
            }

            public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                if (ActivitySignedInBase.b(a) != null && !a.isFinishing())
                {
                    ActivitySignedInBase.b(a).show();
                }
            }

            public final void onPrepareLoad(Drawable drawable)
            {
            }

            
            {
                a = ActivitySignedInBase.this;
                super();
            }
        };
        Picasso.a(this).a(user).a(new CircleTransformation()).b().b(j1, j1).a(j);
    }

    public final void a(String s1)
    {
        boolean flag = true;
        if (B != null && B.isShowing()) goto _L2; else goto _L1
_L1:
        ac ac1 = ac.a();
        if (ac.f()) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        if (flag)
        {
            B = new com.tinder.c.v(this, 0, s1);
            B.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final ActivitySignedInBase a;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    dialoginterface = (FragmentSideMenu)a.getSupportFragmentManager().a(0x7f0e0210);
                    if (dialoginterface != null)
                    {
                        dialoginterface.c();
                    }
                }

            
            {
                a = ActivitySignedInBase.this;
                super();
            }
            });
            B.show();
        }
_L2:
        return;
_L4:
        Object obj = new k();
        obj = l.a().b(((k) (obj)).a);
        int i1 = ((Cursor) (obj)).getCount();
        com.tinder.b.f.a(((Cursor) (obj)));
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (i1 >= 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = ac.d();
        flag3 = ac.e();
        flag4 = ac.c();
        flag5 = ac1.c;
        if (!ac.f() || flag2 || flag3)
        {
            (new StringBuilder("No op versionRateable?")).append(ac.f()).append(" hasRatedBefore? ").append(flag2);
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        (new StringBuilder("\n********\nRATING CHECK \n********\n")).append((new StringBuilder("hasRated ")).append(flag2).append('\n').toString()).append((new StringBuilder("backFromMatch ")).append(ac1.a).append('\n').toString()).append((new StringBuilder("backFromMessage ")).append(ac1.b).append('\n').toString()).append((new StringBuilder("hasSentFeedback ")).append(flag3).append('\n').toString()).append((new StringBuilder("hasEnoughDays ")).append(flag1).append('\n').toString()).append((new StringBuilder("hasCrashes ")).append(flag4).append('\n').toString()).append((new StringBuilder("hasBounced ")).append(flag5).append('\n').toString());
        if (flag4)
        {
            ac1.g();
            continue; /* Loop/switch isn't completed */
        }
        if (flag1)
        {
            if (ac1.a || ac1.b)
            {
                (new StringBuilder("true because version is rateable & not rated before & has met session count, & new match ")).append(ac1.a).append(", hasReadNewMessage ").append(ac1.b);
                ac1.g();
                continue; /* Loop/switch isn't completed */
            }
            if (ac1.c)
            {
                ac1.g();
                continue; /* Loop/switch isn't completed */
            }
        }
        ac1.g();
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(boolean flag)
    {
        if (ae.a())
        {
            if (flag)
            {
                Toast.makeText(this, 0x7f0601e2, 0).show();
            }
            return;
        }
        if (w.c())
        {
            (new a(flag)).run();
            return;
        } else
        {
            a(((Runnable) (new a(flag))));
            return;
        }
    }

    public void launchPlusSubscriptionPaywall(int i1, PaywallPerk paywallperk)
    {
        if (q != null)
        {
            com.tinder.utils.v.b("Tried to launch duplicate paywalls. Preventing.");
            return;
        }
        Object obj = t.b;
        if (obj != null && ((com.tinder.managers.z.a) (obj)).e)
        {
            Toast.makeText(this, 0x7f060183, 0).show();
            return;
        }
        boolean flag1 = ae.a();
        obj = new StringBuilder("Restore purchases: ");
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((StringBuilder) (obj)).append(flag);
        if (!flag1)
        {
            a(false);
        }
        if (b == null || b.isEmpty())
        {
            UserMeta usermeta = com.tinder.managers.d.c();
            if (usermeta != null && usermeta.clientConfig != null && usermeta.clientConfig.getRateCard() != null)
            {
                b = usermeta.clientConfig.getRateCard().carousel;
            }
            if (b == null || b.isEmpty())
            {
                com.tinder.utils.v.b("Failed to load carousel order, cannot show paywall with no perks");
                Toast.makeText(this, 0x7f0600a5, 1).show();
                return;
            }
        }
        if (!A.isEmpty())
        {
            (new StringBuilder("sku details available: ")).append(A.size()).append(" skus in");
            q = new n(this, A, b, i1, s.i.numRemaining, this, z, paywallperk);
            q.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final ActivitySignedInBase a;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    a.q = null;
                    com.tinder.base.ActivitySignedInBase.a(a);
                }

            
            {
                a = ActivitySignedInBase.this;
                super();
            }
            });
            q.show();
            return;
        } else
        {
            com.tinder.utils.v.b("no sku details available");
            Toast.makeText(ManagerApp.c(), 0x7f0600ac, 1).show();
            n.e();
            return;
        }
    }

    public void launchSwipeLimitRoadblock(String s1)
    {
        if (!t.b.e) goto _L2; else goto _L1
_L1:
        Toast.makeText(ManagerApp.c(), 0x7f060183, 0).show();
_L7:
        return;
_L2:
        Iterator iterator = f.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (String)iterator.next();
        if (!aa.a(((String) (obj)))) goto _L6; else goto _L5
_L5:
        if (obj != null && !A.isEmpty())
        {
            obj = c(((String) (obj)));
            (new StringBuilder("Bouncer likes sku details ")).append(obj);
            if (obj != null)
            {
                ac.a().c = true;
                h = new com.tinder.c.x(this, A, this, this, s1);
                h.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final ActivitySignedInBase a;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        if (!ae.a())
                        {
                            a.a("swipeLimit");
                        }
                    }

            
            {
                a = ActivitySignedInBase.this;
                super();
            }
                });
                h.show();
                return;
            }
        } else
        {
            com.tinder.utils.v.b("no sku details available");
            Toast.makeText(ManagerApp.c(), 0x7f0600ac, 1).show();
            return;
        }
        if (true) goto _L7; else goto _L4
_L4:
        obj = null;
          goto _L5
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        h h1 = w;
        (new StringBuilder("onActivityResult(")).append(i1).append(',').append(j1).append(',').append(intent).append(')');
        boolean flag;
        if (h1.b != null)
        {
            flag = h1.b.a(i1, j1, intent);
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            super.onActivityResult(i1, j1, intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        ManagerApp.h().a(this);
        super.onCreate(bundle);
        bundle = getSupportActionBar();
        if (!w_()) goto _L2; else goto _L1
_L1:
        if (bundle != null && bundle.getCustomView() == null)
        {
            a = new CustomActionBar(this);
            bundle.setCustomView(a);
            bundle.setDisplayShowCustomEnabled(true);
            bundle.show();
        }
_L4:
        f = new ArrayList(3);
        A = new ArrayList(3);
        return;
_L2:
        if (bundle != null)
        {
            bundle.hide();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroy()
    {
        w.d();
        super.onDestroy();
    }

    public void onEvent(EventLoggedOut eventloggedout)
    {
        ManagerApp.h().a(this);
    }

    public void onEvent(EventBillingError eventbillingerror)
    {
        com.tinder.utils.v.b((new StringBuilder("Billing error! ")).append(eventbillingerror).toString());
        if (eventbillingerror.getCode() == 100)
        {
            com.tinder.utils.v.b((new StringBuilder("getSkuDetails error: ")).append(eventbillingerror).toString());
        }
        c = null;
        d = false;
    }

    public void onEvent(EventInventoryLoaded eventinventoryloaded)
    {
        A.clear();
        if (f.isEmpty() || eventinventoryloaded.getSubscriptions() == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = f.iterator();
_L10:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        String s1;
        List list;
        Iterator iterator1;
        s1 = (String)iterator.next();
        list = eventinventoryloaded.getSubscriptions();
        iterator1 = list.iterator();
_L7:
        if (!iterator1.hasNext()) goto _L5; else goto _L4
_L4:
        f f2 = (f)iterator1.next();
        if (!f2.a.equals(s1)) goto _L7; else goto _L6
_L6:
        int i1 = list.indexOf(f2);
_L8:
        if (i1 != -1)
        {
            f f1 = (f)eventinventoryloaded.getSubscriptions().get(i1);
            (new StringBuilder("Inserting SKU for available inventory: ")).append(f1.a);
            A.add(f1);
            (new StringBuilder("got sku details (inventory): ")).append(f1);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = -1;
        if (true) goto _L8; else goto _L2
_L2:
        d = false;
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onEvent(EventItemNotOwned eventitemnotowned)
    {
        com.tinder.utils.v.b("We tried to consume a product that the user does not own, prompt to buy?");
    }

    public void onEvent(EventPurchaseTampered eventpurchasetampered)
    {
        com.tinder.utils.v.b("Failed to verify purchase, possibly tampered with!");
    }

    public void onEventMainThread(EventGlobalsLoaded eventglobalsloaded)
    {
        super.onEventMainThread(eventglobalsloaded);
        eventglobalsloaded = eventglobalsloaded.getUserMeta();
        if (eventglobalsloaded == null) goto _L2; else goto _L1
_L1:
        if (eventglobalsloaded == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        Iterator iterator;
        if (f == null)
        {
            f = new ArrayList(3);
        } else
        {
            f.clear();
        }
        iterator = ((UserMeta) (eventglobalsloaded)).groups.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductGroup productgroup = (ProductGroup)iterator.next();
            if (TextUtils.equals(productgroup.type, "purchase") && !TextUtils.isEmpty(productgroup.key))
            {
                f.add(productgroup.key);
            }
        } while (true);
        (new StringBuilder("skus from usermeta groups:")).append(f.toString());
        if (f.isEmpty()) goto _L4; else goto _L3
_L3:
        eventglobalsloaded = f;
        if (d) goto _L2; else goto _L5
_L5:
        d = true;
        if (!w.c()) goto _L7; else goto _L6
_L6:
        (new c(eventglobalsloaded)).run();
_L2:
        return;
_L7:
        a(new c(eventglobalsloaded));
        return;
_L4:
        if (!((UserMeta) (eventglobalsloaded)).globalConfig.plusEnabled || ae.a()) goto _L2; else goto _L8
_L8:
        com.tinder.utils.v.b("Failed to set any product skus from user metadata!");
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

            final ActivitySignedInBase a;

            public final void run()
            {
                a.n.e();
            }

            
            {
                a = ActivitySignedInBase.this;
                super();
            }
        }, 2000L);
        return;
        com.tinder.utils.v.b("Failed to set product skus: no user data to work from.");
        return;
    }

    public void onEventMainThread(EventPurchaseFlowError eventpurchaseflowerror)
    {
        com.tinder.utils.v.b((new StringBuilder("Purchase flow failure: ")).append(eventpurchaseflowerror).toString());
        Toast.makeText(this, 0x7f06017f, 0).show();
    }

    public void onEventMainThread(EventPurchaseRestoreConfirmed eventpurchaserestoreconfirmed)
    {
        eventpurchaserestoreconfirmed = eventpurchaserestoreconfirmed.getTransactionDetails();
        Toast.makeText(this, 0x7f0601e2, 0).show();
        f f1 = c(((g) (eventpurchaserestoreconfirmed)).a);
        (new StringBuilder("restore purchase SUCCESS id: ")).append(((g) (eventpurchaserestoreconfirmed)).a).append(" skuDetails: ").append(f1);
        if (f1 != null)
        {
            (new StringBuilder("restore purchase skuDetails ")).append(f1.toString());
        }
        (new StringBuilder("restore purchase tinderpurchse: ")).append(eventpurchaserestoreconfirmed);
        SparksEvent sparksevent = new SparksEvent("TinderPlus.Restore");
        sparksevent.put("term", Integer.valueOf(com.tinder.utils.r.b(((g) (eventpurchaserestoreconfirmed)).a)));
        f f2 = com.tinder.utils.r.b(A);
        if (f2 != null)
        {
            sparksevent.put("basePrice", f2.f);
        }
        sparksevent.put("features", b);
        sparksevent.put("sku", ((g) (eventpurchaserestoreconfirmed)).a);
        if (f1 != null)
        {
            sparksevent.put("currency", f1.e);
            sparksevent.put("price", f1.f);
        }
        sparksevent.put("success", Boolean.valueOf(true));
        sparksevent.put("paywallVersion", Integer.valueOf(4));
        sparksevent.put("roadblockVersion", Integer.valueOf(1));
        com.tinder.managers.a.a(sparksevent);
        s.b();
        I();
    }

    public void onEventMainThread(EventPurchaseRestoreFailed eventpurchaserestorefailed)
    {
        com.tinder.utils.v.b((new StringBuilder("restore purchase: onPurchaseFailure: ")).append(eventpurchaserestorefailed.getError()).toString());
        if (eventpurchaserestorefailed.showErrorToUser())
        {
            Toast.makeText(this, 0x7f0600b9, 0).show();
        }
        eventpurchaserestorefailed = new SparksEvent("TinderPlus.Restore");
        eventpurchaserestorefailed.put("success", Boolean.valueOf(false));
        com.tinder.managers.a.a(eventpurchaserestorefailed);
    }

    public void onEventMainThread(EventBillingReady eventbillingready)
    {
        if (e != null)
        {
            (new StringBuilder("initialize managerInAppBilling (restore|purchase) runnable: ")).append(e.getClass());
            e.run();
            e = null;
            return;
        } else
        {
            c = null;
            d = false;
            return;
        }
    }

    public void onEventMainThread(EventPurchaseConfirmed eventpurchaseconfirmed)
    {
        (new StringBuilder("onPurchaseSuccess: ")).append(eventpurchaseconfirmed.getTransactionDetails());
        eventpurchaseconfirmed = eventpurchaseconfirmed.getTransactionDetails().a;
        f f1 = c(eventpurchaseconfirmed);
        Object obj = new SparksEvent("TinderPlus.Purchase");
        f f2;
        int i1;
        if (q != null)
        {
            i1 = q.b;
        } else
        {
            i1 = -1;
        }
        try
        {
            ((SparksEvent) (obj)).put("products", n.a(A));
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.a("Failed to create json for available products", jsonexception);
        }
        f2 = com.tinder.utils.r.b(A);
        if (f2 != null)
        {
            ((SparksEvent) (obj)).put("basePrice", f2.f);
        }
        if (f1 != null)
        {
            ((SparksEvent) (obj)).put("term", Integer.valueOf(com.tinder.utils.r.b(f1.a)));
            ((SparksEvent) (obj)).put("sku", f1.a);
            ((SparksEvent) (obj)).put("price", f1.f);
            ((SparksEvent) (obj)).put("currency", f1.e);
        }
        ((SparksEvent) (obj)).put("locale", com.tinder.utils.t.b());
        ((SparksEvent) (obj)).put("from", Integer.valueOf(i1));
        ((SparksEvent) (obj)).put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
        ((SparksEvent) (obj)).put("percentLikesLeft", Integer.valueOf(s.g));
        if (i1 == 5)
        {
            ((SparksEvent) (obj)).put("plusMenuOffer", FragmentSideMenu.c);
        }
        if (c.a != -1)
        {
            ((SparksEvent) (obj)).put("features", Integer.valueOf(c.a));
        }
        ((SparksEvent) (obj)).put("paywallVersion", Integer.valueOf(4));
        ((SparksEvent) (obj)).put("roadblockVersion", Integer.valueOf(1));
        ((SparksEvent) (obj)).put("superLikesRemaining", Integer.valueOf(s.i.numRemaining));
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        obj = new Bundle();
        ((Bundle) (obj)).putString("sku", c.b.a);
        ((Bundle) (obj)).putString("locale", com.tinder.utils.t.b());
        ((Bundle) (obj)).putInt("from", i1);
        ((Bundle) (obj)).putBoolean("unlimitedLikesOffered", ae.u());
        ((Bundle) (obj)).putInt("percentLikesLeft", s.g);
        FacebookAnalyticsUtils.logPurchase(c.b, ((Bundle) (obj)));
        if (f1 != null)
        {
            z.a(eventpurchaseconfirmed, f1.e, new BigDecimal(f1.f.doubleValue()));
        }
        I();
        c = null;
        s.b();
    }

    public void onEventMainThread(EventPurchaseFailure eventpurchasefailure)
    {
        com.tinder.utils.v.b((new StringBuilder("onPurchaseFailure: ")).append(eventpurchasefailure).toString());
        c = null;
        Toast.makeText(this, 0x7f06017f, 0).show();
        if (h != null && h.isShowing())
        {
            h.cancel();
            h = null;
        }
        if (i != null && i.isShowing())
        {
            i.cancel();
            i = null;
        }
        if (q != null && q.isShowing())
        {
            q.cancel();
            q = null;
        }
    }

    public void onEventMainThread(EventBillingAPIUnavailable eventbillingapiunavailable)
    {
        com.tinder.utils.v.b("API unavialable, have user check play store.");
        Toast.makeText(this, 0x7f0600ad, 0).show();
        I();
    }

    public void onEventMainThread(EventBillingResultError eventbillingresulterror)
    {
        com.tinder.utils.v.b("Random-o error. Have user try again?");
        Toast.makeText(this, 0x7f060167, 0).show();
    }

    public void onEventMainThread(EventDeveloperWTF eventdeveloperwtf)
    {
        com.tinder.utils.v.b("We screwed up with our API calls somehow. Tell user something?");
        Toast.makeText(this, 0x7f060133, 0).show();
    }

    public void onEventMainThread(EventItemAlreadyOwned eventitemalreadyowned)
    {
        com.tinder.utils.v.b("User attempted to buy something that they already owned, restore!");
        a(true);
        if (c != null && com.tinder.utils.r.a(c.b.a))
        {
            Toast.makeText(this, 0x7f06017d, 0).show();
        }
        I();
    }

    public void onEventMainThread(EventItemUnavailable eventitemunavailable)
    {
        com.tinder.utils.v.b("Attempted to buy an item that is not available for purchase.");
        Toast.makeText(this, 0x7f060166, 0).show();
        I();
    }

    public void onEventMainThread(EventResetContext eventresetcontext)
    {
        com.tinder.utils.v.b("Context inside BillingManager was lost, reset IAB Manager.");
        w.d();
        w.a(this);
        Toast.makeText(this, 0x7f060167, 0).show();
    }

    public void onEventMainThread(EventUserCancelled eventusercancelled)
    {
        com.tinder.utils.v.b("User cancelled purchase flow, dismissing dialog.");
        I();
    }

    public void onPause()
    {
        super.onPause();
        ad.c(h);
    }

    public void onResume()
    {
        super.onResume();
        int i1 = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (i1 != 0)
        {
            Object obj;
            if (GooglePlayServicesUtil.isUserRecoverableError(i1))
            {
                GooglePlayServicesUtil.getErrorDialog(i1, this, 9000).show();
            } else
            {
                com.tinder.utils.v.b("Google Play services error", "This device is not supported.");
            }
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (i1 && (!ae.a.getBoolean("REGISTERED TINDER PUSH", false) || y.a))
        {
            startService(new Intent(this, com/tinder/services/GCMRegistrationIntentService));
        }
        u.k();
        obj = t.b();
        if (obj != null && Crashlytics.d() != null)
        {
            Crashlytics.c(((User) (obj)).getName());
            Crashlytics.b(((User) (obj)).getId());
        }
        obj = com.tinder.managers.d.c();
        if (!g)
        {
            if (obj != null)
            {
                b(((UserMeta) (obj)).reportNotifications);
                obj = ((UserMeta) (obj)).clientConfig;
                if (obj != null && ((ClientConfig) (obj)).getRateCard() != null)
                {
                    b = ((ClientConfig) (obj)).getRateCard().carousel;
                }
            }
            g = true;
        }
    }

    public boolean w_()
    {
        return false;
    }
}
