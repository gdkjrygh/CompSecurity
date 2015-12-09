// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.artfulbits.aiCharts.Base.ChartLegend;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.e;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            b

static final class c extends b
{

    private PointF a;
    private String b;
    private int c;

    protected final void a(e e1, PointF pointf)
    {
        c;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 42
    //                   2 97;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        pointf.set(a);
        return;
_L3:
        e1 = (a)e1.b().a(b);
        if (e1 != null)
        {
            e1 = e1.f();
            pointf.set((float)((Rect) (e1)).left + a.x, (float)((Rect) (e1)).top + a.y);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        e1 = (ChartLegend)e1.d().a(b);
        if (e1 != null)
        {
            e1 = e1.h();
            pointf.set((float)((Rect) (e1)).left + a.x, (float)((Rect) (e1)).top + a.y);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public (PointF pointf)
    {
        this(pointf, null, 0);
    }

    public <init>(PointF pointf, String s, int i)
    {
        a = pointf;
        b = s;
        c = i;
    }
}
