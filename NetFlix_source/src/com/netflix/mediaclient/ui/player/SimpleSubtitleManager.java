// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            SubtitleManager, PlayerActivity, PlayScreen

public final class SimpleSubtitleManager
    implements SubtitleManager
{

    private static final String TAG = "nf_subtitles";
    private final PlayerActivity mActivity;
    private final PlayScreen mScreen;
    private final View mSubtitleArea;
    private final TextView mSubtitleLabel;

    SimpleSubtitleManager(PlayerActivity playeractivity)
    {
        Log.d("nf_subtitles", "SimpleSubtitleManager created");
        mActivity = playeractivity;
        mScreen = mActivity.getScreen();
        if (mScreen == null)
        {
            throw new IllegalArgumentException("Player screen is not initialized!");
        } else
        {
            mSubtitleArea = playeractivity.findViewById(0x7f07014f);
            mSubtitleLabel = (TextView)playeractivity.findViewById(0x7f0700eb);
            return;
        }
    }

    public void clear()
    {
        Log.v("nf_subtitles", "NOOP");
    }

    public void clearPendingUpdates()
    {
        Log.v("nf_subtitles", "NOOP");
    }

    public void onSubtitleChange(SubtitleScreen subtitlescreen)
    {
        Log.w("nf_subtitles", "SimpleSubtitleManager does not implement onSubtitleChange!");
    }

    public void onSubtitleRemove()
    {
        Log.d("nf_subtitles", "Set subtitle to empty text to remove them");
        onSubtitleShow("");
    }

    public void onSubtitleShow(String s)
    {
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Set subtitle to : ").append(s).toString());
        }
        Language language = mActivity.getLanguage();
        if (language != null && language.isSubtitleVisible())
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Subtitle is visible : ").append(language.isSubtitleVisible()).toString());
            }
            setSubtitleVisibility(true);
        }
        if (mSubtitleLabel != null)
        {
            s = Html.fromHtml(s);
            mSubtitleLabel.setText(s, android.widget.TextView.BufferType.SPANNABLE);
        }
    }

    public void setSubtitleVisibility(boolean flag)
    {
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("setSubtitleVisibility to ").append(flag).toString());
        }
        if (mSubtitleArea != null)
        {
            if (flag)
            {
                Log.w("nf_subtitles", "subtitle area should be visible");
                mSubtitleArea.setVisibility(0);
                return;
            } else
            {
                Log.w("nf_subtitles", "subtitle area should be gone");
                mSubtitleArea.setVisibility(8);
                return;
            }
        } else
        {
            Log.w("nf_subtitles", "subtitle area is NULL?!");
            return;
        }
    }
}
