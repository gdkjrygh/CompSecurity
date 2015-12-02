// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            a, Rocket, RocketSmoke

public class b extends Drawable
    implements com.nineoldandroids.a.o.b, a
{

    private static final String b = com/qihoo/security/ui/opti/sysclear/rocket/b.getSimpleName();
    Context a;
    private a c;
    private long d;
    private float e;

    public b(Context context)
    {
        c = null;
        d = 0L;
        e = 0.0F;
        a = context;
    }

    public a a()
    {
        return c;
    }

    public void a(float f, float f1, boolean flag, View view)
    {
        Rect rect = getBounds();
        if (rect != null && !rect.isEmpty())
        {
            Rocket.init(a, flag, rect, this, this);
            RocketSmoke.init(a, rect, this);
            Rocket.launch(f, f1, flag, view);
            e = (float)(Rocket.getRocketWidth() / 2) + f;
        }
    }

    public void a(int i)
    {
        a a1 = a();
        if (a1 != null)
        {
            a1.a(i);
        }
    }

    public void a(o o)
    {
        long l = System.currentTimeMillis();
        if (l - d > 10L)
        {
            invalidateSelf();
            d = l;
        }
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void b()
    {
        Rocket.destroy();
        RocketSmoke.destroy();
    }

    public void b(int i)
    {
        if (i == 2)
        {
            RocketSmoke.startSmoke(e);
        }
        a a1 = a();
        if (a1 != null)
        {
            a1.b(i);
        }
    }

    public void c(int i)
    {
        a a1 = a();
        if (a1 != null)
        {
            a1.c(i);
        }
    }

    public void draw(Canvas canvas)
    {
        Rocket.draw(canvas);
        RocketSmoke.draw(canvas);
    }

    public int getOpacity()
    {
        return 1;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

}
