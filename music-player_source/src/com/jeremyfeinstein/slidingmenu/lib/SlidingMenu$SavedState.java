// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            p

public class a extends android.view.SlidingMenu.SavedState
{

    public static final android.os.b.SlidingMenu.SavedState.a CREATOR = new p();
    private final int a;

    public final int a()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.teToParcel(parcel, i);
        parcel.writeInt(a);
    }


    private (Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
    }

    a(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public <init>(Parcelable parcelable, int i)
    {
        super(parcelable);
        a = i;
    }
}
