// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;

public final class epy
    implements epx
{

    public epy()
    {
    }

    public final void a(Fragment fragment, String s, String s1)
    {
        aa aa1 = fragment.n();
        geh.b();
        epv epv2 = (epv)aa1.a("feature_persistence_fragment");
        epv epv1 = epv2;
        if (epv2 == null)
        {
            epv1 = epv.a(s, s1);
            aa1.a().a(epv1, "feature_persistence_fragment").d();
            aa1.b();
        }
        epv1.a(new fyi(epv1, fragment) {

            final Fragment a;
            private epv b;

            public final boolean c()
            {
                b.a().a(a);
                return false;
            }

            public final boolean d()
            {
                Bundle bundle = new Bundle();
                ((epu)a).c(bundle);
                b.a().a(bundle, new ept(this) {

                    private _cls1 a;

                    public final void a()
                    {
                        ((epu)a.a).H_();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                return false;
            }

            
            {
                b = epv1;
                a = fragment;
                super();
            }
        });
        if (fragment.q())
        {
            epv1.a().a(fragment);
        }
    }
}
