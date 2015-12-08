// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.view.bt;
import android.support.v7.a.l;
import android.support.v7.b.a.a;
import android.support.v7.internal.widget.ak;
import android.support.v7.internal.widget.al;
import android.util.AttributeSet;
import android.view.View;

final class m
{

    private final View a;
    private final al b;
    private ak c;
    private ak d;

    m(View view, al al1)
    {
        a = view;
        b = al1;
    }

    final ColorStateList a()
    {
        if (d != null)
        {
            return d.a;
        } else
        {
            return null;
        }
    }

    final void a(int i)
    {
        ColorStateList colorstatelist;
        if (b != null)
        {
            colorstatelist = b.a(i);
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
            d = new ak();
        }
        d.a = colorstatelist;
        d.d = true;
        c();
    }

    final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (d == null)
        {
            d = new ak();
        }
        d.b = mode;
        d.c = true;
        c();
    }

    final void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, l.ViewBackgroundHelper, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(l.ViewBackgroundHelper_android_background))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = b.a(attributeset.getResourceId(l.ViewBackgroundHelper_android_background, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b(colorstatelist);
        if (attributeset.hasValue(l.ViewBackgroundHelper_backgroundTint))
        {
            bt.a(a, attributeset.getColorStateList(l.ViewBackgroundHelper_backgroundTint));
        }
        if (attributeset.hasValue(l.ViewBackgroundHelper_backgroundTintMode))
        {
            bt.a(a, android.support.v7.b.a.a.a(attributeset.getInt(l.ViewBackgroundHelper_backgroundTintMode, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    final android.graphics.PorterDuff.Mode b()
    {
        if (d != null)
        {
            return d.b;
        } else
        {
            return null;
        }
    }

    final void b(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (c == null)
            {
                c = new ak();
            }
            c.a = colorstatelist;
            c.d = true;
        } else
        {
            c = null;
        }
        c();
    }

    final void c()
    {
        if (a.getBackground() != null)
        {
            if (d != null)
            {
                al.a(a, d);
            } else
            if (c != null)
            {
                al.a(a, c);
                return;
            }
        }
    }
}
