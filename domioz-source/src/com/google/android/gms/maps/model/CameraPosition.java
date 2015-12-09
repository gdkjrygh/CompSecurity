// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.c;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.ag;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            i, LatLng, c

public final class CameraPosition
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int j, LatLng latlng, float f, float f1, float f2)
    {
        ap.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        e = j;
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
        context = context.getResources().obtainAttributes(attributeset, c.d);
        float f;
        float f1;
        com.google.android.gms.maps.model.c c1;
        if (context.hasValue(c.f))
        {
            f = context.getFloat(c.f, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(c.g))
        {
            f1 = context.getFloat(c.g, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        c1 = new com.google.android.gms.maps.model.c();
        c1.a(attributeset);
        if (context.hasValue(c.i))
        {
            c1.a(context.getFloat(c.i, 0.0F));
        }
        if (context.hasValue(c.e))
        {
            c1.c(context.getFloat(c.e, 0.0F));
        }
        if (context.hasValue(c.h))
        {
            c1.b(context.getFloat(c.h, 0.0F));
        }
        return c1.a();
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
        return an.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        if (ag.a())
        {
            int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, j);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
            return;
        } else
        {
            i.a(this, parcel, j);
            return;
        }
    }

}
