// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartLayoutElement, aa, e, y, 
//            v

public final class o extends ChartLayoutElement
{

    private aa i;
    private Drawable j;

    public o()
    {
        i = new aa();
        j = null;
        i.c = new Paint();
        i.c.setColor(-1);
        i.c.setAntiAlias(true);
    }

    public o(String s)
    {
        this();
        i.a = s;
    }

    public final Paint a()
    {
        return i.c;
    }

    protected final void a(Resources resources, String s, int l, AttributeSet attributeset)
    {
        if (!"image".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        int i1 = attributeset.getAttributeResourceValue(l, -1);
        if (i1 != -1 && resources != null)
        {
            i.b = resources.getDrawable(i1);
        }
_L4:
        super.a(resources, s, l, attributeset);
        return;
_L2:
        if ("text".equalsIgnoreCase(s))
        {
            i.a = attributeset.getAttributeValue(l);
        } else
        if ("halign".equalsIgnoreCase(s))
        {
            Alignment alignment = com.artfulbits.aiCharts.Base.a._cls1.c(i.e);
            Alignment alignment2 = Alignment.valueOf(attributeset.getAttributeValue(l));
            i.f = com.artfulbits.aiCharts.Base.a._cls1.a(alignment2, alignment);
        } else
        if ("valign".equalsIgnoreCase(s))
        {
            Alignment alignment1 = Alignment.valueOf(attributeset.getAttributeValue(l));
            Alignment alignment3 = com.artfulbits.aiCharts.Base.a._cls1.b(i.e);
            i.f = com.artfulbits.aiCharts.Base.a._cls1.a(alignment3, alignment1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a(Canvas canvas)
    {
        if (j != null)
        {
            j.setBounds(a);
            j.draw(canvas);
        }
        i.c.setAntiAlias(l().a());
        i.a(canvas, null);
    }

    public final void a(Point point)
    {
        aa aa1 = i;
        int l = point.x;
        l = point.y;
        aa1.a(null);
        d = (int)i.i;
        e = (int)i.j;
        if (j != null)
        {
            Rect rect = new Rect();
            j.getPadding(rect);
            d = d + (rect.left + rect.right);
            int i1 = e;
            int j1 = rect.top;
            e = rect.bottom + j1 + i1;
            d = Math.max(d, j.getMinimumWidth());
            e = Math.max(e, j.getMinimumHeight());
        }
        point.set(d, e);
    }

    public final void a(Drawable drawable)
    {
        if (i.b != drawable)
        {
            i.b = drawable;
            b(true);
        }
    }

    public final void a(ChartLayoutElement.Dock dock)
    {
        super.a(dock);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ChartLayoutElement.Dock.values().length];
                try
                {
                    a[ChartLayoutElement.Dock.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ChartLayoutElement.Dock.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ChartLayoutElement.Dock.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ChartLayoutElement.Dock.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[dock.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            i.d = y.a;
            return;

        case 3: // '\003'
            i.d = y.b;
            return;

        case 4: // '\004'
            i.d = y.c;
            break;
        }
    }

    public final void a(String s)
    {
        if (!v.a(i.a, s))
        {
            i.a = s;
            b(true);
        }
    }

    public final void b(Drawable drawable)
    {
        if (j != drawable)
        {
            j = drawable;
            b(true);
        }
    }

    public final void c(Rect rect)
    {
        super.c(rect);
        if (j != null)
        {
            rect = new Rect();
            j.getPadding(rect);
            i.a(a.left + rect.left, a.top + rect.top, a.right - rect.right, a.bottom - rect.bottom, null);
            return;
        } else
        {
            i.a(a.left, a.top, a.right, a.bottom, null);
            return;
        }
    }

    public final String i()
    {
        return i.a;
    }

    public final Drawable j()
    {
        return i.b;
    }

    public final Drawable k()
    {
        return j;
    }
}
