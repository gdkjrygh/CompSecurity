// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.ContactGroup;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.SpinnerAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactFilter, b

final class a extends SpinnerAdapter
{

    private ContactUtil contactUtil;
    private EcsConfiguration ecsConfiguration;

    public a(Context context, ContactUtil contactutil, EcsConfiguration ecsconfiguration)
    {
        super(context);
        contactUtil = contactutil;
        ecsConfiguration = ecsconfiguration;
        addDefaults();
    }

    private void addDefaults()
    {
        add(new ContactFilter(getContext(), contactUtil, ContactFilter.FilterType.ALL));
        add(new ContactFilter(getContext(), contactUtil, ContactFilter.FilterType.SKYPE));
        add(new ContactFilter(getContext(), contactUtil, ContactFilter.FilterType.AVAILABLE));
        add(new ContactFilter(getContext(), contactUtil, ContactFilter.FilterType.FAVORITES));
        if (ecsConfiguration.isAgentSuggestionsEnabled())
        {
            add(new ContactFilter(getContext(), contactUtil, ContactFilter.FilterType.AGENTS));
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (ContactFilter)getItem(i);
        ((TextView)view.findViewById(0x7f100532)).setText(viewgroup.toString());
        view.setContentDescription(getContext().getString(0x7f080077, new Object[] {
            viewgroup.toString()
        }));
        return view;
    }

    public final void setGroups(List list)
    {
        setNotifyOnChange(false);
        clear();
        addDefaults();
        Collections.sort(list, new b());
        ContactGroup contactgroup;
        for (list = list.iterator(); list.hasNext(); add(new ContactFilter(getContext(), contactUtil, contactgroup)))
        {
            contactgroup = (ContactGroup)list.next();
        }

        notifyDataSetChanged();
    }
}
