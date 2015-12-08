// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

static class te extends te
{

    public static final android.os.pinnerCompat.SavedState._cls1 CREATOR = new _cls1();
    boolean showDropdown;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (showDropdown)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showDropdown = flag;
    }

    showDropdown(Parcel parcel, showDropdown showdropdown)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SpinnerCompat.SavedState createFromParcel(Parcel parcel)
        {
            return new SpinnerCompat.SavedState(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SpinnerCompat.SavedState[] newArray(int i)
        {
            return new SpinnerCompat.SavedState[i];
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
