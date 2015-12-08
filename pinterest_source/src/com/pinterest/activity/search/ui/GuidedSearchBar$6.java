// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.base.Events;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements TextWatcher
{

    final GuidedSearchBar this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (searchHintEnabled())
        {
            if (charsequence.length() == 0)
            {
                _queryText.setHint(GuidedSearchBar.access$400(GuidedSearchBar.this));
            }
            String s = StringUtils.trimToEmpty(charsequence.toString());
            setSearchBarRightDrawable(s.isEmpty());
            alignUserIcon(true);
            if (!StringUtils.isNotEmpty(s) || !s.equals(GuidedSearchBar.access$500(GuidedSearchBar.this)))
            {
                GuidedSearchBar.access$502(GuidedSearchBar.this, s);
                if (s.isEmpty())
                {
                    charsequence = com.pinterest.activity.search.event.ent.SuggestionType.RECENT_QUERY;
                } else
                {
                    charsequence = com.pinterest.activity.search.event.ent.SuggestionType.AUTO_COMPLETE;
                }
                Events.post(new SearchSuggestionEvent(s, charsequence));
                return;
            }
        }
    }

    nEvent()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
