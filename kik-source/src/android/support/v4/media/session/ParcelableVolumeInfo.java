// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;

    public ParcelableVolumeInfo(int i, int j, int k, int l, int i1)
    {
        volumeType = i;
        audioStream = j;
        controlType = k;
        maxVolume = l;
        currentVolume = i1;
    }

    public ParcelableVolumeInfo(Parcel parcel)
    {
        volumeType = parcel.readInt();
        controlType = parcel.readInt();
        maxVolume = parcel.readInt();
        currentVolume = parcel.readInt();
        audioStream = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(volumeType);
        parcel.writeInt(controlType);
        parcel.writeInt(maxVolume);
        parcel.writeInt(currentVolume);
        parcel.writeInt(audioStream);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ParcelableVolumeInfo createFromParcel(Parcel parcel)
        {
            return new ParcelableVolumeInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ParcelableVolumeInfo[] newArray(int i)
        {
            return new ParcelableVolumeInfo[i];
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
