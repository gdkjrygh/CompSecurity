// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import android.os.Parcel;
import android.os.Parcelable;

class text extends android.view.gView.SavedState
{

    public static final android.os.NagView.SavedState._cls1 CREATOR = new _cls1();
    public String text;

    public String toString()
    {
        return (new StringBuilder("SearchNagView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" text=").append(text).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.ToParcel(parcel, i);
        parcel.writeString(text);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        text = "";
        text = parcel.readString();
    }

    text(Parcelable parcelable)
    {
        super(parcelable);
        text = "";
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SearchNagView.SavedState createFromParcel(Parcel parcel)
        {
            return new SearchNagView.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SearchNagView.SavedState[] newArray(int i)
        {
            return new SearchNagView.SavedState[i];
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
