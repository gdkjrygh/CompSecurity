// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter, MessageItem

public class MessagesSearchResultAdapter extends SearchResultAdapter
{
    public class MessagesSearchResultViewAdapter extends SearchResultAdapter.SearchResultViewAdapter
    {

        final MessagesSearchResultAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ((MessageItem)obj).getMessageObjectId();
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected SearchMessagesItemViewHolder onCreateViewHolder(View view)
        {
            return new SearchMessagesItemViewHolder(view);
        }

        public MessagesSearchResultViewAdapter(int i)
        {
            this$0 = MessagesSearchResultAdapter.this;
            super(MessagesSearchResultAdapter.this, i);
        }
    }

    public class SearchMessagesItemViewHolder extends SearchResultAdapter.SearchItemViewHolder
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
            lib.getConversationByIdentity(messageitem.getConversationIdentity(), conversationimpl, false);
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

        public SearchMessagesItemViewHolder(View view)
        {
            this$0 = MessagesSearchResultAdapter.this;
            super(MessagesSearchResultAdapter.this, activity, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, lib, typeFaceFactory);
            secondLinePaint = secondLineView.getPaint();
        }
    }


    private final Activity activity;
    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final GroupAvatarUtil groupAvatarUtil;
    private final ImageCache imageCache;
    private final SkyLib lib;
    private final TypeFaceFactory typeFaceFactory;

    public MessagesSearchResultAdapter(Activity activity1, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, TypeFaceFactory typefacefactory)
    {
        activity = activity1;
        imageCache = imagecache;
        contactUtil = contactutil;
        groupAvatarUtil = groupavatarutil;
        defaultAvatars = defaultavatars;
        lib = skylib;
        typeFaceFactory = typefacefactory;
    }

    protected com.skype.android.app.data.DataAdapter.ItemViewAdapter getDataItemViewAdapter()
    {
        return new MessagesSearchResultViewAdapter(0x7f030063);
    }

    protected String getFooterText()
    {
        return activity.getString(0x7f0804c2);
    }

    protected String getHeaderText()
    {
        return activity.getString(0x7f0804a2);
    }

    public int getMaximumVisibleDataViewsCount()
    {
        return 2;
    }







}
