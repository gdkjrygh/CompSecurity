// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;

class b extends b
{

    public float a;
    public float b;
    private co c;

    public void a(String s)
    {
        if (co.a(c))
        {
            if (co.b(c).b)
            {
                co.c(c).drawText(s, a, b, co.b(c).d);
            }
            if (co.b(c).c)
            {
                co.c(c).drawText(s, a, b, co.b(c).e);
            }
        }
        a = a + co.b(c).d.measureText(s);
    }

    public >(co co1, float f, float f1)
    {
        c = co1;
        super((byte)0);
        a = f;
        b = f1;
    }
}
