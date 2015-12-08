// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableInt extends BaseObservable
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ObservableInt createFromParcel(Parcel parcel)
        {
            return new ObservableInt(parcel.readInt());
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ObservableInt[] newArray(int i)
        {
            return new ObservableInt[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 1L;
    private int mValue;

    public ObservableInt()
    {
    }

    public ObservableInt(int i)
    {
        mValue = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public int get()
    {
        return mValue;
    }

    public void set(int i)
    {
        if (i != mValue)
        {
            mValue = i;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mValue);
    }

}
