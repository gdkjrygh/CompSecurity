// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.contacts.ContactItem;

// Referenced classes of package com.skype.android.app.search:
//            ContactSearchResultAdapter

public class this._cls0 extends this._cls0
{

    final ContactSearchResultAdapter this$0;

    protected Conversation getConversationFromData(ContactItem contactitem)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        ContactSearchResultAdapter.access$600(ContactSearchResultAdapter.this).getConversationByIdentity(contactitem.getIdentity(), conversationimpl, false);
        return conversationimpl;
    }

    protected volatile Conversation getConversationFromData(Object obj)
    {
        return getConversationFromData((ContactItem)obj);
    }

    protected void setFirstLine(Conversation conversation)
    {
        String s;
        SpannableStringBuilder spannablestringbuilder;
        String s2;
        s = conversation.getDisplaynameProp();
        spannablestringbuilder = new SpannableStringBuilder(s);
        s2 = query.toString();
        if (TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        int i;
        String s1 = s.toLowerCase();
        s2 = s2.toLowerCase();
        i = s1.indexOf(s2);
        if (i == -1) goto _L4; else goto _L3
_L3:
        highlightSearchString(spannablestringbuilder, i, s2.length());
_L2:
        firstLineView.setText(spannablestringbuilder);
        return;
_L4:
        int j = conversation.getIdentityProp().indexOf(s2);
        if (j != -1)
        {
            spannablestringbuilder.append(" (").append(conversation.getIdentityProp()).append(")");
            highlightSearchString(spannablestringbuilder, j + (s.length() + 2), s2.length());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void setSecondLine(Conversation conversation)
    {
        secondLineView.setVisibility(8);
    }

    public Y(View view)
    {
        this$0 = ContactSearchResultAdapter.this;
        super(ContactSearchResultAdapter.this, ContactSearchResultAdapter.access$100(ContactSearchResultAdapter.this), view, ContactSearchResultAdapter.access$200(ContactSearchResultAdapter.this), ContactSearchResultAdapter.access$300(ContactSearchResultAdapter.this), ContactSearchResultAdapter.access$400(ContactSearchResultAdapter.this), ContactSearchResultAdapter.access$500(ContactSearchResultAdapter.this), ContactSearchResultAdapter.access$600(ContactSearchResultAdapter.this), ContactSearchResultAdapter.access$700(ContactSearchResultAdapter.this));
    }
}
