// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


// Referenced classes of package com.nuance.b.a:
//            ac

public final class ab
{

    public static final ab c;
    public static final ab d;
    public static final ab e;
    public static final ab f;
    public final ac a;
    public final Runnable b;

    private ab(ac ac1, Runnable runnable)
    {
        a = ac1;
        b = runnable;
    }

    public static ab a(Runnable runnable)
    {
        if (runnable == null)
        {
            throw new NullPointerException("runnable cannot be null");
        } else
        {
            return new ab(ac.c, runnable);
        }
    }

    public final String toString()
    {
        return a.toString();
    }

    static 
    {
        c = new ab(ac.e, null);
        d = new ab(ac.a, null);
        e = new ab(ac.d, null);
        f = new ab(ac.b, null);
    }
}
