// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.imagecrop;


public class CropTouchPoint
{

    private float x;
    private float y;

    public CropTouchPoint()
    {
    }

    public CropTouchPoint(float f, float f1)
    {
        x = f;
        y = f1;
    }

    public CropTouchPoint(CropTouchPoint croptouchpoint)
    {
        x = croptouchpoint.x;
        y = croptouchpoint.y;
    }

    public static CropTouchPoint subtract(CropTouchPoint croptouchpoint, CropTouchPoint croptouchpoint1)
    {
        return new CropTouchPoint(croptouchpoint.x - croptouchpoint1.x, croptouchpoint.y - croptouchpoint1.y);
    }

    public CropTouchPoint add(CropTouchPoint croptouchpoint)
    {
        x = x + croptouchpoint.getX();
        y = y + croptouchpoint.getY();
        return this;
    }

    public CropTouchPoint copy(CropTouchPoint croptouchpoint)
    {
        x = croptouchpoint.getX();
        y = croptouchpoint.getY();
        return this;
    }

    public float getLength()
    {
        return (float)Math.sqrt(x * x + y * y);
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public CropTouchPoint set(float f, float f1)
    {
        x = f;
        y = f1;
        return this;
    }

    public String toString()
    {
        return String.format("(%.4f, %.4f)", new Object[] {
            Float.valueOf(x), Float.valueOf(y)
        });
    }
}
