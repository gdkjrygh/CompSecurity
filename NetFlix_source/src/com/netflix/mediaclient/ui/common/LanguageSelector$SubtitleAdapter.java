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
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.Subtitle;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

public class language extends BaseAdapter
{

    private final Language language;
    final LanguageSelector this$0;

    public int getCount()
    {
        return language.getUsedSubtitles().size();
    }

    public Subtitle getItem(int i)
    {
        return (Subtitle)language.getUsedSubtitles().get(i);
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
        boolean flag = false;
        View view1 = view;
        if (view == null)
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Subtitle create row ").append(i).toString());
            view1 = mController.getLayoutInflater().inflate(0x7f030041, viewgroup, false);
            view1.setTag(new (view1));
        }
        getItem getitem = ()view1.getTag();
        Subtitle subtitle = getItem(i);
        view = language.getSelectedSubtitle();
        if (LanguageSelector.access$200(LanguageSelector.this, language, i, subtitle))
        {
            Log.d("nf_language_selector", "Previously selected subtitle is not allowed anymore, reset to first on list, reload seleted subtitle");
            view = language.getSelectedSubtitle();
        }
        if (subtitle != null)
        {
            viewgroup = new StringBuilder(subtitle.getLanguageDescription());
            if (subtitle.isCC())
            {
                Log.d("nf_language_selector", "Add CC");
                viewgroup.append(' ');
                viewgroup.append(mController.getText(0x7f0c010c));
            }
            viewgroup = viewgroup.toString();
            flag = subtitle.equals(view);
            view = viewgroup;
        } else
        {
            viewgroup = mController.getString(0x7f0c0105);
            if (view == null)
            {
                flag = true;
            }
            view = viewgroup;
        }
        getitem.language.setText(view);
        getitem..setChecked(flag);
        if (flag)
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Subtitle is selected ").append(subtitle).toString());
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
