// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            SearchHelper

final class this._cls0
    implements android.support.v7.widget.eryTextListener
{

    final SearchHelper this$0;

    public final boolean onQueryTextChange(String s)
    {
        doSearch(null);
        if (mSuppressTextChangeProcessing)
        {
            return true;
        }
        mHandler.removeCallbacks(mSearchRunnable);
        if (s != null && s.length() >= 3)
        {
            mCurrentQuery = s;
            mHandler.postDelayed(mSearchRunnable, 500L);
        }
        return false;
    }

    public final boolean onQueryTextSubmit(String s)
    {
        mHandler.removeCallbacks(mSearchRunnable);
        doSearch(s);
        hideSoftKeyboard();
        return true;
    }

    ener()
    {
        this$0 = SearchHelper.this;
        super();
    }
}
