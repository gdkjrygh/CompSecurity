// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.database.DataSetObserver;

// Referenced classes of package com.dominos.views:
//            HorizontalListView

class <init> extends DataSetObserver
{

    final HorizontalListView this$0;

    public void onChanged()
    {
        refreshLayout();
    }

    public void onInvalidated()
    {
        super.onInvalidated();
        refreshLayout();
    }

    private ()
    {
        this$0 = HorizontalListView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
