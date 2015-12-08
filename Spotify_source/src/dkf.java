// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobile.android.arsenal.ArsenalLinkingFragment;
import com.spotify.mobile.android.arsenal.FeedbackMode;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Iterator;
import java.util.List;

public final class dkf extends dxk
{

    private Flags Y;
    private SessionState Z;
    private dxc a;
    private FeedbackMode aa;
    private dwx ab;
    private eda ac;
    private edb b;

    public dkf()
    {
        aa = FeedbackMode.b;
        ab = new dwx() {

            private dkf a;

            public final void a(Flags flags)
            {
                dkf.a(a, flags);
                dkf.c(a);
            }

            
            {
                a = dkf.this;
                super();
            }
        };
        ac = new eda() {

            private dkf a;

            public final void a(SessionState sessionstate)
            {
                dkf.a(a, sessionstate);
                dkf.c(a);
            }

            
            {
                a = dkf.this;
                super();
            }
        };
        a();
    }

    static SessionState a(dkf dkf1)
    {
        return dkf1.Z;
    }

    static SessionState a(dkf dkf1, SessionState sessionstate)
    {
        dkf1.Z = sessionstate;
        return sessionstate;
    }

    static Flags a(dkf dkf1, Flags flags)
    {
        dkf1.Y = flags;
        return flags;
    }

    public static dkf a(FeedbackMode feedbackmode)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_FEEDBACK_MODE", feedbackmode.ordinal());
        feedbackmode = new dkf();
        feedbackmode.f(bundle);
        return feedbackmode;
    }

    static void a(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static FeedbackMode b(dkf dkf1)
    {
        return dkf1.aa;
    }

    static void b(dkf dkf1, dxj dxj)
    {
        dkf1.b(dxj);
    }

    static void c(dkf dkf1)
    {
        if (dkf1.Z != null && dkf1.Y != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Iterator iterator = dkf1.m().f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((Fragment)iterator.next() instanceof djx));
        flag = true;
_L4:
        if (!flag)
        {
            dkw.b(dkf1.k(), dkf1.Z.b, dkf1.Z.c);
            dkf1.c(((dxj) (djx.a(dkf1.Y))));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void c(dkf dkf1, dxj dxj)
    {
        dkf1.b(dxj);
    }

    static void d(dkf dkf1, dxj dxj)
    {
        dkf1.b(dxj);
    }

    static void e(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static void f(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static void g(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static void h(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static void i(dkf dkf1, dxj dxj)
    {
        dkf1.c(dxj);
    }

    static void j(dkf dkf1, dxj dxj)
    {
        dkf1.b(dxj);
    }

    static void k(dkf dkf1, dxj dxj)
    {
        dkf1.b(dxj);
    }

    protected final void a()
    {
        a(djx, new djy() {

            final dkf a;

            public final void a()
            {
                a.G();
            }

            public final void a(Optional optional)
            {
                if (optional.b())
                {
                    dkw.a(a.k(), (String)optional.c());
                }
                dkf.a(a, djz.a());
            }

            public final void a(String s, String s1)
            {
                dkf.b(a).a(new dkq(this, s, s1) {

                    private String a;
                    private String b;
                    private _cls1 c;

                    public final void a()
                    {
                        c.a.G();
                    }

                    public final void b()
                    {
                        dkw.a(c.a.k(), a);
                        if (dkf.a(c.a).b.equals(b))
                        {
                            dkf.b(c.a, dkd.a(c.a.k().getString(0x7f0800b5), c.a.k().getString(0x7f0800b4)));
                            return;
                        } else
                        {
                            dkw.b(c.a.k(), b, b);
                            dkf.c(c.a, dkd.a(c.a.k().getString(0x7f0800b9), c.a.k().getString(0x7f0800b8)));
                            return;
                        }
                    }

            
            {
                c = _pcls1;
                a = s;
                b = s1;
                super();
            }
                });
            }

            public final void b()
            {
                dkf.b(a).a(new dkq(this) {

                    private _cls1 a;

                    public final void a()
                    {
                        a.a.G();
                    }

                    public final void b()
                    {
                        dkf.d(a.a, dkd.a(a.a.k().getString(0x7f0800bd), a.a.k().getString(0x7f0800bc)));
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = dkf.this;
                super();
            }
        });
        a(djz, new dka() {

            private dkf a;

            public final void a()
            {
                dkf.e(a, dxp.a());
            }

            public final void b()
            {
                a.G();
            }

            
            {
                a = dkf.this;
                super();
            }
        });
        a(dxp, new dxq() {

            private dkf a;

            public final void a()
            {
                dkf.g(a, dkd.a(a.k().getString(0x7f0800bd), a.k().getString(0x7f0800bc)));
            }

            public final void a(String s, String s1)
            {
                dkw.a(a.k(), s1);
                dkf.f(a, ArsenalLinkingFragment.a(s, dkf.a(a).b, a));
            }

            
            {
                a = dkf.this;
                super();
            }
        });
        a(com/spotify/mobile/android/arsenal/ArsenalLinkingFragment, new dki() {

            private dkf a;

            public final void a()
            {
                dkf.h(a, dkd.a(a.k().getString(0x7f0800bb), a.k().getString(0x7f0800ba)));
            }

            public final void a(String s)
            {
                dkw.b(a.k(), s, s);
                dkf.j(a, dkd.a(a.k().getString(0x7f0800b9), a.k().getString(0x7f0800b8)));
            }

            public final void b()
            {
                dkf.i(a, dkd.a(a.k().getString(0x7f0800b7), a.k().getString(0x7f0800b6)));
            }

            public final void c()
            {
                dkf.k(a, dkd.a(a.k().getString(0x7f0800b5), a.k().getString(0x7f0800b4)));
            }

            
            {
                a = dkf.this;
                super();
            }
        });
        a(dkd, new dke() {

            private dkf a;

            public final void a()
            {
                a.G();
            }

            
            {
                a = dkf.this;
                super();
            }
        });
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        aa = FeedbackMode.a(g().getInt("KEY_FEEDBACK_MODE", FeedbackMode.b.ordinal()));
    }

    public final void c()
    {
        super.c();
        a.a();
        b.a();
    }

    public final void d()
    {
        super.d();
        a.b(ab);
        a.b();
        b.b(ac);
        b.b();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        a = new dxc(k());
        a.a(ab);
        b = new edb(k());
        b.a(ac);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            Y = fyw.a(bundle);
            a.a(ab);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", Y);
    }
}
