// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            fb

public class fa
    implements SafeParcelable, Geofence
{

    public static final fb CREATOR = new fb();
    private final int iM;
    private final String oA;
    private final int oB;
    private final short oD;
    private final double oE;
    private final double oF;
    private final float oG;
    private final int oH;
    private final int oI;
    private final long pc;

    public fa(int i, String s, int j, short word0, double d1, double d2, float f, long l, int k, int i1)
    {
        R(s);
        b(f);
        a(d1, d2);
        j = aa(j);
        iM = i;
        oD = word0;
        oA = s;
        oE = d1;
        oF = d2;
        oG = f;
        pc = l;
        oB = j;
        oH = k;
        oI = i1;
    }

    public fa(String s, int i, short word0, double d1, double d2, 
            float f, long l, int j, int k)
    {
        this(1, s, i, word0, d1, d2, f, l, j, k);
    }

    private static void R(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static void a(double d1, double d2)
    {
        if (d1 > 90D || d1 < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid latitude: ").append(d1).toString());
        }
        if (d2 > 180D || d2 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid longitude: ").append(d2).toString());
        } else
        {
            return;
        }
    }

    private static int aa(int i)
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

    private static String ab(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
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

    public static fa d(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.z(parcel);
        parcel.recycle();
        return abyte0;
    }

    public short co()
    {
        return oD;
    }

    public float cp()
    {
        return oG;
    }

    public int cq()
    {
        return oB;
    }

    public int cr()
    {
        return oI;
    }

    public int describeContents()
    {
        fb fb1 = CREATOR;
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
            if (!(obj instanceof fa))
            {
                return false;
            }
            obj = (fa)obj;
            if (oG != ((fa) (obj)).oG)
            {
                return false;
            }
            if (oE != ((fa) (obj)).oE)
            {
                return false;
            }
            if (oF != ((fa) (obj)).oF)
            {
                return false;
            }
            if (oD != ((fa) (obj)).oD)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return pc;
    }

    public double getLatitude()
    {
        return oE;
    }

    public double getLongitude()
    {
        return oF;
    }

    public int getNotificationResponsiveness()
    {
        return oH;
    }

    public String getRequestId()
    {
        return oA;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(oE);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(oF);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(oG)) * 31 + oD) * 31 + oB;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            ab(oD), oA, Integer.valueOf(oB), Double.valueOf(oE), Double.valueOf(oF), Float.valueOf(oG), Integer.valueOf(oH / 1000), Integer.valueOf(oI), Long.valueOf(pc)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fb fb1 = CREATOR;
        fb.a(this, parcel, i);
    }

}
