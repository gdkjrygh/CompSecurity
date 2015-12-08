// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.storage.provider.Content;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncConfig, SyncStateManager, SyncAdapterService

public final class SyncContent extends Enum
{

    private static final SyncContent $VALUES[];
    public static final SyncContent MyActivities;
    public static final SyncContent MyFollowings;
    public static final SyncContent MyLikes;
    public static final SyncContent MyPlaylists;
    public static final SyncContent MySoundStream;
    public static final SyncContent MySounds;
    public static EnumSet NON_ACTIVITIES;
    public final int backoffMultipliers[];
    public final Content content;
    public final long syncDelay;

    private SyncContent(String s, int i, Content content1, long l, int ai[])
    {
        super(s, i);
        content = content1;
        syncDelay = l;
        backoffMultipliers = ai;
    }

    public static void updateCollections(SyncStateManager syncstatemanager, Bundle bundle)
    {
        SyncContent asynccontent[] = values();
        int j = asynccontent.length;
        int i = 0;
        while (i < j) 
        {
            SyncContent synccontent = asynccontent[i];
            String s = synccontent.content.uri.toString();
            if (bundle.containsKey(s))
            {
                if (bundle.getBoolean(s))
                {
                    syncstatemanager.resetSyncMisses(synccontent.content.uri);
                    String s1 = SyncAdapterService.TAG;
                    (new StringBuilder("Sync endpoint changed, reset misses for ")).append(synccontent.content.uri);
                } else
                {
                    int k = syncstatemanager.incrementSyncMiss(synccontent.content.uri);
                    String s2 = SyncAdapterService.TAG;
                    (new StringBuilder("Sync endpoint unchanged, ")).append(synccontent.content.uri).append(" incremented misses to ").append(k);
                }
            }
            i++;
        }
    }

    public static SyncContent valueOf(String s)
    {
        return (SyncContent)Enum.valueOf(com/soundcloud/android/sync/SyncContent, s);
    }

    public static SyncContent[] values()
    {
        return (SyncContent[])$VALUES.clone();
    }

    public final Uri contentUri()
    {
        return content.uri;
    }

    public final boolean shouldSync(int i, long l)
    {
        if (backoffMultipliers != null)
        {
            if (System.currentTimeMillis() - l < syncDelay * (long)backoffMultipliers[i = Math.min(backoffMultipliers.length - 1, i)])
            {
                return false;
            }
        }
        return true;
    }

    static 
    {
        MySoundStream = new SyncContent("MySoundStream", 0, Content.ME_SOUND_STREAM, 0x1499700L, SyncConfig.DEFAULT_BACKOFF_MULTIPLIERS);
        MyActivities = new SyncContent("MyActivities", 1, Content.ME_ACTIVITIES, 0x1499700L, SyncConfig.DEFAULT_BACKOFF_MULTIPLIERS);
        MySounds = new SyncContent("MySounds", 2, Content.ME_SOUNDS, 0x36ee80L, SyncConfig.DEFAULT_BACKOFF_MULTIPLIERS);
        MyPlaylists = new SyncContent("MyPlaylists", 3, Content.ME_PLAYLISTS, 0x1499700L, SyncConfig.DEFAULT_BACKOFF_MULTIPLIERS);
        MyLikes = new SyncContent("MyLikes", 4, Content.ME_LIKES, 0x36ee80L, SyncConfig.DEFAULT_BACKOFF_MULTIPLIERS);
        MyFollowings = new SyncContent("MyFollowings", 5, Content.ME_FOLLOWINGS, 0x2932e00L, SyncConfig.USER_BACKOFF_MULTIPLIERS);
        $VALUES = (new SyncContent[] {
            MySoundStream, MyActivities, MySounds, MyPlaylists, MyLikes, MyFollowings
        });
        NON_ACTIVITIES = EnumSet.complementOf(EnumSet.of(MySoundStream, MyActivities));
    }
}
