// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            CommandInterface

public final class CommandHandler
{

    private static final int DEFAULT_INTEGER = -1;
    private static final String TAG = "nf_mdx";
    private CommandInterface mTarget;

    CommandHandler(CommandInterface commandinterface)
    {
        mTarget = commandinterface;
    }

    void handleCommandIntent(Intent intent)
    {
        if (!intent.hasCategory("com.netflix.mediaclient.intent.category.MDX"))
        {
            Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent:intent is not for mdx, ").append(intent.getCategories()).toString());
            return;
        }
        String s = intent.getAction();
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent:intent doesn't have action, ").append(intent.toString()).toString());
            return;
        }
        String s1 = intent.getStringExtra("uuid");
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_GETCAPABILITY"))
        {
            mTarget.playerGetCapability(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_GETSTATE"))
        {
            mTarget.playerGetCurrentState(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_PLAY"))
        {
            String s2 = intent.getStringExtra("catalogId");
            int i = intent.getIntExtra("trackId", -1);
            String s6 = intent.getStringExtra("episodeId");
            int j1 = intent.getIntExtra("time", -1);
            if (i == -1)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerPlay(s1, s2, i, s6, j1);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_PAUSE"))
        {
            mTarget.playerPause(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_RESUME"))
        {
            mTarget.playerResume(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_SEEK"))
        {
            int j = intent.getIntExtra("time", -1);
            if (j == -1)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerSeek(s1, j);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_SKIP"))
        {
            int k = intent.getIntExtra("time", -1);
            if (k == -1)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerSkip(s1, k);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_STOP"))
        {
            mTarget.playerStop(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_SETAUDIOSUB"))
        {
            String s3 = intent.getStringExtra("audioTrackId");
            intent = intent.getStringExtra("subtitleTrackId");
            if (StringUtils.isEmpty(s3) || StringUtils.isEmpty(intent))
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerSetAudioSubtitle(s1, s3, intent);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_SETVOLUME"))
        {
            int l = intent.getIntExtra("volume", -1);
            if (l == -1)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerSetVolume(s1, l);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_AUTOADV"))
        {
            int i1 = intent.getIntExtra("speed", -1);
            if (i1 == -1)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerAutoAdvance(s1, i1);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_METADATA"))
        {
            String s4 = intent.getStringExtra("catalogId");
            String s7 = intent.getStringExtra("episodeId");
            intent = intent.getStringExtra("type");
            if (StringUtils.isEmpty(s4) || StringUtils.isEmpty(s7))
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerChangeMetaData(s1, s4, s7, intent);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_DIALOGRESP"))
        {
            String s5 = intent.getStringExtra("uid");
            intent = intent.getStringExtra("data");
            if (StringUtils.isEmpty(s5) || StringUtils.isEmpty(intent))
            {
                Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", invalid parameters").toString());
                return;
            } else
            {
                mTarget.playerDialogReponse(s1, s5, intent);
                return;
            }
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_GETAUDIOSUB"))
        {
            mTarget.playerGetAudioSubtitle(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_PINCONFIRMED"))
        {
            mTarget.pinConfirmed(s1);
            return;
        }
        if (s.equals("com.netflix.mediaclient.intent.action.MDX_PINCANCELLED"))
        {
            mTarget.pinCancelled(s1);
            return;
        } else
        {
            Log.e("nf_mdx", (new StringBuilder()).append("handleCommandIntent: ").append(s).append(", unknown command").toString());
            return;
        }
    }
}
