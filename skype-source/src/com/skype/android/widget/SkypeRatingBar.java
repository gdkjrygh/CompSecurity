// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RatingBar;

public class SkypeRatingBar extends RatingBar
{

    public SkypeRatingBar(Context context)
    {
        super(context);
    }

    public SkypeRatingBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SkypeRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a()
    {
        android.widget.RatingBar.OnRatingBarChangeListener onratingbarchangelistener = getOnRatingBarChangeListener();
        if (onratingbarchangelistener != null)
        {
            onratingbarchangelistener.onRatingChanged(this, getRating(), true);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        if (!isIndicator())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        byte0 = -1;
        i;
        JVM INSTR tableswitch 7 22: default 100
    //                   7 166
    //                   8 171
    //                   9 176
    //                   10 181
    //                   11 186
    //                   12 191
    //                   13 100
    //                   14 100
    //                   15 100
    //                   16 100
    //                   17 100
    //                   18 100
    //                   19 100
    //                   20 100
    //                   21 155
    //                   22 144;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L10 _L11
_L3:
        flag = false;
        i = byte0;
_L13:
        flag1 = flag;
        if (i <= getNumStars())
        {
            flag1 = flag;
            if (i >= 0)
            {
                setRating(i);
                flag1 = flag;
            }
        }
_L2:
        return flag1;
_L11:
        i = (int)getRating() + 1;
        continue; /* Loop/switch isn't completed */
_L10:
        i = (int)getRating() - 1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 5;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = (int)getRating();
        boolean flag = super.onTouchEvent(motionevent);
        if ((int)getRating() != i)
        {
            a();
        }
        return flag;
    }

    public void setPressed(boolean flag)
    {
        flag = isPressed();
        super.setPressed(flag);
        if (flag && !isPressed())
        {
            a();
        }
    }
}
