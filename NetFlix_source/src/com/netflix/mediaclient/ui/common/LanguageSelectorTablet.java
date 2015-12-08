// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

final class LanguageSelectorTablet extends LanguageSelector
{

    public LanguageSelectorTablet(NetflixActivity netflixactivity, LanguageSelector.LanguageSelectorCallback languageselectorcallback)
    {
        super(netflixactivity, languageselectorcallback);
    }

    protected int calculateListViewHeight()
    {
        Log.d("nf_language_selector", "Tablet calculate height");
        int l = (int)mController.getResources().getDimension(0x7f0a0048);
        int j = (int)mController.getResources().getDimension(0x7f0a0047);
        int i1 = (int)mController.getResources().getDimension(0x7f0a0060);
        int k = mController.getResources().getDrawable(0x7f0200fa).getIntrinsicHeight();
        int i = k;
        if (k == -1)
        {
            i = (int)mController.getResources().getDimension(0x7f0a0061);
        }
        Language language = getLanguage();
        if (language == null)
        {
            i = 0;
        } else
        {
            i = Math.max(language.getAltAudios().length, language.getSubtitles().length + 1) * (i1 + i);
        }
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
        Log.d("nf_language_selector", "R.layout.language_selector_tablet_dialog");
        return 0x7f030043;
    }
}
