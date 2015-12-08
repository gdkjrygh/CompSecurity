// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import ct;
import qm;
import wa;
import zm;

public class AppCompatCheckBox extends CheckBox
    implements qm
{

    private wa a;
    private zm b;

    public AppCompatCheckBox(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01013a);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = wa.a(context);
        b = new zm(this, a);
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

    public int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (b != null)
        {
            i = b.a(j);
        }
        return i;
    }

    public void setButtonDrawable(int i)
    {
        Drawable drawable;
        if (a != null)
        {
            drawable = a.a(i, false);
        } else
        {
            drawable = ct.a(getContext(), i);
        }
        setButtonDrawable(drawable);
    }

    public void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        if (b != null)
        {
            b.a();
        }
    }
}
