// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.stats:
//            zza

public final class ConnectionEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final long zzUR;
    private String zzUS;
    private final String zzUT;
    private final String zzUU;
    private final String zzUV;
    private final String zzUW;
    private final String zzUX;
    private final long zzUY;
    private final long zzUZ;
    private final long zzVa;
    private long zzVb;
    final int zzzH;

    ConnectionEvent(int i, long l, String s, String s1, String s2, String s3, 
            String s4, String s5, long l1, long l2, long l3)
    {
        zzzH = i;
        zzUR = l;
        zzUS = s;
        zzUT = s1;
        zzUU = s2;
        zzUV = s3;
        zzUW = s4;
        zzVb = -1L;
        zzUX = s5;
        zzUY = l1;
        zzUZ = l2;
        zzVa = l3;
    }

    public ConnectionEvent(long l, String s, String s1, String s2, String s3, String s4, 
            String s5, long l1, long l2, long l3)
    {
        this(1, l, s, s1, s2, s3, s4, s5, l1, l2, l3);
    }

    public int describeContents()
    {
        return 0;
    }

    public long getTimeMillis()
    {
        return zzUR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public String zzmS()
    {
        return zzUS;
    }

    public String zzmT()
    {
        return zzUT;
    }

    public String zzmU()
    {
        return zzUU;
    }

    public String zzmV()
    {
        return zzUV;
    }

    public String zzmW()
    {
        return zzUW;
    }

    public String zzmX()
    {
        return zzUX;
    }

    public long zzmY()
    {
        return zzUY;
    }

    public long zzmZ()
    {
        return zzVa;
    }

    public long zzna()
    {
        return zzUZ;
    }

}
