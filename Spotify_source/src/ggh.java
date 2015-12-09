// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class ggh
{

    private long a;

    public ggh()
    {
        a = SystemClock.uptimeMillis();
    }

    public final long a()
    {
        long l = SystemClock.uptimeMillis();
        long l1 = a;
        a = l;
        return l - l1;
    }
}
