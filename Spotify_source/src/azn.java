// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

final class azn
    implements ayy
{

    boolean a;
    long b;
    long c;

    azn()
    {
    }

    static long b(long l)
    {
        return SystemClock.elapsedRealtime() * 1000L - l;
    }

    public final void a(long l)
    {
        b = l;
        c = b(l);
    }

    public final void b()
    {
        if (a)
        {
            b = b(c);
            a = false;
        }
    }

    public final long d_()
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
