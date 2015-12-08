// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.android.app.recents.Recent;
import com.skype.android.skylib.ObjectIdMap;

// Referenced classes of package com.skype.android.app.search:
//            ConversationsSearchResultAdapter

public class this._cls0 extends this._cls0
{

    final ConversationsSearchResultAdapter this$0;

    protected Conversation getConversationFromData(Recent recent)
    {
        return (Conversation)ConversationsSearchResultAdapter.access$700(ConversationsSearchResultAdapter.this).a(recent.getConversationObjectId(), com/skype/Conversation);
    }

    protected volatile Conversation getConversationFromData(Object obj)
    {
        return getConversationFromData((Recent)obj);
    }

    protected void setFirstLine(Conversation conversation)
    {
        String s1 = conversation.getDisplaynameProp();
        conversation = new SpannableStringBuilder(s1);
        String s = query.toString();
        if (!TextUtils.isEmpty(s))
        {
            s1 = s1.toLowerCase();
            s = s.toLowerCase();
            int i = s1.indexOf(s);
            if (i != -1)
            {
                highlightSearchString(conversation, i, s.length());
            }
        }
        firstLineView.setText(conversation);
    }

    protected void setSecondLine(Conversation conversation)
    {
        int i = conversation.getParticipants(com.skype.tionItemViewHolder).tionItemViewHolder.length;
        conversation = String.format(secondLineView.getContext().getString(0x7f0802fb), new Object[] {
            Integer.valueOf(i)
        });
        secondLineView.setText(conversation);
        secondLineView.setVisibility(0);
    }

    public (View view)
    {
        this$0 = ConversationsSearchResultAdapter.this;
        super(ConversationsSearchResultAdapter.this, ConversationsSearchResultAdapter.access$000(ConversationsSearchResultAdapter.this), view, ConversationsSearchResultAdapter.access$100(ConversationsSearchResultAdapter.this), ConversationsSearchResultAdapter.access$200(ConversationsSearchResultAdapter.this), ConversationsSearchResultAdapter.access$300(ConversationsSearchResultAdapter.this), ConversationsSearchResultAdapter.access$400(ConversationsSearchResultAdapter.this), ConversationsSearchResultAdapter.access$500(ConversationsSearchResultAdapter.this), ConversationsSearchResultAdapter.access$600(ConversationsSearchResultAdapter.this));
    }
}
