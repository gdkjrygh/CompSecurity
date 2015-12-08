// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.kit.utils.FontUtils;

public class PEditText extends EditText
{

    private Drawable _clearDrawable;
    private boolean _clearEnabled;
    private boolean _clearVisible;
    private boolean _shouldApplyTint;
    private com.pinterest.kit.utils.FontUtils.TypefaceId _typefaceId;

    public PEditText(Context context)
    {
        super(context);
        _typefaceId = com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR;
        _shouldApplyTint = true;
        init();
    }

    public PEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _typefaceId = com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR;
        _shouldApplyTint = true;
        init();
    }

    public PEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _typefaceId = com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR;
        _shouldApplyTint = true;
        init();
    }

    private void setClearIconVisible(boolean flag)
    {
        if (_clearVisible != flag)
        {
            Drawable drawable;
            if (flag)
            {
                drawable = _clearDrawable;
            } else
            {
                drawable = null;
            }
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
        }
        _clearVisible = flag;
    }

    protected void init()
    {
        FontUtils.setFont(_typefaceId, this);
    }

    public boolean isClearEnabled()
    {
        return _clearEnabled;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (!_clearEnabled)
        {
            return;
        }
        if (flag && getText().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setClearIconVisible(flag);
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (!_clearEnabled)
        {
            return;
        }
        boolean flag;
        if (getText().length() > 0 && hasFocus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setClearIconVisible(flag);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (_clearEnabled && isFocused() && motionevent.getX() > (float)(getWidth() - getPaddingRight() - _clearDrawable.getIntrinsicWidth()))
        {
            setText("");
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setClearEnabled(boolean flag)
    {
        _clearEnabled = flag;
        if (_clearEnabled)
        {
            _clearDrawable = Resources.drawable(0x7f020168);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        if (_shouldApplyTint)
        {
            super.setCompoundDrawablesWithIntrinsicBounds(DrawableUtils.tintIcon(drawable), DrawableUtils.tintIcon(drawable1), DrawableUtils.tintIcon(drawable2), DrawableUtils.tintIcon(drawable3));
            return;
        } else
        {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
            return;
        }
    }

    public void setShouldApplyTint(boolean flag)
    {
        _shouldApplyTint = flag;
    }

    public void setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId typefaceid)
    {
        _typefaceId = typefaceid;
        FontUtils.setFont(typefaceid, this);
    }
}
