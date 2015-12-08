// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.details.EpisodeListFrag;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

class this._cls0
    implements android.view.ner
{

    final PlayerActivity this$0;

    public void onClick(View view)
    {
        if (destroyed())
        {
            return;
        }
        if (PlayerActivity.access$400(PlayerActivity.this) == null)
        {
            Log.e("PlayerActivity", "mPlayable is null!");
            return;
        }
        if (!PlayerActivity.access$400(PlayerActivity.this).isEpisode())
        {
            Log.e("PlayerActivity", "mPlayable is not episode detail!");
            return;
        } else
        {
            Log.d("PlayerActivity", "Start episodes dialog");
            stopScreenUpdateTask();
            view = EpisodeListFrag.create(PlayerActivity.access$400(PlayerActivity.this).getParentId(), PlayerActivity.access$400(PlayerActivity.this).getPlayableId(), false);
            view.onManagerReady(getServiceManager(), 0);
            view.setCancelable(true);
            showDialog(view);
            return;
        }
    }

    logFrag()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
