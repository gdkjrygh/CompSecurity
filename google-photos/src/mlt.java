// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import java.util.ArrayList;

public final class mlt
    implements mlv
{

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private final boolean g = false;

    public mlt(float f1, float f2, float f3, float f4, float f5, float f6, boolean flag)
    {
        a = f1;
        b = f2;
        c = f3;
        d = f4;
        e = f5;
        f = f6;
    }

    public final void a(ArrayList arraylist, ArrayList arraylist1, float f1, PointF pointf)
    {
        Object obj;
        if (arraylist.isEmpty())
        {
            obj = new PointF(0.0F, 0.0F);
        } else
        {
            obj = (PointF)arraylist.get(arraylist.size() - 1);
        }
        if (g)
        {
            PointF pointf1 = new PointF(a + ((PointF) (obj)).x, b + ((PointF) (obj)).y);
            PointF pointf2 = new PointF(c + ((PointF) (obj)).x, d + ((PointF) (obj)).y);
            float f2 = e;
            float f3 = ((PointF) (obj)).x;
            float f4 = f;
            obj = (new PointF[] {
                obj, pointf1, pointf2, new PointF(f2 + f3, ((PointF) (obj)).y + f4)
            });
        } else
        {
            obj = (new PointF[] {
                obj, new PointF(a, b), new PointF(c, d), new PointF(e, f)
            });
        }
        mlr.a(((PointF []) (obj)), mlr.a(), true, arraylist, arraylist1, f1, pointf);
    }
}
