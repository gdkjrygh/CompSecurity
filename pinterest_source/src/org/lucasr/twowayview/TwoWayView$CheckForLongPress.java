// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init> extends <init>
    implements Runnable
{

    final TwoWayView this$0;

    public void run()
    {
label0:
        {
            int i = TwoWayView.access$3400(TwoWayView.this);
            View view = getChildAt(i - TwoWayView.access$3300(TwoWayView.this));
            if (view != null)
            {
                long l = TwoWayView.access$1400(TwoWayView.this).getItemId(TwoWayView.access$3400(TwoWayView.this));
                boolean flag;
                if (sameWindow() && !TwoWayView.access$500(TwoWayView.this))
                {
                    flag = TwoWayView.access$4000(TwoWayView.this, view, i, l);
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                TwoWayView.access$402(TwoWayView.this, -1);
                setPressed(false);
                view.setPressed(false);
            }
            return;
        }
        TwoWayView.access$402(TwoWayView.this, 2);
    }

    private ()
    {
        this$0 = TwoWayView.this;
        super(TwoWayView.this, null);
    }

    nit>(nit> nit>)
    {
        this();
    }
}
