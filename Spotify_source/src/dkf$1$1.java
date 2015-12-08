// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.arsenal.FeedbackMode;
import com.spotify.mobile.android.service.session.SessionState;

final class g.Object
    implements dkq
{

    private String a;
    private String b;
    private g.String c;

    public final void a()
    {
        c.c.G();
    }

    public final void b()
    {
        dkw.a(c.c.k(), a);
        if (dkf.a(c.c).b.equals(b))
        {
            dkf.b(c.c, dkd.a(c.c.k().getString(0x7f0800b5), c.c.k().getString(0x7f0800b4)));
            return;
        } else
        {
            dkw.b(c.c.k(), b, b);
            dkf.c(c.c, dkd.a(c.c.k().getString(0x7f0800b9), c.c.k().getString(0x7f0800b8)));
            return;
        }
    }

    g.String( , String s, String s1)
    {
        c = ;
        a = s;
        b = s1;
        super();
    }

    // Unreferenced inner class dkf$1

/* anonymous class */
    final class dkf._cls1
        implements djy
    {

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
            dkf.b(a).a(new dkf._cls1._cls1(this, s, s1));
        }

        public final void b()
        {
            dkf.b(a).a(new dkf._cls1._cls2());
        }

            
            {
                a = dkf1;
                super();
            }

        // Unreferenced inner class dkf$1$2

/* anonymous class */
        final class dkf._cls1._cls2
            implements dkq
        {

            private dkf._cls1 a;

            public final void a()
            {
                a.a.G();
            }

            public final void b()
            {
                dkf.d(a.a, dkd.a(a.a.k().getString(0x7f0800bd), a.a.k().getString(0x7f0800bc)));
            }

                    
                    {
                        a = dkf._cls1.this;
                        super();
                    }
        }

    }

}
