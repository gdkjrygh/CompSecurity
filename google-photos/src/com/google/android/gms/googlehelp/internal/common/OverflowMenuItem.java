// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kpt;

public final class OverflowMenuItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kpt();
    public final int a;
    public final int b;
    public final String c;
    public final Intent d;

    public OverflowMenuItem(int i, int j, String s, Intent intent)
    {
        a = i;
        b = j;
        c = s;
        d = intent;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        kpt.a(this, parcel, i);
    }

}
