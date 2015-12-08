// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import loe;

public class MigrationStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new loe();
    public final int a;
    public boolean b;

    public MigrationStatus(int i, boolean flag)
    {
        a = i;
        b = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        loe.a(this, parcel);
    }

}
