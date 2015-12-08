// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.SystemClock;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.utils:
//            DateProvider

public class SystemClockDateProvider
    implements DateProvider
{

    public SystemClockDateProvider()
    {
    }

    public Date getCurrentDate()
    {
        return new Date(SystemClock.uptimeMillis());
    }

    public long getCurrentTime()
    {
        return SystemClock.uptimeMillis();
    }
}
