// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;


// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersSimpleAdapterWrapper

private class mCount
{

    private int mCount;
    private int mRefPosition;
    final StickyGridHeadersSimpleAdapterWrapper this$0;

    public int getCount()
    {
        return mCount;
    }

    public int getRefPosition()
    {
        return mRefPosition;
    }

    public void incrementCount()
    {
        mCount = mCount + 1;
    }

    public (int i)
    {
        this$0 = StickyGridHeadersSimpleAdapterWrapper.this;
        super();
        mRefPosition = i;
        mCount = 0;
    }
}
