// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultView, SearchQueryDetailsActivity

private class title
    implements android.view.gestionClickListener
{

    private final String id;
    final SearchResultView this$0;
    private final String title;

    public void onClick(View view)
    {
        SearchQueryDetailsActivity.show((Activity)getContext(), ailsType.SEARCH_SUGGESTION, id, title);
    }

    public ailsType(String s, String s1)
    {
        this$0 = SearchResultView.this;
        super();
        id = s;
        title = s1;
    }
}
