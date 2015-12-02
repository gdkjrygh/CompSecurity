// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuView

private static class <init> extends android.view.vedState
{

    public static final android.os.ble.IconState.name CREATOR = new android.os.Parcelable.Creator() {

        public MaterialMenuView.SavedState a(Parcel parcel)
        {
            return new MaterialMenuView.SavedState(parcel, null);
        }

        public MaterialMenuView.SavedState[] a(int i)
        {
            return new MaterialMenuView.SavedState[i];
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
    protected te a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        parcel.writeString(a.name());
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        a = te.valueOf(parcel.readString());
    }

    te.valueOf(Parcel parcel, te.valueOf valueof)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
