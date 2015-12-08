// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.skype.android.widget.SeparatedColumnsAdapter;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment

final class val.listView
    implements android.view.actListFragment._cls1
{

    final ContactListFragment this$0;
    final RecyclerView val$listView;

    public final void onClick(View view)
    {
        view = (com.skype.android.widget.r.ListItemsGroupsProvider.GroupInfo)view.getTag();
        int i = ContactListFragment.access$000(ContactListFragment.this).a(((com.skype.android.widget.r.ListItemsGroupsProvider.GroupInfo) (view)).c);
        val$listView.scrollToPosition(i);
        ensureListShown();
    }

    ItemsGroupsProvider.GroupInfo()
    {
        this$0 = final_contactlistfragment;
        val$listView = RecyclerView.this;
        super();
    }
}
