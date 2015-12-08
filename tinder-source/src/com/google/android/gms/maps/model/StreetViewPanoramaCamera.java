// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            l, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    final int a;
    public final float b;
    public final float c;
    public final float d;
    private StreetViewPanoramaOrientation e;

    StreetViewPanoramaCamera(int i, float f, float f1, float f2)
    {
        float f3;
        StreetViewPanoramaOrientation.a a1;
        boolean flag;
        if (-90F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "Tilt needs to be between -90 and 90 inclusive");
        a = i;
        f3 = f;
        if ((double)f <= 0.0D)
        {
            f3 = 0.0F;
        }
        b = f3;
        c = f1 + 0.0F;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        } else
        {
            f = f2;
        }
        d = f % 360F;
        a1 = new StreetViewPanoramaOrientation.a();
        a1.b = f1;
        a1.a = f2;
        e = new StreetViewPanoramaOrientation(a1.b, a1.a);
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
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).c) || Float.floatToIntBits(d) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
        });
    }

    public String toString()
    {
        return t.a(this).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel);
    }

}
