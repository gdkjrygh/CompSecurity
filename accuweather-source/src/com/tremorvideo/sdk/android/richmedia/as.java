// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.media.MediaPlayer;
import com.tremorvideo.sdk.android.videoad.ct;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ao

class as
    implements android.media.MediaPlayer.OnErrorListener
{

    final ao a;

    as(ao ao1)
    {
        a = ao1;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        ct.d((new StringBuilder()).append("Media Player Error: ").append(i).append(" Extra: ").append(j).toString());
        if (!a.a.a)
        {
            a.a.a = true;
            if (a.e != null)
            {
                a.e.p();
            }
        }
        return true;
    }
}
