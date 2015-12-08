// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersSimpleAdapterWrapper

private final class <init> extends DataSetObserver
{

    final StickyGridHeadersSimpleAdapterWrapper this$0;

    public void onChanged()
    {
        StickyGridHeadersSimpleAdapterWrapper.access$102(StickyGridHeadersSimpleAdapterWrapper.this, generateHeaderList(StickyGridHeadersSimpleAdapterWrapper.access$200(StickyGridHeadersSimpleAdapterWrapper.this)));
        notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        StickyGridHeadersSimpleAdapterWrapper.access$102(StickyGridHeadersSimpleAdapterWrapper.this, generateHeaderList(StickyGridHeadersSimpleAdapterWrapper.access$200(StickyGridHeadersSimpleAdapterWrapper.this)));
        notifyDataSetInvalidated();
    }

    private ()
    {
        this$0 = StickyGridHeadersSimpleAdapterWrapper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
