// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, LatLng

public final class CameraPosition
    implements SafeParcelable
{
    public static final class a
    {

        private LatLng a;
        private float b;
        private float c;
        private float d;

        public final a a(float f)
        {
            b = f;
            return this;
        }

        public final a a(LatLng latlng)
        {
            a = latlng;
            return this;
        }

        public final CameraPosition a()
        {
            return new CameraPosition(a, b, c, d);
        }

        public final a b(float f)
        {
            c = f;
            return this;
        }

        public final a c(float f)
        {
            d = f;
            return this;
        }

        public a()
        {
        }
    }


    public static final e CREATOR = new e();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        y.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] {
            Float.valueOf(f1)
        });
        e = i;
        a = latlng;
        b = f;
        c = f1 + 0.0F;
        f = f2;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        }
        d = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, com.google.android.gms.a.d.MapAttrs);
        float f;
        float f1;
        a a1;
        if (context.hasValue(com.google.android.gms.a.d.MapAttrs_cameraTargetLat))
        {
            f = context.getFloat(com.google.android.gms.a.d.MapAttrs_cameraTargetLat, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(com.google.android.gms.a.d.MapAttrs_cameraTargetLng))
        {
            f1 = context.getFloat(com.google.android.gms.a.d.MapAttrs_cameraTargetLng, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        a1 = new a();
        a1.a(attributeset);
        if (context.hasValue(com.google.android.gms.a.d.MapAttrs_cameraZoom))
        {
            a1.a(context.getFloat(com.google.android.gms.a.d.MapAttrs_cameraZoom, 0.0F));
        }
        if (context.hasValue(com.google.android.gms.a.d.MapAttrs_cameraBearing))
        {
            a1.c(context.getFloat(com.google.android.gms.a.d.MapAttrs_cameraBearing, 0.0F));
        }
        if (context.hasValue(com.google.android.gms.a.d.MapAttrs_cameraTilt))
        {
            a1.b(context.getFloat(com.google.android.gms.a.d.MapAttrs_cameraTilt, 0.0F));
        }
        return a1.a();
    }

    final int a()
    {
        return e;
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
            if (!a.equals(((CameraPosition) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((CameraPosition) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((CameraPosition) (obj)).c) || Float.floatToIntBits(d) != Float.floatToIntBits(((CameraPosition) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
        });
    }

    public final String toString()
    {
        return x.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.model.e.a(this, parcel, i);
    }

}
