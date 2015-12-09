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
import android.support.v7.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.internal:
//            ForegroundLinearLayout

public class NavigationMenuItemView extends ForegroundLinearLayout
    implements android.support.v7.view.menu.MenuView.ItemView
{

    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private FrameLayout mActionArea;
    private final int mIconSize;
    private ColorStateList mIconTintList;
    private MenuItemImpl mItemData;
    private final CheckedTextView mTextView;

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
        setOrientation(0);
        LayoutInflater.from(context).inflate(android.support.design.R.layout.design_navigation_menu_item, this, true);
        mIconSize = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_navigation_icon_size);
        mTextView = (CheckedTextView)findViewById(android.support.design.R.id.design_menu_item_text);
        mTextView.setDuplicateParentStateEnabled(true);
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

    private void setActionView(View view)
    {
        if (mActionArea == null)
        {
            mActionArea = (FrameLayout)((ViewStub)findViewById(android.support.design.R.id.design_menu_item_action_area_stub)).inflate();
        }
        mActionArea.removeAllViews();
        if (view != null)
        {
            mActionArea.addView(view);
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
        setActionView(menuitemimpl.getActionView());
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

    public void recycle()
    {
        if (mActionArea != null)
        {
            mActionArea.removeAllViews();
        }
        mTextView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean flag)
    {
        refreshDrawableState();
    }

    public void setChecked(boolean flag)
    {
        refreshDrawableState();
        mTextView.setChecked(flag);
    }

    public void setIcon(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable != null)
        {
            obj = drawable.getConstantState();
            if (obj != null)
            {
                drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
            }
            obj = DrawableCompat.wrap(drawable).mutate();
            ((Drawable) (obj)).setBounds(0, 0, mIconSize, mIconSize);
            DrawableCompat.setTintList(((Drawable) (obj)), mIconTintList);
        }
        TextViewCompat.setCompoundDrawablesRelative(mTextView, ((Drawable) (obj)), null, null, null);
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

    public void setTextAppearance(Context context, int i)
    {
        mTextView.setTextAppearance(context, i);
    }

    public void setTextColor(ColorStateList colorstatelist)
    {
        mTextView.setTextColor(colorstatelist);
    }

    public void setTitle(CharSequence charsequence)
    {
        mTextView.setText(charsequence);
    }

    public boolean showsIcon()
    {
        return true;
    }

}
