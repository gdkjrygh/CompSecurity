// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class c
{

    private final CompoundButton a;
    private final o b;
    private ColorStateList c;
    private android.graphics.PorterDuff.Mode d;
    private boolean e;
    private boolean f;
    private boolean g;

    c(CompoundButton compoundbutton, o o1)
    {
        c = null;
        d = null;
        e = false;
        f = false;
        a = compoundbutton;
        b = o1;
    }

    private void b()
    {
        Drawable drawable = android.support.v4.widget.c.a(a);
        if (drawable != null && (e || f))
        {
            drawable = android.support.v4.graphics.drawable.a.c(drawable).mutate();
            if (e)
            {
                android.support.v4.graphics.drawable.a.a(drawable, c);
            }
            if (f)
            {
                android.support.v4.graphics.drawable.a.a(drawable, d);
            }
            if (drawable.isStateful())
            {
                drawable.setState(a.getDrawableState());
            }
            a.setButtonDrawable(drawable);
        }
    }

    final int a(int i)
    {
        int j = i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Drawable drawable = android.support.v4.widget.c.a(a);
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
        c = colorstatelist;
        e = true;
        b();
    }

    final void a(android.graphics.PorterDuff.Mode mode)
    {
        d = mode;
        f = true;
        b();
    }

    final void a(AttributeSet attributeset, int i)
    {
        attributeset = a.getContext().obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.CompoundButton, i, 0);
        if (!attributeset.hasValue(android.support.v7.appcompat.a.k.CompoundButton_android_button))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        i = attributeset.getResourceId(android.support.v7.appcompat.a.k.CompoundButton_android_button, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        a.setButtonDrawable(b.a(i));
        if (attributeset.hasValue(android.support.v7.appcompat.a.k.CompoundButton_buttonTint))
        {
            android.support.v4.widget.c.a(a, attributeset.getColorStateList(android.support.v7.appcompat.a.k.CompoundButton_buttonTint));
        }
        if (attributeset.hasValue(android.support.v7.appcompat.a.k.CompoundButton_buttonTintMode))
        {
            android.support.v4.widget.c.a(a, android.support.v7.graphics.drawable.a.a(attributeset.getInt(android.support.v7.appcompat.a.k.CompoundButton_buttonTintMode, -1)));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }
}
