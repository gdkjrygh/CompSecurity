// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;


// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

private class <init>
{

    private int mOriginalAttachCount;
    final StickyGridHeadersGridView this$0;

    public void rememberWindowAttachCount()
    {
        mOriginalAttachCount = StickyGridHeadersGridView.access$500(StickyGridHeadersGridView.this);
    }

    public boolean sameWindow()
    {
        return hasWindowFocus() && StickyGridHeadersGridView.access$600(StickyGridHeadersGridView.this) == mOriginalAttachCount;
    }

    private ()
    {
        this$0 = StickyGridHeadersGridView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
