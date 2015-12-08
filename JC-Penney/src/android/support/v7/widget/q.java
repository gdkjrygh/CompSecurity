// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bq;
import android.support.v7.b.k;
import android.support.v7.c.a.a;
import android.support.v7.internal.widget.aj;
import android.support.v7.internal.widget.ak;
import android.util.AttributeSet;
import android.view.View;

class q
{

    private final View a;
    private final ak b;
    private aj c;
    private aj d;

    q(View view, ak ak1)
    {
        a = view;
        b = ak1;
    }

    ColorStateList a()
    {
        if (d != null)
        {
            return d.a;
        } else
        {
            return null;
        }
    }

    void a(int i)
    {
        ColorStateList colorstatelist;
        if (b != null)
        {
            colorstatelist = b.c(i);
        } else
        {
            colorstatelist = null;
        }
        b(colorstatelist);
    }

    void a(ColorStateList colorstatelist)
    {
        if (d == null)
        {
            d = new aj();
        }
        d.a = colorstatelist;
        d.d = true;
        c();
    }

    void a(android.graphics.PorterDuff.Mode mode)
    {
        if (d == null)
        {
            d = new aj();
        }
        d.b = mode;
        d.c = true;
        c();
    }

    void a(Drawable drawable)
    {
        b(null);
    }

    void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, k.ViewBackgroundHelper, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(k.ViewBackgroundHelper_android_background))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = b.c(attributeset.getResourceId(k.ViewBackgroundHelper_android_background, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(k.ViewBackgroundHelper_backgroundTint))
        {
            bq.a(a, attributeset.getColorStateList(k.ViewBackgroundHelper_backgroundTint));
        }
        if (attributeset.hasValue(k.ViewBackgroundHelper_backgroundTintMode))
        {
            bq.a(a, android.support.v7.c.a.a.a(attributeset.getInt(k.ViewBackgroundHelper_backgroundTintMode, -1), null));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    android.graphics.PorterDuff.Mode b()
    {
        if (d != null)
        {
            return d.b;
        } else
        {
            return null;
        }
    }

    void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (c == null)
            {
                c = new aj();
            }
            c.a = colorstatelist;
            c.d = true;
        } else
        {
            c = null;
        }
        c();
    }

    void c()
    {
        if (a.getBackground() != null)
        {
            if (d != null)
            {
                ak.a(a, d);
            } else
            if (c != null)
            {
                ak.a(a, c);
                return;
            }
        }
    }
}
