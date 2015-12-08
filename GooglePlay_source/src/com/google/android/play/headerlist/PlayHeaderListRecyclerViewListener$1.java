// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;


// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListRecyclerViewListener, PlayHeaderListLayout

final class this._cls0 extends android.support.v7.widget.stener._cls1
{

    final PlayHeaderListRecyclerViewListener this$0;

    public final void onChanged()
    {
        PlayHeaderListRecyclerViewListener.access$000$536d8310(PlayHeaderListRecyclerViewListener.this);
        mLayout.mPendingListSync = 2;
    }

    public final void onItemRangeChanged(int i, int j)
    {
        onChanged();
    }

    public final void onItemRangeInserted(int i, int j)
    {
        onChanged();
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        onChanged();
    }

    ()
    {
        this$0 = PlayHeaderListRecyclerViewListener.this;
        super();
    }
}
