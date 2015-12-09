// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;


// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView, StickyGridHeadersBaseAdapterWrapper

private class <init> extends <init>
    implements Runnable
{

    int mClickMotionPosition;
    final StickyGridHeadersGridView this$0;

    public void run()
    {
        if (!mDataChanged && mAdapter != null && mAdapter.getCount() > 0 && mClickMotionPosition != -1 && mClickMotionPosition < mAdapter.getCount() && sameWindow())
        {
            android.view.View view = getHeaderAt(mClickMotionPosition);
            if (view != null)
            {
                performHeaderClick(view, StickyGridHeadersGridView.access$400(StickyGridHeadersGridView.this, mClickMotionPosition));
                return;
            }
        }
    }

    private ()
    {
        this$0 = StickyGridHeadersGridView.this;
        super(StickyGridHeadersGridView.this, null);
    }

    t>(t> t>)
    {
        this();
    }
}
