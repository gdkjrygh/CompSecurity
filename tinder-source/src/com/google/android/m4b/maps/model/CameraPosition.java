// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            c, LatLng

public final class CameraPosition
    implements c
{
    public static final class a
    {

        public LatLng a;
        public float b;
        public float c;
        public float d;

        public final CameraPosition a()
        {
            return new CameraPosition(a, b, c, d);
        }

        public a()
        {
        }

        public a(CameraPosition cameraposition)
        {
            a = cameraposition.b;
            b = cameraposition.c;
            c = cameraposition.d;
            d = cameraposition.e;
        }
    }


    public static final com.google.android.m4b.maps.model.c CREATOR = new com.google.android.m4b.maps.model.c();
    final int a;
    public final LatLng b;
    public final float c;
    public final float d;
    public final float e;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        x.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] {
            Float.valueOf(f1)
        });
        a = i;
        b = latlng;
        c = f;
        d = f1 + 0.0F;
        f = f2;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        }
        e = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static a a(CameraPosition cameraposition)
    {
        return new a(cameraposition);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, com.google.android.m4b.maps.h.i.MapM4bAttrs);
        float f;
        float f1;
        a a1;
        if (context.hasValue(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTargetLat))
        {
            f = context.getFloat(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTargetLat, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTargetLng))
        {
            f1 = context.getFloat(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTargetLng, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        a1 = new a();
        a1.a = attributeset;
        if (context.hasValue(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraZoom))
        {
            a1.b = context.getFloat(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraZoom, 0.0F);
        }
        if (context.hasValue(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraBearing))
        {
            a1.d = context.getFloat(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraBearing, 0.0F);
        }
        if (context.hasValue(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTilt))
        {
            a1.c = context.getFloat(com.google.android.m4b.maps.h.i.MapM4bAttrs_m4b_cameraTilt, 0.0F);
        }
        return a1.a();
    }

    public static final CameraPosition a(LatLng latlng)
    {
        return new CameraPosition(latlng, 1.0F, 0.0F, 0.0F);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CameraPosition))
            {
                return false;
            }
            obj = (CameraPosition)obj;
            if (!b.equals(((CameraPosition) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((CameraPosition) (obj)).c) || Float.floatToIntBits(d) != Float.floatToIntBits(((CameraPosition) (obj)).d) || Float.floatToIntBits(e) != Float.floatToIntBits(((CameraPosition) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, Float.valueOf(c), Float.valueOf(d), Float.valueOf(e)
        });
    }

    public final String toString()
    {
        return v.a(this).a("target", b).a("zoom", Float.valueOf(c)).a("tilt", Float.valueOf(d)).a("bearing", Float.valueOf(e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.model.c.a(this, parcel, i);
    }

}
