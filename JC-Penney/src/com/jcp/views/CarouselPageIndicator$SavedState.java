// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.jcp.views:
//            b, a

class <init> extends android.view.
{

    public static final android.os.te.a CREATOR = new b();
    private int a;

    static int a(<init> <init>1)
    {
        return <init>1.a;
    }

    static int a(a a1, int i)
    {
        a1.a = i;
        return i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.(parcel, i);
        parcel.writeInt(a);
    }


    private (Parcel parcel)
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
