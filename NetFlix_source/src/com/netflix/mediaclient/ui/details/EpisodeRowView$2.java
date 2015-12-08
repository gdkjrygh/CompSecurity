// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextProvider;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeRowView

class val.episode
    implements android.view.ner
{

    final EpisodeRowView this$0;
    final EpisodeDetails val$episode;

    public void onClick(View view)
    {
        if (getContext() instanceof isodeRowListenerProvider)
        {
            isodeRowListener isoderowlistener = ((isodeRowListenerProvider)getContext()).getEpisodeRowListener();
            if (isoderowlistener != null)
            {
                view = PlayContext.EMPTY_CONTEXT;
                if (getContext() instanceof PlayContextProvider)
                {
                    view = ((PlayContextProvider)getContext()).getPlayContext();
                }
                isoderowlistener.onEpisodeSelectedForPlayback(val$episode, view);
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

    isodeRowListener()
    {
        this$0 = final_episoderowview;
        val$episode = EpisodeDetails.this;
        super();
    }
}
