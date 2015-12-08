// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.recents.Recent;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public class ConversationsSearchResultAdapter extends SearchResultAdapter
{
    public class ConversationsSearchResultViewAdapter extends SearchResultAdapter.SearchResultViewAdapter
    {

        final ConversationsSearchResultAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ((Recent)obj).getConversationObjectId();
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected SearchConversationItemViewHolder onCreateViewHolder(View view)
        {
            return new SearchConversationItemViewHolder(view);
        }

        public ConversationsSearchResultViewAdapter(int i)
        {
            this$0 = ConversationsSearchResultAdapter.this;
            super(ConversationsSearchResultAdapter.this, i);
        }
    }

    public class SearchConversationItemViewHolder extends SearchResultAdapter.SearchItemViewHolder
    {

        final ConversationsSearchResultAdapter this$0;

        protected Conversation getConversationFromData(Recent recent)
        {
            return (Conversation)map.a(recent.getConversationObjectId(), com/skype/Conversation);
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
            int i = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList.length;
            conversation = String.format(secondLineView.getContext().getString(0x7f0802fb), new Object[] {
                Integer.valueOf(i)
            });
            secondLineView.setText(conversation);
            secondLineView.setVisibility(0);
        }

        public SearchConversationItemViewHolder(View view)
        {
            this$0 = ConversationsSearchResultAdapter.this;
            super(ConversationsSearchResultAdapter.this, activity, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, lib, typeFaceFactory);
        }
    }


    private final Activity activity;
    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final GroupAvatarUtil groupAvatarUtil;
    private final ImageCache imageCache;
    private final SkyLib lib;
    private final ObjectIdMap map;
    private final TypeFaceFactory typeFaceFactory;

    public ConversationsSearchResultAdapter(Activity activity1, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, ObjectIdMap objectidmap, 
            TypeFaceFactory typefacefactory)
    {
        activity = activity1;
        imageCache = imagecache;
        contactUtil = contactutil;
        groupAvatarUtil = groupavatarutil;
        defaultAvatars = defaultavatars;
        lib = skylib;
        map = objectidmap;
        typeFaceFactory = typefacefactory;
    }

    protected com.skype.android.app.data.DataAdapter.ItemViewAdapter getDataItemViewAdapter()
    {
        return new ConversationsSearchResultViewAdapter(0x7f030063);
    }

    protected String getFooterText()
    {
        return activity.getString(0x7f0804c1);
    }

    protected String getHeaderText()
    {
        return activity.getString(0x7f08047d);
    }

    public int getMaximumVisibleDataViewsCount()
    {
        return 2;
    }








}
