// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.View;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0
    implements android.view.ConversationFragment._cls6
{

    final ConversationFragment this$0;

    public void onClick(View view)
    {
        view = ConversationFragment.access$1200(ConversationFragment.this).getText().toString();
        if (StringUtils.isNotEmpty(view))
        {
            ConversationFragment.access$1200(ConversationFragment.this).setText(null);
            ConversationApi.e(ConversationFragment.access$600(ConversationFragment.this), view, ConversationFragment.access$1000(ConversationFragment.this), getApiTag());
        }
    }

    ()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
