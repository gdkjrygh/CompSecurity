// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.graphics.Paint;

// Referenced classes of package com.viewpagerindicator:
//            UnderlinePageIndicator

class this._cls0
    implements Runnable
{

    final UnderlinePageIndicator this$0;

    public void run()
    {
        if (UnderlinePageIndicator.access$000(UnderlinePageIndicator.this))
        {
            int i = Math.max(UnderlinePageIndicator.access$100(UnderlinePageIndicator.this).getAlpha() - UnderlinePageIndicator.access$200(UnderlinePageIndicator.this), 0);
            UnderlinePageIndicator.access$100(UnderlinePageIndicator.this).setAlpha(i);
            invalidate();
            if (i > 0)
            {
                postDelayed(this, 30L);
                return;
            }
        }
    }

    ()
    {
        this$0 = UnderlinePageIndicator.this;
        super();
    }
}
