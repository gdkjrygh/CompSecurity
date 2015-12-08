// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.media.MediaPlayer;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ao, ar

class aq
    implements android.media.MediaPlayer.OnPreparedListener
{

    final ao a;

    aq(ao ao1)
    {
        a = ao1;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (a.l != null)
        {
            a.a.post(new ar(this));
        } else
        {
            a.i = 200L;
            a.k = false;
            a.g = a.a.getDuration();
            if (a.d)
            {
                boolean flag = true;
                if (a.e != null)
                {
                    flag = a.e.a(a);
                }
                ao.a(a);
                if (flag)
                {
                    a.a.start();
                    return;
                }
            }
        }
    }
}
