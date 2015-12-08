// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bo;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ai;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.an;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            m, u

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
    implements bo
{

    private static final int a[] = {
        0x1010176
    };
    private al b;
    private m c;
    private u d;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.autoCompleteTextViewStyle);
    }

    private AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(ai.a(context), attributeset, i);
        context = an.a(getContext(), attributeset, a, i);
        b = context.a();
        if (context.e(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        ((an) (context)).a.recycle();
        c = new m(this, b);
        c.a(attributeset, i);
        d = new u(this);
        d.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null)
        {
            c.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (c != null)
        {
            return c.b();
        } else
        {
            return null;
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
