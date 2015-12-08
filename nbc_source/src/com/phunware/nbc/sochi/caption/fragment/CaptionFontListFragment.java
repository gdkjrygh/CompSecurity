// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            AbsCaptionSetupListFragment

public class CaptionFontListFragment extends AbsCaptionSetupListFragment
    implements android.widget.AdapterView.OnItemClickListener
{
    public static class FontArrayAdapter extends ArrayAdapter
    {

        private final CaptionPreviewHelper captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
        private final int mDefaultPos = 0;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = (CheckedTextView)super.getView(i, view, viewgroup);
            viewgroup = getContext().getResources().getStringArray(0x7f0d0005)[i];
            NBCSystem.debugLog("CaptionFontListFragment", (new StringBuilder()).append("fontName: ").append(viewgroup).toString());
            android.graphics.Typeface typeface = captionPreviewHelper.getTypeFaceForName(getContext(), viewgroup);
            if (typeface != null)
            {
                view.setTypeface(typeface);
                if (i == 0)
                {
                    view.setText(getContext().getString(0x7f07007b, new Object[] {
                        viewgroup
                    }));
                }
            }
            return view;
        }

        public FontArrayAdapter(Context context, int i, String as[])
        {
            super(context, i, as);
        }
    }


    private static final String ARG_CURRENT_FONT = "current_font";
    private static final String TAG = "CaptionFontListFragment";
    private CaptionPreviewHelper captionPreviewHelper;

    public CaptionFontListFragment()
    {
    }

    public static CaptionFontListFragment getInstance(long l, String s)
    {
        CaptionFontListFragment captionfontlistfragment = new CaptionFontListFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("style_id", l);
        bundle.putString("current_font", s);
        captionfontlistfragment.setArguments(bundle);
        return captionfontlistfragment;
    }

    protected BaseAdapter getAdapter()
    {
        return new FontArrayAdapter(getActivity(), 0x109000f, getResources().getStringArray(0x7f0d0005));
    }

    protected int getCheckedStyleItem()
    {
        int j = 1;
        String as[] = getResources().getStringArray(0x7f0d0005);
        int k = as.length;
        int i = 0;
        do
        {
            if (i >= k || as[i].equalsIgnoreCase(getArguments().getString("current_font")))
            {
                return j;
            }
            j++;
            i++;
        } while (true);
    }

    protected String getFragmentTitle()
    {
        return getString(0x7f0700a6);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    }

    public void onStyleOptionClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)adapterview.getItemAtPosition(i);
        view = new ContentValues();
        view.put("font", adapterview);
        persistChangesToCurrentStyle(view);
    }
}
