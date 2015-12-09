// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.MdxPostplayState;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxAgent

public static class ivity
{

    public static Intent createIntent(Activity activity, String s, String s1)
    {
        s = new Intent(s);
        s.setClass(activity, com/netflix/mediaclient/service/NetflixService);
        s.addCategory("com.netflix.mediaclient.intent.category.MDX");
        s.putExtra("uuid", s1);
        return s;
    }

    public static boolean isInPostPlay(Intent intent)
    {
        if (intent.hasExtra("postplayState"))
        {
            if (!StringUtils.isEmpty(intent = intent.getExtras().getString("postplayState")) && ((intent = new MdxPostplayState(intent)).isInCountdown() || intent.isInPrompt()))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean isSameAsCurrentlyPlaying(String s, String s1, com.netflix.mediaclient.util.eoIds eoids)
    {
        if (StringUtils.isEmpty(s1) && StringUtils.isNotEmpty(s) && eoids.catalogId == Integer.valueOf(s).intValue())
        {
            Log.v("nf_mdx_agent", "same movie");
            return true;
        }
        if (StringUtils.isNotEmpty(s1) && eoids.episodeId == Integer.valueOf(s1).intValue())
        {
            Log.v("nf_mdx_agent", "same show");
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean playVideo(NetflixActivity netflixactivity, Asset asset, boolean flag)
    {
        if (asset.isEpisode())
        {
            Log.d("nf_mdx_agent", "Playing episode");
            return playVideo(netflixactivity, asset.getParentId(), asset.getPlayableId(), asset.getTrackId(), asset.getPlaybackBookmark(), flag);
        } else
        {
            Log.d("nf_mdx_agent", "Playing movie");
            return playVideo(netflixactivity, asset.getPlayableId(), null, asset.getTrackId(), asset.getPlaybackBookmark(), flag);
        }
    }

    private static boolean playVideo(NetflixActivity netflixactivity, String s, String s1, int i, int j, boolean flag)
    {
        if (Log.isLoggable("nf_mdx_agent", 2))
        {
            Log.v("nf_mdx_agent", (new StringBuilder()).append("Starting playback movieId ").append(s).append(", epId ").append(s1).append(", trackId ").append(i).append(", bookmark ").append(j).toString());
        }
        Object obj = netflixactivity.getServiceManager();
        if (!ServiceManagerUtils.isMdxAgentAvailable(((ServiceManager) (obj))))
        {
            Log.w("nf_mdx_agent", "MDX agent not available - can't play video");
        } else
        {
            com.netflix.mediaclient.util.eoIds eoids = ((ServiceManager) (obj)).getMdx().getVideoIds();
            if (flag || eoids == null || !isSameAsCurrentlyPlaying(s, s1, eoids))
            {
                obj = ((ServiceManager) (obj)).getMdx().getCurrentTarget();
                Intent intent = createIntent(netflixactivity, "com.netflix.mediaclient.intent.action.MDX_PLAY_VIDEOIDS", ((String) (obj)));
                if (s != null)
                {
                    intent.putExtra("catalogId", Integer.parseInt(s));
                }
                if (s1 != null)
                {
                    intent.putExtra("episodeId", Integer.parseInt(s1));
                }
                intent.putExtra("trackId", i);
                intent.putExtra("time", j);
                netflixactivity.startService(intent);
                Log.v("nf_mdx_agent", "play done");
                netflixactivity.startService(createIntent(netflixactivity, "com.netflix.mediaclient.intent.action.MDX_GETCAPABILITY", ((String) (obj))));
                return true;
            }
        }
        return false;
    }

    public ivity()
    {
    }
}
