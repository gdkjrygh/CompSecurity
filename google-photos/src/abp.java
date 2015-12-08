// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class abp
{

    public yg a;
    private final View b;
    private final yh c;
    private yg d;

    public abp(View view, yh yh1)
    {
        b = view;
        c = yh1;
    }

    public final void a()
    {
        if (b.getBackground() != null)
        {
            if (a != null)
            {
                yh.a(b, a);
            } else
            if (d != null)
            {
                yh.a(b, d);
                return;
            }
        }
    }

    public final void a(int i)
    {
        ColorStateList colorstatelist;
        if (c != null)
        {
            colorstatelist = c.a(i);
        } else
        {
            colorstatelist = null;
        }
        b(colorstatelist);
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (a == null)
        {
            a = new yg();
        }
        a.a = colorstatelist;
        a.d = true;
        a();
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (a == null)
        {
            a = new yg();
        }
        a.b = mode;
        a.c = true;
        a();
    }

    public final void a(AttributeSet attributeset, int i)
    {
        attributeset = b.getContext().obtainStyledAttributes(attributeset, uh.ci, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(uh.cj))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = c.a(attributeset.getResourceId(uh.cj, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(uh.ck))
        {
            mk.a(b, attributeset.getColorStateList(uh.ck));
        }
        if (attributeset.hasValue(uh.cl))
        {
            mk.a(b, b.a(attributeset.getInt(uh.cl, -1), null));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    public final void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (d == null)
            {
                d = new yg();
            }
            d.a = colorstatelist;
            d.d = true;
        } else
        {
            d = null;
        }
        a();
    }
}
