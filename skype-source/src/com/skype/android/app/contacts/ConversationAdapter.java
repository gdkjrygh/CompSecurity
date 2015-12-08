// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentItem;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.BoldTypeFacedSpan;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ImageItemViewHolder

public class ConversationAdapter extends DataAdapter
    implements Filterable
{
    public static class ConversationItemViewHolder extends ImageItemViewHolder
    {

        private final BoldTypeFacedSpan boldfaced;
        public CheckBox checkbox;
        private final TextView firstLineView;
        private final ObjectIdMap map;
        private final boolean multipane;
        private final TextView secondLineView;

        private void highlightSearchString(SpannableStringBuilder spannablestringbuilder, int i, int j)
        {
            spannablestringbuilder.setSpan(boldfaced, i, i + j, 18);
        }

        private void setFirstLine(Recent recent)
        {
            String s;
            String s1;
            SpannableStringBuilder spannablestringbuilder;
            s1 = recent.getDisplayName();
            spannablestringbuilder = new SpannableStringBuilder(s1);
            s = null;
            if (ConversationAdapter.query != null)
            {
                s = ConversationAdapter.query.toString();
            }
            if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
            int i;
            String s2 = s1.toLowerCase();
            s = s.toLowerCase();
            i = s2.indexOf(s);
            if (i == -1) goto _L4; else goto _L3
_L3:
            highlightSearchString(spannablestringbuilder, i, s.length());
_L2:
            firstLineView.setText(spannablestringbuilder);
            return;
_L4:
            int j = recent.getIdentity().indexOf(s);
            if (j != -1)
            {
                spannablestringbuilder.append(" (").append(recent.getIdentity()).append(")");
                highlightSearchString(spannablestringbuilder, j + (s1.length() + 2), s.length());
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        private void setSecondLine(Recent recent, Conversation conversation)
        {
            if (!recent.isDialog() && conversation != null)
            {
                int i = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList.length;
                recent = String.format(secondLineView.getContext().getString(0x7f0802fb), new Object[] {
                    Integer.valueOf(i)
                });
                secondLineView.setText(recent);
                secondLineView.setVisibility(0);
                return;
            } else
            {
                secondLineView.setVisibility(8);
                return;
            }
        }

        protected void onSetData(Object obj)
        {
            obj = (Recent)obj;
            Conversation conversation = (Conversation)map.a(((Recent) (obj)).getConversationObjectId(), com/skype/Conversation);
            bindImage(conversation);
            setFirstLine(((Recent) (obj)));
            setSecondLine(((Recent) (obj)), conversation);
            if (multipane)
            {
                obj = checkbox;
                int i;
                if (isItemChecked())
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                ((CheckBox) (obj)).setVisibility(i);
            }
        }

        public ConversationItemViewHolder(Activity activity, View view, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, 
                ObjectIdMap objectidmap, TypeFaceFactory typefacefactory)
        {
            super(activity, view, (SkypeAvatarView)ViewUtil.a(view, 0x7f10030c), imagecache, contactutil, groupavatarutil, defaultavatars, skylib);
            map = objectidmap;
            firstLineView = (TextView)ViewUtil.a(view, 0x7f10031a);
            secondLineView = (TextView)ViewUtil.a(view, 0x7f10031b);
            checkbox = (CheckBox)ViewUtil.a(view, 0x7f100319);
            boldfaced = new BoldTypeFacedSpan(typefacefactory);
            checkbox.setVisibility(8);
            multipane = view.getContext().getResources().getBoolean(0x7f0d0003);
        }
    }

    private static final class a extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        private final Activity activity;
        private final ContactUtil contactUtil;
        private final DefaultAvatars defaultAvatars;
        private final GroupAvatarUtil groupAvatarUtil;
        private final ImageCache imageCache;
        private final SkyLib lib;
        private final ObjectIdMap map;
        private final TypeFaceFactory typeFaceFactory;

        protected final int getItemId(Object obj)
        {
            return ((RecentItem)obj).getConversationObjectId();
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030063, viewgroup, false);
        }

        protected final ConversationItemViewHolder onCreateViewHolder(View view)
        {
            return new ConversationItemViewHolder(activity, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, lib, map, typeFaceFactory);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        public a(Activity activity1, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, ObjectIdMap objectidmap, 
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
    }


    private static CharSequence query;
    private Filter conversationSearchFilter;
    private List filteredConversations;
    private boolean multipleChoice;
    private List unfilteredConversations;

    public ConversationAdapter(Activity activity, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, ObjectIdMap objectidmap, 
            TypeFaceFactory typefacefactory)
    {
        unfilteredConversations = new ArrayList();
        filteredConversations = new ArrayList();
        setItemViewAdapter(0, new a(activity, imagecache, contactutil, groupavatarutil, defaultavatars, skylib, objectidmap, typefacefactory));
    }

    public Filter getFilter()
    {
        if (conversationSearchFilter == null)
        {
            conversationSearchFilter = new Filter() {

                final ConversationAdapter this$0;

                protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
                {
                    android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
                    ArrayList arraylist = new ArrayList();
                    if (!TextUtils.isEmpty(charsequence))
                    {
                        Iterator iterator = unfilteredConversations.iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            Recent recent = (Recent)iterator.next();
                            if (recent.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
                            {
                                arraylist.add(recent);
                            }
                        } while (true);
                    } else
                    {
                        arraylist.addAll(unfilteredConversations);
                    }
                    filterresults.values = arraylist;
                    return filterresults;
                }

                protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
                {
                    filteredConversations = (ArrayList)filterresults.values;
                    setData(filteredConversations);
                }

            
            {
                this$0 = ConversationAdapter.this;
                super();
            }
            };
        }
        return conversationSearchFilter;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i);
    }

    public void onBindViewHolder(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i)
    {
        super.onBindViewHolder(itemviewholder, i);
        itemviewholder = (ConversationItemViewHolder)itemviewholder;
        boolean flag = itemviewholder.isItemChecked();
        if (multipleChoice)
        {
            ((ConversationItemViewHolder) (itemviewholder)).checkbox.setOnCheckedChangeListener(null);
            ((ConversationItemViewHolder) (itemviewholder)).checkbox.setChecked(flag);
            ((ConversationItemViewHolder) (itemviewholder)).checkbox.setOnCheckedChangeListener(itemviewholder);
            Object obj = ((ConversationItemViewHolder) (itemviewholder)).itemView.findViewById(0x7f10031c);
            if (obj != null)
            {
                ((View) (obj)).setSelected(flag);
            }
            ((TextView)((ConversationItemViewHolder) (itemviewholder)).itemView.findViewById(0x7f10031a)).setSelected(flag);
            obj = (TextView)((ConversationItemViewHolder) (itemviewholder)).itemView.findViewById(0x7f10031b);
            if (obj != null)
            {
                ((TextView) (obj)).setSelected(flag);
            }
            ((ConversationItemViewHolder) (itemviewholder)).checkbox.setVisibility(0);
            return;
        }
        CheckBox checkbox = ((ConversationItemViewHolder) (itemviewholder)).checkbox;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        checkbox.setVisibility(i);
        ((ConversationItemViewHolder) (itemviewholder)).checkbox.setChecked(flag);
    }

    public void setData(List list, CharSequence charsequence)
    {
        super.setData(list);
        query = charsequence;
    }

    public void setMultipleChoice(boolean flag)
    {
        multipleChoice = flag;
    }

    public void update(List list)
    {
        if (list != null)
        {
            unfilteredConversations.clear();
            unfilteredConversations.addAll(list);
        }
    }





/*
    static List access$202(ConversationAdapter conversationadapter, List list)
    {
        conversationadapter.filteredConversations = list;
        return list;
    }

*/
}
