// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.activities:
//            MainActivity, ab, ac, ad, 
//            ae

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, MainActivity mainactivity, Object obj)
    {
        mainactivity.mDrawerLayout = (DrawerLayout)jector.((View)jector.iredView(obj, 0x7f0e0163, "field 'mDrawerLayout'"), 0x7f0e0163, "field 'mDrawerLayout'");
        mainactivity.sDepartmentListView = (ListView)jector.((View)jector.iredView(obj, 0x7f0e0168, "field 'sDepartmentListView'"), 0x7f0e0168, "field 'sDepartmentListView'");
        mainactivity.mDrawerList = (ListView)jector.((View)jector.iredView(obj, 0x7f0e0169, "field 'mDrawerList'"), 0x7f0e0169, "field 'mDrawerList'");
        mainactivity.mSlideMenuRootLayout = (LinearLayout)jector.((View)jector.iredView(obj, 0x7f0e0167, "field 'mSlideMenuRootLayout'"), 0x7f0e0167, "field 'mSlideMenuRootLayout'");
        mainactivity.mSearchSuggestionLayout = (LinearLayout)jector.((View)jector.iredView(obj, 0x7f0e0457, "field 'mSearchSuggestionLayout'"), 0x7f0e0457, "field 'mSearchSuggestionLayout'");
        mainactivity.mSearchLayout = (LinearLayout)jector.((View)jector.iredView(obj, 0x7f0e045b, "field 'mSearchLayout'"), 0x7f0e045b, "field 'mSearchLayout'");
        mainactivity.mSearchSuggestionsListView = (ListView)jector.((View)jector.iredView(obj, 0x7f0e045a, "field 'mSearchSuggestionsListView'"), 0x7f0e045a, "field 'mSearchSuggestionsListView'");
        mainactivity.mSearchEditText = (EditText)jector.((View)jector.iredView(obj, 0x7f0e0458, "field 'mSearchEditText'"), 0x7f0e0458, "field 'mSearchEditText'");
        View view = (View)jector.iredView(obj, 0x7f0e045d, "field 'mSearchTextView' and method 'onSearchClick'");
        mainactivity.mSearchTextView = (TextView)jector.(view, 0x7f0e045d, "field 'mSearchTextView'");
        view.setOnClickListener(new ab(this, mainactivity));
        view = (View)jector.iredView(obj, 0x7f0e045e, "field 'mScan' and method 'onScanClick'");
        mainactivity.mScan = (ImageView)jector.(view, 0x7f0e045e, "field 'mScan'");
        view.setOnClickListener(new ac(this, mainactivity));
        mainactivity.mSearchInclude = (RelativeLayout)jector.((View)jector.iredView(obj, 0x7f0e0164, "field 'mSearchInclude'"), 0x7f0e0164, "field 'mSearchInclude'");
        ((View)jector.iredView(obj, 0x7f0e0459, "method 'onSearchClearIconClick'")).setOnClickListener(new ad(this, mainactivity));
        ((View)jector.iredView(obj, 0x7f0e045c, "method 'onSearchClick'")).setOnClickListener(new ae(this, mainactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (MainActivity)obj, obj1);
    }

    public void reset(MainActivity mainactivity)
    {
        mainactivity.mDrawerLayout = null;
        mainactivity.sDepartmentListView = null;
        mainactivity.mDrawerList = null;
        mainactivity.mSlideMenuRootLayout = null;
        mainactivity.mSearchSuggestionLayout = null;
        mainactivity.mSearchLayout = null;
        mainactivity.mSearchSuggestionsListView = null;
        mainactivity.mSearchEditText = null;
        mainactivity.mSearchTextView = null;
        mainactivity.mScan = null;
        mainactivity.mSearchInclude = null;
    }

    public volatile void reset(Object obj)
    {
        reset((MainActivity)obj);
    }

    public ()
    {
    }
}
