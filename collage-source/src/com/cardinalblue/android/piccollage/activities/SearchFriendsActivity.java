// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.view.fragments.ad;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class SearchFriendsActivity extends BaseFragmentActivity
{

    private ad a;

    public SearchFriendsActivity()
    {
    }

    static ad a(SearchFriendsActivity searchfriendsactivity)
    {
        return searchfriendsactivity.a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b8);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a = (ad)getSupportFragmentManager().findFragmentById(0x7f1001d4);
        if (a == null)
        {
            bundle = new Bundle();
            bundle.putInt("type", 6);
            bundle.putString("user_list_path", "users/search");
            a = new ad();
            a.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(0x7f1001d4, a).commit();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001b, menu);
        menu = menu.findItem(0x7f1002eb);
        SearchView searchview = (SearchView)MenuItemCompat.getActionView(menu);
        if (searchview != null)
        {
            searchview.setSearchableInfo(((SearchManager)getSystemService("search")).getSearchableInfo(getComponentName()));
            k.a(searchview);
            searchview.setQueryHint(getString(0x7f0701b0));
            searchview.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

                final SearchFriendsActivity a;

                public boolean onQueryTextChange(String s)
                {
                    return false;
                }

                public boolean onQueryTextSubmit(String s)
                {
                    if (SearchFriendsActivity.a(a) != null && !TextUtils.isEmpty(s))
                    {
                        SearchFriendsActivity.a(a).a(new String[] {
                            "q", s
                        });
                    }
                    return false;
                }

            
            {
                a = SearchFriendsActivity.this;
                super();
            }
            });
        }
        MenuItemCompat.setOnActionExpandListener(menu, new android.support.v4.view.MenuItemCompat.OnActionExpandListener() {

            final SearchFriendsActivity a;

            public boolean onMenuItemActionCollapse(MenuItem menuitem)
            {
                a.finish();
                return true;
            }

            public boolean onMenuItemActionExpand(MenuItem menuitem)
            {
                return true;
            }

            
            {
                a = SearchFriendsActivity.this;
                super();
            }
        });
        menu.expandActionView();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
