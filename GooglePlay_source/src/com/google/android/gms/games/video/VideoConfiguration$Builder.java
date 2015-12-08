// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;


// Referenced classes of package com.google.android.gms.games.video:
//            VideoConfiguration

public static final class mLogProfileStats
{

    private int mCaptureMode;
    private boolean mLogProfileStats;
    private int mQualityLevel;
    private String mStreamKey;
    private String mStreamUrl;

    public final VideoConfiguration build()
    {
        return new VideoConfiguration(mQualityLevel, 0, null, null, (byte)0);
    }

    public (int i)
    {
        mQualityLevel = i;
        mCaptureMode = 0;
        mStreamUrl = null;
        mStreamKey = null;
        mLogProfileStats = false;
    }
}
