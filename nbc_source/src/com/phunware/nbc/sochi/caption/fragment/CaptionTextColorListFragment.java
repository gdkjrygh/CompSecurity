// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.phunware.nbc.sochi.caption.adapter.CaptionColorAdapter;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            AbsCaptionSetupListFragment

public class CaptionTextColorListFragment extends AbsCaptionSetupListFragment
{

    private static final String ARG_CURRENT_COLOR = "current_color";
    private CaptionColorAdapter mCaptionColorAdapter;
    private final boolean mIsTelemundo = "nbclive".equals("telemundo");

    public CaptionTextColorListFragment()
    {
    }

    public static CaptionTextColorListFragment getInstance(long l, String s)
    {
        CaptionTextColorListFragment captiontextcolorlistfragment = new CaptionTextColorListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putString("current_color", s);
        captiontextcolorlistfragment.setArguments(bundle);
        return captiontextcolorlistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        if (mCaptionColorAdapter == null)
        {
            mCaptionColorAdapter = new CaptionColorAdapter(getActivity(), getActivity().getString(0x7f070071));
        }
        return mCaptionColorAdapter;
    }

    protected int getCheckedStyleItem()
    {
        int j = 1;
        String as[] = ((CaptionColorAdapter)getAdapter()).getItems();
        int k = as.length;
        int i = 0;
        do
        {
            if (i >= k || as[i].equalsIgnoreCase(getArguments().getString("current_color")))
            {
                return j;
            }
            j++;
            i++;
        } while (true);
    }

    protected String getFragmentTitle()
    {
        return getString(0x7f0700a5);
    }

    public void onStyleOptionClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = mCaptionColorAdapter.getItem(i - 1);
        view = new ContentValues();
        view.put("text_color", adapterview);
        if (mIsTelemundo)
        {
            view.put("text_esp_color", mCaptionColorAdapter.getTranslatedItem(i - 1));
        }
        persistChangesToCurrentStyle(view);
    }
}
