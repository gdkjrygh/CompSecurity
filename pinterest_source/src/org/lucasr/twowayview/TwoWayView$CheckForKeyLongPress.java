// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.view.View;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init> extends <init>
    implements Runnable
{

    final TwoWayView this$0;

    public void run()
    {
        if (isPressed() && TwoWayView.access$2200(TwoWayView.this) >= 0)
        {
            int i = TwoWayView.access$2200(TwoWayView.this);
            int j = TwoWayView.access$3300(TwoWayView.this);
            View view = getChildAt(i - j);
            if (!TwoWayView.access$500(TwoWayView.this))
            {
                boolean flag;
                if (sameWindow())
                {
                    flag = TwoWayView.access$4000(TwoWayView.this, view, TwoWayView.access$2200(TwoWayView.this), TwoWayView.access$2300(TwoWayView.this));
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    setPressed(false);
                    view.setPressed(false);
                    return;
                }
            }
            while (false) 
            {
                setPressed(false);
                if (view != null)
                {
                    view.setPressed(false);
                    return;
                }
            }
        }
    }

    private ()
    {
        this$0 = TwoWayView.this;
        super(TwoWayView.this, null);
    }

    >(> >)
    {
        this();
    }
}
