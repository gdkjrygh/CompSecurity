// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import com.arist.activity.MainActivity;

public class CustomEditText extends EditText
{

    private Drawable a;
    private Rect b;

    public CustomEditText(Context context)
    {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustomEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void finalize()
    {
        a = null;
        b = null;
        super.finalize();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && a != null)
        {
            b = a.getBounds();
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            if (i >= getRight() - b.width() - 40 && i <= getRight() && j >= getPaddingTop() && j <= getHeight())
            {
                android.text.Editable editable = getText();
                if (editable != null && editable.length() > 0)
                {
                    setText("");
                } else
                {
                    ((MainActivity)getContext()).b(false);
                }
            }
        }
        return super.onTouchEvent(motionevent);
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        if (drawable2 != null)
        {
            a = drawable2;
        }
        super.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
    }
}
