// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            o, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements c
{

    public static final o CREATOR = new o();
    final int a;
    public final float b;
    public final float c;
    public final float d;
    private StreetViewPanoramaOrientation e;

    public StreetViewPanoramaCamera(float f, float f1, float f2)
    {
        this(1, f, f1, f2);
    }

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
        x.b(flag, "Tilt needs to be between -90 and 90 inclusive");
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
        return v.a(this).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel);
    }

}
