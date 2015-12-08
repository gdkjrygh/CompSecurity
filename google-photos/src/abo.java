// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class abo extends AutoCompleteTextView
    implements mf
{

    private static final int a[] = {
        0x1010176
    };
    private yh b;
    private abp c;
    private ace d;

    public abo(Context context)
    {
        this(context, null);
    }

    public abo(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.x);
    }

    public abo(Context context, AttributeSet attributeset, int i)
    {
        super(ye.a(context), attributeset, i);
        context = yj.a(getContext(), attributeset, a, i, 0);
        b = context.a();
        if (context.d(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        ((yj) (context)).a.recycle();
        c = new abp(this, b);
        c.a(attributeset, i);
        d = new ace(this);
        d.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (c != null)
        {
            c.a();
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
