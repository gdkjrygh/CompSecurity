// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            SwipeCover

class lastPos
    implements Runnable
{

    private int lastPos;
    final SwipeCover this$0;

    public void run()
    {
        int i = getScrollX();
        if (lastPos - i < SwipeCover.access$000())
        {
            Log.d("SC", (new StringBuilder()).append("threshold: ").append(SwipeCover.access$100(SwipeCover.this)).append(" -- ").append(lastPos).append(" -- ").append(i).toString());
            if (i > SwipeCover.access$100(SwipeCover.this) && i < SwipeCover.access$200(SwipeCover.this) + SwipeCover.access$300(SwipeCover.this))
            {
                resetScroll();
            } else
            {
                openScroll();
            }
            SwipeCover.access$402(SwipeCover.this, 0x80000000);
            SwipeCover.access$502(SwipeCover.this, false);
            return;
        } else
        {
            lastPos = i;
            postDelayed(SwipeCover.access$600(SwipeCover.this), SwipeCover.access$700());
            return;
        }
    }

    A()
    {
        this$0 = SwipeCover.this;
        super();
        lastPos = 0x80000000;
    }
}
