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
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class NavigationMenuItemView extends TextView
    implements android.support.v7.internal.view.menu.MenuView.ItemView
{

    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private int mIconSize;
    private ColorStateList mIconTintList;
    private MenuItemImpl mItemData;

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
        mIconSize = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.navigation_icon_size);
    }

    private StateListDrawable createDefaultBackground()
    {
        TypedValue typedvalue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(android.support.design.R.attr.colorControlHighlight, typedvalue, true))
        {
            StateListDrawable statelistdrawable = new StateListDrawable();
            statelistdrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedvalue.data));
            statelistdrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            return statelistdrawable;
        } else
        {
            return null;
        }
    }

    public MenuItemImpl getItemData()
    {
        return mItemData;
    }

    public void initialize(MenuItemImpl menuitemimpl, int i)
    {
        mItemData = menuitemimpl;
        if (menuitemimpl.isVisible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null)
        {
            setBackgroundDrawable(createDefaultBackground());
        }
        setCheckable(menuitemimpl.isCheckable());
        setChecked(menuitemimpl.isChecked());
        setEnabled(menuitemimpl.isEnabled());
        setTitle(menuitemimpl.getTitle());
        setIcon(menuitemimpl.getIcon());
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (mItemData != null && mItemData.isCheckable() && mItemData.isChecked())
        {
            mergeDrawableStates(ai, CHECKED_STATE_SET);
        }
        return ai;
    }

    public boolean prefersCondensedTitle()
    {
        return false;
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
            drawable1 = DrawableCompat.wrap(drawable.getConstantState().newDrawable()).mutate();
            drawable1.setBounds(0, 0, mIconSize, mIconSize);
            DrawableCompat.setTintList(drawable1, mIconTintList);
        }
        TextViewCompat.setCompoundDrawablesRelative(this, drawable1, null, null, null);
    }

    void setIconTintList(ColorStateList colorstatelist)
    {
        mIconTintList = colorstatelist;
        if (mItemData != null)
        {
            setIcon(mItemData.getIcon());
        }
    }

    public void setShortcut(boolean flag, char c)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        setText(charsequence);
    }

    public boolean showsIcon()
    {
        return true;
    }

}
