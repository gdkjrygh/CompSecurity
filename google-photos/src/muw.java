// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

final class muw
    implements muz
{

    muw()
    {
    }

    public final long a()
    {
        return System.currentTimeMillis();
    }

    public final long b()
    {
        return SystemClock.elapsedRealtime();
    }
}
