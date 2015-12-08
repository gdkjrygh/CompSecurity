// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableChar extends BaseObservable
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ObservableChar createFromParcel(Parcel parcel)
        {
            return new ObservableChar((char)parcel.readInt());
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ObservableChar[] newArray(int i)
        {
            return new ObservableChar[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final long serialVersionUID = 1L;
    private char mValue;

    public ObservableChar()
    {
    }

    public ObservableChar(char c)
    {
        mValue = c;
    }

    public int describeContents()
    {
        return 0;
    }

    public char get()
    {
        return mValue;
    }

    public void set(char c)
    {
        if (c != mValue)
        {
            mValue = c;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mValue);
    }

}
