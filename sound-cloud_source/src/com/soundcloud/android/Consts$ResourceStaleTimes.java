// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android:
//            Consts

public static final class 
{

    public static final long ACTIVITY;
    public static final long PLAYLIST;
    public static final long TRACK;
    public static final long USER;

    static 
    {
        USER = TimeUnit.DAYS.toMillis(1L);
        TRACK = TimeUnit.HOURS.toMillis(4L);
        PLAYLIST = TimeUnit.HOURS.toMillis(4L);
        ACTIVITY = TimeUnit.MINUTES.toMillis(20L);
    }

    public ()
    {
    }
}
