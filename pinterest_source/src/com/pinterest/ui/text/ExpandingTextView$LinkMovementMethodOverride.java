// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.pinterest.ui.text:
//            ExpandingTextView

class <init>
    implements android.view.Override
{

    final ExpandingTextView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!(view instanceof ExpandingTextView))
        {
            return false;
        }
        view = (ExpandingTextView)view;
        int i = motionevent.getAction();
        if (i == 1)
        {
            view.expand();
        }
        Object obj = view.getText();
        if (obj instanceof Spanned)
        {
            obj = (Spanned)obj;
            if (i == 1 || i == 0)
            {
                int j = (int)motionevent.getX();
                int k = (int)motionevent.getY();
                int l = view.getTotalPaddingLeft();
                int i1 = view.getTotalPaddingTop();
                int j1 = view.getScrollX();
                int k1 = view.getScrollY();
                motionevent = view.getLayout();
                j = motionevent.getOffsetForHorizontal(motionevent.getLineForVertical((k - i1) + k1), (j - l) + j1);
                motionevent = (ClickableSpan[])((Spanned) (obj)).getSpans(j, j, android/text/style/ClickableSpan);
                if (motionevent.length != 0)
                {
                    if (i == 1)
                    {
                        motionevent[0].onClick(view);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private ()
    {
        this$0 = ExpandingTextView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
