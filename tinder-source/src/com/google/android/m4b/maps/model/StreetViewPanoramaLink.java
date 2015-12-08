// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            p

public class StreetViewPanoramaLink
    implements c
{

    public static final p CREATOR = new p();
    final int a;
    public final String b;
    public final float c;

    StreetViewPanoramaLink(int i, String s, float f)
    {
        a = i;
        b = s;
        float f1 = f;
        if ((double)f <= 0.0D)
        {
            f1 = f % 360F + 360F;
        }
        c = f1 % 360F;
    }

    public StreetViewPanoramaLink(String s, float f)
    {
        this(1, s, f);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLink))
            {
                return false;
            }
            obj = (StreetViewPanoramaLink)obj;
            if (!b.equals(((StreetViewPanoramaLink) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, Float.valueOf(c)
        });
    }

    public String toString()
    {
        return v.a(this).a("panoId", b).a("bearing", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel);
    }

}
