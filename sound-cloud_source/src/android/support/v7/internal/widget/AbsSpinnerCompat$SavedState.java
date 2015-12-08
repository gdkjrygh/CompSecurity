// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat

static class position extends android.view.nnerCompat.SavedState
{

    public static final android.os.pinnerCompat.SavedState._cls1 CREATOR = new _cls1();
    int position;
    long selectedId;

    public String toString()
    {
        return (new StringBuilder("AbsSpinner.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" position=").append(position).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        parcel.writeLong(selectedId);
        parcel.writeInt(position);
    }


    _cls1(Parcel parcel)
    {
        super(parcel);
        selectedId = parcel.readLong();
        position = parcel.readInt();
    }

    position(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final AbsSpinnerCompat.SavedState createFromParcel(Parcel parcel)
        {
            return new AbsSpinnerCompat.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AbsSpinnerCompat.SavedState[] newArray(int i)
        {
            return new AbsSpinnerCompat.SavedState[i];
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
