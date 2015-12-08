// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.View;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.base.Application;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment

class this._cls0
    implements android.view.sationCreateFragment._cls7
{

    final ConversationCreateFragment this$0;

    public void onClick(View view)
    {
        if (ConversationCreateFragment.access$200(ConversationCreateFragment.this) != null && !ConversationCreateFragment.access$200(ConversationCreateFragment.this).isEmpty())
        {
            ConversationApi.a(ConversationCreateFragment.access$200(ConversationCreateFragment.this), ConversationCreateFragment.access$300(ConversationCreateFragment.this), getApiTag());
            return;
        } else
        {
            Application.showToast(0x7f07019a);
            return;
        }
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
