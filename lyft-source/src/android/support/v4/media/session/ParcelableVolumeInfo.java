// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ParcelableVolumeInfo a(Parcel parcel)
        {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] a(int i)
        {
            return new ParcelableVolumeInfo[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public ParcelableVolumeInfo(Parcel parcel)
    {
        a = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
        b = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeInt(b);
    }

}
