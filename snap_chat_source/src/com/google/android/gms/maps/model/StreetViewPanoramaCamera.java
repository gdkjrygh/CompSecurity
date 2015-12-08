// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzq, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{

    public static final zzq CREATOR = new zzq();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final int zzFG;
    private StreetViewPanoramaOrientation zzarF;

    StreetViewPanoramaCamera(int i, float f, float f1, float f2)
    {
        float f3;
        boolean flag;
        if (-90F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
        zzFG = i;
        f3 = f;
        if ((double)f <= 0.0D)
        {
            f3 = 0.0F;
        }
        zoom = f3;
        tilt = f1 + 0.0F;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        } else
        {
            f = f2;
        }
        bearing = f % 360F;
        zzarF = (new StreetViewPanoramaOrientation.Builder()).tilt(f1).bearing(f2).build();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaCamera))
            {
                return false;
            }
            obj = (StreetViewPanoramaCamera)obj;
            if (Float.floatToIntBits(zoom) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzw.zzk(this).zza("zoom", Float.valueOf(zoom)).zza("tilt", Float.valueOf(tilt)).zza("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

}
