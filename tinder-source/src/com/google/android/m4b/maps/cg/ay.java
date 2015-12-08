// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.opengl.Matrix;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ar

public final class ay
{

    public float a;
    public float b;
    public float c;
    private final float d[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
    };
    private final float e[];
    private boolean f;
    private final float g[];

    public ay()
    {
        b = 0.5F;
        e = new float[16];
        g = new float[3];
    }

    public ay(float f1, float f2, float f3)
    {
        b = 0.5F;
        e = new float[16];
        g = new float[3];
        a = f1;
        b = f2;
        c = f3;
        f = false;
    }

    public ay(ay ay1)
    {
        b = 0.5F;
        e = new float[16];
        g = new float[3];
        a = ay1.a;
        b = ay1.b;
        c = ay1.c;
        System.arraycopy(ay1.d, 0, d, 0, 16);
        f = ay1.f;
    }

    public static ay a(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        return new ay(streetviewpanoramacamera.d, streetviewpanoramacamera.c / 180F + 0.5F, streetviewpanoramacamera.b);
    }

    public final void a(float f1)
    {
        a = f1;
        f = false;
    }

    public final float[] a()
    {
        if (!f)
        {
            Matrix.setIdentityM(d, 0);
            Matrix.rotateM(d, 0, 90F - b * 180F, 1.0F, 0.0F, 0.0F);
            Matrix.rotateM(d, 0, a, 0.0F, 1.0F, 0.0F);
            f = true;
        }
        return d;
    }

    public final float b()
    {
        return (b - 0.5F) * 180F;
    }

    public final void b(float f1)
    {
        b = f1;
        f = false;
    }

    public final float c()
    {
        return ar.f(-c);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ay))
            {
                return false;
            }
            obj = (ay)obj;
            if (Float.floatToIntBits(a) != Float.floatToIntBits(((ay) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((ay) (obj)).b) || Float.floatToIntBits(c) != Float.floatToIntBits(((ay) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Float.valueOf(a), Float.valueOf(b), Float.valueOf(c)
        });
    }

    public final String toString()
    {
        return v.a(this).a("pitch", Float.valueOf(b())).a("yaw", Float.valueOf(a)).a("zoom", Float.valueOf(c)).toString();
    }
}
