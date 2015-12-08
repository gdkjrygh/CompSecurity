// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnn extends fni
{

    private final fni b;

    public fnn(fni fni1, fni fni2)
    {
        super("SyncNotification");
        b = fni1;
        fni2.a(new fnl() {

            private fnn a;

            public final void a()
            {
                if (fnn.a(a).d())
                {
                    a.J_();
                }
            }

            public final void b()
            {
                a.c();
            }

            
            {
                a = fnn.this;
                super();
            }
        });
    }

    static fni a(fnn fnn1)
    {
        return fnn1.b;
    }
}
