// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.View;
import android.widget.EditText;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.base.Device;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class val.query
    implements android.view.r
{

    final GuidedSearchBar this$0;
    final String val$query;
    final SearchFilter val$searchFilter;

    public void onClick(View view)
    {
        if (val$searchFilter != null && com.pinterest.api.model.Type.MODE.getValue().equals(val$searchFilter.getType()))
        {
            return;
        }
        String s = getCurrentTokenQuery(true);
        clearTokens(true);
        alignUserIcon(true);
        _queryText.setText(s);
        int i = s.indexOf(val$query) + val$query.length();
        if (i < s.length() && i >= 0)
        {
            _queryText.setSelection(i);
        }
        _queryText.requestFocus();
        if (s.isEmpty())
        {
            view = com.pinterest.activity.search.event.nt.SuggestionType.RECENT_QUERY;
        } else
        {
            view = com.pinterest.activity.search.event.nt.SuggestionType.AUTO_COMPLETE;
        }
        Events.post(new SearchSuggestionEvent(s, view));
        Device.showSoftKeyboard(_queryText);
    }

    Event()
    {
        this$0 = final_guidedsearchbar;
        val$searchFilter = searchfilter;
        val$query = String.this;
        super();
    }
}
