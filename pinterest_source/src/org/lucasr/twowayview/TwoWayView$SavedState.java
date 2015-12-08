// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.LongSparseArray;
import android.util.SparseBooleanArray;

class <init> extends android.view.vedState
{

    public static final android.os.SavedState._cls1 CREATOR = new _cls1();
    LongSparseArray checkIdState;
    SparseBooleanArray checkState;
    int checkedItemCount;
    long firstId;
    int height;
    int position;
    long selectedId;
    int viewStart;

    public String toString()
    {
        return (new StringBuilder("TwoWayView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" firstId=").append(firstId).append(" viewStart=").append(viewStart).append(" height=").append(height).append(" position=").append(position).append(" checkState=").append(checkState).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = 0;
        super.iteToParcel(parcel, i);
        parcel.writeLong(selectedId);
        parcel.writeLong(firstId);
        parcel.writeInt(viewStart);
        parcel.writeInt(position);
        parcel.writeInt(height);
        parcel.writeInt(checkedItemCount);
        parcel.writeSparseBooleanArray(checkState);
        if (checkIdState != null)
        {
            i = checkIdState.size();
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        for (; j < i; j++)
        {
            parcel.writeLong(checkIdState.keyAt(j));
            parcel.writeInt(((Integer)checkIdState.valueAt(j)).intValue());
        }

    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        selectedId = parcel.readLong();
        firstId = parcel.readLong();
        viewStart = parcel.readInt();
        position = parcel.readInt();
        height = parcel.readInt();
        checkedItemCount = parcel.readInt();
        checkState = parcel.readSparseBooleanArray();
        int j = parcel.readInt();
        if (j > 0)
        {
            checkIdState = new LongSparseArray();
            for (int i = 0; i < j; i++)
            {
                long l = parcel.readLong();
                int k = parcel.readInt();
                checkIdState.put(l, Integer.valueOf(k));
            }

        }
    }

    checkIdState(Parcel parcel, checkIdState checkidstate)
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

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TwoWayView.SavedState createFromParcel(Parcel parcel)
        {
            return new TwoWayView.SavedState(parcel, null);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public final TwoWayView.SavedState[] newArray(int i)
        {
            return new TwoWayView.SavedState[i];
        }

            _cls1()
            {
            }
    }

}
