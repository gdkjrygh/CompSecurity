// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofenceCreator

public class ParcelableGeofence
    implements SafeParcelable
{

    public static final ParcelableGeofenceCreator CREATOR = new ParcelableGeofenceCreator();
    final long mExpirationTime;
    final double mLatitude;
    final int mLoiteringDelayMillis;
    final double mLongitude;
    final int mNotificationResponsiveness;
    final float mRadius;
    final String mRequestId;
    final int mTransitionTypes;
    final short mType;
    final int mVersionCode;

    public ParcelableGeofence(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("requestId is null or too long: ")).append(s).toString());
        }
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid radius: ")).append(f).toString());
        }
        if (d > 90D || d < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid latitude: ")).append(d).toString());
        }
        if (d1 > 180D || d1 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid longitude: ")).append(d1).toString());
        }
        int j1 = j & 7;
        if (j1 == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("No supported transition specified: ")).append(j).toString());
        } else
        {
            mVersionCode = i;
            mType = word0;
            mRequestId = s;
            mLatitude = d;
            mLongitude = d1;
            mRadius = f;
            mExpirationTime = l;
            mTransitionTypes = j1;
            mNotificationResponsiveness = k;
            mLoiteringDelayMillis = i1;
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
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof ParcelableGeofence))
            {
                return false;
            }
            obj = (ParcelableGeofence)obj;
            if (mRadius != ((ParcelableGeofence) (obj)).mRadius)
            {
                return false;
            }
            if (mLatitude != ((ParcelableGeofence) (obj)).mLatitude)
            {
                return false;
            }
            if (mLongitude != ((ParcelableGeofence) (obj)).mLongitude)
            {
                return false;
            }
            if (mType != ((ParcelableGeofence) (obj)).mType)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(mLatitude);
        int i = (int)(l >>> 32 ^ l);
        l = Double.doubleToLongBits(mLongitude);
        return ((((i + 31) * 31 + (int)(l >>> 32 ^ l)) * 31 + Float.floatToIntBits(mRadius)) * 31 + mType) * 31 + mTransitionTypes;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        mType;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 130;
           goto _L1 _L2
_L1:
        Object obj = null;
_L4:
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            obj, mRequestId, Integer.valueOf(mTransitionTypes), Double.valueOf(mLatitude), Double.valueOf(mLongitude), Float.valueOf(mRadius), Integer.valueOf(mNotificationResponsiveness / 1000), Integer.valueOf(mLoiteringDelayMillis), Long.valueOf(mExpirationTime)
        });
_L2:
        obj = "CIRCLE";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableGeofenceCreator.writeToParcel$3125d07d(this, parcel);
    }

}
