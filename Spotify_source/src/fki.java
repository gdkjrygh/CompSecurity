// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fki extends fkh
{

    edk a;

    public fki(edk edk1)
    {
        ctz.a(edk1);
        a = edk1;
    }

    public final void a()
    {
        a.c();
    }

    public final void a(fku fku, int i)
    {
        a.a();
        a.a(new edm(fku, i) {

            private fku a;
            private int b;
            private fki c;

            public final void a()
            {
            }

            public final void a(int j)
            {
                a.a(j, b);
                c.a.b();
            }

            
            {
                c = fki.this;
                a = fku1;
                b = i;
                super();
            }
        });
    }
}
