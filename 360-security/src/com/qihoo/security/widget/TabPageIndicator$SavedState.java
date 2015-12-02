// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.qihoo.security.widget:
//            TabPageIndicator

static class <init> extends android.view.r.SavedState
{

    public static final android.os.tor.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public TabPageIndicator.SavedState a(Parcel parcel)
        {
            return new TabPageIndicator.SavedState(parcel, null);
        }

        public TabPageIndicator.SavedState[] a(int i)
        {
            return new TabPageIndicator.SavedState[i];
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
    int a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        parcel.writeInt(a);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
    }

    a(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
