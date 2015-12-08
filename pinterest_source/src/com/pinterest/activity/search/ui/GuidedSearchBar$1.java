// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements android.widget.ctionListener
{

    final GuidedSearchBar this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || i == 6 || keyevent == null || keyevent.getKeyCode() == 66)
        {
            textview = StringUtils.trimToEmpty(textview.getText().toString());
            if (textview.isEmpty())
            {
                return true;
            }
            keyevent = new HashMap();
            keyevent.put("entered_query", textview);
            Pinalytics.a(EventType.TAP, ElementType.SEARCH_BOX_TEXT_INPUT, ComponentType.SEARCH_BOX, null, keyevent, null);
            keyevent = new QueryMetaData(textview, com.pinterest.activity.search.model.extType.TYPED);
            GuidedSearchBar.access$000(GuidedSearchBar.this).add(keyevent);
            GuidedSearchBar.access$102(GuidedSearchBar.this, keyevent);
            GuidedSearchBar.access$202(GuidedSearchBar.this, com.pinterest.activity.search.model.erState.ADDED);
            addQueryList(textview);
            _queryText.setText("");
            _queryText.setHint("");
            if (GuidedSearchBar.access$300(GuidedSearchBar.this) == com.pinterest.activity.search.event.SearchType.PIN)
            {
                StopWatch.get().start("search_ttrfp");
            }
            Events.post(new GuidedSearchEvent(getCurrentTokenQuery(false), GuidedSearchBar.access$300(GuidedSearchBar.this)));
            return true;
        } else
        {
            return false;
        }
    }

    nt()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
