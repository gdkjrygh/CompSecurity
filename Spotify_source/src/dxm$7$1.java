// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;

final class g.Object
    implements hfb
{

    private a a;

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

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class dxm$7

/* anonymous class */
    final class dxm._cls7
        implements dys
    {

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
            dxm.a(a, ((dun)dmz.a(dun)).a(fys.al).a(((dup)dmz.a(dup)).c()).b().a(new dxm._cls7._cls1(this)));
        }

            
            {
                a = dxm1;
                super();
            }
    }

}
