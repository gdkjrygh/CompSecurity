// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            SearchHelper

final class this._cls0
    implements Runnable
{

    final SearchHelper this$0;

    public final void run()
    {
        if (mActivity.isFinishing() || mStopped)
        {
            return;
        } else
        {
            doSearch(mCurrentQuery);
            return;
        }
    }

    y()
    {
        this$0 = SearchHelper.this;
        super();
    }
}
