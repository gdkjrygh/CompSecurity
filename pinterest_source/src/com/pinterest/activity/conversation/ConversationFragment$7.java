// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.View;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0
    implements android.view.ConversationFragment._cls7
{

    final ConversationFragment this$0;

    public void onClick(View view)
    {
        Device.hideSoftKeyboard(view);
        ConversationFragment.access$1300(ConversationFragment.this);
    }

    ()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
