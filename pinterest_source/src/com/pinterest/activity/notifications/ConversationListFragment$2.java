// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.notifications:
//            ConversationListFragment

class this._cls0
    implements Runnable
{

    final ConversationListFragment this$0;

    public void run()
    {
        ConversationListFragment.access$100(ConversationListFragment.this).execute();
    }

    ()
    {
        this$0 = ConversationListFragment.this;
        super();
    }
}
