// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment

class this._cls0
    implements Runnable
{

    final ConversationCreateFragment this$0;

    public void run()
    {
        if (_peopleFacetSearchBar != null)
        {
            _peopleFacetSearchBar.getFocus();
        }
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
