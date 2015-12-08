// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.internal.widget.CapitalizingButton;
import com.actionbarsherlock.internal.widget.IcsToast;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemImpl

public class ActionMenuItemView extends LinearLayout
    implements MenuView.ItemView, android.view.View.OnClickListener, android.view.View.OnLongClickListener, ActionMenuView.ActionMenuChildView, View_HasStateListenerSupport
{

    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private ImageButton mImageButton;
    private MenuItemImpl mItemData;
    private MenuBuilder.ItemInvoker mItemInvoker;
    private final Set mListeners;
    private int mMinWidth;
    private CapitalizingButton mTextButton;
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
        super(context, attributeset);
        mListeners = new HashSet();
        mAllowTextWithIcon = ResourcesCompat.getResources_getBoolean(context, com.actionbarsherlock.R.bool.abs__config_allowActionMenuItemTextWithIcon);
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActionMenuItemView, 0, 0);
        mMinWidth = context.getDimensionPixelSize(com.actionbarsherlock.R.styleable.SherlockActionMenuItemView_android_minWidth, 0);
        context.recycle();
    }

    private void updateTextButtonVisibility()
    {
        int i;
label0:
        {
            boolean flag2 = true;
            boolean flag1 = false;
            CapitalizingButton capitalizingbutton;
            boolean flag;
            if (TextUtils.isEmpty(mTextButton.getText()))
            {
                i = 0;
            } else
            {
                i = 1;
            }
            flag = flag2;
            if (mImageButton.getDrawable() == null)
            {
                break label0;
            }
            if (mItemData.showsTextAsAction())
            {
                flag = flag2;
                if (mAllowTextWithIcon)
                {
                    break label0;
                }
                flag = flag2;
                if (mExpandedFormat)
                {
                    break label0;
                }
            }
            flag = false;
        }
        capitalizingbutton = mTextButton;
        if (i & flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        capitalizingbutton.setVisibility(i);
    }

    public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
    {
        mListeners.add(view_onattachstatechangelistener);
    }

    public boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return onHoverEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        onPopulateAccessibilityEvent(accessibilityevent);
        return true;
    }

    public MenuItemImpl getItemData()
    {
        return mItemData;
    }

    public boolean hasText()
    {
        return mTextButton.getVisibility() != 8;
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Iterator iterator = mListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((View_OnAttachStateChangeListener)iterator.next()).onViewAttachedToWindow(this);
        } while (true);
    }

    public void onClick(View view)
    {
        if (mItemInvoker != null)
        {
            mItemInvoker.invokeItem(mItemData);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Iterator iterator = mListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((View_OnAttachStateChangeListener)iterator.next()).onViewDetachedFromWindow(this);
        } while (true);
    }

    public void onFinishInflate()
    {
        mImageButton = (ImageButton)findViewById(com.actionbarsherlock.R.id.abs__imageButton);
        mTextButton = (CapitalizingButton)findViewById(com.actionbarsherlock.R.id.abs__textButton);
        mImageButton.setOnClickListener(this);
        mTextButton.setOnClickListener(this);
        mImageButton.setOnLongClickListener(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
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
        obj = IcsToast.makeText(((Context) (obj)), mItemData.getTitle(), 0);
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
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onPopulateAccessibilityEvent(accessibilityevent);
        }
        CharSequence charsequence = getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            accessibilityevent.getText().add(charsequence);
        }
    }

    public boolean prefersCondensedTitle()
    {
        return true;
    }

    public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_onattachstatechangelistener)
    {
        mListeners.remove(view_onattachstatechangelistener);
    }

    public void setCheckable(boolean flag)
    {
    }

    public void setChecked(boolean flag)
    {
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        mImageButton.setEnabled(flag);
        mTextButton.setEnabled(flag);
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
        mImageButton.setImageDrawable(drawable);
        if (drawable != null)
        {
            mImageButton.setVisibility(0);
        } else
        {
            mImageButton.setVisibility(8);
        }
        updateTextButtonVisibility();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker iteminvoker)
    {
        mItemInvoker = iteminvoker;
    }

    public void setShortcut(boolean flag, char c)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        mTextButton.setTextCompat(mTitle);
        setContentDescription(mTitle);
        updateTextButtonVisibility();
    }

    public boolean showsIcon()
    {
        return true;
    }
}
