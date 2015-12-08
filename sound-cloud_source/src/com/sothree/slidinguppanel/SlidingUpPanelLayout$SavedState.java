// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout, c

static class <init> extends android.view.ut.SavedState
{

    public static final android.os.yout.c.toString CREATOR = new c();
    a a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.l(parcel, i);
        parcel.writeString(a.a());
    }


    private (Parcel parcel)
    {
        super(parcel);
        try
        {
            a = (a)Enum.valueOf(com/sothree/slidinguppanel/SlidingUpPanelLayout$c, parcel.readString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            a = a;
        }
    }

    a(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
