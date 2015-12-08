// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.widget.r;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;
import android.widget.CheckBox;

// Referenced classes of package android.support.v7.widget:
//            c

public class AppCompatCheckBox extends CheckBox
    implements r
{

    private o a;
    private c b;

    public AppCompatCheckBox(Context context)
    {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = o.a(context);
        b = new c(this, a);
        b.a(attributeset, i);
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
            drawable = a.a(i);
        } else
        {
            drawable = android.support.v4.content.a.a(getContext(), i);
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

    public void setSupportButtonTintList(ColorStateList colorstatelist)
    {
        if (b != null)
        {
            b.a(colorstatelist);
        }
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (b != null)
        {
            b.a(mode);
        }
    }
}
