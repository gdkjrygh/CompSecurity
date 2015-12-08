// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableFloat extends BaseObservable
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ObservableFloat createFromParcel(Parcel parcel)
        {
            return new ObservableFloat(parcel.readFloat());
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ObservableFloat[] newArray(int i)
        {
            return new ObservableFloat[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 1L;
    private float mValue;

    public ObservableFloat()
    {
    }

    public ObservableFloat(float f)
    {
        mValue = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public float get()
    {
        return mValue;
    }

    public void set(float f)
    {
        if (f != mValue)
        {
            mValue = f;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(mValue);
    }

}
