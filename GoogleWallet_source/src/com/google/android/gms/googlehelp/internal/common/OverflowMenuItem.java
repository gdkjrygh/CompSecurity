// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            a

public final class OverflowMenuItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final String Yv;
    final int mId;
    final Intent mIntent;
    final int mVersionCode;

    OverflowMenuItem(int i, int j, String s, Intent intent)
    {
        mVersionCode = i;
        mId = j;
        Yv = s;
        mIntent = intent;
    }

    public OverflowMenuItem(int i, String s, Intent intent)
    {
        this(1, i, s, intent);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
