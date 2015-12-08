// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

public final class abt extends EditText
    implements mf
{

    private yh a;
    private abp b;
    private ace c;

    public abt(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.J);
    }

    private abt(Context context, AttributeSet attributeset, int i)
    {
        super(ye.a(context), attributeset, i);
        a = yh.a(getContext());
        b = new abp(this, a);
        b.a(attributeset, i);
        c = new ace(this);
        c.a(attributeset, i);
    }

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (b != null)
        {
            b.a();
        }
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (b != null)
        {
            b.b(null);
        }
    }

    public final void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (b != null)
        {
            b.a(i);
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (b != null)
        {
            b.a(colorstatelist);
        }
    }

    public final void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (b != null)
        {
            b.a(mode);
        }
    }

    public final void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (c != null)
        {
            c.a(context, i);
        }
    }
}
