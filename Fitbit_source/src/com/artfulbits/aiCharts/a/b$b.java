// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.PointF;
import android.text.TextUtils;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.p;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            b

static final class c extends b
{

    private final String a;
    private final double b;
    private final double c;

    protected final void a(e e1, PointF pointf)
    {
        a a1 = null;
        if (e1.b().size() > 0)
        {
            if (TextUtils.isEmpty(a))
            {
                a1 = (a)e1.b().get(0);
            } else
            {
                a1 = (a)e1.b().a(a);
            }
        }
        if (a1 == null)
        {
            pointf.set(0.0F, 0.0F);
            return;
        } else
        {
            p.a(a1).a(b, c, pointf);
            return;
        }
    }

    public (String s, double d, double d1)
    {
        a = s;
        b = d;
        c = d1;
    }
}
