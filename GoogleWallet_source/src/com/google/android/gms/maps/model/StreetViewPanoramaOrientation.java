// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.maps.model:
//            t

public class StreetViewPanoramaOrientation
    implements SafeParcelable
{
    public static final class Builder
    {

        public float bearing;
        public float tilt;

        public final Builder bearing(float f)
        {
            bearing = f;
            return this;
        }

        public final StreetViewPanoramaOrientation build()
        {
            return new StreetViewPanoramaOrientation(tilt, bearing);
        }

        public final Builder tilt(float f)
        {
            tilt = f;
            return this;
        }

        public Builder()
        {
        }
    }


    public static final t CREATOR = new t();
    public final float bearing;
    private final int mVersionCode;
    public final float tilt;

    public StreetViewPanoramaOrientation(float f, float f1)
    {
        this(1, f, f1);
    }

    StreetViewPanoramaOrientation(int i, float f, float f1)
    {
        boolean flag;
        if (-90F <= f && f <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "Tilt needs to be between -90 and 90 inclusive");
        mVersionCode = i;
        tilt = 0.0F + f;
        f = f1;
        if ((double)f1 <= 0.0D)
        {
            f = f1 % 360F + 360F;
        }
        bearing = f % 360F;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaOrientation))
            {
                return false;
            }
            obj = (StreetViewPanoramaOrientation)obj;
            if (Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return kl.j(this).a("tilt", Float.valueOf(tilt)).a("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
