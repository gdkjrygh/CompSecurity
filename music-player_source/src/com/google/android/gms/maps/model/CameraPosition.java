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
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gt;
import com.google.android.gms.maps.a.b;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            c, LatLng, b

public final class CameraPosition
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.model.c a = new com.google.android.gms.maps.model.c();
    public final LatLng b;
    public final float c;
    public final float d;
    public final float e;
    private final int f;

    CameraPosition(int i, LatLng latlng, float f1, float f2, float f3)
    {
        gt.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f2 && f2 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf("Tilt needs to be between 0 and 90 inclusive"));
        }
        f = i;
        b = latlng;
        c = f1;
        d = f2 + 0.0F;
        f1 = f3;
        if ((double)f3 <= 0.0D)
        {
            f1 = f3 % 360F + 360F;
        }
        e = f1 % 360F;
    }

    public CameraPosition(LatLng latlng, float f1, float f2, float f3)
    {
        this(1, latlng, f1, f2, f3);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, e.b);
        float f1;
        float f2;
        com.google.android.gms.maps.model.b b1;
        if (context.hasValue(2))
        {
            f1 = context.getFloat(2, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        if (context.hasValue(3))
        {
            f2 = context.getFloat(3, 0.0F);
        } else
        {
            f2 = 0.0F;
        }
        attributeset = new LatLng(f1, f2);
        b1 = new com.google.android.gms.maps.model.b();
        b1.a(attributeset);
        if (context.hasValue(5))
        {
            b1.a(context.getFloat(5, 0.0F));
        }
        if (context.hasValue(1))
        {
            b1.c(context.getFloat(1, 0.0F));
        }
        if (context.hasValue(4))
        {
            b1.b(context.getFloat(4, 0.0F));
        }
        return b1.a();
    }

    final int a()
    {
        return f;
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
        return gq.a(this).a("target", b).a("zoom", Float.valueOf(c)).a("tilt", Float.valueOf(d)).a("bearing", Float.valueOf(e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
            return;
        } else
        {
            com.google.android.gms.maps.model.c.a(this, parcel, i);
            return;
        }
    }

}
