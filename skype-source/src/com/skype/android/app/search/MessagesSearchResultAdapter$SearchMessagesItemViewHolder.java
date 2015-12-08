// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;

// Referenced classes of package com.skype.android.app.search:
//            MessagesSearchResultAdapter, MessageItem

public class secondLineView extends secondLineView
{

    private static final int AVERAGE_NUMBER_OF_CHARACTERS = 40;
    private final Paint secondLinePaint;
    final MessagesSearchResultAdapter this$0;

    private int getAverageNumberOfCharacters(String s)
    {
        float f = secondLineView.getWidth();
        if (f == 0.0F)
        {
            return 40;
        } else
        {
            return Math.round(f / (secondLinePaint.measureText(s) / (float)s.length()));
        }
    }

    private int getCutPosition(String s, int i, int j)
    {
        int k;
label0:
        {
            int l = s.substring(0, j - i / 4).lastIndexOf(" ");
            if (l != -1)
            {
                k = l;
                if (l >= j - i / 2)
                {
                    break label0;
                }
            }
            k = j - i / 2;
        }
        return k;
    }

    private boolean isHighlightVisible(int i, int j)
    {
        return j < (i * 3) / 4;
    }

    protected Conversation getConversationFromData(MessageItem messageitem)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        MessagesSearchResultAdapter.access$500(MessagesSearchResultAdapter.this).getConversationByIdentity(messageitem.getConversationIdentity(), conversationimpl, false);
        return conversationimpl;
    }

    protected volatile Conversation getConversationFromData(Object obj)
    {
        return getConversationFromData((MessageItem)obj);
    }

    protected void setFirstLine(Conversation conversation)
    {
        firstLineView.setText(conversation.getDisplaynameProp());
    }

    protected void setSecondLine(Conversation conversation)
    {
        String s = ((MessageItem)data).getMessage();
        conversation = new SpannableStringBuilder(s);
        String s1 = query.toString();
        Object obj = conversation;
        if (!TextUtils.isEmpty(s1))
        {
            int k = getAverageNumberOfCharacters(s);
            obj = s.toLowerCase();
            s1 = s1.toLowerCase();
            int j = ((String) (obj)).indexOf(s1);
            obj = conversation;
            if (j != -1)
            {
                int i = j;
                if (!isHighlightVisible(k, j))
                {
                    i = getCutPosition(s, k, j);
                    conversation = new SpannableStringBuilder(s.substring(i + 1));
                    conversation.insert(0, "\u2026");
                    i = j - i;
                }
                highlightSearchString(conversation, i, s1.length());
                obj = conversation;
            }
        }
        secondLineView.setText(((CharSequence) (obj)));
        secondLineView.setVisibility(0);
    }

    public (View view)
    {
        this$0 = MessagesSearchResultAdapter.this;
        super(MessagesSearchResultAdapter.this, MessagesSearchResultAdapter.access$000(MessagesSearchResultAdapter.this), view, MessagesSearchResultAdapter.access$100(MessagesSearchResultAdapter.this), MessagesSearchResultAdapter.access$200(MessagesSearchResultAdapter.this), MessagesSearchResultAdapter.access$300(MessagesSearchResultAdapter.this), MessagesSearchResultAdapter.access$400(MessagesSearchResultAdapter.this), MessagesSearchResultAdapter.access$500(MessagesSearchResultAdapter.this), MessagesSearchResultAdapter.access$600(MessagesSearchResultAdapter.this));
        secondLinePaint = secondLineView.getPaint();
    }
}
