// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.ResetPasswordActivity;
import com.spotify.mobile.android.service.flow.login.StartFragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.tracking.InstallReferrerReceiver;
import com.spotify.music.spotlets.tracking.Tracking;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dxm extends dxk
    implements dwk
{

    private static final gip ac = gip.a("login_with_stored_credentials_on_next_start");
    private dwt Y;
    private dwk Z;
    boolean a;
    private boolean aa;
    private boolean ab;
    private final AtomicBoolean ad = new AtomicBoolean(false);
    private hfg ae;
    private BroadcastReceiver af;
    private an ag;
    private dxl b;

    public dxm()
    {
        af = new BroadcastReceiver() {

            private dxm a;

            public final void onReceive(Context context, Intent intent)
            {
                int i = intent.getIntExtra("error_code", 0);
                context = a.F();
                if (context != null)
                {
                    context.c(i);
                }
            }

            
            {
                a = dxm.this;
                super();
            }
        };
        ag = new an() {

            private final String a[] = {
                "logged_in", "logging_in", "payment_state", "suppress_welcome_screen", "current_account_type", "logging_out"
            };
            private boolean b;
            private dxm c;

            public final da a(Bundle bundle)
            {
                return new cu(c.k(), dtw.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    boolean flag1 = gcw.a(((Cursor) (obj)), 0);
                    boolean flag2 = gcw.a(((Cursor) (obj)), 1);
                    boolean flag3 = gcw.a(((Cursor) (obj)), 5);
                    boolean flag = gcw.a(((Cursor) (obj)), 3);
                    PaymentState paymentstate = new PaymentState(((Cursor) (obj)).getString(2));
                    int i = ((Cursor) (obj)).getInt(4);
                    int j = paymentstate.d();
                    if (j <= 0)
                    {
                        flag = true;
                    }
                    obj = (dxx)c.F();
                    if (obj != null)
                    {
                        ((dxx) (obj)).a(new dxy(flag1, flag2, flag3, flag, j));
                    }
                    if (flag1)
                    {
                        if (!b && !dxm.c(c))
                        {
                            Object obj1 = dxm.b(c);
                            Object obj2 = geu.a();
                            if (((geu) (obj2)).d())
                            {
                                obj2 = ((geu) (obj2)).c();
                                geh.a(((CharSequence) (obj2)), "referralCode must be set");
                                ((dxl) (obj1)).a(((String) (obj2)), null);
                            }
                            InstallReferrerReceiver.a(((dxl) (obj1)).b);
                            if (((dxl) (obj1)).c != null)
                            {
                                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Y, com.spotify.mobile.android.util.ClientEvent.SubEvent.aL);
                                dxl.a(clientevent, i);
                                ((dxl) (obj1)).a.a(((dxl) (obj1)).b, ((dxl) (obj1)).c, clientevent);
                            }
                            obj1 = (com.spotify.music.spotlets.tracking.Tracking.SourceType)((dxl) (obj1)).d.get(i);
                            if (obj1 != null)
                            {
                                ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).b(((com.spotify.music.spotlets.tracking.Tracking.SourceType) (obj1)));
                            }
                        }
                        if (obj != null && ((dxx) (obj)).J() && !flag3)
                        {
                            c.G();
                        }
                    } else
                    {
                        dxm.d(c);
                        c.k().setVisible(true);
                    }
                    b = flag1;
                }
            }

            
            {
                c = dxm.this;
                super();
            }
        };
        a();
    }

    public static dxm H()
    {
        return new dxm();
    }

    static hfg a(dxm dxm1, hfg hfg1)
    {
        dxm1.ae = hfg1;
        return hfg1;
    }

    static void a(dxm dxm1)
    {
label0:
        {
            if (dxm1.ad.compareAndSet(false, true))
            {
                dxl dxl1 = dxm1.b;
                Object obj = geu.a();
                if (((geu) (obj)).d())
                {
                    String s = ((geu) (obj)).c();
                    ((geu) (obj)).b();
                    dxl1.a(s, ((geu) (obj)).a.getProperty("partner"));
                }
                obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ae);
                dxl.a(((ClientEvent) (obj)), dxl1.e);
                fop.a(dxl1.b, ViewUri.b, ((ClientEvent) (obj)));
                if (dxl1.e == 1)
                {
                    for.a(dxl1.b);
                    AsyncTask.execute(new dxl._cls1(dxl1));
                }
                InstallReferrerReceiver.a(dxl1.b);
                if (dxl1.c != null)
                {
                    ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Y, com.spotify.mobile.android.util.ClientEvent.SubEvent.aM);
                    dxl.a(clientevent, dxl1.e);
                    dxl1.a.a(dxl1.b, dxl1.c, clientevent);
                }
                AsyncTask.execute(new fjl._cls1(dxl1.b));
                ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).a();
                dxm1 = (dxh)dxm1.k();
                if (dxm1 != null)
                {
                    break label0;
                }
                Logger.c("Could not finish flow - activity not attached", new Object[0]);
            }
            return;
        }
        dxm1.a(new dxk._cls2(dxm1));
    }

    static dxl b(dxm dxm1)
    {
        return dxm1.b;
    }

    public static void b(Context context)
    {
        ((giq)dmz.a(giq)).a(context).b().a(ac, true).a();
    }

    static boolean c(dxm dxm1)
    {
        return dxm1.a;
    }

    static void d(dxm dxm1)
    {
        if (!dxm1.ab)
        {
            dxm1.ab = true;
            gin gin1 = ((giq)dmz.a(giq)).a(dxm1.k());
            if (((giq)dmz.a(giq)).a(dxm1.k()).a(ac, false))
            {
                dxm1.a = false;
                dxm1.a(new dwk() {

                    public final void a(Object obj)
                    {
                        ((eae)obj).c();
                    }

                    public final void b()
                    {
                    }

                });
                gin1.b().a(ac).b();
            }
        }
    }

    public final void B()
    {
        Y.b();
        k().unregisterReceiver(af);
        if (ae != null)
        {
            ae.unsubscribe();
        }
        super.B();
    }

    protected final void a()
    {
        a(dxr, new dxs() {

            private dxm a;

            public final void a()
            {
                dxm.a(a);
            }

            public final void a(String s, String s1, boolean flag)
            {
                dxm dxm1 = a;
                dxm1.a = flag;
                dxm1.a(dxm1. new dwk(s, s1) {

                    private String a;
                    private String b;
                    private dxm c;

                    public final void a(Object obj)
                    {
                        ((eae)obj).a(a, b, dxm.c(c));
                    }

                    public final void b()
                    {
                    }

            
            {
                c = dxm.this;
                a = s;
                b = s1;
                super();
            }
                });
            }

            public final void b()
            {
                a.G();
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(dyr, new dys() {

            final dxm a;

            public final void a()
            {
                a.k().a_().c();
            }

            public final void a(String s)
            {
                a.b(dxz.a(s));
            }

            public final void a(String s, String s1)
            {
                a.a(s, s1, true);
            }

            public final void b()
            {
                dxm.a(a, ((dun)dmz.a(dun)).a(fys.al).a(((dup)dmz.a(dup)).c()).b().a(new hfb(this) {

                    private _cls7 a;

                    public final void onCompleted()
                    {
                    }

                    public final void onError(Throwable throwable)
                    {
                        Assertion.a("Error to observe flag Taste_ONBOARDING", throwable);
                        dxm.a(a.a);
                    }

                    public final void onNext(Object obj)
                    {
                        if (((Boolean)obj).booleanValue())
                        {
                            a.a.b(new dyh());
                            return;
                        } else
                        {
                            dxm.a(a.a);
                            return;
                        }
                    }

            
            {
                a = _pcls7;
                super();
            }
                }));
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(com/spotify/mobile/android/service/flow/login/StartFragment, new dyf() {

            private dxm a;

            public final void a()
            {
                a.b(dxz.a());
            }

            public final void b()
            {
                a.b(dyc.a());
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(dyh, new dyi() {

            private dxm a;

            public final void a()
            {
                dxm.a(a);
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(dko, new dkp() {

        });
        a(dxn, new dxo() {

            private dxm a;

            public final void a()
            {
                a.c(StartFragment.F());
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(dxz, new dya() {

            private dxm a;

            public final void a()
            {
                a.b(dxr.a());
            }

            public final void a(String s, String s1)
            {
                a.a(s, s1, false);
            }

            public final void b()
            {
                a.a(ResetPasswordActivity.a(a.k()));
            }

            
            {
                a = dxm.this;
                super();
            }
        });
        a(dyc, new dyd() {

            private dxm a;

            public final void a()
            {
                dxm.b(a).a(1);
                a.b(dxr.F());
            }

            public final void a(String s)
            {
                a.b(dxz.a(s));
            }

            public final void a(String s, String s1, dva dva)
            {
                dxm.b(a).a(0);
                a.b(dyr.a(s, s1, dva));
            }

            
            {
                a = dxm.this;
                super();
            }
        });
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        dxh dxh1 = (dxh)k();
        ctz.a(dxh1);
        b = new dxl(dxh1, dxh1.f());
        if (bundle == null)
        {
            c(StartFragment.F());
        } else
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        Y = new dwt(dxh1);
        Y.a(this);
        bundle = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.LOGIN_ERROR");
        bundle.addCategory("android.intent.category.DEFAULT");
        dxh1.registerReceiver(af, bundle);
    }

    final void a(dwk dwk1)
    {
        if (!aa)
        {
            Z = dwk1;
            aa = true;
            if (Y.c())
            {
                dwk1.a((eae)Y.f());
                aa = false;
                return;
            }
        }
    }

    public final volatile void a(Object obj)
    {
        obj = (eae)obj;
        if (Z != null)
        {
            Z.a(obj);
        }
        aa = false;
    }

    protected final void a(String s, String s1, boolean flag)
    {
        a = flag;
        a(new dwk(s, s1) {

            private String a;
            private String b;

            public final volatile void a(Object obj)
            {
                ((eae)obj).a(a, b);
            }

            public final void b()
            {
            }

            
            {
                a = s;
                b = s1;
                super();
            }
        });
    }

    public final void b()
    {
        dxx dxx1 = (dxx)F();
        if (dxx1 != null)
        {
            dxx1.c(SpotifyError.d.mCode);
        }
        aa = false;
    }

    public final void c()
    {
        super.c();
        Y.a();
        u().a(0x7f110083, null, ag);
    }

    public final void d()
    {
        Y.b();
        u().a(0x7f110083);
        super.d();
    }

}
