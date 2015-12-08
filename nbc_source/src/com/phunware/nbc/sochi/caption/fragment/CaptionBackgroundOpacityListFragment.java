// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.phunware.nbc.sochi.caption.adapter.CaptionBackgroundOpacityAdapter;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            AbsCaptionSetupListFragment

public class CaptionBackgroundOpacityListFragment extends AbsCaptionSetupListFragment
{

    protected static final String ARG_CURRENT_OPACITY = "current_opacity";
    private CaptionBackgroundOpacityAdapter mAdapter;

    public CaptionBackgroundOpacityListFragment()
    {
    }

    public static CaptionBackgroundOpacityListFragment getInstance(long l, int i)
    {
        CaptionBackgroundOpacityListFragment captionbackgroundopacitylistfragment = new CaptionBackgroundOpacityListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putInt("current_opacity", i);
        captionbackgroundopacitylistfragment.setArguments(bundle);
        return captionbackgroundopacitylistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        if (mAdapter == null)
        {
            mAdapter = new CaptionBackgroundOpacityAdapter(getActivity(), 50);
        }
        return mAdapter;
    }

    protected int getCheckedStyleItem()
    {
        int j = 1;
        int ai[] = ((CaptionBackgroundOpacityAdapter)getAdapter()).getItems();
        int k = ai.length;
        int i = 0;
        do
        {
            if (i >= k || ai[i] == getArguments().getInt("current_opacity"))
            {
                return j;
            }
            j++;
            i++;
        } while (true);
    }

    protected String getFragmentTitle()
    {
        return getString(0x7f0700a8);
    }

    public void onStyleOptionClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Integer)adapterview.getItemAtPosition(i);
        view = new ContentValues();
        view.put("background_opacity", adapterview);
        persistChangesToCurrentStyle(view);
    }
}
