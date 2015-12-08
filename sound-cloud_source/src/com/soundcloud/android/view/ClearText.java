// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.EditText;

// Referenced classes of package com.soundcloud.android.view:
//            CustomFontLoader

public class ClearText extends EditText
{

    private android.view.View.OnClickListener defaultDrawableListener;
    private Drawable originalRightDrawable;

    public ClearText(Context context)
    {
        super(context);
        init();
    }

    public ClearText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
        CustomFontLoader.applyCustomFont(context, this, attributeset);
    }

    public ClearText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
        CustomFontLoader.applyCustomFont(context, this, attributeset);
    }

    private void init()
    {
        setText("");
        originalRightDrawable = getCompoundDrawables()[2];
        final Drawable x = getResources().getDrawable(0x7f020111);
        x.setBounds(0, 0, x.getIntrinsicWidth(), x.getIntrinsicHeight());
        Drawable drawable;
        if ("".equals(""))
        {
            drawable = originalRightDrawable;
        } else
        {
            drawable = x;
        }
        setCompoundDrawables(null, null, drawable, null);
        setCompoundDrawablePadding((int)(getResources().getDisplayMetrics().density * 5F));
        setOnTouchListener(new _cls1());
        addTextChangedListener(new _cls2());
    }

    public void setDefaultDrawableClickListener(android.view.View.OnClickListener onclicklistener)
    {
        defaultDrawableListener = onclicklistener;
    }



    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final ClearText this$0;
        final Drawable val$x;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (getCompoundDrawables()[2] != null && motionevent.getAction() == 1 && motionevent.getX() > (float)(getWidth() - getPaddingRight() - x.getIntrinsicWidth()))
            {
                if (TextUtils.isEmpty(getText()))
                {
                    if (defaultDrawableListener != null)
                    {
                        defaultDrawableListener.onClick(ClearText.this);
                        return false;
                    }
                } else
                {
                    setText("");
                    setCompoundDrawables(null, null, originalRightDrawable, null);
                    return false;
                }
            }
            return false;
        }

        _cls1()
        {
            this$0 = ClearText.this;
            x = drawable;
            super();
        }
    }


    private class _cls2
        implements TextWatcher
    {

        final ClearText this$0;
        final Drawable val$x;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            ClearText cleartext = ClearText.this;
            if (getText().toString().equals(""))
            {
                charsequence = originalRightDrawable;
            } else
            {
                charsequence = x;
            }
            cleartext.setCompoundDrawables(null, null, charsequence, null);
        }

        _cls2()
        {
            this$0 = ClearText.this;
            x = drawable;
            super();
        }
    }

}
