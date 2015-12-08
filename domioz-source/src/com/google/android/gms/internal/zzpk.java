// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.e;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ke

public class zzpk
    implements SafeParcelable, e
{

    public static final ke CREATOR = new ke();
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

    public zzpk(int k, String s, int l, short word0, double d1, double d2, float f1, long l1, int i1, int j1)
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
        int k1 = l & 7;
        if (k1 == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("No supported transition specified: ")).append(l).toString());
        } else
        {
            a = k;
            d = word0;
            b = s;
            e = d1;
            f = d2;
            g = f1;
            c = l1;
            h = k1;
            i = i1;
            j = j1;
            return;
        }
    }

    public zzpk(String s, int k, double d1, double d2, float f1, 
            long l, int i1, int j1)
    {
        this(1, s, k, (short)1, d1, d2, f1, l, i1, j1);
    }

    public static zzpk a(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = ke.a(parcel);
        parcel.recycle();
        return abyte0;
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
            if (!(obj instanceof zzpk))
            {
                return false;
            }
            obj = (zzpk)obj;
            if (g != ((zzpk) (obj)).g)
            {
                return false;
            }
            if (e != ((zzpk) (obj)).e)
            {
                return false;
            }
            if (f != ((zzpk) (obj)).f)
            {
                return false;
            }
            if (d != ((zzpk) (obj)).d)
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
        long l = Double.doubleToLongBits(e);
        int k = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(f);
        return ((((k + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(g)) * 31 + d) * 31 + h;
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
        ke.a(this, parcel);
    }

}
