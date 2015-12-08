// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

final class jjo
    implements jim
{

    boolean a;
    long b;
    long c;

    jjo()
    {
    }

    static long b(long l)
    {
        return SystemClock.elapsedRealtime() * 1000L - l;
    }

    public final void a()
    {
        if (a)
        {
            b = b(c);
            a = false;
        }
    }

    public final void a(long l)
    {
        b = l;
        c = b(l);
    }

    public final long b()
    {
        if (a)
        {
            return b(c);
        } else
        {
            return b;
        }
    }
}
