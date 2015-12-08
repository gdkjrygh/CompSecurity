// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class r
    implements Runnable
{

    private q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void run()
    {
        float f = (float)(a.b.getDrawingTime() - a.c) / (float)a.d;
        if (f > 1.0F || a.b.getParent() == null)
        {
            f = 1.0F;
        }
        a.e = f;
        q q1 = a;
        for (int i = q1.a.size() - 1; i >= 0; i--)
        {
            ((o)q1.a.get(i)).a(q1);
        }

        if (a.e >= 1.0F)
        {
            a.b();
            return;
        } else
        {
            a.b.postDelayed(a.f, 16L);
            return;
        }
    }
}
