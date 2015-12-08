// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


// Referenced classes of package me.lyft.android.common:
//            IDeviceClock

class 
    implements IDeviceClock
{

    public long getCurrentTimeMs()
    {
        return System.currentTimeMillis();
    }

    public long getElapsedTimeMs()
    {
        return System.currentTimeMillis();
    }

    ()
    {
    }
}
