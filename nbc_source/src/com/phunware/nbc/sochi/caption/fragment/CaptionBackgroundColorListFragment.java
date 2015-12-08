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
//            CaptionTextColorListFragment

public class CaptionBackgroundColorListFragment extends CaptionTextColorListFragment
{

    private static final String ARG_CURRENT_COLOR = "current_color";
    private CaptionColorAdapter mCaptionColorAdapter;
    private final boolean mIsTelemundo = "nbclive".equals("telemundo");

    public CaptionBackgroundColorListFragment()
    {
    }

    public static CaptionBackgroundColorListFragment getInstance(long l, String s)
    {
        CaptionBackgroundColorListFragment captionbackgroundcolorlistfragment = new CaptionBackgroundColorListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putString("current_color", s);
        captionbackgroundcolorlistfragment.setArguments(bundle);
        return captionbackgroundcolorlistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        if (mCaptionColorAdapter == null)
        {
            mCaptionColorAdapter = new CaptionColorAdapter(getActivity(), getActivity().getString(0x7f07007c));
        }
        return mCaptionColorAdapter;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = mCaptionColorAdapter.getItem(i - 1);
        view = new ContentValues();
        view.put("background_color", adapterview);
        if (mIsTelemundo)
        {
            view.put("background_esp_color", mCaptionColorAdapter.getTranslatedItem(i - 1));
        }
        persistChangesToCurrentStyle(view);
    }
}
