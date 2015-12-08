// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.content.g;
import android.support.v4.widget.ce;
import android.support.v7.a.b;
import android.support.v7.internal.widget.al;
import android.util.AttributeSet;
import android.widget.CheckBox;

// Referenced classes of package android.support.v7.widget:
//            n

public class AppCompatCheckBox extends CheckBox
    implements ce
{

    private al a;
    private n b;

    public AppCompatCheckBox(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.checkboxStyle);
    }

    private AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = al.a(context);
        b = new n(this, a);
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

    public ColorStateList getSupportButtonTintList()
    {
        if (b != null)
        {
            return b.a;
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode()
    {
        if (b != null)
        {
            return b.b;
        } else
        {
            return null;
        }
    }

    public void setButtonDrawable(int i)
    {
        Drawable drawable;
        if (a != null)
        {
            drawable = a.a(i, false);
        } else
        {
            drawable = g.a(getContext(), i);
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
