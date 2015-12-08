// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.search.ui.GuidedSearchFilterHeader;

// Referenced classes of package com.pinterest.activity.search.dialog:
//            FilterDialogView

class this._cls0
    implements android.widget.lickListener
{

    final FilterDialogView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        FilterDialogView.access$300(FilterDialogView.this, FilterDialogView.access$400(FilterDialogView.this).getItem(i));
    }

    r()
    {
        this$0 = FilterDialogView.this;
        super();
    }
}
