// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.FloatMath;

public abstract class ao
{

    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public Matrix F;
    protected Context a;
    public Matrix b;
    public int c;
    public int d;
    public Point e;
    public boolean f;
    public String g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n[];
    public float o[];
    public int p;
    public int q;
    public float r[];
    public int s;
    public int t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ao(Context context)
    {
        h = 1.0F;
        i = 1.0F;
        j = 0.0F;
        k = 0.0F;
        u = 1.0F;
        x = false;
        y = true;
        z = false;
        C = false;
        F = new Matrix();
        a = context;
        b = new Matrix();
    }

    public static float a(float f1, float f2, float f3, float f4)
    {
        f1 -= f3;
        f2 -= f4;
        return FloatMath.sqrt(f1 * f1 + f2 * f2);
    }

    private static boolean a(PointF pointf, PointF pointf1, PointF pointf2)
    {
        double d1 = (pointf2.x - pointf.x) * (pointf1.x - pointf.x) + (pointf2.y - pointf.y) * (pointf1.y - pointf.y);
        return d1 > 0.0D || Double.isNaN(d1);
    }

    public abstract ao a(Context context);

    public abstract void a();

    public abstract void a(Canvas canvas);

    public abstract boolean a(float f1);

    public final boolean a(float f1, float f2)
    {
        if (n != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        float af[];
        int i1;
        af = (float[])n.clone();
        b.mapPoints(af, n);
        i1 = 0;
_L5:
        if (i1 >= af.length)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (!Float.isNaN(af[i1])) goto _L4; else goto _L3
_L3:
        i1 = 1;
_L6:
        if (i1 != 0)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_77;
_L4:
        i1++;
          goto _L5
        i1 = 0;
          goto _L6
        o = af;
        PointF pointf = new PointF(o[0], o[1]);
        PointF pointf1 = new PointF(o[4], o[5]);
        PointF pointf2 = new PointF(o[8], o[9]);
        PointF pointf3 = new PointF(o[12], o[13]);
        PointF pointf4 = new PointF(f1, f2);
        boolean flag = a(pointf, pointf1, pointf4);
        boolean flag1 = a(pointf1, pointf2, pointf4);
        boolean flag2 = a(pointf2, pointf3, pointf4);
        boolean flag3 = a(pointf3, pointf, pointf4);
        if (flag && flag1 && flag2 && flag3)
        {
            return true;
        }
        if (!flag && !flag1 && !flag2 && !flag3)
        {
            return false;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public abstract void b();

    public void b(float f1)
    {
        b.postRotate(f1, o[16], o[17]);
        l = l + f1;
    }

    public void b(float f1, float f2)
    {
        b.postTranslate(f1, f2);
        k = k + f2;
        j = j + f1;
    }

    public final int c()
    {
        return (int)(a(n[0], n[1], n[4], n[5]) * h);
    }

    public final int d()
    {
        return (int)(a(n[0], n[1], n[12], n[13]) * h);
    }

    public final float[] e()
    {
        b.mapPoints(o, n);
        return (new float[] {
            o[16], o[17]
        });
    }

    public final float[] f()
    {
        return (new float[] {
            o[16], o[17]
        });
    }
}
