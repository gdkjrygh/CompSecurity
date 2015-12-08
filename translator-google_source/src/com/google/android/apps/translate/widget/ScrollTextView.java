// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.ArrowKeyMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ar

public class ScrollTextView extends TextView
{

    private final int a;
    private final android.view.View.OnClickListener b = new ar(this);
    private boolean c;
    private int d;
    private android.view.View.OnClickListener e;

    public ScrollTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!o.e())
        {
            setMovementMethod(ArrowKeyMovementMethod.getInstance());
        }
        a = ViewConfiguration.get(context).getScaledTouchSlop();
        if (getBackground() != null)
        {
            context = new Rect();
            getBackground().getPadding(context);
            int i = getPaddingLeft();
            int j = ((Rect) (context)).left;
            int k = getPaddingTop();
            int l = ((Rect) (context)).top;
            int i1 = getPaddingRight();
            int j1 = ((Rect) (context)).right;
            int k1 = getPaddingBottom();
            setPadding(i + j, k + l, i1 + j1, ((Rect) (context)).bottom + k1);
        }
    }

    static boolean a(ScrollTextView scrolltextview)
    {
        return scrolltextview.c;
    }

    static android.view.View.OnClickListener b(ScrollTextView scrolltextview)
    {
        return scrolltextview.e;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = super.onTouchEvent(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 36
    //                   0 38
    //                   1 36
    //                   2 53;
           goto _L1 _L2 _L1 _L3
_L1:
        return flag1;
_L2:
        c = false;
        d = getScrollX();
        return flag1;
_L3:
        if (!c)
        {
            boolean flag;
            if (Math.abs(d - getScrollX()) >= a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            if (c)
            {
                setPressed(false);
                return flag1;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        e = onclicklistener;
        super.setOnClickListener(b);
    }
}
