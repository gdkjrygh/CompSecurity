// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.view.View;

final class goj
    implements hyk
{

    private ekp a;
    private PointF b;
    private float c;
    private float d;
    private gog e;

    goj(gog gog1, ekp ekp, PointF pointf, float f, float f1)
    {
        e = gog1;
        a = ekp;
        b = pointf;
        c = f;
        d = f1;
        super();
    }

    public final void a(View view)
    {
        if (gog.a(e) == null)
        {
            if (gog.b(e).a())
            {
                gog.b(e);
            }
            return;
        } else
        {
            gog.a(e).a(a, view, b, c, d, gpb.b);
            return;
        }
    }
}
