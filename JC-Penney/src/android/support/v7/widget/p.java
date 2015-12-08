// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bk;
import android.support.v7.b.b;
import android.support.v7.internal.widget.ah;
import android.support.v7.internal.widget.ak;
import android.support.v7.internal.widget.am;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            q, y

public class p extends AutoCompleteTextView
    implements bk
{

    private static final int a[] = {
        0x1010176
    };
    private ak b;
    private q c;
    private y d;

    public p(Context context)
    {
        this(context, null);
    }

    public p(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.autoCompleteTextViewStyle);
    }

    public p(Context context, AttributeSet attributeset, int i)
    {
        super(ah.a(context), attributeset, i);
        context = am.a(getContext(), attributeset, a, i, 0);
        b = context.c();
        if (context.d(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        context.b();
        c = new q(this, b);
        c.a(attributeset, i);
        d = new y(this);
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
            c.a(drawable);
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
