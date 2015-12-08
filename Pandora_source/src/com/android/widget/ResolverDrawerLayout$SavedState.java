// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.android.widget:
//            ResolverDrawerLayout

static class <init> extends android.view.State
{

    public static final android.os.edState.a CREATOR = new android.os.Parcelable.Creator() {

        public ResolverDrawerLayout.SavedState a(Parcel parcel)
        {
            return new ResolverDrawerLayout.SavedState(parcel, null);
        }

        public ResolverDrawerLayout.SavedState[] a(int i)
        {
            return new ResolverDrawerLayout.SavedState[i];
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
    boolean a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.l(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    a(Parcel parcel, a a1)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
