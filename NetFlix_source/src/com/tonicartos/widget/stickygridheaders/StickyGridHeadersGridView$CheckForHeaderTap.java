// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

final class this._cls0
    implements Runnable
{

    final StickyGridHeadersGridView this$0;

    public void run()
    {
label0:
        {
label1:
            {
                if (mTouchMode == 0)
                {
                    mTouchMode = 1;
                    View view = getHeaderAt(mMotionHeaderPosition);
                    if (view != null && !mHeaderChildBeingPressed)
                    {
                        if (mDataChanged)
                        {
                            break label0;
                        }
                        view.setPressed(true);
                        setPressed(true);
                        refreshDrawableState();
                        int i = ViewConfiguration.getLongPressTimeout();
                        if (!isLongClickable())
                        {
                            break label1;
                        }
                        if (mPendingCheckForLongPress == null)
                        {
                            mPendingCheckForLongPress = new Press(StickyGridHeadersGridView.this, null);
                        }
                        mPendingCheckForLongPress.rememberWindowAttachCount();
                        postDelayed(mPendingCheckForLongPress, i);
                    }
                }
                return;
            }
            mTouchMode = 2;
            return;
        }
        mTouchMode = 2;
    }

    Press()
    {
        this$0 = StickyGridHeadersGridView.this;
        super();
    }
}
