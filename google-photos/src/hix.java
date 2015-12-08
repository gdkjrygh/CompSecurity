// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

public final class hix
    implements hiw
{

    private final View a;
    private final Rect b;
    private final Rect c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;

    public hix(View view)
    {
        this(view, true);
    }

    public hix(View view, boolean flag)
    {
        a = view;
        e = flag;
        b = new Rect();
        c = new Rect();
        d = view.getContext().getResources().getDimensionPixelOffset(b.wa);
        f = view.getContext().getResources().getDimensionPixelSize(b.wb);
        g = view.getContext().getResources().getDimensionPixelSize(b.wc);
        if (mk.h(view) == 1 && android.os.Build.VERSION.SDK_INT >= 17)
        {
            ((GradientDrawable)view.findViewById(b.wf).getBackground()).setOrientation(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT);
        }
    }

    public final Rect a()
    {
        return a.findViewById(b.wg).getBackground().getBounds();
    }

    public final void a(float f1)
    {
        int i = Math.round((float)f * f1);
        int j = Math.round((float)g * f1);
        c.set(i, j, a.getWidth() - i, a.getHeight() - j);
        mk.a(a, c);
        a.findViewById(b.wg).getBackground().setBounds(c);
        a.findViewById(b.we).setAlpha(f1);
        a.invalidate();
    }

    public final void b(float f1)
    {
        int i;
        int j;
        if (c.isEmpty())
        {
            j = a.getWidth();
        } else
        {
            j = c.width();
        }
        if (c.isEmpty())
        {
            i = a.getHeight();
        } else
        {
            i = c.height();
        }
        j = Math.round((float)j - (float)(j - d) * f1);
        if (i > d)
        {
            i = Math.round((float)i - (float)(i - d) * f1);
        }
        if (!c.isEmpty())
        {
            if (mk.h(a) == 1)
            {
                b.set(a.getWidth() - j, 0, a.getWidth(), i);
                b.set(c.right - j, c.top + b.top, b.right - (a.getWidth() - c.right), i + c.top);
            } else
            {
                b.set(0, 0, j, i);
                b.set(c.left + b.left, c.top + b.top, j + c.left, i + c.top);
            }
        }
        a.findViewById(b.wg).getBackground().setBounds(b);
        a.getBackground().setBounds(b);
        mk.a(a, b);
        if (e)
        {
            a.findViewById(b.wd).setAlpha(f1);
        }
        a.invalidate();
    }
}
