// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ceh extends ckq
{

    final cei a;
    private final Object c = new Object();
    private boolean d;

    public ceh(cei cei)
    {
        a = cei;
    }

    public final void a()
    {
label0:
        {
            synchronized (c)
            {
                if (!d)
                {
                    break label0;
                }
            }
            return;
        }
        d = true;
        a(new ckp() {

            public final void a(Object obj1)
            {
                obj1 = (cae)obj1;
                bka.d("Ending javascript session.");
                ((caf)obj1).a();
            }

        }, ((ckn) (new cko())));
        a(new ckp() {

            private ceh a;

            public final void a(Object obj1)
            {
                bka.d("Releasing engine reference.");
                a.a.b();
            }

            
            {
                a = ceh.this;
                super();
            }
        }, new ckn() {

            private ceh a;

            public final void a()
            {
                a.a.b();
            }

            
            {
                a = ceh.this;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
