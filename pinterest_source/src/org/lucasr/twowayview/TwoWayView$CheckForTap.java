// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

final class <init>
    implements Runnable
{

    final TwoWayView this$0;

    public final void run()
    {
        if (TwoWayView.access$400(TwoWayView.this) == 0)
        {
            TwoWayView.access$402(TwoWayView.this, 1);
            View view = getChildAt(TwoWayView.access$3400(TwoWayView.this) - TwoWayView.access$3300(TwoWayView.this));
            if (view != null && !view.hasFocusable())
            {
                TwoWayView.access$3502(TwoWayView.this, 0);
                if (!TwoWayView.access$500(TwoWayView.this))
                {
                    setPressed(true);
                    view.setPressed(true);
                    TwoWayView.access$3600(TwoWayView.this);
                    TwoWayView.access$3700(TwoWayView.this, TwoWayView.access$3400(TwoWayView.this), view);
                    refreshDrawableState();
                    TwoWayView.access$3700(TwoWayView.this, TwoWayView.access$3400(TwoWayView.this), view);
                    refreshDrawableState();
                    boolean flag = isLongClickable();
                    if (TwoWayView.access$3800(TwoWayView.this) != null)
                    {
                        Drawable drawable = TwoWayView.access$3800(TwoWayView.this).getCurrent();
                        if (drawable != null && (drawable instanceof TransitionDrawable))
                        {
                            if (flag)
                            {
                                int i = ViewConfiguration.getLongPressTimeout();
                                ((TransitionDrawable)drawable).startTransition(i);
                            } else
                            {
                                ((TransitionDrawable)drawable).resetTransition();
                            }
                        }
                    }
                    if (flag)
                    {
                        TwoWayView.access$3900(TwoWayView.this);
                        return;
                    } else
                    {
                        TwoWayView.access$402(TwoWayView.this, 2);
                        return;
                    }
                } else
                {
                    TwoWayView.access$402(TwoWayView.this, 2);
                    return;
                }
            }
        }
    }

    private ()
    {
        this$0 = TwoWayView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
