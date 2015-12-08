// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderScrollableContentListener, PlayHeaderListLayout

final class this._cls0 extends DataSetObserver
{

    final PlayHeaderScrollableContentListener this$0;

    public final void onChanged()
    {
        PlayHeaderScrollableContentListener.access$000$3aa5f084(PlayHeaderScrollableContentListener.this);
        mLayout.mPendingListSync = 2;
    }

    public final void onInvalidated()
    {
        onChanged();
    }

    ()
    {
        this$0 = PlayHeaderScrollableContentListener.this;
        super();
    }
}
