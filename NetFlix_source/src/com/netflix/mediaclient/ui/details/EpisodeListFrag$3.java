// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ListView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.SeasonDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag, SeasonsSpinner, EpisodeListAdapter

class this._cls0 extends BroadcastReceiver
{

    final EpisodeListFrag this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!EpisodeListFrag.access$600(EpisodeListFrag.this))
        {
            context = intent.getAction();
            Log.v("EpisodeListFrag", (new StringBuilder()).append("receiver inovoked, action: ").append(context).toString());
            if ("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH".equals(context))
            {
                int j = intent.getIntExtra("curSeasonNumber", 1) - 1;
                int i = EpisodeListFrag.access$000(EpisodeListFrag.this).getSelectedItemPosition();
                if (j != i)
                {
                    Log.v("EpisodeListFrag", (new StringBuilder()).append("Notification is for season ").append(j).append(" but spinner set to season ").append(i).toString());
                    return;
                } else
                {
                    int k = intent.getIntExtra("curEpisodeNumber", 1) - 1;
                    int l = k + EpisodeListFrag.access$700(EpisodeListFrag.this).getHeaderViewsCount();
                    Log.v("EpisodeListFrag", (new StringBuilder()).append("Episode index: ").append(k).append(", setting current episode to: ").append(l).toString());
                    EpisodeListFrag.access$700(EpisodeListFrag.this).setItemChecked(l, true);
                    context = (SeasonDetails)EpisodeListFrag.access$000(EpisodeListFrag.this).getItemAtPosition(i);
                    EpisodeListFrag.access$100(EpisodeListFrag.this).updateSeasonDetails(context);
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = EpisodeListFrag.this;
        super();
    }
}
