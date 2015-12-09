// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.dialog.PremiumUpsellInterstitialActivity;
import com.spotify.mobile.android.ui.activity.dialog.TrialReminderActivity;
import com.spotify.mobile.android.ui.activity.dialog.TrialStartedActivity;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.repository.OptInTrialBypassFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class fzc extends fze
{

    private static gip Z = gip.b("five_days_ahead_shown_key");
    private static gip a = gip.b("one_day_ahead_shown_key");
    private static Uri aa = Uri.parse("https://www.spotify.com/redirect/csi/?platform=android");
    private static final String ab[] = {
        "trial_length", "trial_time_remaining", "trial_dialog_shown", "trial_ending_dialog_shown", "trial_active", "post_trial_active", "hide_trial"
    };
    private static final long ac;
    private static gip b = gip.b("three_days_ahead_shown_key");
    private fsg aA;
    private fsf aB;
    private an aC;
    private an aD;
    private dwx aE;
    private eda aF;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private int ao;
    private boolean ap;
    private PaymentState aq;
    private fnu ar;
    private String as;
    private Intent at;
    private Intent au;
    private Intent av;
    private CheckOptInTrialEligibilityTask aw;
    private dxc ax;
    private Flags ay;
    private edb az;

    public fzc()
    {
        ar = fnv.a;
        aC = new an() {

            private fzc a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), dua.a, fzc.G(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                boolean flag2;
                flag2 = true;
                obj = (Cursor)obj;
                if (!((Cursor) (obj)).moveToFirst() || fzc.c(a)) goto _L2; else goto _L1
_L1:
                boolean flag;
                int i1;
                boolean flag3;
                boolean flag5;
                flag5 = gcw.a(((Cursor) (obj)), 6);
                boolean flag1;
                boolean flag6;
                if (gcw.a(((Cursor) (obj)), 2) || fzc.d(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (gcw.a(((Cursor) (obj)), 3) || fzc.e(a))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag3 = gcw.a(((Cursor) (obj)), 4);
                flag6 = gcw.a(((Cursor) (obj)), 5);
                i1 = ((Cursor) (obj)).getInt(1);
                fzc.a(a, ((Cursor) (obj)).getInt(0));
                if (!flag6 || flag1) goto _L4; else goto _L3
_L3:
                fzc.f(a);
                fzc.g(a);
_L6:
                fzc.i(a);
_L2:
                return;
_L4:
                if (flag3 || fzc.h(a) != null && fzc.h(a).c())
                {
                    boolean flag4;
                    if (!flag5 && !flag)
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    if (!flag5)
                    {
                        flag = flag2;
                    } else
                    {
                        flag = false;
                    }
                    if (flag && !fzc.j(a) && i1 > 0)
                    {
                        fzc.k(a);
                        fzc.a(a, i1);
                    }
                    fzc.a(a, flag4);
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = fzc.this;
                super();
            }
        };
        aD = new an() {

            private final String a[] = {
                "current_user", "streaming_rule_shuffle", "product_type", "can_stream", "product_expiry", "payment_state"
            };
            private fzc b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtw.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst() && !fzc.c(b))
                {
                    fzc.b(b, gcw.a(((Cursor) (obj)), 1));
                    fzc.c(b, gcw.a(((Cursor) (obj)), 3));
                    fzc.a(b, ((Cursor) (obj)).getString(4));
                    fzc.a(b, new PaymentState(((Cursor) (obj)).getString(5)));
                    fzc.l(b);
                    String s = ((Cursor) (obj)).getString(2);
                    fzc.b(b, s);
                    obj = ((Cursor) (obj)).getString(0);
                    fzc.c(b, ((String) (obj)));
                    fzc.m(b);
                    fzc.g(b);
                    fzc.i(b);
                }
            }

            
            {
                b = fzc.this;
                super();
            }
        };
        aE = new dwx() {

            private fzc a;

            public final void a(Flags flags)
            {
                fzc.a(a, flags);
                fzc.i(a);
            }

            
            {
                a = fzc.this;
                super();
            }
        };
        aF = new eda() {

            private fzc a;

            public final void a(SessionState sessionstate)
            {
                fzc.a(a, sessionstate.l);
                fzc.b(a, sessionstate.m);
                fzc.m(a);
                fzc.n(a).a(sessionstate);
                fzc.a(a, sessionstate);
            }

            
            {
                a = fzc.this;
                super();
            }
        };
    }

    static String[] G()
    {
        return ab;
    }

    private void H()
    {
        if (am && !ae && !ad)
        {
            boolean flag;
            if (ar != null && ar.b() && ((Boolean)ar.a()).booleanValue() && aq.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                at = new Intent(k(), com/spotify/mobile/android/ui/activity/dialog/TrialStartedActivity);
                at.addFlags(0x20000000);
                at.putExtra("trial_length", ao);
                ad = true;
                if (aq.c())
                {
                    at.putExtra("trial_type", 2);
                }
                if (Y != null)
                {
                    Y.a(this);
                }
            }
        }
    }

    private boolean I()
    {
        return ar.b() && ((Boolean)ar.a()).booleanValue() && (aq == null || !aq.c());
    }

    static int a(fzc fzc1, int i1)
    {
        fzc1.ao = i1;
        return i1;
    }

    static PaymentState a(fzc fzc1, PaymentState paymentstate)
    {
        fzc1.aq = paymentstate;
        return paymentstate;
    }

    static Flags a(fzc fzc1)
    {
        return fzc1.ay;
    }

    static Flags a(fzc fzc1, Flags flags)
    {
        fzc1.ay = flags;
        return flags;
    }

    public static fzc a(Flags flags)
    {
        fzc fzc1 = new fzc();
        fyw.a(fzc1, flags);
        return fzc1;
    }

    static String a(fzc fzc1, String s)
    {
        fzc1.as = s;
        return s;
    }

    private static Calendar a(Calendar calendar, int i1)
    {
        Calendar calendar1 = GregorianCalendar.getInstance();
        calendar1.setTime(calendar.getTime());
        calendar1.add(5, i1);
        return calendar1;
    }

    static void a(fzc fzc1, long l1)
    {
        long l2 = ac;
        Object obj = new Intent("com.spotify.music.spotlets.optintrial.action.TRIAL_REMINDER");
        obj = PendingIntent.getBroadcast(fzc1.k(), 0, ((Intent) (obj)), 0);
        long l3 = SystemClock.elapsedRealtime();
        ((AlarmManager)fzc1.k().getSystemService("alarm")).set(3, l3 + (1000L * l1 - l2), ((PendingIntent) (obj)));
    }

    static void a(fzc fzc1, SessionState sessionstate)
    {
        if (gqa.a(fzc1.ay))
        {
            Object obj = (gpy)dmz.a(gpy);
            ((gpy) (obj)).a(sessionstate.b, sessionstate.c);
            ((gpy) (obj)).a(fzc1.k());
            obj = (gqc)dmz.a(gqc);
            if (!sessionstate.m.equals(((gqc) (obj)).c))
            {
                obj.c = sessionstate.m;
                ((gpy)dmz.a(gpy)).a("Product Type", ((gqc) (obj)).c);
            }
            fzc1 = (String)fzc1.ay.a(fys.aL);
            sessionstate = (gqc)dmz.a(gqc);
            if (!fzc1.equals(((gqc) (sessionstate)).e) && !TextUtils.isEmpty(fzc1))
            {
                sessionstate.e = fzc1;
                ((gpy)dmz.a(gpy)).a("Favorite Artist", ((gqc) (sessionstate)).e);
            }
        }
    }

    static void a(fzc fzc1, boolean flag)
    {
        if (flag)
        {
            fzc1.am = true;
            fzc1.H();
        }
    }

    private void a(gip gip1)
    {
        ad = true;
        fqz fqz1 = PremiumSignupActivity.a(k());
        fqz1.c = aa;
        fqz1.a = ay;
        fqz1.b = true;
        fqz1.e = true;
        fqz1.f = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.L;
        av = fqz1.a();
        av.putExtra("extra_key_to_mark_as_seen", gip1.a);
        if (Y != null)
        {
            Y.a(this);
        }
    }

    static void b(fzc fzc1)
    {
        fzc1.aA.a(fzc1. new fsh() {

            private fzc a;

            public final void a()
            {
            }

            public final void a(Offer offer)
            {
                if (gqa.a(fzc.a(a)))
                {
                    gqc gqc1 = (gqc)dmz.a(gqc);
                    if (!offer.equals(gqc1.d))
                    {
                        gqc1.d = offer;
                        ((gpy)dmz.a(gpy)).a("Current Offer", gqc1.d.toString());
                        gpy gpy1 = (gpy)dmz.a(gpy);
                        if (gqc1.d.isTrial())
                        {
                            offer = "Trial";
                        } else
                        {
                            offer = "Paid Offer";
                        }
                        gpy1.a("Current Offer Type", offer);
                        gpy1 = (gpy)dmz.a(gpy);
                        if (gqc1.d.getDurationType() == com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY)
                        {
                            offer = "Days";
                        } else
                        {
                            offer = "Months";
                        }
                        gpy1.a("Current Offer Duration Type", offer);
                    }
                }
            }

            
            {
                a = fzc.this;
                super();
            }
        });
    }

    static void b(fzc fzc1, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            fzc1.ar = fnv.a;
        } else
        {
            fzc1.ar = fnu.a(Boolean.valueOf("premium".equals(s)));
        }
        if (fzc1.aw == null) goto _L2; else goto _L1
_L1:
        s = fzc1.aw;
        fzc1 = fzc1.ar;
        if (((CheckOptInTrialEligibilityTask) (s)).m.equals(fzc1)) goto _L2; else goto _L3
_L3:
        if (!fzc1.b() || ((Boolean)fzc1.a()).booleanValue()) goto _L5; else goto _L4
_L4:
        if (!CheckOptInTrialEligibilityTask.h && !((CheckOptInTrialEligibilityTask) (s)).l.c)
        {
            Logger.a("CheckOptInTrialEligibilityTask: Starting checking for: %s", new Object[] {
                CheckOptInTrialEligibilityTask.a("x")
            });
            ((CheckOptInTrialEligibilityTask) (s)).l.a();
        }
_L7:
        s.m = fzc1;
_L2:
        return;
_L5:
        if (fzc1.b() && ((Boolean)fzc1.a()).booleanValue())
        {
            Logger.a("CheckOptInTrialEligibilityTask: user is on premium so they aren't eligible for opt in trial", new Object[0]);
            ((CheckOptInTrialEligibilityTask) (s)).k.b().a(CheckOptInTrialEligibilityTask.b, false).a(CheckOptInTrialEligibilityTask.c, ((CheckOptInTrialEligibilityTask) (s)).j).a(CheckOptInTrialEligibilityTask.d, CheckOptInTrialEligibilityTask.b()).b();
            CheckOptInTrialEligibilityTask.a(com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.c, ((CheckOptInTrialEligibilityTask) (s)).j, CheckOptInTrialEligibilityTask.b());
            ((CheckOptInTrialEligibilityTask) (s)).a.a(new Intent("opt-in-trial-eligibility-received"));
            if (((CheckOptInTrialEligibilityTask) (s)).l.c)
            {
                ((CheckOptInTrialEligibilityTask) (s)).l.c();
            }
        } else
        {
            Logger.a("CheckOptInTrialEligibilityTask: new product state is %s and old product state was %s", new Object[] {
                fzc1, ((CheckOptInTrialEligibilityTask) (s)).m
            });
            if (CheckOptInTrialEligibilityTask.e != com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a)
            {
                Logger.a("CheckOptInTrialEligibilityTask: Reset persisted state due to change in product (premium: %s)", new Object[] {
                    fzc1
                });
                ((CheckOptInTrialEligibilityTask) (s)).k.b().a(CheckOptInTrialEligibilityTask.b).a(CheckOptInTrialEligibilityTask.c).a(CheckOptInTrialEligibilityTask.d).b();
            }
            CheckOptInTrialEligibilityTask.c();
            if (((CheckOptInTrialEligibilityTask) (s)).l.c)
            {
                ((CheckOptInTrialEligibilityTask) (s)).l.c();
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean b(fzc fzc1, boolean flag)
    {
        fzc1.ak = flag;
        return flag;
    }

    private boolean b(gip gip1)
    {
        return ((giq)dmz.a(giq)).b(k()).a(gip1, false);
    }

    static void c(fzc fzc1, String s)
    {
        Object obj;
        obj = null;
        if (fzc1.aw != null && !fzc1.aw.j.equals(s))
        {
            fzc1.aw.d();
            fzc1.aw = null;
        }
        if (fzc1.I() || TextUtils.isEmpty(s) || fzc1.aw != null) goto _L2; else goto _L1
_L1:
        CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask;
        boolean flag;
        fzc1.aw = new CheckOptInTrialEligibilityTask(fzc1.k(), s, de.a(fzc1.k()));
        checkoptintrialeligibilitytask = fzc1.aw;
        Logger.a("CheckOptInTrialEligibilityTask: started sStateLoadedFromPreferences: %s", new Object[] {
            Boolean.valueOf(CheckOptInTrialEligibilityTask.i)
        });
        flag = CheckOptInTrialEligibilityTask.i;
        if (!TextUtils.equals(CheckOptInTrialEligibilityTask.f, checkoptintrialeligibilitytask.j))
        {
            Logger.a("CheckOptInTrialEligibilityTask: Reset state since username changed %s -> %s", new Object[] {
                CheckOptInTrialEligibilityTask.a("x"), CheckOptInTrialEligibilityTask.a("y")
            });
            CheckOptInTrialEligibilityTask.c();
        }
        if (flag) goto _L2; else goto _L3
_L3:
        if (!checkoptintrialeligibilitytask.k.f(CheckOptInTrialEligibilityTask.b)) goto _L5; else goto _L4
_L4:
        String s1;
        Logger.a("CheckOptInTrialEligibilityTask: prefs contain eligibility data", new Object[0]);
        flag = checkoptintrialeligibilitytask.k.a(CheckOptInTrialEligibilityTask.b, false);
        s1 = checkoptintrialeligibilitytask.k.a(CheckOptInTrialEligibilityTask.c, null);
        fzc1 = obj;
        if (checkoptintrialeligibilitytask.k.f(CheckOptInTrialEligibilityTask.d))
        {
            fzc1 = Integer.valueOf(checkoptintrialeligibilitytask.k.a(CheckOptInTrialEligibilityTask.d));
        }
        if (flag) goto _L7; else goto _L6
_L6:
        int i1;
        Logger.a("CheckOptInTrialEligibilityTask: cached eligibility is NOT_ELIGIBLE", new Object[0]);
        fzc1 = com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.c;
        i1 = 0;
_L11:
        s = checkoptintrialeligibilitytask.j;
        CheckOptInTrialEligibilityTask.i = true;
        if (fzc1 != com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a)
        {
            if (CheckOptInTrialEligibilityTask.e == com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a)
            {
                break; /* Loop/switch isn't completed */
            }
            Logger.a("Ignore state, %s, from prefs since state is already loaded: %s", new Object[] {
                fzc1, CheckOptInTrialEligibilityTask.e
            });
        }
_L2:
        return;
_L7:
        if (fzc1 != null) goto _L9; else goto _L8
_L8:
        Logger.a("CheckOptInTrialEligibilityTask: Ignore persisted state due to no trial duration", new Object[0]);
        Logger.a("CheckOptInTrialEligibilityTask: state is UNKNOWN", new Object[0]);
_L5:
        fzc1 = com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L9:
        if (checkoptintrialeligibilitytask.j.equals(s1))
        {
            s = com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.b;
            i1 = fzc1.intValue();
            Logger.a("CheckOptInTrialEligibilityTask: state is %s and username is %s", new Object[] {
                s, s1
            });
            fzc1 = s;
        } else
        {
            Logger.a("CheckOptInTrialEligibilityTask: Ignore persisted state due to username mismatch (%s, %s)", new Object[] {
                checkoptintrialeligibilitytask.j, s1
            });
            checkoptintrialeligibilitytask.k.b().a(CheckOptInTrialEligibilityTask.b).a(CheckOptInTrialEligibilityTask.c).a(CheckOptInTrialEligibilityTask.d).a();
            fzc1 = com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a;
            Logger.a("CheckOptInTrialEligibilityTask: state is UNKNOWN", new Object[0]);
            i1 = 0;
        }
        if (true) goto _L11; else goto _L10
_L10:
        Logger.a("Got trial eligibility: %s (was %s) %d days (from preferences)", new Object[] {
            fzc1, CheckOptInTrialEligibilityTask.e, Integer.valueOf(i1)
        });
        CheckOptInTrialEligibilityTask.e = fzc1;
        CheckOptInTrialEligibilityTask.f = s;
        CheckOptInTrialEligibilityTask.g = i1;
        return;
    }

    static boolean c(fzc fzc1)
    {
        return fzc1.ad;
    }

    static boolean c(fzc fzc1, boolean flag)
    {
        fzc1.ap = flag;
        return flag;
    }

    static boolean d(fzc fzc1)
    {
        return fzc1.ae;
    }

    static boolean e(fzc fzc1)
    {
        return fzc1.af;
    }

    static boolean f(fzc fzc1)
    {
        fzc1.an = true;
        return true;
    }

    static void g(fzc fzc1)
    {
        if (fzc1.al && fzc1.an && !fzc1.af)
        {
            boolean flag;
            if (fzc1.ar.b() && ((Boolean)fzc1.ar.a()).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                fzc1.ad = true;
                if (fzc1.ak)
                {
                    String s = fzc1.l().getQuantityString(0x7f090019, 7, new Object[] {
                        Integer.valueOf(7)
                    });
                    fzc1.au = PremiumUpsellInterstitialActivity.a(fzc1.k(), s, fzc1.ay);
                } else
                {
                    Intent intent = (new Intent(fzc1.k(), com/spotify/mobile/android/ui/activity/dialog/TrialReminderActivity)).putExtra("trial_remaining", 0).putExtra("shuffle_streaming", fzc1.ak).putExtra("streaming", fzc1.ap).addFlags(0x20000000);
                    fyw.a(intent, fzc1.ay);
                    fzc1.au = intent;
                }
                if (fzc1.Y != null)
                {
                    fzc1.Y.a(fzc1);
                }
            }
        }
    }

    static PaymentState h(fzc fzc1)
    {
        return fzc1.aq;
    }

    static void i(fzc fzc1)
    {
        if (fzc1.ay != null && "Enabled".equals((String)fzc1.ay.a(fys.V)) && ((Boolean)fzc1.ay.a(fys.W)).booleanValue() && !TextUtils.isEmpty(fzc1.as))
        {
            long l1 = Long.parseLong(fzc1.as);
            Calendar calendar4 = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar4.setTimeInMillis(l1);
            Calendar calendar = a(calendar4, -6);
            Calendar calendar1 = GregorianCalendar.getInstance();
            if (!calendar1.after(calendar4) && !calendar1.before(calendar))
            {
                Calendar calendar2 = a(calendar4, -4);
                Calendar calendar3 = a(calendar4, -2);
                calendar4 = a(calendar4, -1);
                if (calendar1.after(calendar) && calendar1.before(calendar2) && !fzc1.b(Z))
                {
                    fzc1.a(Z);
                    return;
                }
                if (calendar1.after(calendar2) && calendar1.before(calendar3) && !fzc1.b(b))
                {
                    fzc1.a(b);
                    return;
                }
                if (calendar1.after(calendar3) && calendar1.before(calendar4) && !fzc1.b(a))
                {
                    fzc1.a(a);
                    return;
                }
            }
        }
    }

    static boolean j(fzc fzc1)
    {
        return fzc1.ag;
    }

    static boolean k(fzc fzc1)
    {
        fzc1.ag = true;
        return true;
    }

    static boolean l(fzc fzc1)
    {
        fzc1.al = true;
        return true;
    }

    static void m(fzc fzc1)
    {
        fzc1.H();
    }

    static fsf n(fzc fzc1)
    {
        return fzc1.aB;
    }

    public final void A()
    {
        ax.b(aE);
        ax.b();
        az.b(aF);
        az.b();
        super.A();
    }

    protected final void F()
    {
        ah = Y.b(this);
        ai = Y.b(this);
        aj = Y.b(this);
    }

    public final void a()
    {
        if (at == null) goto _L2; else goto _L1
_L1:
        a(at, ah);
        at = null;
_L4:
        return;
_L2:
        if (au != null)
        {
            a(au, ai);
            au = null;
            return;
        }
        if (av == null) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = av.getStringExtra("extra_key_to_mark_as_seen");
        av.removeExtra("extra_key_to_mark_as_seen");
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (Z.a.equals(obj))
        {
            obj = Z;
        } else
        {
            if (!b.a.equals(obj))
            {
                continue;
            }
            obj = b;
        }
_L8:
        ((giq)dmz.a(giq)).b(k()).b().a(((gip) (obj)), true).b();
_L6:
        do
        {
            a(av, aj);
            av = null;
            return;
        } while (!a.a.equals(obj));
        obj = a;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(int i1, int j1, Intent intent)
    {
        if (i1 != ah) goto _L2; else goto _L1
_L1:
        ae = true;
        ad = false;
_L4:
        super.a(i1, j1, intent);
        return;
_L2:
        if (i1 == ai)
        {
            af = true;
            ad = false;
        } else
        if (i1 == aj)
        {
            ad = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Context context)
    {
        super.a(context);
        ax = new dxc(context);
        dmz.a(edd);
        az = edd.a(context);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            ad = bundle.getBoolean("display_trial", false);
            ae = bundle.getBoolean("dialog_shown", false);
            af = bundle.getBoolean("dialog_ended_shown", false);
            ag = bundle.getBoolean("reminder_added", false);
            ah = bundle.getInt("start_request_code", 0);
            ai = bundle.getInt("end_request_code", 0);
            ah = bundle.getInt("trial_start_request_code");
            ai = bundle.getInt("trial_end_request_code");
            aj = bundle.getInt("extra_resub_request_code");
            ay = fyw.a(bundle);
            return;
        } else
        {
            ay = fyw.a(this);
            return;
        }
    }

    public final void a(DialogPresenter dialogpresenter)
    {
        super.a(dialogpresenter);
        if (at != null)
        {
            Y.a(this);
        }
        if (au != null)
        {
            Y.a(this);
        }
        if (av != null)
        {
            Y.a(this);
        }
    }

    public final void c()
    {
        super.c();
        dmz.a(fsi);
        aA = fsi.a(k());
        aB = new fsf(Cosmos.getResolver(k()), de.a(k()));
        if (gqa.a(ay))
        {
            fsf fsf1 = aB;
            fsj fsj = new fsj() {

                public final void a(int i1)
                {
                    gqc gqc1 = (gqc)dmz.a(gqc);
                    if (i1 != gqc1.b)
                    {
                        gqc1.b = i1;
                        ((gpy)dmz.a(gpy)).a("Days since Registration", Integer.valueOf(i1));
                    }
                }

            };
            fsf1.a.resolve(new Request("GET", "sp://ads/v1/targeting"), new fsf._cls2(fsf1.b, fsj));
        }
        u().a(0x7f1100ac, null, aC);
        u().a(0x7f1100ad, null, aD);
    }

    public final void d()
    {
        super.d();
        aA.a();
        aB.b();
        if (aw != null)
        {
            aw.d();
            aw = null;
        }
        u().a(0x7f1100ac);
        u().a(0x7f1100ad);
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("display_trial", ad);
        bundle.putBoolean("dialog_shown", ae);
        bundle.putBoolean("dialog_ended_shown", af);
        bundle.putBoolean("reminder_added", ag);
        bundle.putInt("start_request_code", ah);
        bundle.putInt("end_request_code", ai);
        bundle.putInt("trial_start_request_code", ah);
        bundle.putInt("trial_end_request_code", ai);
        bundle.putInt("extra_resub_request_code", aj);
        bundle.putParcelable("FlagsArgumentHelper.Flags", ay);
        super.e(bundle);
    }

    public final void z()
    {
        ax.a();
        ax.a(aE);
        az.a();
        az.a(aF);
        if (ar != null && !I())
        {
            aB.a(new fsk() {

                private fzc a;

                public final void a(com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel eligibilitylevel)
                {
                    boolean flag2 = false;
                    gqc gqc1;
                    boolean flag;
                    boolean flag1;
                    if (eligibilitylevel == com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.a && fzc.a(a).a(fys.aA) == OptInTrialBypassFlag.b)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (eligibilitylevel == com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.b)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (eligibilitylevel == com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.a)
                    {
                        flag2 = true;
                    }
                    if (!((flag2 | flag1) & gqa.a(fzc.a(a)))) goto _L2; else goto _L1
_L1:
                    if (flag)
                    {
                        ((gpy)dmz.a(gpy)).a("Is Bypassing Opt in Trial", Boolean.valueOf(true));
                    }
                    gqc1 = (gqc)dmz.a(gqc);
                    if (flag)
                    {
                        eligibilitylevel = com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.b;
                    }
                    if (eligibilitylevel == gqc1.a) goto _L2; else goto _L3
_L3:
                    gqc1.a = eligibilitylevel;
                    eligibilitylevel = "N/A";
                    gqc._cls1.a[gqc1.a.ordinal()];
                    JVM INSTR tableswitch 1 3: default 164
                //                               1 208
                //                               2 214
                //                               3 220;
                       goto _L4 _L5 _L6 _L7
_L4:
                    ((gpy)dmz.a(gpy)).a("Offer Eligibility Level", eligibilitylevel);
_L2:
                    if (flag || flag1)
                    {
                        fzc.b(a);
                    }
                    return;
_L5:
                    eligibilitylevel = "7 Day Trial";
                    continue; /* Loop/switch isn't completed */
_L6:
                    eligibilitylevel = "Market Offer";
                    continue; /* Loop/switch isn't completed */
_L7:
                    eligibilitylevel = "No Offer";
                    if (true) goto _L4; else goto _L8
_L8:
                }

            
            {
                a = fzc.this;
                super();
            }
            });
        }
        super.z();
    }

    static 
    {
        ac = TimeUnit.DAYS.toMillis(1L);
    }
}
