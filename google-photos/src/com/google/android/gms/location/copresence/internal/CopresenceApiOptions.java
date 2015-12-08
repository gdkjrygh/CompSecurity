// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lgw;

public final class CopresenceApiOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lgw();
    public static final CopresenceApiOptions a = new CopresenceApiOptions(true, null);
    public final int b;
    public final boolean c;
    public final String d;

    public CopresenceApiOptions(int i, boolean flag, String s)
    {
        b = i;
        c = flag;
        d = s;
    }

    private CopresenceApiOptions(boolean flag, String s)
    {
        this(1, true, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lgw.a(this, parcel);
    }

}
