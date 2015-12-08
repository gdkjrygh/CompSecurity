// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, f, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    public final float a;
    public final float b;
    public final float c;
    private final int d;
    private StreetViewPanoramaOrientation e;

    StreetViewPanoramaCamera(int i, float f1, float f2, float f3)
    {
        float f4;
        f f5;
        boolean flag;
        if (-90F <= f2 && f2 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "Tilt needs to be between -90 and 90 inclusive");
        d = i;
        f4 = f1;
        if ((double)f1 <= 0.0D)
        {
            f4 = 0.0F;
        }
        a = f4;
        b = f2 + 0.0F;
        if ((double)f3 <= 0.0D)
        {
            f1 = f3 % 360F + 360F;
        } else
        {
            f1 = f3;
        }
        c = f1 % 360F;
        f5 = new f();
        f5.b = f2;
        f5.a = f3;
        e = new StreetViewPanoramaOrientation(f5.b, f5.a);
    }

    final int a()
    {
        return d;
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
            if (Float.floatToIntBits(a) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Float.valueOf(a), Float.valueOf(b), Float.valueOf(c)
        });
    }

    public String toString()
    {
        return an.a(this).a("zoom", Float.valueOf(a)).a("tilt", Float.valueOf(b)).a("bearing", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel);
    }

}
