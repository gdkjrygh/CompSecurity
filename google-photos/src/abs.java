// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class abs
{

    private final CompoundButton a;
    private final yh b;
    private ColorStateList c;
    private android.graphics.PorterDuff.Mode d;
    private boolean e;
    private boolean f;
    private boolean g;

    abs(CompoundButton compoundbutton, yh yh1)
    {
        c = null;
        d = null;
        e = false;
        f = false;
        a = compoundbutton;
        b = yh1;
    }

    private void b()
    {
        Drawable drawable = qe.a(a);
        if (drawable != null && (e || f))
        {
            drawable = fa.c(drawable).mutate();
            if (e)
            {
                fa.a(drawable, c);
            }
            if (f)
            {
                fa.a(drawable, d);
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
            Drawable drawable = qe.a(a);
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
        attributeset = a.getContext().obtainStyledAttributes(attributeset, uh.N, i, 0);
        if (!attributeset.hasValue(uh.O))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = attributeset.getResourceId(uh.O, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        a.setButtonDrawable(b.a(i, false));
        if (attributeset.hasValue(uh.P))
        {
            qe.a(a, attributeset.getColorStateList(uh.P));
        }
        if (attributeset.hasValue(uh.Q))
        {
            qe.a(a, b.a(attributeset.getInt(uh.Q, -1), null));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }
}
