// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.inject.LifecycleSupport;
import java.util.LinkedList;

// Referenced classes of package com.skype.android.app.dialer:
//            CountriesAdapter

public class SelectCountryActivity extends SkypeActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    public static final String COUNTRY_LIST_ITEM = "country_list_item";
    public static final String EXTRA_SELECTION = "selection";
    public static final String EXTRA_SHOW_CODES = "showCodes";
    public static final String EXTRA_STYLE = "style";
    public static final int EXTRA_STYLE_BLUE = 0x7f090121;
    public static final int EXTRA_STYLE_DEFAULT = 0x7f090038;
    private static final int MAX_RECENT_ITEMS = 5;
    private static final int NO_CODE = -1;
    ActionBarCustomizer actionBarCustomizer;
    CountriesAdapter adapter;
    ListView listView;
    private LinkedList recentCountries;
    UserPreferences userPrefs;

    public SelectCountryActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Intent intent = getIntent();
        boolean flag = intent.getBooleanExtra("showCodes", true);
        int i = intent.getIntExtra("style", 0x7f090038);
        int k = intent.getIntExtra("selection", -1);
        setTheme(i);
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitle(0x7f080270);
        getSupportActionBar().b(true);
        listView.setOnItemClickListener(this);
        recentCountries = userPrefs.getRecentCountryCodes();
        adapter.setShowCodes(flag);
        adapter.setRecents(recentCountries);
        listView.setAdapter(adapter);
        if (k != -1)
        {
            int j = adapter.getItemPositionByCountryCodeIndex(k);
            listView.setSelection(j);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        byte byte0 = 5;
        adapterview = adapter.getItem(i);
        if (((CountriesAdapter.a) (adapterview)).type == 2)
        {
            recentCountries.remove(((CountriesAdapter.a) (adapterview)).isoCode);
            recentCountries.addFirst(((CountriesAdapter.a) (adapterview)).isoCode);
            i = byte0;
            if (recentCountries.size() <= 5)
            {
                i = recentCountries.size();
            }
            userPrefs.setRecentCountryCodes(recentCountries.subList(0, i));
            view = new Intent();
            view.putExtra("country_list_item", ((CountriesAdapter.a) (adapterview)).countryId);
            setResult(-1, view);
            finish();
        }
    }
}
