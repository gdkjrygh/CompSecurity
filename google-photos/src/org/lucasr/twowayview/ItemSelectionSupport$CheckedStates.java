// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;

class <init> extends SparseBooleanArray
    implements Parcelable
{

    public static final android.os.ckedStates._cls1 CREATOR = new _cls1();
    private static final int FALSE = 0;
    private static final int TRUE = 1;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int k = size();
        parcel.writeInt(k);
        i = 0;
        while (i < k) 
        {
            parcel.writeInt(keyAt(i));
            int j;
            if (valueAt(i))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            i++;
        }
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j > 0)
        {
            int i = 0;
            while (i < j) 
            {
                int k = parcel.readInt();
                boolean flag;
                if (parcel.readInt() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                put(k, flag);
                i++;
            }
        }
    }

    put(Parcel parcel, put put)
    {
        this(parcel);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ItemSelectionSupport.CheckedStates createFromParcel(Parcel parcel)
        {
            return new ItemSelectionSupport.CheckedStates(parcel, null);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public final ItemSelectionSupport.CheckedStates[] newArray(int i)
        {
            return new ItemSelectionSupport.CheckedStates[i];
        }

            _cls1()
            {
            }
    }

}
