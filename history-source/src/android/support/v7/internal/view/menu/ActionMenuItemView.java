// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.CompatTextView;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import java.util.Locale;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl

public class ActionMenuItemView extends CompatTextView
    implements MenuView.ItemView, android.view.View.OnClickListener, android.view.View.OnLongClickListener, ActionMenuView.ActionMenuChildView
{
    private class AllCapsTransformationMethod
        implements TransformationMethod
    {

        private Locale mLocale;
        final ActionMenuItemView this$0;

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
            if (charsequence != null)
            {
                return charsequence.toString().toUpperCase(mLocale);
            } else
            {
                return null;
            }
        }

        public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
        {
        }

        public AllCapsTransformationMethod()
        {
            this$0 = ActionMenuItemView.this;
            super();
            mLocale = getContext().getResources().getConfiguration().locale;
        }
    }


    private static final String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private Drawable mIcon;
    private MenuItemImpl mItemData;
    private MenuBuilder.ItemInvoker mItemInvoker;
    private int mMinWidth;
    private int mSavedPaddingLeft;
    private CharSequence mTitle;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAllowTextWithIcon = context.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_config_allowActionMenuItemTextWithIcon);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionMenuItemView, 0, 0);
        mMinWidth = context.getDimensionPixelSize(0, 0);
        context.recycle();
        setOnClickListener(this);
        setOnLongClickListener(this);
        setTransformationMethod(new AllCapsTransformationMethod());
        mSavedPaddingLeft = -1;
    }

    private void updateTextButtonVisibility()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag2 = false;
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(mTitle))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (mIcon != null)
            {
                flag1 = flag2;
                if (!mItemData.showsTextAsAction())
                {
                    break label0;
                }
                if (!mAllowTextWithIcon)
                {
                    flag1 = flag2;
                    if (!mExpandedFormat)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        if (flag & flag1)
        {
            charsequence = mTitle;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public MenuItemImpl getItemData()
    {
        return mItemData;
    }

    public boolean hasText()
    {
        return !TextUtils.isEmpty(getText());
    }

    public void initialize(MenuItemImpl menuitemimpl, int i)
    {
        mItemData = menuitemimpl;
        setIcon(menuitemimpl.getIcon());
        setTitle(menuitemimpl.getTitleForItemView(this));
        setId(menuitemimpl.getItemId());
        if (menuitemimpl.isVisible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        setEnabled(menuitemimpl.isEnabled());
    }

    public boolean needsDividerAfter()
    {
        return hasText();
    }

    public boolean needsDividerBefore()
    {
        return hasText() && mItemData.getIcon() == null;
    }

    public void onClick(View view)
    {
        if (mItemInvoker != null)
        {
            mItemInvoker.invokeItem(mItemData);
        }
    }

    public boolean onLongClick(View view)
    {
        if (hasText())
        {
            return false;
        }
        view = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(view);
        getWindowVisibleDisplayFrame(rect);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = view[1];
        int l = j / 2;
        int i1 = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), mItemData.getTitle(), 0);
        if (k + l < rect.height())
        {
            ((Toast) (obj)).setGravity(53, i1 - view[0] - i / 2, j);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, j);
        }
        ((Toast) (obj)).show();
        return true;
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = hasText();
        if (flag && mSavedPaddingLeft >= 0)
        {
            super.setPadding(mSavedPaddingLeft, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, j);
        int k = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        int l = getMeasuredWidth();
        if (k == 0x80000000)
        {
            i = Math.min(i, mMinWidth);
        } else
        {
            i = mMinWidth;
        }
        if (k != 0x40000000 && mMinWidth > 0 && l < i)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
        }
        if (!flag && mIcon != null)
        {
            super.setPadding((getMeasuredWidth() - mIcon.getIntrinsicWidth()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean prefersCondensedTitle()
    {
        return true;
    }

    public void setCheckable(boolean flag)
    {
    }

    public void setChecked(boolean flag)
    {
    }

    public void setExpandedFormat(boolean flag)
    {
        if (mExpandedFormat != flag)
        {
            mExpandedFormat = flag;
            if (mItemData != null)
            {
                mItemData.actionFormatChanged();
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        mIcon = drawable;
        setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
        updateTextButtonVisibility();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker iteminvoker)
    {
        mItemInvoker = iteminvoker;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        mSavedPaddingLeft = i;
        super.setPadding(i, j, k, l);
    }

    public void setShortcut(boolean flag, char c)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        setContentDescription(mTitle);
        updateTextButtonVisibility();
    }

    public boolean showsIcon()
    {
        return true;
    }
}
