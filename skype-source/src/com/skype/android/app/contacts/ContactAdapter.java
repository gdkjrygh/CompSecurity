// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.HeaderComparator;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactFilter, ContactItem, ContactAdapterViewBuilder

public class ContactAdapter extends DataAdapter
    implements Filterable, SectionIndexer, com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider
{
    public class ContactItemViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final ContactAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ((ContactItem)obj).getContactObjectId();
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(peopleListItemLayout, viewgroup, false);
        }

        protected FullContactItemHolder onCreateViewHolder(View view)
        {
            return new FullContactItemHolder(view);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        public ContactItemViewAdapter()
        {
            this$0 = ContactAdapter.this;
            super();
        }
    }

    public class FullContactItemHolder extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        public SkypeAvatarView avatarView;
        public Future bitmapFuture;
        public CheckBox checkbox;
        public ContactItem contact;
        public TextView fullName;
        public Future moodFuture;
        public SymbolView presenceIcon;
        public TextView statusMessage;
        final ContactAdapter this$0;

        protected void onSetData(Object obj)
        {
            ContactAdapterViewBuilder.a a1;
            if (countryAsMood)
            {
                a1 = ContactAdapterViewBuilder.a.CONTACT_DIRECTORY;
            } else
            {
                a1 = ContactAdapterViewBuilder.a.CONTACT;
            }
            viewBuilder.bindContactView(this, context, itemView, (ContactItem)obj, searchText, a1, multipleChoice);
        }

        public void onViewRecycled()
        {
            super.onViewRecycled();
            if (bitmapFuture != null)
            {
                bitmapFuture.cancel(true);
            }
            if (moodFuture != null)
            {
                moodFuture.cancel(true);
            }
        }

        public FullContactItemHolder(View view)
        {
            this$0 = ContactAdapter.this;
            super(view);
            avatarView = (SkypeAvatarView)view.findViewById(0x7f10030c);
            if (enableAvatarClipping)
            {
                avatarView.a().setClipCircleEnabled(true);
            }
            presenceIcon = (SymbolView)view.findViewById(0x7f100329);
            fullName = (TextView)view.findViewById(0x7f10031a);
            statusMessage = (TextView)view.findViewById(0x7f10031b);
            checkbox = (CheckBox)view.findViewById(0x7f100319);
            if (customCheckboxResId != -1)
            {
                checkbox.setButtonDrawable(customCheckboxResId);
            }
            new SpannedAnimationDrawableCallback(statusMessage);
        }
    }

    public class LetterItemViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final ContactAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ~obj.toString().charAt(0);
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f03005b, viewgroup, false);
        }

        protected a onCreateViewHolder(View view)
        {
            return new a(view);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        public LetterItemViewAdapter()
        {
            this$0 = ContactAdapter.this;
            super();
        }
    }

    final class a extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        final ContactAdapter this$0;
        public TextView title;

        protected final void onSetData(Object obj)
        {
            if (obj != null)
            {
                obj = ((com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)obj).a;
            } else
            {
                obj = "";
            }
            viewBuilder.bindHeaderView(this, context, ((String) (obj)));
        }

        public a(View view)
        {
            this$0 = ContactAdapter.this;
            super(view);
            title = (TextView)view.findViewById(0x7f100305);
        }
    }


    static final int ALPHA_SEPARATOR_THRESHOLD = 15;
    private static final String PHONE_SEPARATOR = "#";
    public static final int VIEW_TYPE_CONTACT = 0;
    static final int VIEW_TYPE_LETTER = 1;
    private ContactFilter contactFilter;
    private Filter contactSearchFilter;
    private ContactUtil contactUtil;
    private List contacts;
    protected final Context context;
    private boolean countryAsMood;
    private int customCheckboxResId;
    private boolean disableGroupHeaders;
    private boolean enableAvatarClipping;
    private Map groupInfoMap;
    private boolean multipleChoice;
    private int peopleListItemLayout;
    private String searchText;
    private String sections[];
    private boolean showSeparators;
    private List unfilteredContacts;
    ContactAdapterViewBuilder viewBuilder;

    public ContactAdapter(Activity activity, ContactUtil contactutil, ContactAdapterViewBuilder contactadapterviewbuilder)
    {
        peopleListItemLayout = 0x7f030063;
        customCheckboxResId = -1;
        context = activity;
        contactUtil = contactutil;
        viewBuilder = contactadapterviewbuilder;
        showSeparators = true;
        contacts = new ArrayList();
        unfilteredContacts = new ArrayList();
        contactFilter = new ContactFilter(activity, contactutil, ContactFilter.FilterType.ALL);
        setItemViewAdapter(1, new LetterItemViewAdapter());
        setItemViewAdapter(0, new ContactItemViewAdapter());
    }

    private void addSeparators()
    {
label0:
        {
            TreeMap treemap = new TreeMap(new HeaderComparator());
            if (!hasGroupHeaders() || disableGroupHeaders)
            {
                break label0;
            }
            TreeMap treemap1 = new TreeMap(new HeaderComparator());
            for (int i = 0; i < getCount(); i++)
            {
                ContactItem contactitem = (ContactItem)getItem(i);
                String s = getHeaderLetterFromName(getName(contactitem));
                List list = (List)treemap1.get(s);
                Object obj = list;
                if (list == null)
                {
                    obj = new ArrayList();
                    treemap1.put(s, obj);
                }
                ((List) (obj)).add(contactitem);
            }

            setNotifyOnChange(false);
            clear();
            int j = 0;
            Iterator iterator = treemap1.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (java.util.Map.Entry)iterator.next();
                Object obj1 = (String)((java.util.Map.Entry) (obj2)).getKey();
                int k = ((List)((java.util.Map.Entry) (obj2)).getValue()).size();
                obj2 = new com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo(((String) (obj1)), k, j);
                k = j + (k + 1);
                treemap.put(obj1, obj2);
                add(obj2);
                obj1 = ((List)treemap1.get(obj1)).iterator();
                do
                {
                    j = k;
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    add((ContactItem)((Iterator) (obj1)).next());
                } while (true);
            } while (true);
            setNotifyOnChange(true);
            notifyDataSetChanged();
            sections = (String[])treemap1.keySet().toArray(new String[treemap1.size()]);
            groupInfoMap = treemap;
            return;
        }
        sections = new String[0];
        groupInfoMap = null;
    }

    private String getHeaderLetterFromName(String s)
    {
        if (s.length() == 0)
        {
            return "#";
        }
        char c = Character.toUpperCase(s.charAt(0));
        if (!Character.isLetter(c))
        {
            return "#";
        } else
        {
            return String.valueOf(c);
        }
    }

    private ContactItem getItemByObjectId(int i, boolean flag)
    {
        for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
        {
            ContactItem contactitem = (ContactItem)iterator.next();
            if (i == contactitem.getContactObjectId() && contactitem.isLocalContact() == flag)
            {
                return contactitem;
            }
        }

        return null;
    }

    private String getName(ContactItem contactitem)
    {
        return contactUtil.a(contactitem.getDisplayName(), contactitem.getType());
    }

    public void applyFilter(ContactFilter contactfilter)
    {
        contactFilter = contactfilter;
        setNotifyOnChange(false);
        clear();
        Iterator iterator = contacts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ContactItem contactitem = (ContactItem)iterator.next();
            if (contactfilter == null || contactfilter.accept(contactitem))
            {
                add(contactitem);
            }
        } while (true);
        if (showSeparators)
        {
            addSeparators();
        }
        notifyDataSetChanged();
    }

    public void disableGroupHeaders()
    {
        disableGroupHeaders = true;
    }

    public android.support.v7.widget.RecyclerView.a getAdapter()
    {
        return this;
    }

    public ContactFilter getContactFilter()
    {
        return contactFilter;
    }

    public Filter getFilter()
    {
        if (contactSearchFilter == null)
        {
            contactSearchFilter = new Filter() {

                final ContactAdapter this$0;

                protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
                {
                    android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
                    ArrayList arraylist = new ArrayList();
                    if (!TextUtils.isEmpty(charsequence))
                    {
                        Iterator iterator = unfilteredContacts.iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            ContactItem contactitem = (ContactItem)iterator.next();
                            if (contactitem.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
                            {
                                arraylist.add(contactitem);
                            }
                        } while (true);
                    } else
                    {
                        arraylist.addAll(unfilteredContacts);
                    }
                    filterresults.values = arraylist;
                    return filterresults;
                }

                protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
                {
                    contacts = (ArrayList)filterresults.values;
                    applyFilter(contactFilter);
                }

            
            {
                this$0 = ContactAdapter.this;
                super();
            }
            };
        }
        return contactSearchFilter;
    }

    public Map getGroupInfoMap()
    {
        return groupInfoMap;
    }

    public int getItemViewType(int i)
    {
        Object obj = getItem(i);
        i = 0;
        if (obj instanceof com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo)
        {
            i = 1;
        }
        return i;
    }

    public int getPositionForSection(int i)
    {
        if (sections != null)
        {
            int j = i;
            if (i >= sections.length)
            {
                j = sections.length - 1;
            }
            if (j > 0)
            {
                String s = sections[j];
                for (i = 0; i < getCount(); i++)
                {
                    if (getItemViewType(i) == 1 && s.equalsIgnoreCase((String)getItem(i)))
                    {
                        return i;
                    }
                }

            }
        }
        return 0;
    }

    public int getSectionForPosition(int i)
    {
        String s1;
        int j;
        int k = getCount();
        j = i;
        if (i > k)
        {
            j = k - 1;
        }
        s1 = null;
        i = j;
_L12:
        String s = s1;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        if (getItemViewType(i) != 1) goto _L4; else goto _L3
_L3:
        s = (String)getItem(i);
_L2:
        s1 = s;
        if (s != null) goto _L6; else goto _L5
_L5:
        s1 = s;
        if (j >= getCount()) goto _L6; else goto _L7
_L7:
        if (getItemViewType(j) != 1) goto _L9; else goto _L8
_L8:
        s1 = (String)getItem(j);
_L6:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        i = 0;
_L10:
        if (i >= sections.length)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (s1.equalsIgnoreCase(sections[i]))
        {
            return i;
        }
        break MISSING_BLOCK_LABEL_133;
_L4:
        i--;
        continue; /* Loop/switch isn't completed */
_L9:
        j++;
          goto _L5
        i++;
          goto _L10
        return 0;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public Object[] getSections()
    {
        return sections;
    }

    public boolean hasGroupHeaders()
    {
        return getCount() > 15;
    }

    public void setAvatarClippingEnabled(boolean flag)
    {
        enableAvatarClipping = flag;
    }

    public void setCountryAsMood(boolean flag)
    {
        countryAsMood = flag;
    }

    public void setCustomCheckboxResource(int i)
    {
        customCheckboxResId = i;
    }

    public void setMultipleChoice(boolean flag)
    {
        multipleChoice = flag;
    }

    public void setPeopleListItemLayout(int i)
    {
        peopleListItemLayout = i;
    }

    public void setSearchText(String s)
    {
        searchText = s;
    }

    public void setShowSeparators(boolean flag)
    {
        showSeparators = flag;
    }

    public void update(List list)
    {
        if (list != null)
        {
            contacts = list;
            unfilteredContacts.clear();
            unfilteredContacts.addAll(list);
            applyFilter(contactFilter);
        }
    }

    public void updateExisting(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ContactItem contactitem = (ContactItem)list.next();
                ContactItem contactitem1 = getItemByObjectId(contactitem.getContactObjectId(), contactitem.isLocalContact());
                if (contactitem1 != null)
                {
                    contactitem1.copy(contactitem);
                }
            } while (true);
            notifyDataSetChanged();
        }
    }



/*
    static List access$102(ContactAdapter contactadapter, List list)
    {
        contactadapter.contacts = list;
        return list;
    }

*/







}
