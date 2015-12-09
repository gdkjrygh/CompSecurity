// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.search;

import android.support.v4.app.LoaderManager;
import com.fitbit.ui.a.b;

// Referenced classes of package com.fitbit.ui.search:
//            SearchActivity

class a
    implements Runnable
{

    final SearchActivity a;

    public void run()
    {
        a.getSupportLoaderManager().restartLoader(84, SearchActivity.a(a), a);
        com.fitbit.ui.search.SearchActivity.b(a).clear();
        SearchActivity.a(a, true);
    }

    (SearchActivity searchactivity)
    {
        a = searchactivity;
        super();
    }
}
