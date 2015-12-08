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

public class CaptionTextSizeListFragment extends AbsCaptionSetupListFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String ARG_CURRENT_SIZE = "current_size";

    public CaptionTextSizeListFragment()
    {
    }

    public static CaptionTextSizeListFragment getInstance(long l, int i)
    {
        CaptionTextSizeListFragment captiontextsizelistfragment = new CaptionTextSizeListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putInt("current_size", i);
        captiontextsizelistfragment.setArguments(bundle);
        return captiontextsizelistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        String as[] = getResources().getStringArray(0x7f0d0003);
        return new ArrayAdapter(getActivity(), 0x109000f, as);
    }

    protected int getCheckedStyleItem()
    {
        return getArguments().getInt("current_size") + 1;
    }

    protected String getFragmentTitle()
    {
        return getString(0x7f0700a9);
    }

    public void onStyleOptionClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new ContentValues();
        adapterview.put("text_size", Integer.valueOf(i - 1));
        persistChangesToCurrentStyle(adapterview);
    }
}
