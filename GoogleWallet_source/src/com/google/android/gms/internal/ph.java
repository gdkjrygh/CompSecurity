// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            pi

public class ph
    implements SafeParcelable, Geofence
{

    public static final pi CREATOR = new pi();
    private final String alx;
    private final int atm;
    private final short ato;
    private final double atp;
    private final double atq;
    private final float atr;
    private final int ats;
    private final int att;
    private final long avT;
    private final int mVersionCode;

    public ph(int i, String s, int j, short word0, double d, double d1, float f, long l1, int k, int i1)
    {
        cD(s);
        b(f);
        a(d, d1);
        j = ia(j);
        mVersionCode = i;
        ato = word0;
        alx = s;
        atp = d;
        atq = d1;
        atr = f;
        avT = l1;
        atm = j;
        ats = k;
        att = i1;
    }

    public ph(String s, int i, short word0, double d, double d1, 
            float f, long l1, int j, int k)
    {
        this(1, s, i, word0, d, d1, f, l1, j, k);
    }

    private static void a(double d, double d1)
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

    private static void b(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid radius: ")).append(f).toString());
        } else
        {
            return;
        }
    }

    private static void cD(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("requestId is null or too long: ")).append(s).toString());
        } else
        {
            return;
        }
    }

    private static int ia(int i)
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

    private static String ib(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static ph l(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR;
        abyte0 = pi.fJ(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        pi pi1 = CREATOR;
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
            if (!(obj instanceof ph))
            {
                return false;
            }
            obj = (ph)obj;
            if (atr != ((ph) (obj)).atr)
            {
                return false;
            }
            if (atp != ((ph) (obj)).atp)
            {
                return false;
            }
            if (atq != ((ph) (obj)).atq)
            {
                return false;
            }
            if (ato != ((ph) (obj)).ato)
            {
                return false;
            }
        }
        return true;
    }

    public final long getExpirationTime()
    {
        return avT;
    }

    public final double getLatitude()
    {
        return atp;
    }

    public final double getLongitude()
    {
        return atq;
    }

    public final int getNotificationResponsiveness()
    {
        return ats;
    }

    public final String getRequestId()
    {
        return alx;
    }

    public final int getTransitionTypes()
    {
        return atm;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        long l1 = Double.doubleToLongBits(atp);
        int i = (int)(l1 ^ l1 >>> 32);
        l1 = Double.doubleToLongBits(atq);
        return ((((i + 31) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + Float.floatToIntBits(atr)) * 31 + ato) * 31 + atm;
    }

    public final int pA()
    {
        return att;
    }

    public final short py()
    {
        return ato;
    }

    public final float pz()
    {
        return atr;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            ib(ato), alx, Integer.valueOf(atm), Double.valueOf(atp), Double.valueOf(atq), Float.valueOf(atr), Integer.valueOf(ats / 1000), Integer.valueOf(att), Long.valueOf(avT)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pi pi1 = CREATOR;
        pi.a(this, parcel, i);
    }

}
