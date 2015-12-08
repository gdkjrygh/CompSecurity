// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.base.Device;

public class KeyboardEventLayout extends FrameLayout
{

    private boolean _initMeasured;
    private KeyboardListener _listener;

    public KeyboardEventLayout(Context context)
    {
        super(context);
        _initMeasured = false;
    }

    public KeyboardEventLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _initMeasured = false;
    }

    public KeyboardEventLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _initMeasured = false;
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(j);
        int l = getHeight();
        if (_listener != null && _initMeasured && l > 0 && k > 0 && l != k)
        {
            if (l > k)
            {
                _listener.onKeyboardShown();
            } else
            {
                _listener.onKeyboardHidden();
            }
        }
        super.onMeasure(i, j);
        if (!Device.isTablet() || l > 0 && k > 0 && l != k)
        {
            _initMeasured = true;
        }
    }

    public void onStop()
    {
        _initMeasured = false;
    }

    public void setListener(KeyboardListener keyboardlistener)
    {
        _listener = keyboardlistener;
    }

    private class KeyboardListener
    {

        public abstract void onKeyboardHidden();

        public abstract void onKeyboardShown();

        public KeyboardListener()
        {
        }
    }

}
