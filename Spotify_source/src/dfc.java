// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dfc
    implements dev
{

    TimeInterpolator a;
    List b;
    private float c;
    private float d;
    private float e;
    private float f;

    public dfc(float f1, float f2, float f3, float f4)
    {
        b = Collections.emptyList();
        a = null;
        c = f1;
        d = f2;
        e = f3;
        f = f4;
    }

    public final float a(float f1)
    {
        if (c < d)
        {
            f1 = dis.a(f1, c, d);
        } else
        {
            f1 = dis.a(f1, d, c);
        }
        f1 = dis.a(f1, c, d, e, f);
        if (a != null)
        {
            f1 = dis.a(f1, e, f, 0.0F, 1.0F);
            f1 = dis.a(a.getInterpolation(f1), 0.0F, 1.0F, e, f);
        }
        if (!b.isEmpty())
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dfb)iterator.next()).a(f1)) { }
        }
        return f1;
    }
}
