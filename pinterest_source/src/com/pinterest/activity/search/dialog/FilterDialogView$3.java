// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.pinterest.activity.search.adapter.ActionFilterAdapter;

// Referenced classes of package com.pinterest.activity.search.dialog:
//            FilterDialogView

class this._cls0
    implements android.widget.lickListener
{

    final FilterDialogView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = _optionsLv.getHeaderViewsCount();
        if (i >= j && j > 0)
        {
            FilterDialogView.access$300(FilterDialogView.this, FilterDialogView.access$200(FilterDialogView.this).getItem(i - j));
            return;
        } else
        {
            FilterDialogView.access$300(FilterDialogView.this, FilterDialogView.access$200(FilterDialogView.this).getItem(i));
            return;
        }
    }

    r()
    {
        this$0 = FilterDialogView.this;
        super();
    }
}
