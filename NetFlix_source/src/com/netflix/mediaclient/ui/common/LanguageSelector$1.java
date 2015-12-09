// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

class btitleAdapter
    implements android.widget.lickListener
{

    final LanguageSelector this$0;
    final dioAdapter val$audioAdapter;
    final Language val$language;
    final btitleAdapter val$subtitleAdapter;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = val$audioAdapter.getItem(i);
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Audio selected on position ").append(i).append(", audio choosen: ").append(adapterview).toString());
        }
        if (val$language.getSelectedAudio() != adapterview)
        {
            Log.v("nf_language_selector", "Audio is changed, refresh both views");
            val$language.setSelectedAudio(adapterview);
            val$audioAdapter.notifyDataSetChanged();
            val$subtitleAdapter.notifyDataSetChanged();
            return;
        } else
        {
            Log.v("nf_language_selector", "Audio is not changed, do not refresh");
            return;
        }
    }

    btitleAdapter()
    {
        this$0 = final_languageselector;
        val$audioAdapter = dioadapter;
        val$language = language1;
        val$subtitleAdapter = btitleAdapter.this;
        super();
    }
}
