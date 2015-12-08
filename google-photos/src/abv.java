// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class abv extends RadioButton
    implements rq
{

    private yh a;
    private abs b;

    public abv(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.O);
    }

    private abv(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = yh.a(context);
        b = new abs(this, a);
        b.a(attributeset, i);
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (b != null)
        {
            b.a(colorstatelist);
        }
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (b != null)
        {
            b.a(mode);
        }
    }

    public final int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (b != null)
        {
            i = b.a(j);
        }
        return i;
    }

    public final void setButtonDrawable(int i)
    {
        Drawable drawable;
        if (a != null)
        {
            drawable = a.a(i, false);
        } else
        {
            drawable = ed.a(getContext(), i);
        }
        setButtonDrawable(drawable);
    }

    public final void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        if (b != null)
        {
            b.a();
        }
    }
}
