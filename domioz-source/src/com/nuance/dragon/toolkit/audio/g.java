// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;

import android.os.SystemClock;

// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            h, i, e, j

public final class g extends h
{

    public g(e e1, byte abyte0[])
    {
        this(e1, null, abyte0, 0L, 0, i.a, null);
    }

    public g(e e1, byte abyte0[], int j, i k)
    {
        this(e1, null, abyte0, SystemClock.uptimeMillis(), j, k, null);
    }

    public g(e e1, short aword0[])
    {
        this(e1, aword0, null, SystemClock.uptimeMillis(), e1.a(aword0.length), i.a, null);
    }

    public g(e e1, short aword0[], long l)
    {
        this(e1, aword0, null, l, e1.a(aword0.length), i.a, null);
    }

    public g(e e1, short aword0[], long l, j aj[])
    {
        this(e1, aword0, null, l, e1.a(aword0.length), i.a, aj);
    }

    public g(e e1, short aword0[], i j)
    {
        this(e1, aword0, null, SystemClock.uptimeMillis(), e1.a(aword0.length), j, null);
    }

    private g(e e1, short aword0[], byte abyte0[], long l, int j, i k, 
            j aj[])
    {
        super(e1, aword0, abyte0, l, j, k, aj);
    }

    public g(e e1, short aword0[], j aj[])
    {
        this(e1, aword0, null, SystemClock.uptimeMillis(), e1.a(aword0.length), i.a, aj);
    }
}
