// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            y

final class aa
{

    public String a;
    public Drawable b;
    public Paint c;
    public y d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private float p;
    private float q;
    private float r;
    private int s;
    private int t;
    private float u;

    public aa()
    {
        f = 16;
        u = 4F;
    }

    public aa(Paint paint)
    {
        f = 16;
        u = 4F;
        c = paint;
    }

    private void b(Paint paint)
    {
        if (c != null)
        {
            paint = c;
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        f & 0xf;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 107
    //                   1 148
    //                   2 173;
           goto _L3 _L4 _L5 _L6
_L3:
        f >> 4 & 0xf;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 208
    //                   1 249
    //                   2 274;
           goto _L7 _L8 _L9 _L10
_L7:
        m = m + (paint.getTextSize() - paint.descent());
        return;
_L4:
        n = (int)Math.ceil(-p / 2.0F);
        l = -p / 2.0F + (float)s + u;
          goto _L3
_L5:
        n = -(s / 2);
        l = -q / 2.0F;
          goto _L3
_L6:
        n = (int)Math.ceil(p / 2.0F - (float)s);
        l = -p / 2.0F;
          goto _L3
_L8:
        o = (int)Math.ceil(-k / 2.0F);
        m = -k / 2.0F + (float)t + u;
          goto _L7
_L9:
        o = -(t / 2);
        m = -r / 2.0F;
          goto _L7
_L10:
        o = (int)Math.ceil(k / 2.0F - (float)t);
        m = -k / 2.0F;
          goto _L7
_L2:
        l = -q / 2.0F;
        m = -r / 2.0F;
          goto _L7
    }

    public final void a(float f1, float f2, float f3, float f4, Paint paint)
    {
        b(paint);
        e & 0xf;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 77
    //                   1 92
    //                   2 104;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_104;
_L5:
        switch (e >> 4 & 0xf)
        {
        default:
            return;

        case 0: // '\0'
            h = j / 2.0F + f2;
            return;

        case 1: // '\001'
            h = (f2 + f4) / 2.0F;
            return;

        case 2: // '\002'
            h = f4 - j / 2.0F;
            break;
        }
        break MISSING_BLOCK_LABEL_156;
_L2:
        g = i / 2.0F + f1;
          goto _L5
_L3:
        g = (f1 + f3) / 2.0F;
          goto _L5
        g = f3 - i / 2.0F;
          goto _L5
    }

    public final void a(float f1, float f2, Paint paint)
    {
        b(paint);
        e & 0xf;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 77
    //                   1 92
    //                   2 100;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_100;
_L5:
        switch (e >> 4 & 0xf)
        {
        default:
            return;

        case 0: // '\0'
            h = f2 - j / 2.0F;
            return;

        case 1: // '\001'
            h = f2;
            return;

        case 2: // '\002'
            h = j / 2.0F + f2;
            break;
        }
        break MISSING_BLOCK_LABEL_146;
_L2:
        g = f1 - i / 2.0F;
          goto _L5
_L3:
        g = f1;
          goto _L5
        g = i / 2.0F + f1;
          goto _L5
    }

    public final void a(Canvas canvas, Paint paint)
    {
        canvas.save(1);
        canvas.translate((int)g, (int)h);
        if (d != null && d.d != 0.0F)
        {
            canvas.rotate(d.d);
        }
        if (b != null)
        {
            b.setBounds(n, o, n + s, o + t);
            b.draw(canvas);
        }
        if (!TextUtils.isEmpty(a))
        {
            String s1 = a;
            float f1 = l;
            float f2 = m;
            if (c != null)
            {
                paint = c;
            }
            canvas.drawText(s1, f1, f2, paint);
        }
        canvas.restore();
    }

    public final void a(Paint paint)
    {
        p = 0.0F;
        k = 0.0F;
        if (c != null)
        {
            paint = c;
        }
        if (!TextUtils.isEmpty(a))
        {
            float f1 = (float)Math.ceil(paint.measureText(a));
            q = f1;
            p = f1;
            f1 = (float)Math.ceil(paint.getTextSize());
            r = f1;
            k = f1;
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        s = b.getIntrinsicWidth();
        t = b.getIntrinsicWidth();
        f & 0xf;
        JVM INSTR tableswitch 0 2: default 140
    //                   0 244
    //                   1 140
    //                   2 244;
           goto _L3 _L4 _L3 _L4
_L3:
        p = Math.max(p, s);
_L7:
        f >> 4 & 0xf;
        JVM INSTR tableswitch 0 2: default 192
    //                   0 266
    //                   1 192
    //                   2 266;
           goto _L5 _L6 _L5 _L6
_L5:
        k = Math.max(k, t);
_L2:
        if (d == null || d.d == 0.0F)
        {
            i = p;
            j = k;
            return;
        } else
        {
            i = Math.abs(d.e * p) + Math.abs(d.f * k);
            j = Math.abs(d.f * p) + Math.abs(d.e * k);
            return;
        }
_L4:
        p = p + ((float)s + u);
          goto _L7
_L6:
        k = k + ((float)t + u);
          goto _L2
    }
}
