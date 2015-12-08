// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.InterestsGridAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.HashMap;

public class InterestsFragment extends PinterestGridFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    public InterestsFragment()
    {
        _layoutId = 0x7f0300d8;
        _adapter = new InterestsGridAdapter();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (_adapter != null)
        {
            if ((adapterview = (Interest)((InterestsGridAdapter)_adapter).getItem(i)) != null)
            {
                view = new HashMap();
                view.put("interest", adapterview.getUrlName());
                Pinalytics.a(ElementType.FLOWED_INTEREST, view);
                StopWatch.get().start("interest_ttrfp");
                Events.post(new Navigation(Location.INTEREST, adapterview));
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(this);
    }
}
