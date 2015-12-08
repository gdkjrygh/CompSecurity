// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.content.Context;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.roidapp.cloudlib.sns.basepost.g;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            a

public class DescriptionTextView extends TextView
{

    private StaticLayout a;
    private Spannable b;
    private CharacterStyle c;

    public DescriptionTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 46
    //                   1 212
    //                   2 40
    //                   3 257;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        int k = (int)motionevent.getX();
        int i = (int)motionevent.getY();
        int l = getPaddingLeft();
        int j = getPaddingTop();
        k = (k - l) + getScrollX();
        l = getScrollY();
        i = a.getLineForVertical((i - j) + l);
        if (a.getLineLeft(i) <= (float)k && (float)k <= a.getLineRight(i))
        {
            i = a.getOffsetForHorizontal(i, k);
            CharacterStyle acharacterstyle[] = (CharacterStyle[])b.getSpans(i, i, com/roidapp/cloudlib/sns/basepost/g);
            if (acharacterstyle.length != 0)
            {
                c = acharacterstyle[acharacterstyle.length - 1];
                if (c != null && (c instanceof a))
                {
                    ((a)c).a(true);
                    invalidate();
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (c != null && (c instanceof a))
        {
            ((a)c).onClick(this);
            ((a)c).a(false);
            invalidate();
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c != null && (c instanceof a))
        {
            ((a)c).a(false);
            invalidate();
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
