// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.recycler.OnAnyChangeObserver;
import com.skype.android.widget.recycler.RecyclerViewUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapter, ContactAdapterViewBuilder, ContactItem, ContactSearchLoader

public class ContactSearchAdapter extends ContactAdapter
    implements Filterable, ListAdapter
{
    public class SearchItemViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final ContactSearchAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ~obj.toString().charAt(0);
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f0300f5, viewgroup, false);
        }

        protected b onCreateViewHolder(View view)
        {
            return new b(view);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        public SearchItemViewAdapter()
        {
            this$0 = ContactSearchAdapter.this;
            super();
        }
    }

    private static final class a extends OnAnyChangeObserver
    {

        private final DataSetObserver observer;

        public final boolean equals(Object obj)
        {
            return this == obj || (obj instanceof a) && observer == ((a)obj).observer;
        }

        public final int hashCode()
        {
            if (observer != null)
            {
                return observer.hashCode();
            } else
            {
                return 0;
            }
        }

        public final void onChanged()
        {
            observer.onChanged();
        }

        public a(DataSetObserver datasetobserver)
        {
            observer = datasetobserver;
        }
    }

    final class b extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        final ContactSearchAdapter this$0;
        public TextView title;

        protected final void onSetData(Object obj)
        {
            viewBuilder.bindSearchResultView(this, context, (ContactItem)obj, "");
        }

        public b(View view)
        {
            this$0 = ContactSearchAdapter.this;
            super(view);
            title = (TextView)view.findViewById(0x7f1004f9);
        }
    }


    private Account account;
    private List currentParticipants;
    private Filter filter;
    private SkyLib lib;
    private ObjectIdMap map;

    public ContactSearchAdapter(Activity activity, SkyLib skylib, ObjectIdMap objectidmap, Account account1, ContactUtil contactutil, ContactAdapterViewBuilder contactadapterviewbuilder)
    {
        super(activity, contactutil, contactadapterviewbuilder);
        filter = new Filter() {

            final ContactSearchAdapter this$0;

            protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
            {
                android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
                if (TextUtils.isEmpty(charsequence))
                {
                    return filterresults;
                } else
                {
                    charsequence = (new ContactSearchLoader(lib, map, account, charsequence.toString(), currentParticipants)).call();
                    filterresults.values = charsequence;
                    filterresults.count = charsequence.size();
                    return filterresults;
                }
            }

            protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
            {
                if (filterresults.count > 0)
                {
                    charsequence = (ArrayList)filterresults.values;
                    update(charsequence);
                }
            }

            
            {
                this$0 = ContactSearchAdapter.this;
                super();
            }
        };
        lib = skylib;
        map = objectidmap;
        account = account1;
        currentParticipants = new ArrayList();
        setItemViewAdapter(0, new SearchItemViewAdapter());
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public Filter getFilter()
    {
        return filter;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return RecyclerViewUtils.a(this, i, viewgroup);
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        registerAdapterDataObserver(new a(datasetobserver));
    }

    public void setCurrentParticipants(List list)
    {
        currentParticipants.clear();
        currentParticipants.addAll(list);
    }

    public void setSearchText(String s)
    {
    }

    public void setShowSections(boolean flag)
    {
        setShowSeparators(flag);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        unregisterAdapterDataObserver(new a(datasetobserver));
    }




}
