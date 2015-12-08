// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.TimeUtils;

public class EpisodeRowView extends RelativeLayout
    implements Checkable
{
    public static interface EpisodeRowListener
    {

        public abstract void onEpisodeSelectedForPlayback(EpisodeDetails episodedetails, PlayContext playcontext);
    }

    public static interface EpisodeRowListenerProvider
    {

        public abstract EpisodeRowListener getEpisodeRowListener();
    }


    private static final String TAG = "EpisodeRowView";
    private boolean checked;
    private boolean isCurrentEpisode;
    private ImageView playButton;
    private ProgressBar progressBar;
    private int progressVal;
    private TextView synopsis;
    private TextView title;

    public EpisodeRowView(Context context)
    {
        super(context);
        init();
    }

    public EpisodeRowView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public EpisodeRowView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private CharSequence createTitleText(int i, int j)
    {
        return createTitleText(i, getResources().getString(j));
    }

    private CharSequence createTitleText(int i, String s)
    {
        return getResources().getString(0x7f0c0180, new Object[] {
            Integer.valueOf(i), s
        });
    }

    private void init()
    {
        ((Activity)getContext()).getLayoutInflater().inflate(0x7f030029, this);
        setBackgroundResource(0x7f020161);
        title = (TextView)findViewById(0x7f070093);
        synopsis = (TextView)findViewById(0x7f070095);
        playButton = (ImageView)findViewById(0x7f070092);
        progressBar = (ProgressBar)findViewById(0x7f070094);
    }

    public void handleItemClick()
    {
        if (playButton != null)
        {
            playButton.performClick();
        }
    }

    public boolean isChecked()
    {
        return checked;
    }

    public void setChecked(boolean flag)
    {
        checked = flag;
        TextView textview = synopsis;
        int i;
        if (flag && StringUtils.isNotEmpty(synopsis.getText().toString()))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        if (progressVal <= 0)
        {
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setVisibility(0);
        if (isCurrentEpisode)
        {
            progressBar.setProgress(progressVal);
            progressBar.setSecondaryProgress(0);
            return;
        } else
        {
            progressBar.setProgress(0);
            progressBar.setSecondaryProgress(progressVal);
            return;
        }
    }

    public void toggle()
    {
        boolean flag;
        if (!checked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    public void updateToEpisode(final EpisodeDetails episode, boolean flag)
    {
        isCurrentEpisode = flag;
        setContentDescription(String.format(getResources().getString(0x7f0c014b), new Object[] {
            Integer.valueOf(episode.getEpisodeNumber()), episode.getTitle(), episode.getSynopsis(), Integer.valueOf(TimeUtils.convertSecondsToMinutes(episode.getRuntime()))
        }));
        title.setText(createTitleText(episode.getEpisodeNumber(), episode.getTitle()));
        title.setClickable(false);
        synopsis.setText(episode.getSynopsis());
        synopsis.setVisibility(8);
        int i = Math.max(0, episode.getBookmarkPosition());
        if (episode.getRuntime() > 0)
        {
            i = (i * 100) / episode.getRuntime();
        } else
        {
            i = 0;
        }
        progressVal = i;
        playButton.setVisibility(0);
        playButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EpisodeRowView this$0;
            final EpisodeDetails val$episode;

            public void onClick(View view)
            {
                if (getContext() instanceof EpisodeRowListenerProvider)
                {
                    EpisodeRowListener episoderowlistener = ((EpisodeRowListenerProvider)getContext()).getEpisodeRowListener();
                    if (episoderowlistener != null)
                    {
                        view = PlayContext.EMPTY_CONTEXT;
                        if (getContext() instanceof PlayContextProvider)
                        {
                            view = ((PlayContextProvider)getContext()).getPlayContext();
                        }
                        episoderowlistener.onEpisodeSelectedForPlayback(episode, view);
                        return;
                    } else
                    {
                        Log.w("EpisodeRowView", (new StringBuilder()).append("No EpisodeRowListener provided: ").append(getContext()).toString());
                        return;
                    }
                } else
                {
                    Log.w("EpisodeRowView", (new StringBuilder()).append("Context is not an EpisodeRowListenerProvider, context: ").append(getContext()).toString());
                    return;
                }
            }

            
            {
                this$0 = EpisodeRowView.this;
                episode = episodedetails;
                super();
            }
        });
        setChecked(true);
    }

    public void updateToErrorState(int i, final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback callback)
    {
        i++;
        setContentDescription(String.format(getResources().getString(0x7f0c014a), new Object[] {
            Integer.valueOf(i)
        }));
        title.setText(createTitleText(i, 0x7f0c0073));
        title.setClickable(true);
        title.setOnClickListener(new android.view.View.OnClickListener() {

            final EpisodeRowView this$0;
            final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback val$callback;

            public void onClick(View view)
            {
                callback.onRetryRequested();
            }

            
            {
                this$0 = EpisodeRowView.this;
                callback = callback1;
                super();
            }
        });
        synopsis.setText("");
        synopsis.setVisibility(8);
        setChecked(false);
    }

    public void updateToLoadingState(int i)
    {
        i++;
        setContentDescription(String.format(getResources().getString(0x7f0c0149), new Object[] {
            Integer.valueOf(i)
        }));
        title.setText(createTitleText(i, 0x7f0c013a));
        title.setClickable(false);
        synopsis.setText("");
        synopsis.setVisibility(8);
        setChecked(false);
    }
}
