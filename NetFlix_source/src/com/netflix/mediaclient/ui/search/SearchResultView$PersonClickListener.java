// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultView, SearchQueryDetailsActivity

private class name
    implements android.view..PersonClickListener
{

    private final String id;
    private final String name;
    final SearchResultView this$0;

    public void onClick(View view)
    {
        SearchQueryDetailsActivity.show((Activity)getContext(), yDetailsType.PERSON, id, name);
    }

    public yDetailsType(String s, String s1)
    {
        this$0 = SearchResultView.this;
        super();
        id = s;
        name = s1;
    }
}
