// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class g.Object
    implements ckp
{

    private cbi a;
    private g.Throwable b;

    public final void a(Object obj)
    {
        obj = (cae)obj;
        b.b.a(a, new String[] {
            "jsf"
        });
        b.b.b();
        ((cae) (obj)).a("/invalidRequest", b.b.g);
        ((cae) (obj)).a("/loadAdURL", b.b.h);
        try
        {
            ((cae) (obj)).a("AFMA_buildAdURL", b.b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.b("Error requesting an ad url", ((Throwable) (obj)));
        }
    }

    ( , cbi cbi)
    {
        b = ;
        a = cbi;
        super();
    }

    // Unreferenced inner class cif$1

/* anonymous class */
    final class cif._cls1
        implements Runnable
    {

        final cih a;
        final cbk b;
        final String c;
        private ced d;
        private cbi e;

        public final void run()
        {
            ceh ceh1 = d.b();
            a.f = ceh1;
            b.a(e, new String[] {
                "rwc"
            });
            ceh1.a(new cif._cls1._cls1(this, b.a()), new cif._cls1._cls2());
        }

            
            {
                d = ced1;
                a = cih1;
                b = cbk1;
                e = cbi;
                c = s;
                super();
            }

        // Unreferenced inner class cif$1$2

/* anonymous class */
        final class cif._cls1._cls2
            implements ckn
        {

            public final void a()
            {
            }

        }

    }

}
