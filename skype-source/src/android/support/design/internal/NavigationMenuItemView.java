// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.widget.q;
import android.support.v7.internal.view.menu.h;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class NavigationMenuItemView extends TextView
    implements android.support.v7.internal.view.menu.m.a
{

    private static final int a[] = {
        0x10100a0
    };
    private int b;
    private h c;
    private ColorStateList d;

    public NavigationMenuItemView(Context context)
    {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = context.getResources().getDimensionPixelSize(android.support.design.a.d.design_navigation_icon_size);
    }

    public final h a()
    {
        return c;
    }

    final void a(ColorStateList colorstatelist)
    {
        d = colorstatelist;
        if (c != null)
        {
            setIcon(c.getIcon());
        }
    }

    public final void a(h h1)
    {
        c = h1;
        int i;
        if (h1.isVisible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null)
        {
            TypedValue typedvalue = new TypedValue();
            StateListDrawable statelistdrawable;
            if (getContext().getTheme().resolveAttribute(android.support.design.a.b.colorControlHighlight, typedvalue, true))
            {
                statelistdrawable = new StateListDrawable();
                statelistdrawable.addState(a, new ColorDrawable(typedvalue.data));
                statelistdrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else
            {
                statelistdrawable = null;
            }
            setBackgroundDrawable(statelistdrawable);
        }
        setCheckable(h1.isCheckable());
        setChecked(h1.isChecked());
        setEnabled(h1.isEnabled());
        setTitle(h1.getTitle());
        setIcon(h1.getIcon());
    }

    public final boolean b()
    {
        return false;
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (c != null && c.isCheckable() && c.isChecked())
        {
            mergeDrawableStates(ai, a);
        }
        return ai;
    }

    public void setCheckable(boolean flag)
    {
        refreshDrawableState();
    }

    public void setChecked(boolean flag)
    {
        refreshDrawableState();
    }

    public void setIcon(Drawable drawable)
    {
        Drawable drawable1 = drawable;
        if (drawable != null)
        {
            drawable1 = android.support.v4.graphics.drawable.a.c(drawable.getConstantState().newDrawable()).mutate();
            drawable1.setBounds(0, 0, b, b);
            android.support.v4.graphics.drawable.a.a(drawable1, d);
        }
        q.a(this, drawable1);
    }

    public void setShortcut(boolean flag, char c1)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        setText(charsequence);
    }

}
