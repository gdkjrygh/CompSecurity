// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAbsSpinner

static class <init> extends android.view..SavedState
{

    public static final android.os.er.SavedState.b CREATOR = new android.os.Parcelable.Creator() {

        public EcoGalleryAbsSpinner.SavedState a(Parcel parcel)
        {
            return new EcoGalleryAbsSpinner.SavedState(parcel, null);
        }

        public EcoGalleryAbsSpinner.SavedState[] a(int i)
        {
            return new EcoGalleryAbsSpinner.SavedState[i];
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
        super.l(parcel, i);
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
