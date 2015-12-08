// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.view.x;
import android.support.v7.graphics.drawable.a;
import android.support.v7.internal.widget.n;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;
import android.view.View;

final class b
{

    private final View a;
    private final o b;
    private n c;
    private n d;

    b(View view, o o1)
    {
        a = view;
        b = o1;
    }

    private void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (c == null)
            {
                c = new n();
            }
            c.a = colorstatelist;
            c.d = true;
        } else
        {
            c = null;
        }
        b();
    }

    final void a()
    {
        b(null);
    }

    final void a(int i)
    {
        ColorStateList colorstatelist;
        if (b != null)
        {
            colorstatelist = b.b(i);
        } else
        {
            colorstatelist = null;
        }
        b(colorstatelist);
    }

    final void a(ColorStateList colorstatelist)
    {
        if (d == null)
        {
            d = new n();
        }
        d.a = colorstatelist;
        d.d = true;
        b();
    }

    final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (d == null)
        {
            d = new n();
        }
        d.b = mode;
        d.c = true;
        b();
    }

    final void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.ViewBackgroundHelper, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(android.support.v7.appcompat.a.k.ViewBackgroundHelper_android_background))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = b.b(attributeset.getResourceId(android.support.v7.appcompat.a.k.ViewBackgroundHelper_android_background, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(android.support.v7.appcompat.a.k.ViewBackgroundHelper_backgroundTint))
        {
            x.a(a, attributeset.getColorStateList(android.support.v7.appcompat.a.k.ViewBackgroundHelper_backgroundTint));
        }
        if (attributeset.hasValue(android.support.v7.appcompat.a.k.ViewBackgroundHelper_backgroundTintMode))
        {
            x.a(a, android.support.v7.graphics.drawable.a.a(attributeset.getInt(android.support.v7.appcompat.a.k.ViewBackgroundHelper_backgroundTintMode, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    final void b()
    {
        if (a.getBackground() != null)
        {
            if (d != null)
            {
                o.a(a, d);
            } else
            if (c != null)
            {
                o.a(a, c);
                return;
            }
        }
    }
}
