// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media:
//            PlayerType, JPlayerHelper, JPlayer2Helper, DefaultMediaPlayerHelper, 
//            MediaPlayerHelper

public final class MediaPlayerHelperFactory
{

    private static final String TAG = "nf_player";
    private static DefaultMediaPlayerHelper defaultHelper = null;
    private static JPlayerHelper jpHelper = null;

    private MediaPlayerHelperFactory()
    {
    }

    public static MediaPlayerHelper getInstance(PlayerType playertype)
    {
        if (playertype == null)
        {
            throw new IllegalArgumentException("Type is null!");
        }
        if (playertype == PlayerType.device10 || playertype == PlayerType.device11)
        {
            Log.d("nf_player", "Use JPlayer helper");
            if (jpHelper == null)
            {
                jpHelper = new JPlayerHelper();
            }
            return jpHelper;
        }
        if (playertype == PlayerType.device12)
        {
            Log.d("nf_player", "Use JPlayer2 helper");
            return new JPlayer2Helper();
        }
        Log.d("nf_player", "Use default player helper");
        if (defaultHelper == null)
        {
            defaultHelper = new DefaultMediaPlayerHelper();
        }
        return defaultHelper;
    }

}
