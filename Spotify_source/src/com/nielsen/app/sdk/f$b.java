// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            f, h, a, c

class <init>
    implements Runnable
{

    final f a;

    public void run()
    {
        long l;
        if (f.b(a) <= 0L || f.c(a) == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        l = h.g();
        if (l <= f.b(a))
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (!com.nielsen.app.sdk.a.b())
        {
            f.c(a).a();
            f.a(a, com.nielsen.app.sdk.a.a(f.d(a), f.e(a), f.b()));
            f.a(a, f.f(a) + l);
            c.a('I', "New App SDK refresh. Now(%d), next time(%d)", new Object[] {
                Long.valueOf(l), Long.valueOf(f.b(a))
            });
            return;
        }
        try
        {
            f.a(a, f.g(a) + l);
            c.a('I', "Postponed the App SDK refresh. Now(%d), next time(%d)", new Object[] {
                Long.valueOf(l), Long.valueOf(f.b(a))
            });
            return;
        }
        catch (Exception exception)
        {
            c.a(exception, true, 'E', "Error while setting up the refresh event", new Object[0]);
        }
    }

    private (f f1)
    {
        a = f1;
        super();
    }

    a(f f1, a a1)
    {
        this(f1);
    }
}
