// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.a.b;
import android.support.v7.internal.widget.au;
import android.support.v7.internal.widget.aw;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
{

    private static final int a[] = {
        0x10100d4, 0x1010176
    };
    private aw b;
    private aw c;
    private ax d;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.p);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(au.a(context), attributeset, i);
        if (ax.a)
        {
            context = az.a(getContext(), attributeset, a, i);
            d = context.c();
            if (context.f(0))
            {
                attributeset = context.c().b(context.f(0, -1));
                if (attributeset != null)
                {
                    a(attributeset);
                }
            }
            if (context.f(1))
            {
                setDropDownBackgroundDrawable(context.a(1));
            }
            context.b();
        }
    }

    private void a()
    {
        if (getBackground() != null)
        {
            if (c != null)
            {
                ax.a(this, c);
            } else
            if (b != null)
            {
                ax.a(this, b);
                return;
            }
        }
    }

    private void a(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (b == null)
            {
                b = new aw();
            }
            b.a = colorstatelist;
            b.d = true;
        } else
        {
            b = null;
        }
        a();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        a();
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        a(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        ColorStateList colorstatelist;
        if (d != null)
        {
            colorstatelist = d.b(i);
        } else
        {
            colorstatelist = null;
        }
        a(colorstatelist);
    }

    public void setDropDownBackgroundResource(int i)
    {
        if (d != null)
        {
            setDropDownBackgroundDrawable(d.a(i));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
        }
    }

}
