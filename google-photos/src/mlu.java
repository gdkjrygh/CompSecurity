// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import java.util.ArrayList;

public final class mlu
    implements mlv
{

    private float a;
    private float b;
    private final boolean c = false;

    public mlu(float f, float f1, boolean flag)
    {
        a = f;
        b = f1;
    }

    public final void a(ArrayList arraylist, ArrayList arraylist1, float f, PointF pointf)
    {
        if (!arraylist1.isEmpty())
        {
            arraylist1.add(arraylist1.get(arraylist1.size() - 1));
        } else
        {
            arraylist1.add(Float.valueOf(0.0F));
        }
        if (c && !arraylist.isEmpty())
        {
            arraylist1 = (PointF)arraylist.get(arraylist.size() - 1);
            arraylist1 = new PointF(((PointF) (arraylist1)).x + a, ((PointF) (arraylist1)).y + b);
        } else
        {
            arraylist1 = new PointF(a, b);
        }
        arraylist.add(arraylist1);
        pointf.set(arraylist1);
    }
}
