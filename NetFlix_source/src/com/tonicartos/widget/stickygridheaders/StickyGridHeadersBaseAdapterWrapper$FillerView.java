// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapterWrapper

protected class this._cls0 extends View
{

    private View mMeasureTarget;
    final StickyGridHeadersBaseAdapterWrapper this$0;

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, android.view.eAdapterWrapper.FillerView(mMeasureTarget.getMeasuredHeight(), 0x40000000));
    }

    public void setMeasureTarget(View view)
    {
        mMeasureTarget = view;
    }

    public (Context context)
    {
        this$0 = StickyGridHeadersBaseAdapterWrapper.this;
        super(context);
    }

    public this._cls0(Context context, AttributeSet attributeset)
    {
        this$0 = StickyGridHeadersBaseAdapterWrapper.this;
        super(context, attributeset);
    }

    public this._cls0(Context context, AttributeSet attributeset, int i)
    {
        this$0 = StickyGridHeadersBaseAdapterWrapper.this;
        super(context, attributeset, i);
    }
}
