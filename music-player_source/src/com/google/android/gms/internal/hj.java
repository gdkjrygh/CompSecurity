// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ix

public class hj
    implements SafeParcelable
{

    public static final ix a = new ix();
    private final int b;
    private final String c;
    private final long d;
    private final short e;
    private final double f;
    private final double g;
    private final float h;
    private final int i;
    private final int j;
    private final int k;

    public hj(int l, String s, int i1, short word0, double d1, double d2, float f1, long l1, int j1, int k1)
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
            b = l;
            e = word0;
            c = s;
            f = d1;
            g = d2;
            h = f1;
            d = l1;
            i = i2;
            j = j1;
            k = k1;
            return;
        }
    }

    public final int a()
    {
        return b;
    }

    public final short b()
    {
        return e;
    }

    public final double c()
    {
        return f;
    }

    public final double d()
    {
        return g;
    }

    public int describeContents()
    {
        ix ix1 = a;
        return 0;
    }

    public final float e()
    {
        return h;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof hj))
            {
                return false;
            }
            obj = (hj)obj;
            if (h != ((hj) (obj)).h)
            {
                return false;
            }
            if (f != ((hj) (obj)).f)
            {
                return false;
            }
            if (g != ((hj) (obj)).g)
            {
                return false;
            }
            if (e != ((hj) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return c;
    }

    public final long g()
    {
        return d;
    }

    public final int h()
    {
        return i;
    }

    public int hashCode()
    {
        long l1 = Double.doubleToLongBits(f);
        int l = (int)(l1 ^ l1 >>> 32);
        l1 = Double.doubleToLongBits(g);
        return ((((l + 31) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + Float.floatToIntBits(h)) * 31 + e) * 31 + i;
    }

    public final int i()
    {
        return j;
    }

    public final int j()
    {
        return k;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        e;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 130;
           goto _L1 _L2
_L1:
        Object obj = null;
_L4:
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            obj, c, Integer.valueOf(i), Double.valueOf(f), Double.valueOf(g), Float.valueOf(h), Integer.valueOf(j / 1000), Integer.valueOf(k), Long.valueOf(d)
        });
_L2:
        obj = "CIRCLE";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        ix ix1 = a;
        ix.a(this, parcel);
    }

}
