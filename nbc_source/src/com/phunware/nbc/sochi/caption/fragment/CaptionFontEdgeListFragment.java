// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.ContentValues;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            AbsCaptionSetupListFragment

public class CaptionFontEdgeListFragment extends AbsCaptionSetupListFragment
{

    private static final String ARG_CURRENT_FONT_EDGE = "current_font_edge";

    public CaptionFontEdgeListFragment()
    {
    }

    public static CaptionFontEdgeListFragment getInstance(long l, String s)
    {
        CaptionFontEdgeListFragment captionfontedgelistfragment = new CaptionFontEdgeListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putString("current_font_edge", s);
        captionfontedgelistfragment.setArguments(bundle);
        return captionfontedgelistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        String as[] = getResources().getStringArray(0x7f0d0002);
        return new ArrayAdapter(getActivity(), 0x109000f, as);
    }

    protected int getCheckedStyleItem()
    {
        int j = 1;
        String as[] = getResources().getStringArray(0x7f0d0002);
        int k = as.length;
        int i = 0;
        do
        {
            if (i >= k || as[i].equalsIgnoreCase(getArguments().getString("current_font_edge")))
            {
                return j;
            }
            j++;
            i++;
        } while (true);
    }

    protected String getFragmentTitle()
    {
        return getString(0x7f0700a7);
    }

    public void onStyleOptionClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)adapterview.getItemAtPosition(i);
        view = new ContentValues();
        view.put("text_edge", adapterview);
        persistChangesToCurrentStyle(view);
    }
}
