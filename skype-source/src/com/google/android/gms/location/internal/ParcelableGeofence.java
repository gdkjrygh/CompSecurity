// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.internal:
//            l

public class ParcelableGeofence
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    private final int a;
    private final String b;
    private final long c;
    private final short d;
    private final double e;
    private final double f;
    private final float g;
    private final int h;
    private final int i;
    private final int j;

    public ParcelableGeofence(int k, String s, int i1, short word0, double d1, double d2, float f1, long l1, int j1, int k1)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("requestId is null or too long: ")).append(s).toString());
        }
        if (f1 <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid radius: ")).append(f1).toString());
        }
        if (d1 > 90D || d1 < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid latitude: ")).append(d1).toString());
        }
        if (d2 > 180D || d2 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid longitude: ")).append(d2).toString());
        }
        int i2 = i1 & 7;
        if (i2 == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("No supported transition specified: ")).append(i1).toString());
        } else
        {
            a = k;
            d = word0;
            b = s;
            e = d1;
            f = d2;
            g = f1;
            c = l1;
            h = i2;
            i = j1;
            j = k1;
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final short b()
    {
        return d;
    }

    public final double c()
    {
        return e;
    }

    public final double d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public final float e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof ParcelableGeofence))
            {
                return false;
            }
            obj = (ParcelableGeofence)obj;
            if (g != ((ParcelableGeofence) (obj)).g)
            {
                return false;
            }
            if (e != ((ParcelableGeofence) (obj)).e)
            {
                return false;
            }
            if (f != ((ParcelableGeofence) (obj)).f)
            {
                return false;
            }
            if (d != ((ParcelableGeofence) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return b;
    }

    public final long g()
    {
        return c;
    }

    public final int h()
    {
        return h;
    }

    public int hashCode()
    {
        long l1 = Double.doubleToLongBits(e);
        int k = (int)(l1 ^ l1 >>> 32);
        l1 = Double.doubleToLongBits(f);
        return ((((k + 31) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + Float.floatToIntBits(g)) * 31 + d) * 31 + h;
    }

    public final int i()
    {
        return i;
    }

    public final int j()
    {
        return j;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        d;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 130;
           goto _L1 _L2
_L1:
        Object obj = null;
_L4:
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            obj, b, Integer.valueOf(h), Double.valueOf(e), Double.valueOf(f), Float.valueOf(g), Integer.valueOf(i / 1000), Integer.valueOf(j), Long.valueOf(c)
        });
_L2:
        obj = "CIRCLE";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        l.a(this, parcel);
    }

}
