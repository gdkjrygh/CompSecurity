// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            zzc

public final class VersionInfoParcel
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public final int versionCode;
    public String zzJu;
    public int zzJv;
    public int zzJw;
    public boolean zzJx;

    public VersionInfoParcel(int i, int j, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder("afma-sdk-a-v")).append(i).append(".").append(j).append(".");
        String s;
        if (flag)
        {
            s = "0";
        } else
        {
            s = "1";
        }
        this(1, stringbuilder.append(s).toString(), i, j, flag);
    }

    VersionInfoParcel(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        zzJu = s;
        zzJv = j;
        zzJw = k;
        zzJx = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzc.a(this, parcel);
    }

}
