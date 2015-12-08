// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzpl

public class zzpk
    implements SafeParcelable
{

    public static final zzpl CREATOR = new zzpl();
    private final int zzFG;
    private final int zzalN;
    private final short zzalP;
    private final double zzalQ;
    private final double zzalR;
    private final float zzalS;
    private final int zzalT;
    private final int zzalU;
    private final long zzanp;
    private final String zzxv;

    public zzpk(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        zzcl(s);
        zzb(f);
        zza(d, d1);
        j = zzfw(j);
        zzFG = i;
        zzalP = word0;
        zzxv = s;
        zzalQ = d;
        zzalR = d1;
        zzalS = f;
        zzanp = l;
        zzalN = j;
        zzalT = k;
        zzalU = i1;
    }

    private static void zza(double d, double d1)
    {
        if (d > 90D || d < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid latitude: ")).append(d).toString());
        }
        if (d1 > 180D || d1 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid longitude: ")).append(d1).toString());
        } else
        {
            return;
        }
    }

    private static void zzb(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid radius: ")).append(f).toString());
        } else
        {
            return;
        }
    }

    private static void zzcl(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("requestId is null or too long: ")).append(s).toString());
        } else
        {
            return;
        }
    }

    private static int zzfw(int i)
    {
        int j = i & 7;
        if (j == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("No supported transition specified: ")).append(i).toString());
        } else
        {
            return j;
        }
    }

    private static String zzfx(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof zzpk))
            {
                return false;
            }
            obj = (zzpk)obj;
            if (zzalS != ((zzpk) (obj)).zzalS)
            {
                return false;
            }
            if (zzalQ != ((zzpk) (obj)).zzalQ)
            {
                return false;
            }
            if (zzalR != ((zzpk) (obj)).zzalR)
            {
                return false;
            }
            if (zzalP != ((zzpk) (obj)).zzalP)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzanp;
    }

    public double getLatitude()
    {
        return zzalQ;
    }

    public double getLongitude()
    {
        return zzalR;
    }

    public int getNotificationResponsiveness()
    {
        return zzalT;
    }

    public String getRequestId()
    {
        return zzxv;
    }

    public int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(zzalQ);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(zzalR);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(zzalS)) * 31 + zzalP) * 31 + zzalN;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            zzfx(zzalP), zzxv, Integer.valueOf(zzalN), Double.valueOf(zzalQ), Double.valueOf(zzalR), Float.valueOf(zzalS), Integer.valueOf(zzalT / 1000), Integer.valueOf(zzalU), Long.valueOf(zzanp)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzpl.zza(this, parcel, i);
    }

    public short zzpB()
    {
        return zzalP;
    }

    public float zzpC()
    {
        return zzalS;
    }

    public int zzpD()
    {
        return zzalN;
    }

    public int zzpE()
    {
        return zzalU;
    }

}
