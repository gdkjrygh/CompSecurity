// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.ui.PortalAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            SearchActivity, ContactActivity

public class PortalActivity extends SearchActivity
{

    public PortalActivity()
    {
    }

    public PortalAdapter getModelAdapter()
    {
        return (PortalAdapter)getListAdapter();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(com.uservoice.uservoicesdk.R.string.uv_portal_title);
        getListView().setDivider(null);
        setListAdapter(new PortalAdapter(this));
        getListView().setOnItemClickListener(getModelAdapter());
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_KB);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.uservoice.uservoicesdk.R.menu.uv_portal, menu);
        setupScopedSearch(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.uservoice.uservoicesdk.R.id.uv_action_contact)
        {
            startActivity(new Intent(this, com/uservoice/uservoicesdk/activity/ContactActivity));
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
