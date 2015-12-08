// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public class ContactSearchResultAdapter extends SearchResultAdapter
{
    public class ConversationsSearchResultViewAdapter extends SearchResultAdapter.SearchResultViewAdapter
    {

        final ContactSearchResultAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ((ContactItem)obj).getContactObjectId();
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected SearchContactItemViewHolder onCreateViewHolder(View view)
        {
            return new SearchContactItemViewHolder(view);
        }

        public ConversationsSearchResultViewAdapter(int i)
        {
            this$0 = ContactSearchResultAdapter.this;
            super(ContactSearchResultAdapter.this, i);
        }
    }

    public class SearchContactItemViewHolder extends SearchResultAdapter.SearchItemViewHolder
    {

        final ContactSearchResultAdapter this$0;

        protected Conversation getConversationFromData(ContactItem contactitem)
        {
            ConversationImpl conversationimpl = new ConversationImpl();
            lib.getConversationByIdentity(contactitem.getIdentity(), conversationimpl, false);
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

        public SearchContactItemViewHolder(View view)
        {
            this$0 = ContactSearchResultAdapter.this;
            super(ContactSearchResultAdapter.this, activity, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, lib, typeFaceFactory);
        }
    }

    private final class a extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final ContactSearchResultAdapter this$0;

        protected final int getItemId(Object obj)
        {
            return 0;
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300f8, viewgroup, false);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected final b onCreateViewHolder(View view)
        {
            return new b(view);
        }

        private a()
        {
            this$0 = ContactSearchResultAdapter.this;
            super();
        }

    }

    private final class b extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        private TextView descriptionTextView;
        private TextView searchTextView;
        final ContactSearchResultAdapter this$0;

        protected final void onSetData(Object obj)
        {
            searchTextView.setText(0x7f0804d9);
            descriptionTextView.setText(String.format(activity.getString(0x7f0804bf), new Object[] {
                query.toString()
            }));
        }

        public b(View view)
        {
            this$0 = ContactSearchResultAdapter.this;
            super(view);
            searchTextView = (TextView)view.findViewById(0x7f1004fd);
            descriptionTextView = (TextView)view.findViewById(0x7f1004fe);
        }
    }


    public static final int VIEW_TYPE_SKYPE_SEARCH = 4;
    private final Activity activity;
    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final GroupAvatarUtil groupAvatarUtil;
    private final ImageCache imageCache;
    private final SkyLib lib;
    private final TypeFaceFactory typeFaceFactory;

    public ContactSearchResultAdapter(Activity activity1, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, TypeFaceFactory typefacefactory)
    {
        activity = activity1;
        imageCache = imagecache;
        contactUtil = contactutil;
        groupAvatarUtil = groupavatarutil;
        defaultAvatars = defaultavatars;
        lib = skylib;
        typeFaceFactory = typefacefactory;
        setItemViewAdapter(4, new a());
    }

    private Boolean shouldShowFindNewConacts()
    {
        boolean flag;
        if (!TextUtils.isEmpty(query))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    protected boolean forceShowEmptyAdapter()
    {
        return shouldShowFindNewConacts().booleanValue();
    }

    protected com.skype.android.app.data.DataAdapter.ItemViewAdapter getDataItemViewAdapter()
    {
        return new ConversationsSearchResultViewAdapter(0x7f030063);
    }

    protected String getFooterText()
    {
        return activity.getString(0x7f0804c0);
    }

    protected String getHeaderText()
    {
        return activity.getString(0x7f08047b);
    }

    public int getItemViewType(int i)
    {
        if (shouldShowFindNewConacts().booleanValue() && i == (getHeaderViewsCount() + getVisibleDataViewsCount()) - 1 && getMode() == SearchResultAdapter.Mode.MODE_COMBINED)
        {
            return 4;
        } else
        {
            return super.getItemViewType(i);
        }
    }

    public int getMaximumVisibleDataViewsCount()
    {
        return 3;
    }

    protected int getVisibleDataViewsCount()
    {
        int j = super.getVisibleDataViewsCount();
        int i;
        if (shouldShowFindNewConacts().booleanValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }







}
