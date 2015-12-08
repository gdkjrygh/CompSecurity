// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.widget:
//            x, y, z

public class InputTextView extends TextView
{

    private final Runnable a = new x(this);
    private z b;
    private android.view.View.OnClickListener c;
    private int d;
    private long e;
    private long f;

    public InputTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = -1;
        e = -1L;
        f = -1L;
        setTextIsSelectable(true);
        setCustomSelectionActionModeCallback(new y(this));
    }

    static android.view.View.OnClickListener a(InputTextView inputtextview)
    {
        return inputtextview.c;
    }

    private void a()
    {
        removeCallbacks(a);
        e = System.currentTimeMillis();
    }

    static z b(InputTextView inputtextview)
    {
        return inputtextview.b;
    }

    public int getTouchCharPos()
    {
        return d;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        long l = System.currentTimeMillis();
        if (flag && rect == null && l - f < 100L && l - e > 100L)
        {
            postDelayed(a, 100L);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            d = getOffsetForPosition(motionevent.getX(), motionevent.getY());
        }
        f = System.currentTimeMillis();
        return super.onTouchEvent(motionevent);
    }

    public boolean performClick()
    {
        a();
        return super.performClick();
    }

    public boolean performLongClick()
    {
        a();
        return super.performLongClick();
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
        c = onclicklistener;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        d = -1;
    }

    public void setTextPasteController(z z)
    {
        b = z;
    }
}
