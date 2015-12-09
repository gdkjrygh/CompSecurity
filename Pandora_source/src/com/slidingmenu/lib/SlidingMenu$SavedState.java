// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.slidingmenu.lib:
//            SlidingMenu

public static class a extends android.view.dState
{

    public static final android.os.vedState.a CREATOR = new android.os.Parcelable.Creator() {

        public SlidingMenu.SavedState a(Parcel parcel)
        {
            return new SlidingMenu.SavedState(parcel, null);
        }

        public SlidingMenu.SavedState[] a(int i)
        {
            return new SlidingMenu.SavedState[i];
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
    private final int a;

    public int a()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.teToParcel(parcel, i);
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

    public <init>(Parcelable parcelable, int i)
    {
        super(parcelable);
        a = i;
    }
}
