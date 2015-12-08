// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.SearchActionBar;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchActivity

class this._cls0
    implements android.widget.yTextListener
{

    final SearchActivity this$0;

    public boolean onQueryTextChange(String s)
    {
        SearchActivity.access$400(SearchActivity.this, s);
        return true;
    }

    public boolean onQueryTextSubmit(String s)
    {
        Log.v("SearchActivity", (new StringBuilder()).append("onQueryTextSubmit: ").append(s).toString());
        SearchActivity.access$100(SearchActivity.this).clearFocus();
        DeviceUtils.hideSoftKeyboard(SearchActivity.this);
        return true;
    }

    Bar()
    {
        this$0 = SearchActivity.this;
        super();
    }
}
