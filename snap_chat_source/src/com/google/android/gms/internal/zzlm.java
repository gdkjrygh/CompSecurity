// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzln

public final class zzlm
    implements SafeParcelable
{

    public static final zzln CREATOR = new zzln();
    final int zzFG;
    private final long zzRi;
    private String zzRj;
    private final String zzRk;
    private final String zzRl;
    private final String zzRm;
    private final String zzRn;
    private final String zzRo;
    private final long zzRp;
    private long zzRq;

    zzlm(int i, long l, String s, String s1, String s2, String s3, 
            String s4, String s5, long l1)
    {
        zzFG = i;
        zzRi = l;
        zzRj = s;
        zzRk = s1;
        zzRl = s2;
        zzRm = s3;
        zzRn = s4;
        zzRq = -1L;
        zzRo = s5;
        zzRp = l1;
    }

    public zzlm(long l, String s, String s1, String s2, String s3, String s4, 
            String s5, long l1)
    {
        this(1, l, s, s1, s2, s3, s4, s5, l1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long getTimeMillis()
    {
        return zzRi;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzln.zza(this, parcel, i);
    }

    public final String zzjT()
    {
        return zzRj;
    }

    public final String zzjU()
    {
        return zzRk;
    }

    public final String zzjV()
    {
        return zzRl;
    }

    public final String zzjW()
    {
        return zzRm;
    }

    public final String zzjX()
    {
        return zzRn;
    }

    public final String zzjY()
    {
        return zzRo;
    }

    public final long zzjZ()
    {
        return zzRp;
    }

}
