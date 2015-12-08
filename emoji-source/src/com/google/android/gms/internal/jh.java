// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ji

public class jh
    implements SafeParcelable, Geofence
{

    public static final ji CREATOR = new ji();
    private final String OB;
    private final long VZ;
    private final int Va;
    private final short Vc;
    private final double Vd;
    private final double Ve;
    private final float Vf;
    private final int Vg;
    private final int Vh;
    private final int xM;

    public jh(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        bq(s);
        b(f);
        a(d, d1);
        j = cM(j);
        xM = i;
        Vc = word0;
        OB = s;
        Vd = d;
        Ve = d1;
        Vf = f;
        VZ = l;
        Va = j;
        Vg = k;
        Vh = i1;
    }

    public jh(String s, int i, short word0, double d, double d1, 
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

    private static void bq(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static int cM(int i)
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

    private static String cN(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static jh h(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.bt(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        ji ji1 = CREATOR;
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
            if (!(obj instanceof jh))
            {
                return false;
            }
            obj = (jh)obj;
            if (Vf != ((jh) (obj)).Vf)
            {
                return false;
            }
            if (Vd != ((jh) (obj)).Vd)
            {
                return false;
            }
            if (Ve != ((jh) (obj)).Ve)
            {
                return false;
            }
            if (Vc != ((jh) (obj)).Vc)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return VZ;
    }

    public double getLatitude()
    {
        return Vd;
    }

    public double getLongitude()
    {
        return Ve;
    }

    public int getNotificationResponsiveness()
    {
        return Vg;
    }

    public String getRequestId()
    {
        return OB;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(Vd);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(Ve);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(Vf)) * 31 + Vc) * 31 + Va;
    }

    public short ja()
    {
        return Vc;
    }

    public float jb()
    {
        return Vf;
    }

    public int jc()
    {
        return Va;
    }

    public int jd()
    {
        return Vh;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            cN(Vc), OB, Integer.valueOf(Va), Double.valueOf(Vd), Double.valueOf(Ve), Float.valueOf(Vf), Integer.valueOf(Vg / 1000), Integer.valueOf(Vh), Long.valueOf(VZ)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ji ji1 = CREATOR;
        ji.a(this, parcel, i);
    }

}
