// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.text:
//            ClearFocusEditText

public class SearchEditText extends ClearFocusEditText
{

    private static final int TOUCH_TARGET_PADDING;
    private final Drawable _crossIcon;
    private boolean _isBrioStyle;
    private boolean _isCrossShown;
    private Drawable _primaryIcon;
    private android.view.View.OnTouchListener focusGrabber;
    private TextWatcher searchTextWatcher;

    public SearchEditText(Context context)
    {
        this(context, null, 0);
    }

    public SearchEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SearchEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _isCrossShown = false;
        _isBrioStyle = false;
        focusGrabber = new _cls1();
        searchTextWatcher = new _cls2();
        _primaryIcon = getCompoundDrawables()[2];
        if (_primaryIcon == null)
        {
            _primaryIcon = Resources.drawable(0x7f0201ec);
        }
        _crossIcon = Resources.drawable(0x7f020168);
        addTextChangedListener(searchTextWatcher);
        setOnTouchListener(focusGrabber);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (_isCrossShown && motionevent.getAction() == 0)
        {
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            Rect rect = _crossIcon.getBounds();
            if (i >= getRight() - rect.width() - TOUCH_TARGET_PADDING && i <= (getRight() - getPaddingRight()) + TOUCH_TARGET_PADDING && j >= getPaddingTop() - TOUCH_TARGET_PADDING && j <= (getHeight() - getPaddingBottom()) + TOUCH_TARGET_PADDING)
            {
                setText("");
                requestFocusFromTouch();
            }
        }
        return super.onTouchEvent(motionevent);
    }

    public void setBrioStyle(boolean flag)
    {
        _isBrioStyle = flag;
        if (_isBrioStyle)
        {
            setCompoundDrawablePadding((int)Resources.dimension(0x7f0a0045));
        }
    }

    static 
    {
        TOUCH_TARGET_PADDING = Constants.BUTTON_HEIGHT;
    }





/*
    static boolean access$302(SearchEditText searchedittext, boolean flag)
    {
        searchedittext._isCrossShown = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final SearchEditText this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            view.requestFocusFromTouch();
            return false;
        }

        _cls1()
        {
            this$0 = SearchEditText.this;
            super();
        }
    }


    private class _cls2
        implements TextWatcher
    {

        final SearchEditText this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (charsequence.length() > 0)
            {
                SearchEditText searchedittext = SearchEditText.this;
                if (_isBrioStyle)
                {
                    charsequence = _primaryIcon;
                } else
                {
                    charsequence = null;
                }
                searchedittext.setCompoundDrawablesWithIntrinsicBounds(charsequence, null, _crossIcon, null);
                _isCrossShown = true;
                return;
            }
            SearchEditText searchedittext1 = SearchEditText.this;
            if (_isBrioStyle)
            {
                charsequence = _primaryIcon;
            } else
            {
                charsequence = null;
            }
            searchedittext1.setCompoundDrawablesWithIntrinsicBounds(charsequence, null, null, null);
            _isCrossShown = false;
        }

        _cls2()
        {
            this$0 = SearchEditText.this;
            super();
        }
    }

}
