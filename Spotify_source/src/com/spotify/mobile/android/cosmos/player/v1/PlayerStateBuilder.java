// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v1;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v1:
//            PlayerState

public class PlayerStateBuilder
{

    private static final String TRACK_RESOLVER_URI = "hm://track-resolver/v1?uri=";
    private PlayerState mState;

    private PlayerStateBuilder(PlayerState.Action action)
    {
        mState = new PlayerState(action);
    }

    public static PlayerStateBuilder create(PlayerState.Action action)
    {
        return new PlayerStateBuilder(action);
    }

    public static PlayerStateBuilder createFromContextUri(String s)
    {
        boolean flag = s.matches("^spotify:(album|artist):[A-Za-z0-9]+$");
        boolean flag1 = s.matches("^spotify:user:[^:]+:(playlist:[A-Za-z0-9]+|starred)$");
        if (!flag && !flag1)
        {
            throw new IllegalArgumentException("This version of the player does not support createFromContextUri with this type of URI");
        }
        String s1;
        if (flag1)
        {
            s1 = s;
        } else
        {
            s1 = (new StringBuilder("hm://track-resolver/v1?uri=")).append(s).toString();
        }
        return create(PlayerState.Action.PLAY).contextUri(s).nextPageUrl(s1).tracks(new ArrayList());
    }

    public PlayerState build()
    {
        if (mState.action == null)
        {
            throw new IllegalArgumentException("Cannot create PlayerState with null action");
        }
        if (mState.index != null && mState.index.intValue() < 0)
        {
            throw new IllegalArgumentException("Cannot create PlayerState with negative index");
        }
        if (mState.action == PlayerState.Action.PLAY)
        {
            if (mState.origin == null || mState.origin.source == null)
            {
                throw new IllegalArgumentException("Cannot create PlayerState with null view URI");
            }
            if (mState.contextUri == null)
            {
                throw new IllegalArgumentException("Cannot create PlayerState with null context URI");
            }
            if (mState.tracks == null)
            {
                throw new IllegalArgumentException("Cannot create PlayerState with null track list");
            }
        }
        return mState;
    }

    public PlayerStateBuilder contextUri(String s)
    {
        mState.contextUri = s;
        return this;
    }

    public PlayerStateBuilder index(int i)
    {
        mState.index = Integer.valueOf(i);
        return this;
    }

    public PlayerStateBuilder nextPageUrl(String s)
    {
        mState.nextPageUrl = s;
        return this;
    }

    public PlayerStateBuilder shuffle(boolean flag)
    {
        if (mState.options == null)
        {
            mState.options = new PlayerState.PlayOptions();
        }
        mState.options.shuffle = flag;
        return this;
    }

    public PlayerStateBuilder tracks(List list)
    {
        mState.tracks = list;
        return this;
    }

    public PlayerStateBuilder viewUri(String s)
    {
        if (mState.origin == null)
        {
            mState.origin = new PlayerState.PlayOrigin();
        }
        mState.origin.source = s;
        return this;
    }
}
