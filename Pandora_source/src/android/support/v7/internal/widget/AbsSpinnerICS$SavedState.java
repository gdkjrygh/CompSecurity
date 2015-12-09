// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerICS

static class <init> extends android.view.SpinnerICS.SavedState
{

    public static final android.os.bsSpinnerICS.SavedState.b CREATOR = new android.os.Parcelable.Creator() {

        public AbsSpinnerICS.SavedState a(Parcel parcel)
        {
            return new AbsSpinnerICS.SavedState(parcel, null);
        }

        public AbsSpinnerICS.SavedState[] a(int i)
        {
            return new AbsSpinnerICS.SavedState[i];
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
    long a;
    int b;

    public String toString()
    {
        return (new StringBuilder()).append("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.ToParcel(parcel, i);
        parcel.writeLong(a);
        parcel.writeInt(b);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readLong();
        b = parcel.readInt();
    }

    b(Parcel parcel, b b1)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
