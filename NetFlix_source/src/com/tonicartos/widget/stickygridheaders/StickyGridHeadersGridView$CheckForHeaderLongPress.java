// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

private class <init> extends <init>
    implements Runnable
{

    final StickyGridHeadersGridView this$0;

    public void run()
    {
label0:
        {
            View view = getHeaderAt(mMotionHeaderPosition);
            if (view != null)
            {
                long l = StickyGridHeadersGridView.access$400(StickyGridHeadersGridView.this, mMotionHeaderPosition);
                boolean flag1 = false;
                boolean flag = flag1;
                if (sameWindow())
                {
                    flag = flag1;
                    if (!mDataChanged)
                    {
                        flag = performHeaderLongPress(view, l);
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                mTouchMode = -2;
                setPressed(false);
                view.setPressed(false);
            }
            return;
        }
        mTouchMode = 2;
    }

    private ()
    {
        this$0 = StickyGridHeadersGridView.this;
        super(StickyGridHeadersGridView.this, null);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
