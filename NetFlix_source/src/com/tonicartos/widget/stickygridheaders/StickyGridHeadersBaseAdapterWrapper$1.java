// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapterWrapper

class this._cls0 extends DataSetObserver
{

    final StickyGridHeadersBaseAdapterWrapper this$0;

    public void onChanged()
    {
        updateCount();
        notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        StickyGridHeadersBaseAdapterWrapper.access$002(StickyGridHeadersBaseAdapterWrapper.this, false);
        notifyDataSetInvalidated();
    }

    ()
    {
        this$0 = StickyGridHeadersBaseAdapterWrapper.this;
        super();
    }
}
