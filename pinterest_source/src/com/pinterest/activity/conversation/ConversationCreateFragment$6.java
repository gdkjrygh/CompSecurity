// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment, ConversationCreateAdapter

class this._cls0
    implements android.view.sationCreateFragment._cls6
{

    final ConversationCreateFragment this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && i == 67 && StringUtils.isEmpty(ConversationCreateFragment.access$100(ConversationCreateFragment.this)))
        {
            view = _peopleFacetSearchBar.removeLastFacet();
            if (view != null)
            {
                ConversationCreateFragment.access$000(ConversationCreateFragment.this).onPersonUnselected(view);
                ConversationCreateFragment.access$200(ConversationCreateFragment.this).remove(view);
                _peopleListView.invalidateViews();
            }
        }
        return false;
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
