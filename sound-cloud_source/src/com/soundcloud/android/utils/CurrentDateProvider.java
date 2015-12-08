// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.util.Date;

// Referenced classes of package com.soundcloud.android.utils:
//            DateProvider

public class CurrentDateProvider
    implements DateProvider
{

    public CurrentDateProvider()
    {
    }

    public Date getCurrentDate()
    {
        return new Date();
    }

    public long getCurrentTime()
    {
        return System.currentTimeMillis();
    }
}
