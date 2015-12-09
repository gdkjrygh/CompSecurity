// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            SearchHelper

final class val.searchView
    implements android.support.v7.widget.oseListener
{

    final SearchHelper this$0;
    final SearchView val$searchView;

    public final boolean onClose()
    {
        if (!TextUtils.isEmpty(val$searchView.getQuery()))
        {
            val$searchView.setQuery(null, true);
        }
        return true;
    }

    ()
    {
        this$0 = final_searchhelper;
        val$searchView = SearchView.this;
        super();
    }
}
