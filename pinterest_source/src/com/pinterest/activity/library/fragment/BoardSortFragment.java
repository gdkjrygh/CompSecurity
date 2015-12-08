// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

public class BoardSortFragment extends BaseFragment
{

    private String _currentSortOrder;
    TextView _sortOptionAlphabetical;
    TextView _sortOptionRecency;

    public BoardSortFragment()
    {
        _layoutId = 0x7f03002f;
    }

    private void updateSortOptions()
    {
        String s;
        byte byte0;
        if (_sortOptionAlphabetical == null || _sortOptionRecency == null)
        {
            return;
        }
        _sortOptionAlphabetical.setTextColor(getResources().getColor(0x7f0e006d));
        _sortOptionRecency.setTextColor(getResources().getColor(0x7f0e006d));
        s = _currentSortOrder;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 84
    //                   639348664: 126
    //                   848460249: 140;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_140;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            _sortOptionAlphabetical.setTextColor(getResources().getColor(0x7f0e0024));
            return;

        case 1: // '\001'
            _sortOptionRecency.setTextColor(getResources().getColor(0x7f0e0024));
            break;
        }
        break MISSING_BLOCK_LABEL_170;
_L2:
        if (s.equals("alphabetical"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("last_pinned_to"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(_layoutId, viewgroup, false);
        ButterKnife.a(this, layoutinflater);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        updateSortOptions();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _currentSortOrder = (String)navigation.getExtra("com.pinterest.EXTRA_SORT_ORDER");
            return;
        }
    }

    public void sortByAlphabetical()
    {
        Pinalytics.a(ElementType.LIBRARY_SORT_BOARDS_OPTION_CHANGED);
        Events.post(new com.pinterest.activity.library.model.LibraryFeed.SortEvent("alphabetical"));
        getActivity().onBackPressed();
    }

    public void sortByRecency()
    {
        Pinalytics.a(ElementType.LIBRARY_SORT_BOARDS_OPTION_CHANGED);
        Events.post(new com.pinterest.activity.library.model.LibraryFeed.SortEvent("last_pinned_to"));
        getActivity().onBackPressed();
    }
}
