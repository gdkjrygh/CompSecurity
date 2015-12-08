// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import com.soundcloud.android.api.legacy.model.SearchSuggestions;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            SuggestionsAdapter

class val.suggestions
    implements Runnable
{

    final SuggestionsAdapter this$0;
    final CharSequence val$constraint;
    final SearchSuggestions val$suggestions;

    public void run()
    {
        if (val$constraint.equals(SuggestionsAdapter.access$000(SuggestionsAdapter.this)))
        {
            SuggestionsAdapter.access$102(SuggestionsAdapter.this, val$suggestions);
            swapCursor(SuggestionsAdapter.access$200(SuggestionsAdapter.this));
            SuggestionsAdapter.access$300(SuggestionsAdapter.this, SuggestionsAdapter.access$100(SuggestionsAdapter.this));
        }
    }

    ()
    {
        this$0 = final_suggestionsadapter;
        val$constraint = charsequence;
        val$suggestions = SearchSuggestions.this;
        super();
    }
}
