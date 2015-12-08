// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            no

public class nn
    implements SafeParcelable, Geofence
{

    public static final no CREATOR = new no();
    private final int CK;
    private final String Zt;
    private final int agd;
    private final short agf;
    private final double agg;
    private final double agh;
    private final float agi;
    private final int agj;
    private final int agk;
    private final long ahl;

    public nn(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        cb(s);
        b(f);
        a(d, d1);
        j = eH(j);
        CK = i;
        agf = word0;
        Zt = s;
        agg = d;
        agh = d1;
        agi = f;
        ahl = l;
        agd = j;
        agj = k;
        agk = i1;
    }

    public nn(String s, int i, short word0, double d, double d1, 
            float f, long l, int j, int k)
    {
        this(1, s, i, word0, d, d1, f, l, j, k);
    }

    private static void a(double d, double d1)
    {
        if (d > 90D || d < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid latitude: ").append(d).toString());
        }
        if (d1 > 180D || d1 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid longitude: ").append(d1).toString());
        } else
        {
            return;
        }
    }

    private static void b(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid radius: ").append(f).toString());
        } else
        {
            return;
        }
    }

    private static void cb(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static int eH(int i)
    {
        int j = i & 7;
        if (j == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No supported transition specified: ").append(i).toString());
        } else
        {
            return j;
        }
    }

    private static String eI(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static nn h(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.cN(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        no no1 = CREATOR;
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
            if (!(obj instanceof nn))
            {
                return false;
            }
            obj = (nn)obj;
            if (agi != ((nn) (obj)).agi)
            {
                return false;
            }
            if (agg != ((nn) (obj)).agg)
            {
                return false;
            }
            if (agh != ((nn) (obj)).agh)
            {
                return false;
            }
            if (agf != ((nn) (obj)).agf)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return ahl;
    }

    public double getLatitude()
    {
        return agg;
    }

    public double getLongitude()
    {
        return agh;
    }

    public int getNotificationResponsiveness()
    {
        return agj;
    }

    public String getRequestId()
    {
        return Zt;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(agg);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(agh);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(agi)) * 31 + agf) * 31 + agd;
    }

    public short nn()
    {
        return agf;
    }

    public float no()
    {
        return agi;
    }

    public int np()
    {
        return agd;
    }

    public int nq()
    {
        return agk;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            eI(agf), Zt, Integer.valueOf(agd), Double.valueOf(agg), Double.valueOf(agh), Float.valueOf(agi), Integer.valueOf(agj / 1000), Integer.valueOf(agk), Long.valueOf(ahl)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        no no1 = CREATOR;
        com.google.android.gms.internal.no.a(this, parcel, i);
    }

}
