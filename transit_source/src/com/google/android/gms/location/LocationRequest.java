// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequestCreator

public final class LocationRequest
    implements SafeParcelable
{

    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private final int iM;
    int mPriority;
    long oC;
    long oJ;
    long oK;
    boolean oL;
    int oM;
    float oN;

    public LocationRequest()
    {
        iM = 1;
        mPriority = 102;
        oJ = 0x36ee80L;
        oK = 0x927c0L;
        oL = false;
        oC = 0x7fffffffffffffffL;
        oM = 0x7fffffff;
        oN = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f)
    {
        iM = i;
        mPriority = j;
        oJ = l;
        oK = l1;
        oL = flag;
        oC = l2;
        oM = k;
        oN = f;
    }

    private static void X(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String Y(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    private static void a(float f)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f).toString());
        } else
        {
            return;
        }
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void h(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (mPriority != ((LocationRequest) (obj)).mPriority || oJ != ((LocationRequest) (obj)).oJ || oK != ((LocationRequest) (obj)).oK || oL != ((LocationRequest) (obj)).oL || oC != ((LocationRequest) (obj)).oC || oM != ((LocationRequest) (obj)).oM || oN != ((LocationRequest) (obj)).oN)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return oC;
    }

    public long getFastestInterval()
    {
        return oK;
    }

    public long getInterval()
    {
        return oJ;
    }

    public int getNumUpdates()
    {
        return oM;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return oN;
    }

    int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return dl.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(oJ), Long.valueOf(oK), Boolean.valueOf(oL), Long.valueOf(oC), Integer.valueOf(oM), Float.valueOf(oN)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            oC = 0x7fffffffffffffffL;
        } else
        {
            oC = l1 + l;
        }
        if (oC < 0L)
        {
            oC = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        oC = l;
        if (oC < 0L)
        {
            oC = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        h(l);
        oL = true;
        oK = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        h(l);
        oJ = l;
        if (!oL)
        {
            oK = (long)((double)oJ / 6D);
        }
        return this;
    }

    public LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i).toString());
        } else
        {
            oM = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        X(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        oN = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(Y(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(oJ).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(oK).append("ms").toString());
        if (oC != 0x7fffffffffffffffL)
        {
            long l = oC;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (oM != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(oM);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.a(this, parcel, i);
    }

}
