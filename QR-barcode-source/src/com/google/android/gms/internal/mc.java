// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            md

public class mc
    implements SafeParcelable, Geofence
{

    public static final md CREATOR = new md();
    private final int BR;
    private final String XC;
    private final int aeh;
    private final short aej;
    private final double aek;
    private final double ael;
    private final float aem;
    private final int aen;
    private final int aeo;
    private final long afm;

    public mc(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        bY(s);
        b(f);
        a(d, d1);
        j = ek(j);
        BR = i;
        aej = word0;
        XC = s;
        aek = d;
        ael = d1;
        aem = f;
        afm = l;
        aeh = j;
        aen = k;
        aeo = i1;
    }

    public mc(String s, int i, short word0, double d, double d1, 
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

    private static void bY(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static int ek(int i)
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

    private static String el(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static mc h(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.cw(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        md md1 = CREATOR;
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
            if (!(obj instanceof mc))
            {
                return false;
            }
            obj = (mc)obj;
            if (aem != ((mc) (obj)).aem)
            {
                return false;
            }
            if (aek != ((mc) (obj)).aek)
            {
                return false;
            }
            if (ael != ((mc) (obj)).ael)
            {
                return false;
            }
            if (aej != ((mc) (obj)).aej)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return afm;
    }

    public double getLatitude()
    {
        return aek;
    }

    public double getLongitude()
    {
        return ael;
    }

    public int getNotificationResponsiveness()
    {
        return aen;
    }

    public String getRequestId()
    {
        return XC;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(aek);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(ael);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(aem)) * 31 + aej) * 31 + aeh;
    }

    public short ma()
    {
        return aej;
    }

    public float mb()
    {
        return aem;
    }

    public int mc()
    {
        return aeh;
    }

    public int md()
    {
        return aeo;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            el(aej), XC, Integer.valueOf(aeh), Double.valueOf(aek), Double.valueOf(ael), Float.valueOf(aem), Integer.valueOf(aen / 1000), Integer.valueOf(aeo), Long.valueOf(afm)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        md md1 = CREATOR;
        com.google.android.gms.internal.md.a(this, parcel, i);
    }

}
