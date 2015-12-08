// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableBoolean extends BaseObservable
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ObservableBoolean createFromParcel(Parcel parcel)
        {
            boolean flag = true;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            return new ObservableBoolean(flag);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ObservableBoolean[] newArray(int i)
        {
            return new ObservableBoolean[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 1L;
    private boolean mValue;

    public ObservableBoolean()
    {
    }

    public ObservableBoolean(boolean flag)
    {
        mValue = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean get()
    {
        return mValue;
    }

    public void set(boolean flag)
    {
        if (flag != mValue)
        {
            mValue = flag;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (mValue)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
