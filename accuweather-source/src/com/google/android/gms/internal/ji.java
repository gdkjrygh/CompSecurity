// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            jj

public class ji
    implements SafeParcelable, Geofence
{

    public static final jj CREATOR = new jj();
    private final String Oy;
    private final int UX;
    private final short UZ;
    private final long VW;
    private final double Va;
    private final double Vb;
    private final float Vc;
    private final int Vd;
    private final int Ve;
    private final int xJ;

    public ji(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        bq(s);
        b(f);
        a(d, d1);
        j = cM(j);
        xJ = i;
        UZ = word0;
        Oy = s;
        Va = d;
        Vb = d1;
        Vc = f;
        VW = l;
        UX = j;
        Vd = k;
        Ve = i1;
    }

    public ji(String s, int i, short word0, double d, double d1, 
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

    public static ji h(byte abyte0[])
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
        jj jj1 = CREATOR;
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
            if (!(obj instanceof ji))
            {
                return false;
            }
            obj = (ji)obj;
            if (Vc != ((ji) (obj)).Vc)
            {
                return false;
            }
            if (Va != ((ji) (obj)).Va)
            {
                return false;
            }
            if (Vb != ((ji) (obj)).Vb)
            {
                return false;
            }
            if (UZ != ((ji) (obj)).UZ)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return VW;
    }

    public double getLatitude()
    {
        return Va;
    }

    public double getLongitude()
    {
        return Vb;
    }

    public int getNotificationResponsiveness()
    {
        return Vd;
    }

    public String getRequestId()
    {
        return Oy;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(Va);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(Vb);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(Vc)) * 31 + UZ) * 31 + UX;
    }

    public short iV()
    {
        return UZ;
    }

    public float iW()
    {
        return Vc;
    }

    public int iX()
    {
        return UX;
    }

    public int iY()
    {
        return Ve;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            cN(UZ), Oy, Integer.valueOf(UX), Double.valueOf(Va), Double.valueOf(Vb), Float.valueOf(Vc), Integer.valueOf(Vd / 1000), Integer.valueOf(Ve), Long.valueOf(VW)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jj jj1 = CREATOR;
        jj.a(this, parcel, i);
    }

}
