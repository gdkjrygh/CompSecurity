// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl

public class ListMenuItemView extends LinearLayout
    implements MenuView.ItemView
{

    private Drawable mBackground;
    private CheckBox mCheckBox;
    private Context mContext;
    boolean mForceShowIcon;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private int mMenuType;
    boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;

    public ListMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        mContext = context;
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuView, i, 0);
        mBackground = attributeset.getDrawable(5);
        mTextAppearance = attributeset.getResourceId(1, -1);
        mPreserveIconSpacing = attributeset.getBoolean(7, false);
        mTextAppearanceContext = context;
        attributeset.recycle();
    }

    private LayoutInflater getInflater()
    {
        if (mInflater == null)
        {
            mInflater = LayoutInflater.from(mContext);
        }
        return mInflater;
    }

    public final MenuItemImpl getItemData()
    {
        return mItemData;
    }

    public final void initialize$6b732f7b(MenuItemImpl menuitemimpl)
    {
        char c;
        Object obj;
        int i;
        mItemData = menuitemimpl;
        mMenuType = 0;
        boolean flag;
        if (menuitemimpl.isVisible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        obj = menuitemimpl.getTitleForItemView(this);
        if (obj != null)
        {
            mTitleView.setText(((CharSequence) (obj)));
            if (mTitleView.getVisibility() != 0)
            {
                mTitleView.setVisibility(0);
            }
        } else
        if (mTitleView.getVisibility() != 8)
        {
            mTitleView.setVisibility(8);
        }
        flag = menuitemimpl.isCheckable();
        if (flag || mRadioButton != null || mCheckBox != null)
        {
            Object obj1;
            if (mItemData.isExclusiveCheckable())
            {
                if (mRadioButton == null)
                {
                    mRadioButton = (RadioButton)getInflater().inflate(0x7f04000f, this, false);
                    addView(mRadioButton);
                }
                obj = mRadioButton;
                obj1 = mCheckBox;
            } else
            {
                if (mCheckBox == null)
                {
                    mCheckBox = (CheckBox)getInflater().inflate(0x7f04000c, this, false);
                    addView(mCheckBox);
                }
                obj = mCheckBox;
                obj1 = mRadioButton;
            }
            if (flag)
            {
                ((CompoundButton) (obj)).setChecked(mItemData.isChecked());
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                if (((CompoundButton) (obj)).getVisibility() != i)
                {
                    ((CompoundButton) (obj)).setVisibility(i);
                }
                if (obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
                {
                    ((CompoundButton) (obj1)).setVisibility(8);
                }
            } else
            {
                if (mCheckBox != null)
                {
                    mCheckBox.setVisibility(8);
                }
                if (mRadioButton != null)
                {
                    mRadioButton.setVisibility(8);
                }
            }
        }
        flag = menuitemimpl.shouldShowShortcut();
        menuitemimpl.getShortcut();
        if (flag && mItemData.shouldShowShortcut())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        obj1 = mShortcutView;
        c = mItemData.getShortcut();
        if (c != 0) goto _L4; else goto _L3
_L3:
        obj = "";
_L10:
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
_L2:
        if (mShortcutView.getVisibility() != i)
        {
            mShortcutView.setVisibility(i);
        }
        obj = menuitemimpl.getIcon();
        if (mForceShowIcon)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if ((i != 0 || mPreserveIconSpacing) && (mIconView != null || obj != null || mPreserveIconSpacing))
        {
            if (mIconView == null)
            {
                mIconView = (ImageView)getInflater().inflate(0x7f04000d, this, false);
                addView(mIconView, 0);
            }
            if (obj != null || mPreserveIconSpacing)
            {
                obj1 = mIconView;
                if (i == 0)
                {
                    obj = null;
                }
                ((ImageView) (obj1)).setImageDrawable(((Drawable) (obj)));
                if (mIconView.getVisibility() != 0)
                {
                    mIconView.setVisibility(0);
                }
            } else
            {
                mIconView.setVisibility(8);
            }
        }
        setEnabled(menuitemimpl.isEnabled());
        return;
_L4:
        obj = new StringBuilder(null);
        c;
        JVM INSTR lookupswitch 3: default 588
    //                   8: 611
    //                   10: 602
    //                   32: 620;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_620;
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        ((StringBuilder) (obj)).append(c);
_L11:
        obj = ((StringBuilder) (obj)).toString();
        if (true) goto _L10; else goto _L9
_L9:
        ((StringBuilder) (obj)).append(null);
          goto _L11
_L6:
        ((StringBuilder) (obj)).append(null);
          goto _L11
        ((StringBuilder) (obj)).append(null);
          goto _L11
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setBackgroundDrawable(mBackground);
        mTitleView = (TextView)findViewById(0x7f0d0075);
        if (mTextAppearance != -1)
        {
            mTitleView.setTextAppearance(mTextAppearanceContext, mTextAppearance);
        }
        mShortcutView = (TextView)findViewById(0x7f0d00c4);
    }

    protected void onMeasure(int i, int j)
    {
        if (mIconView != null && mPreserveIconSpacing)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)mIconView.getLayoutParams();
            if (layoutparams.height > 0 && layoutparams1.width <= 0)
            {
                layoutparams1.width = layoutparams.height;
            }
        }
        super.onMeasure(i, j);
    }

    public final boolean prefersCondensedTitle()
    {
        return false;
    }
}
