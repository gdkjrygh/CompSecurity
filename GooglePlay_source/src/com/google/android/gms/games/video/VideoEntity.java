// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.video:
//            Video, VideoEntityCreator

public final class VideoEntity
    implements SafeParcelable, Video
{

    public static final android.os.Parcelable.Creator CREATOR = new VideoEntityCreator();
    final int mDuration;
    final String mFilePath;
    final long mFileSize;
    final String mPackageName;
    final long mStartTime;
    final int mVersionCode;

    VideoEntity(int i, int j, String s, long l, long l1, 
            String s1)
    {
        mVersionCode = i;
        mDuration = j;
        mFilePath = s;
        mFileSize = l;
        mStartTime = l1;
        mPackageName = s1;
    }

    public VideoEntity(Video video)
    {
        mVersionCode = 1;
        mDuration = video.getDuration();
        mFilePath = video.getFilePath();
        mFileSize = video.getFileSize();
        mStartTime = video.getStartTime();
        mPackageName = video.getPackageName();
        Asserts.checkNotNull(mFilePath);
        Asserts.checkNotNull(mPackageName);
    }

    static String toString(Video video)
    {
        return Objects.toStringHelper(video).add("Duration", Integer.valueOf(video.getDuration())).add("File path", video.getFilePath()).add("File size", Long.valueOf(video.getFileSize())).add("Start time", Long.valueOf(video.getStartTime())).add("Package name", video.getPackageName()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Video)) goto _L2; else goto _L1
_L1:
        if (this != obj) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (Objects.equal(Integer.valueOf(((Video) (obj = (Video)obj)).getDuration()), Integer.valueOf(getDuration())) && Objects.equal(((Video) (obj)).getFilePath(), getFilePath()) && Objects.equal(Long.valueOf(((Video) (obj)).getFileSize()), Long.valueOf(getFileSize())) && Objects.equal(Long.valueOf(((Video) (obj)).getStartTime()), Long.valueOf(getStartTime())) && Objects.equal(((Video) (obj)).getPackageName(), getPackageName())) goto _L3; else goto _L2
_L2:
        return false;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getDuration()
    {
        return mDuration;
    }

    public final String getFilePath()
    {
        return mFilePath;
    }

    public final long getFileSize()
    {
        return mFileSize;
    }

    public final String getPackageName()
    {
        return mPackageName;
    }

    public final long getStartTime()
    {
        return mStartTime;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(getDuration()), getFilePath(), Long.valueOf(getFileSize()), Long.valueOf(getStartTime()), getPackageName()
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((Video) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        VideoEntityCreator.writeToParcel$538f6138(this, parcel);
    }

}
