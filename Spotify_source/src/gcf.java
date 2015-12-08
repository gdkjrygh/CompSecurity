// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.TimeZone;

public final class gcf
{

    public static final gcf a = new gcf();

    public gcf()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis();
    }

    public static long b()
    {
        return SystemClock.elapsedRealtime();
    }

    public static long c()
    {
        return SystemClock.uptimeMillis();
    }

    public static TimeZone d()
    {
        return TimeZone.getDefault();
    }

}
