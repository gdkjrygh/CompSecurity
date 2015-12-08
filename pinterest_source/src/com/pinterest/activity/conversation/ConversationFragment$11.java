// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;


// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0
    implements Runnable
{

    final ConversationFragment this$0;

    public void run()
    {
        if (isAdded() && isActive())
        {
            ConversationFragment.access$2000(ConversationFragment.this);
        }
    }

    A()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
