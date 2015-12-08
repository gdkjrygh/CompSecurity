// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.widget.e;
import android.support.v7.a.l;
import android.support.v7.internal.widget.al;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class n
{

    ColorStateList a;
    android.graphics.PorterDuff.Mode b;
    private final CompoundButton c;
    private final al d;
    private boolean e;
    private boolean f;
    private boolean g;

    n(CompoundButton compoundbutton, al al1)
    {
        a = null;
        b = null;
        e = false;
        f = false;
        c = compoundbutton;
        d = al1;
    }

    private void b()
    {
        Drawable drawable = android.support.v4.widget.e.a(c);
        if (drawable != null && (e || f))
        {
            drawable = android.support.v4.a.a.a.c(drawable).mutate();
            if (e)
            {
                android.support.v4.a.a.a.a(drawable, a);
            }
            if (f)
            {
                android.support.v4.a.a.a.a(drawable, b);
            }
            if (drawable.isStateful())
            {
                drawable.setState(c.getDrawableState());
            }
            c.setButtonDrawable(drawable);
        }
    }

    final int a(int i)
    {
        int j = i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Drawable drawable = android.support.v4.widget.e.a(c);
            j = i;
            if (drawable != null)
            {
                j = i + drawable.getIntrinsicWidth();
            }
        }
        return j;
    }

    final void a()
    {
        if (g)
        {
            g = false;
            return;
        } else
        {
            g = true;
            b();
            return;
        }
    }

    final void a(ColorStateList colorstatelist)
    {
        a = colorstatelist;
        e = true;
        b();
    }

    final void a(android.graphics.PorterDuff.Mode mode)
    {
        b = mode;
        f = true;
        b();
    }

    final void a(AttributeSet attributeset, int i)
    {
        attributeset = c.getContext().obtainStyledAttributes(attributeset, l.CompoundButton, i, 0);
        if (!attributeset.hasValue(l.CompoundButton_android_button))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = attributeset.getResourceId(l.CompoundButton_android_button, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        c.setButtonDrawable(d.a(i, false));
        if (attributeset.hasValue(l.CompoundButton_buttonTint))
        {
            android.support.v4.widget.e.a(c, attributeset.getColorStateList(l.CompoundButton_buttonTint));
        }
        if (attributeset.hasValue(l.CompoundButton_buttonTintMode))
        {
            android.support.v4.widget.e.a(c, android.support.v7.b.a.a.a(attributeset.getInt(l.CompoundButton_buttonTintMode, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }
}
