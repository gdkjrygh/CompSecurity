// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.v;
import android.support.v7.internal.widget.m;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            b, d

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
    implements v
{

    private static final int a[] = {
        0x1010176
    };
    private o b;
    private b c;
    private d d;

    public AppCompatMultiAutoCompleteTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(m.a(context), attributeset, i);
        context = p.a(getContext(), attributeset, a, i);
        b = context.c();
        if (context.g(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        context.b();
        c = new b(this, b);
        c.a(attributeset, i);
        d = new d(this);
        d.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null)
        {
            c.b();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (c != null)
        {
            c.a();
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (c != null)
        {
            c.a(i);
        }
    }

    public void setDropDownBackgroundResource(int i)
    {
        if (b != null)
        {
            setDropDownBackgroundDrawable(b.a(i));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (c != null)
        {
            c.a(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (c != null)
        {
            c.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (d != null)
        {
            d.a(context, i);
        }
    }

}
