// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;

// Referenced classes of package com.google.android.gms.games.video:
//            Video, VideoEntity

public final class VideoRef extends DataBufferRef
    implements Video
{

    private Video freeze()
    {
        return new VideoEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getDuration()
    {
        return getInteger("duration");
    }

    public final String getFilePath()
    {
        return getString("filepath");
    }

    public final long getFileSize()
    {
        return getLong("filesize");
    }

    public final String getPackageName()
    {
        return getString("package");
    }

    public final long getStartTime()
    {
        return getLong("start_time");
    }

    public final String toString()
    {
        return VideoEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((VideoEntity)freeze()).writeToParcel(parcel, i);
    }
}
