// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Matrix;
import android.graphics.RectF;
import org.json.JSONException;
import org.json.JSONObject;

public class g
{

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;

    public g(float f1, float f2, float f3, float f4, float f5)
    {
        a = f1;
        b = f2;
        c = f3;
        d = f4;
        e = f5;
    }

    public g(RectF rectf, float f1)
    {
        this(rectf.right, rectf.bottom, rectf.left, rectf.top, f1);
    }

    public g(JSONObject jsonobject, float f1)
        throws JSONException
    {
        this((float)jsonobject.optDouble("x_ratio"), (float)jsonobject.optDouble("y_ratio"), (float)jsonobject.optDouble("x_offset"), (float)jsonobject.optDouble("y_offset"), f1);
    }

    public RectF a(float f1, float f2)
    {
        if (a == 1.0F && b == 1.0F)
        {
            return new RectF();
        } else
        {
            RectF rectf = new RectF(a(f1, f2, false));
            rectf.inset(2.0F, 2.0F);
            return rectf;
        }
    }

    public RectF a(float f1, float f2, boolean flag)
    {
        RectF rectf = new RectF();
        float af[] = new float[4];
        af[0] = c;
        af[1] = d;
        af[2] = c + a;
        af[3] = d + b;
        Matrix matrix = new Matrix();
        matrix.postRotate(0.0F, c + a / 2.0F, d + b / 2.0F);
        matrix.postScale(f1, f2);
        matrix.mapPoints(af);
        rectf.top = af[1];
        rectf.bottom = af[3];
        rectf.left = af[0];
        rectf.right = af[2];
        double d1;
        double d2;
        double d3;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (d == 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (d + b == 1.0F)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (c == 0.0F)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (c + a == 1.0F)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = e * f1;
        }
        d2 = rectf.top;
        d3 = f1;
        if (flag1)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.5D;
        }
        rectf.top = (float)(d1 * d3 + d2);
        d2 = rectf.bottom;
        d3 = f1;
        if (flag2)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.5D;
        }
        rectf.bottom = (float)(d2 - d1 * d3);
        d2 = rectf.left;
        d3 = f1;
        if (flag3)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.5D;
        }
        rectf.left = (float)(d1 * d3 + d2);
        d2 = rectf.right;
        d3 = f1;
        if (flag4)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.5D;
        }
        rectf.right = (float)(d2 - d1 * d3);
        return rectf;
    }

    public JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("x_ratio", a);
        jsonobject.put("y_ratio", b);
        jsonobject.put("x_offset", c);
        jsonobject.put("y_offset", d);
        return jsonobject;
    }

    public void a(float f1)
    {
        e = f1;
    }

    public boolean a(float f1, float f2, int i, int j)
    {
        float af[] = new float[2];
        af[0] = f1 / (float)i;
        af[1] = f2 / (float)j;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-b(), -c());
        matrix.mapPoints(af);
        return Math.abs(af[0]) < a / 2.0F && Math.abs(af[1]) < b / 2.0F;
    }

    public float b()
    {
        return c + a / 2.0F;
    }

    public float c()
    {
        return d + b / 2.0F;
    }

    public float d()
    {
        return a;
    }

    public float e()
    {
        return b;
    }

    public float f()
    {
        return c;
    }

    public float g()
    {
        return d;
    }

    public float h()
    {
        return e;
    }
}
