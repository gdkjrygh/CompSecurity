// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.search.TabbedSearchFragment;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.java.strings.Strings;

public class SearchResultsActivity extends ScActivity
{

    public static final String EXTRA_SEARCH_QUERY = "searchQuery";
    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public SearchResultsActivity()
    {
    }

    private void createFragmentForSearchResults()
    {
        Object obj = getIntent().getStringExtra("searchQuery");
        if (Strings.isNullOrEmpty(((CharSequence) (obj))))
        {
            throw new IllegalStateException("Invalid search query");
        } else
        {
            obj = TabbedSearchFragment.newInstance(((String) (obj)));
            getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, ((android.support.v4.app.Fragment) (obj)), "tabbed_search").commit();
            return;
        }
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            createFragmentForSearchResults();
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}
