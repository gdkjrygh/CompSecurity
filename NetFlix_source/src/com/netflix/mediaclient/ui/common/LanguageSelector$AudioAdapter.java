// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

public class language extends BaseAdapter
{

    private final Language language;
    final LanguageSelector this$0;

    public int getCount()
    {
        return language.getAltAudios().length;
    }

    public AudioSource getItem(int i)
    {
        return language.getAltAudios()[i];
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Audio create row ").append(i).toString());
            view1 = mController.getLayoutInflater().inflate(0x7f030041, viewgroup, false);
            view1.setTag(new it>(view1));
        }
        view = (it>)view1.getTag();
        viewgroup = getItem(i);
        boolean flag = viewgroup.equals(language.getSelectedAudio());
        ((language) (view)).e.setText(viewgroup.getLanguageDescription());
        (() (view)).ice.setChecked(flag);
        if (flag)
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Audio is selected ").append(viewgroup).toString());
            view1.setBackgroundColor(mSelectedRowColor);
            return view1;
        } else
        {
            view1.setBackgroundColor(mRowColor);
            return view1;
        }
    }

    public (Language language1)
    {
        this$0 = LanguageSelector.this;
        super();
        language = language1;
    }
}
