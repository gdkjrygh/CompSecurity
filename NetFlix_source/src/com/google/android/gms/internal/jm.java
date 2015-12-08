// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            jn, gi

public final class jm
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jn();
    String add;
    String ade;
    ArrayList adf;
    private final int xH;

    jm()
    {
        xH = 1;
        adf = gi.fs();
    }

    jm(int i, String s, String s1, ArrayList arraylist)
    {
        xH = i;
        add = s;
        ade = s1;
        adf = arraylist;
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
        jn.a(this, parcel, i);
    }

}
