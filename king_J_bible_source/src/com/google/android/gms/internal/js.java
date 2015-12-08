// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jt

public final class js
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jt();
    String adn;
    String pm;
    private final int xH;

    js()
    {
        xH = 1;
    }

    js(int i, String s, String s1)
    {
        xH = i;
        adn = s;
        pm = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jt.a(this, parcel, i);
    }

}
