// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableByte extends BaseObservable
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ObservableByte createFromParcel(Parcel parcel)
        {
            return new ObservableByte(parcel.readByte());
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ObservableByte[] newArray(int i)
        {
            return new ObservableByte[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 1L;
    private byte mValue;

    public ObservableByte()
    {
    }

    public ObservableByte(byte byte0)
    {
        mValue = byte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte get()
    {
        return mValue;
    }

    public void set(byte byte0)
    {
        if (byte0 != mValue)
        {
            mValue = byte0;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByte(mValue);
    }

}
