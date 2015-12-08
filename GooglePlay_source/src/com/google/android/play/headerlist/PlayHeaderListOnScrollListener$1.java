// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListOnScrollListener, PlayHeaderListLayout

final class this._cls0 extends DataSetObserver
{

    final PlayHeaderListOnScrollListener this$0;

    public final void onChanged()
    {
        PlayHeaderListOnScrollListener.access$000$6e23d318(PlayHeaderListOnScrollListener.this);
        PlayHeaderListOnScrollListener.access$100(PlayHeaderListOnScrollListener.this).mPendingListSync = 2;
    }

    public final void onInvalidated()
    {
        onChanged();
    }

    I()
    {
        this$0 = PlayHeaderListOnScrollListener.this;
        super();
    }
}
