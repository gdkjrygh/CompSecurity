// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhz

public final class zzhy
    implements SafeParcelable
{

    public static final zzhz CREATOR = new zzhz();
    public final int versionCode;
    public String zzzH;
    public int zzzI;
    public int zzzJ;
    public boolean zzzK;

    public zzhy(int i, int j, boolean flag)
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

    zzhy(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        zzzH = s;
        zzzI = j;
        zzzJ = k;
        zzzK = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzhz.zza(this, parcel, i);
    }

}
