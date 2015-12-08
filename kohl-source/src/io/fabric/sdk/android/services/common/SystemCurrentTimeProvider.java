// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//            CurrentTimeProvider

public class SystemCurrentTimeProvider
    implements CurrentTimeProvider
{

    public SystemCurrentTimeProvider()
    {
    }

    public long getCurrentTimeMillis()
    {
        return System.currentTimeMillis();
    }
}
