// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.os.Parcel;
import android.os.Parcelable;
import jo;

class <init> extends jo
    implements Parcelable
{

    public static final android.os.edIdStates._cls1 CREATOR = new _cls1();

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = size();
        parcel.writeInt(j);
        for (i = 0; i < j; i++)
        {
            parcel.writeLong(keyAt(i));
            parcel.writeInt(((Integer)valueAt(i)).intValue());
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
            for (int i = 0; i < j; i++)
            {
                put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
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

        public final ItemSelectionSupport.CheckedIdStates createFromParcel(Parcel parcel)
        {
            return new ItemSelectionSupport.CheckedIdStates(parcel, null);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public final ItemSelectionSupport.CheckedIdStates[] newArray(int i)
        {
            return new ItemSelectionSupport.CheckedIdStates[i];
        }

            _cls1()
            {
            }
    }

}
