// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.explore.adapter.ExploreSubInterestsAdapter;
import com.pinterest.api.model.Interest;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreInterestsListCell

class this._cls0
    implements android.widget.ener
{

    final ExploreInterestsListCell this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Interest)((ExploreSubInterestsAdapter)adapterview.getAdapter()).getItem(i);
        navigateToCategoryOrInterest(adapterview);
    }

    er()
    {
        this$0 = ExploreInterestsListCell.this;
        super();
    }
}
