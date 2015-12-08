// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            he

public class hd
    implements SafeParcelable, Geofence
{

    public static final he CREATOR = new he();
    private final String Jo;
    private final int NU;
    private final short NW;
    private final double NX;
    private final double NY;
    private final float NZ;
    private final int Oa;
    private final int Ob;
    private final long Oz;
    private final int xH;

    public hd(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        aY(s);
        b(f);
        a(d, d1);
        j = bB(j);
        xH = i;
        NW = word0;
        Jo = s;
        NX = d;
        NY = d1;
        NZ = f;
        Oz = l;
        NU = j;
        Oa = k;
        Ob = i1;
    }

    public hd(String s, int i, short word0, double d, double d1, 
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

    private static void aY(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
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

    private static int bB(int i)
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

    private static String bC(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static hd h(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.aC(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        he he1 = CREATOR;
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
            if (!(obj instanceof hd))
            {
                return false;
            }
            obj = (hd)obj;
            if (NZ != ((hd) (obj)).NZ)
            {
                return false;
            }
            if (NX != ((hd) (obj)).NX)
            {
                return false;
            }
            if (NY != ((hd) (obj)).NY)
            {
                return false;
            }
            if (NW != ((hd) (obj)).NW)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return Oz;
    }

    public double getLatitude()
    {
        return NX;
    }

    public double getLongitude()
    {
        return NY;
    }

    public int getNotificationResponsiveness()
    {
        return Oa;
    }

    public String getRequestId()
    {
        return Jo;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public short hS()
    {
        return NW;
    }

    public float hT()
    {
        return NZ;
    }

    public int hU()
    {
        return NU;
    }

    public int hV()
    {
        return Ob;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(NX);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(NY);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(NZ)) * 31 + NW) * 31 + NU;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            bC(NW), Jo, Integer.valueOf(NU), Double.valueOf(NX), Double.valueOf(NY), Float.valueOf(NZ), Integer.valueOf(Oa / 1000), Integer.valueOf(Ob), Long.valueOf(Oz)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        he he1 = CREATOR;
        he.a(this, parcel, i);
    }

}
