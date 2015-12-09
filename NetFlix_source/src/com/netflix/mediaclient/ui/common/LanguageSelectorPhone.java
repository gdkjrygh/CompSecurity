// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

public final class LanguageSelectorPhone extends LanguageSelector
    implements android.widget.TabHost.OnTabChangeListener
{

    private static final String LIST_AUDIOS_TAB_TAG = "ListAudios";
    private static final String LIST_SUBTITLES_TAB_TAG = "ListSubtitles";
    protected TextView mAudioTabLabel;
    protected TextView mSubtitleTabLabel;
    protected TabHost mTabHost;

    public LanguageSelectorPhone(NetflixActivity netflixactivity, LanguageSelector.LanguageSelectorCallback languageselectorcallback)
    {
        super(netflixactivity, languageselectorcallback);
    }

    private int calculateMaxNumberOfItems()
    {
        Language language;
        int j;
        j = 0;
        language = getLanguage();
        if (language != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        if (language.getAltAudios() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (language.getSubtitles() != null)
        {
            return language.getSubtitles().length;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (language.getSubtitles() == null)
        {
            return language.getAltAudios().length;
        }
        Log.d("nf_language_selector", "Calculate maximal item number");
        if (language.getAltAudios().length >= language.getSubtitles().length)
        {
            if (Log.isLoggable("nf_language_selector", 3))
            {
                Log.d("nf_language_selector", (new StringBuilder()).append("More audios, max number of items: ").append(language.getAltAudios().length).toString());
            }
            return language.getAltAudios().length;
        }
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("More subtitles,  audos: ").append(language.getAltAudios().length).append(" < subtitles ").append(language.getSubtitles().length).append(". Check dependencies.").toString());
        }
        int i = language.getAltAudios().length;
        for (j = 0; j < language.getAltAudios().length;)
        {
            int l = language.getSubtitles().length - language.getAltAudios()[j].getDisallowedSubtitles().length;
            int k = i;
            if (i < l)
            {
                k = l;
            }
            j++;
            i = k;
        }

        j = i;
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Max number of items: ").append(i).toString());
            return i;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private View getTabIndicator(Context context, TabHost tabhost, int i, boolean flag)
    {
        context = LayoutInflater.from(context).inflate(0x7f030042, null, false);
        tabhost = (TextView)context.findViewById(0x7f0700e9);
        tabhost.setText(i);
        if (flag)
        {
            Log.d("nf_language_selector", "Set audio tab label");
            mAudioTabLabel = tabhost;
            return context;
        } else
        {
            Log.d("nf_language_selector", "Set subtitle tab label");
            mSubtitleTabLabel = tabhost;
            return context;
        }
    }

    private void setNewTab(Context context, TabHost tabhost, String s, int i, int j, boolean flag)
    {
        context = tabhost.newTabSpec(s);
        context.setIndicator(getTabIndicator(tabhost.getContext(), tabhost, i, flag));
        context.setContent(j);
        tabhost.addTab(context);
    }

    protected int calculateListViewHeight()
    {
        Log.d("nf_language_selector", "Phone calculate height");
        int l = (int)mController.getResources().getDimension(0x7f0a0048);
        int j = (int)mController.getResources().getDimension(0x7f0a0047);
        int i1 = (int)mController.getResources().getDimension(0x7f0a0060);
        int k = mController.getResources().getDrawable(0x7f0200fa).getIntrinsicHeight();
        int i = k;
        if (k == -1)
        {
            i = (int)mController.getResources().getDimension(0x7f0a0061);
        }
        i = calculateMaxNumberOfItems() * (i1 + i);
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Max height ").append(j).append(" px, item height ").append(i1).append(" px, proposed list height ").append(i).append(" px, item divider height").append(" px").toString());
        }
        if (i <= l)
        {
            return l;
        }
        if (i >= j)
        {
            i = j;
        }
        return i;
    }

    protected int getDialogLayoutId()
    {
        Log.d("nf_language_selector", "Phone R.layout.language_selector_dialog");
        return 0x7f030040;
    }

    protected void init(View view, Language language)
    {
        super.init(view, language);
        Log.d("nf_language_selector", "Add tabhost");
        mTabHost = (TabHost)view.findViewById(0x7f0700e4);
        mTabHost.setOnTabChangedListener(this);
        mTabHost.setup();
        setNewTab(mController, mTabHost, "ListAudios", 0x7f0c0104, 0x7f0700e5, true);
        setNewTab(mController, mTabHost, "ListSubtitles", 0x7f0c0103, 0x7f0700e6, false);
        mTabHost.setCurrentTab(0);
        mAudioTabLabel.setTypeface(mAudioTabLabel.getTypeface(), 1);
        mSubtitleTabLabel.setTypeface(mSubtitleTabLabel.getTypeface(), 0);
        Log.d("nf_language_selector", "Done with tabhost");
    }

    public void onTabChanged(String s)
    {
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Switched to ").append(s).toString());
        }
        if ("ListAudios".equals(s))
        {
            if (mAudioTabLabel != null)
            {
                mAudioTabLabel.setTypeface(mAudioTabLabel.getTypeface(), 1);
            } else
            {
                Log.d("nf_language_selector", "audio label is NULL!");
            }
            if (mSubtitleTabLabel != null)
            {
                mSubtitleTabLabel.setTypeface(mSubtitleTabLabel.getTypeface(), 0);
                return;
            } else
            {
                Log.d("nf_language_selector", "subtitle label is NULL!");
                return;
            }
        }
        if (mAudioTabLabel != null)
        {
            mAudioTabLabel.setTypeface(mAudioTabLabel.getTypeface(), 0);
        } else
        {
            Log.d("nf_language_selector", "audio label is NULL!");
        }
        if (mSubtitleTabLabel != null)
        {
            mSubtitleTabLabel.setTypeface(mSubtitleTabLabel.getTypeface(), 1);
            return;
        } else
        {
            Log.d("nf_language_selector", "subtitle label is NULL!");
            return;
        }
    }
}
