// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            Star

public class Stellar extends Star
{

    protected float i;
    protected float j;
    protected float k;

    public Stellar()
    {
        i = 0.0F;
        j = 0.0F;
    }

    public Stellar(Drawable drawable, float f, float f1, float f2, float f3)
    {
        i = 0.0F;
        j = 0.0F;
        c = f3;
        k = f2;
        i = f1;
        j = f;
        h = drawable;
    }

    public void draw(Canvas canvas, Rect rect)
    {
        a = (float)((double)i + (double)k * Math.cos(((double)c * 3.1415926535897931D) / 180D));
        b = -(float)((double)j + (double)k * Math.sin(((double)c * 3.1415926535897931D) / 180D));
        super.draw(canvas, rect);
    }

    public float getPx()
    {
        return i;
    }

    public float getPy()
    {
        return j;
    }

    public float getRadius()
    {
        return k;
    }

    public void setPx(float f)
    {
        i = f;
    }

    public void setPy(float f)
    {
        j = f;
    }

    public void setRadius(float f)
    {
        k = f;
    }
}
