// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            px

public final class pw
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new px();
    private final int CK;
    int avX[];

    pw()
    {
        this(1, null);
    }

    pw(int i, int ai[])
    {
        CK = i;
        avX = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        px.a(this, parcel, i);
    }

}
