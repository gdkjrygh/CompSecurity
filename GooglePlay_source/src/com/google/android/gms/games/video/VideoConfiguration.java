// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.video:
//            VideoConfigurationCreator

public class VideoConfiguration
    implements SafeParcelable
{
    public static final class Builder
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

        public Builder(int i)
        {
            mQualityLevel = i;
            mCaptureMode = 0;
            mStreamUrl = null;
            mStreamKey = null;
            mLogProfileStats = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new VideoConfigurationCreator();
    public final int mCaptureMode;
    public final int mQualityLevel;
    public final String mStreamKey;
    public final String mStreamUrl;
    final int mVersionCode;

    public VideoConfiguration(int i, int j, int k, String s, String s1)
    {
        boolean flag1 = true;
        super();
        mVersionCode = i;
        Preconditions.checkArgument(isValidQualityLevel(j));
        Preconditions.checkArgument(isValidCaptureMode(k));
        mQualityLevel = j;
        mCaptureMode = k;
        if (k == 1)
        {
            mStreamKey = s1;
            mStreamUrl = s;
            return;
        }
        boolean flag;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Stream key should be null when not streaming");
        if (s == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Stream url should be null when not streaming");
        mStreamKey = null;
        mStreamUrl = null;
    }

    private VideoConfiguration(int i, int j, String s, String s1)
    {
        this(1, i, j, s, s1);
    }

    VideoConfiguration(int i, int j, String s, String s1, byte byte0)
    {
        this(i, j, null, null);
    }

    public static boolean isValidCaptureMode(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public static boolean isValidQualityLevel(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        VideoConfigurationCreator.writeToParcel$31bc329b(this, parcel);
    }

}
