// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.api.model.Conversation;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.events.OverrideNavigationEvent;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class this._cls0
    implements com.pinterest.base.
{

    final ConversationFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.nFragment._cls4 _pcls4)
    {
        if (_pcls4.getConversation().getUid().equals(ConversationFragment.access$600(ConversationFragment.this)))
        {
            ConversationFragment.access$700(ConversationFragment.this);
            ConversationFragment.access$800(ConversationFragment.this);
        }
    }

    public void onEventMainThread(com.pinterest.api.model.t t)
    {
        class _cls1 extends BackgroundTask
        {

            private ConversationMessagesFeed _feed;
            final ConversationFragment._cls4 this$1;

            public void onFinish()
            {
                super.onFinish();
                ConversationFragment.access$000(this$0).replaceFeed(_feed);
            }

            public void run()
            {
                int i = ConversationFragment.access$000(this$0).getCount();
                _feed = new ConversationMessagesFeed(ModelHelper.getConversationMessages(ConversationFragment.access$600(this$0), i));
            }

            _cls1()
            {
                this$1 = ConversationFragment._cls4.this;
                super();
            }
        }

        if (t.getConversation().getUid().equals(ConversationFragment.access$600(ConversationFragment.this)))
        {
            (new _cls1()).execute();
        }
    }

    public void onEventMainThread(com.pinterest.api.model.Event event)
    {
        if (event.getConversationId().equals(ConversationFragment.access$600(ConversationFragment.this)))
        {
            ConversationFragment.access$000(ConversationFragment.this).addMessage(event.getConversationMessage());
            ConversationFragment.access$900(ConversationFragment.this);
        }
    }

    public void onEventMainThread(OverrideNavigationEvent overridenavigationevent)
    {
        overridenavigationevent = overridenavigationevent.b();
        ConversationApi.a(ConversationFragment.access$600(ConversationFragment.this), overridenavigationevent, null, ConversationFragment.access$1000(ConversationFragment.this), getApiTag());
        if (ConversationFragment.access$1100(ConversationFragment.this) != null)
        {
            hidePinFragment();
        }
    }

    _cls1()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
