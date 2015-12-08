// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class this._cls0
    implements android.widget.ItemSelectedListener
{

    final SearchView this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        SearchView.access$1900(SearchView.this, i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    dListener()
    {
        this$0 = SearchView.this;
        super();
    }
}
