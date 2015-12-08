// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

public final class PlayHeaderScrollableContentListener
{

    private int mAbsoluteY;
    final PlayHeaderListLayout mLayout;
    private final DataSetObserver mObserver = new DataSetObserver() {

        final PlayHeaderScrollableContentListener this$0;

        public final void onChanged()
        {
            reset();
            mLayout.mPendingListSync = 2;
        }

        public final void onInvalidated()
        {
            onChanged();
        }

            
            {
                this$0 = PlayHeaderScrollableContentListener.this;
                super();
            }
    };
    protected int mScrollState;

    public PlayHeaderScrollableContentListener(PlayHeaderListLayout playheaderlistlayout)
    {
        mAbsoluteY = -1;
        mLayout = playheaderlistlayout;
    }

    final void reset(boolean flag)
    {
        mAbsoluteY = -1;
        mScrollState = 0;
    }

}
