// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.m4b.maps.cg.aa;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            h, d

public final class e
    implements com.google.android.m4b.maps.cg.aa.a
{

    final aa a;
    Paint b;
    Point c;
    Point d;
    private final h e;

    public e(aa aa1, h h1)
    {
        b = new Paint();
        c = new Point(-2, -2);
        d = new Point(-1, -1);
        a = aa1;
        e = h1;
    }

    public final void a()
    {
        h h1 = e;
        h1.b.add(this);
        h1.d.invalidate();
    }

    public final void a(int i)
    {
        if ((i & 1) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 2) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 4) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 0x40) != 0)
        {
            if (!a.v())
            {
                e.a(this);
            }
            e.d.invalidate();
        }
        if ((i & 0x400) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 0x200) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 0x80) != 0)
        {
            e.d.invalidate();
        }
        if ((i & 0x100) != 0)
        {
            e.d.invalidate();
        }
    }

    public final void b()
    {
        h h1 = e;
        h1.b.remove(this);
        if (h1.e == a)
        {
            h1.e = null;
        }
        h1.d.invalidate();
    }

    public final void c()
    {
        h h1 = e;
        h1.e = a;
        h1.d.invalidate();
    }

    public final void d()
    {
        e.a(this);
    }

    public final void e()
    {
    }

    public final boolean f()
    {
        return e.e == a;
    }

    public final Rect g()
    {
        return new Rect(c.x, c.y, d.x, d.y);
    }
}
