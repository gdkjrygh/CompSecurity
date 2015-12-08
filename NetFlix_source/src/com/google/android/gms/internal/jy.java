// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jz, ju, jw

public final class jy
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jz();
    String adn;
    ju adr;
    jw ads;
    jw adt;
    String pm;
    private final int xH;

    jy()
    {
        xH = 1;
    }

    jy(int i, String s, String s1, ju ju, jw jw, jw jw1)
    {
        xH = i;
        adn = s;
        pm = s1;
        adr = ju;
        ads = jw;
        adt = jw1;
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
        jz.a(this, parcel, i);
    }

}
