// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import kh;
import vx;
import wa;
import wc;
import zl;
import zs;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
    implements kh
{

    private static final int a[] = {
        0x1010176
    };
    private wa b;
    private zl c;
    private zs d;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010137);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(vx.a(context), attributeset, i);
        context = wc.a(getContext(), attributeset, a, i);
        b = context.a();
        if (context.e(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        ((wc) (context)).a.recycle();
        c = new zl(this, b);
        c.a(attributeset, i);
        d = zs.a(this);
        d.a(attributeset, i);
        d.a();
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (c != null)
        {
            c.a(colorstatelist);
        }
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (c != null)
        {
            c.a(mode);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            d.a();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (c != null)
        {
            c.b(null);
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
            setDropDownBackgroundDrawable(b.a(i, false));
            return;
        } else
        {
            super.setDropDownBackgroundResource(i);
            return;
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
