// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            av, af

final class w
{

    private volatile int a;
    private volatile long b;

    w()
    {
        a = 0;
        b = -1L;
    }

    public final void a(boolean flag)
    {
        b = System.currentTimeMillis();
        if (flag)
        {
            av.a("BackoffCounter", "backoff counter logging success");
            a = 0;
            return;
        } else
        {
            av.a("BackoffCounter", "backoff counter logging failure");
            a = a + 1;
            return;
        }
    }

    public final boolean a(long l)
    {
        boolean flag;
        boolean flag1;
        if (l > 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        af.a(flag1);
        if (a > 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && b > 0L && System.currentTimeMillis() - b < l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        av.a("BackoffCounter", (new StringBuilder("shouldBackOff(interval) returning ")).append(flag1).toString());
        return flag1;
    }
}
