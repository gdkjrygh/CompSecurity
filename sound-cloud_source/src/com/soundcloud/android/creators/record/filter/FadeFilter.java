// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.filter;

import android.os.Parcel;
import com.soundcloud.android.creators.record.AudioConfig;
import com.soundcloud.android.creators.record.PlaybackFilter;
import java.nio.ByteBuffer;

public class FadeFilter
    implements PlaybackFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final int FADE_EXP_CURVE = 2;
    private static final int FADE_LENGTH_MS = 1000;
    public static final int FADE_TYPE_BEGINNING = 1;
    public static final int FADE_TYPE_BOTH = 0;
    public static final int FADE_TYPE_END = 2;
    private final int fadeExpCurve;
    private final long fadeSize;
    private final int fadeType;

    public FadeFilter(int i, long l)
    {
        this(i, l, 2);
    }

    public FadeFilter(int i, long l, int j)
    {
        fadeSize = l;
        fadeType = i;
        fadeExpCurve = j;
    }

    public FadeFilter(AudioConfig audioconfig)
    {
        this(audioconfig, 0);
    }

    public FadeFilter(AudioConfig audioconfig, int i)
    {
        this(i, audioconfig.msToByte(1000L));
    }

    private void applyVolumeChangeToBuffer(ByteBuffer bytebuffer, long l, int i, int j, long l1, 
            boolean flag)
    {
        int k = Math.max(0, i - i % 2);
        for (i = k; i < k + j; i += 2)
        {
            double d1 = Math.pow((double)(((long)i + l) - l1) / (double)fadeSize, fadeExpCurve);
            double d2 = bytebuffer.getShort(i);
            double d = d1;
            if (flag)
            {
                d = 1.0D - d1;
            }
            bytebuffer.putShort(i, (short)(int)(d * d2));
        }

    }

    public ByteBuffer apply(ByteBuffer bytebuffer, long l, long l1)
    {
        int i = (int)Math.min(l1 - l, bytebuffer.remaining());
        if (l < fadeSize && (fadeType == 1 || fadeType == 0))
        {
            applyVolumeChangeToBuffer(bytebuffer, l, 0, (int)Math.min(i, fadeSize - l), 0L, false);
        }
        long l2 = l1 - fadeSize;
        if ((long)bytebuffer.remaining() + l > l2 && (fadeType == 2 || fadeType == 0))
        {
            int j;
            if (l >= l2)
            {
                l1 = 0L;
            } else
            {
                l1 = l2 - l;
            }
            j = (int)l1;
            applyVolumeChangeToBuffer(bytebuffer, l, j, i - j, l2, true);
        }
        return bytebuffer;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("FadeFilter{fadeSize=")).append(fadeSize).append(", fadeType=").append(fadeType).append(", fadeExpCurve=").append(fadeExpCurve).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(fadeType);
        parcel.writeLong(fadeSize);
        parcel.writeInt(fadeExpCurve);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final FadeFilter createFromParcel(Parcel parcel)
        {
            return new FadeFilter(parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final FadeFilter[] newArray(int i)
        {
            return new FadeFilter[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
