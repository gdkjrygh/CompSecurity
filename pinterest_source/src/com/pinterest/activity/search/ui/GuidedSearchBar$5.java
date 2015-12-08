// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements android.view.er
{

    final GuidedSearchBar this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        EditText edittext = (EditText)view;
        if (!view.isFocused())
        {
            requestFocusFromTouch();
            Device.showSoftKeyboard(edittext);
            motionevent = getCurrentTokenQuery(true);
            if (_searchEt.getChildCount() > 1 && StringUtils.isNotEmpty(motionevent))
            {
                clearTokens(true);
                edittext.setText(motionevent);
                if (motionevent.isEmpty())
                {
                    view = com.pinterest.activity.search.event.ent.SuggestionType.RECENT_QUERY;
                } else
                {
                    view = com.pinterest.activity.search.event.ent.SuggestionType.AUTO_COMPLETE;
                }
                Events.post(new SearchSuggestionEvent(motionevent, view));
            } else
            {
                edittext.setText(edittext.getText());
            }
        }
        return false;
    }

    nEvent()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
