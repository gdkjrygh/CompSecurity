// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;

final class jft
    implements android.media.MediaPlayer.OnInfoListener
{

    private jfq a;

    jft(jfq jfq1)
    {
        a = jfq1;
        super();
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        boolean flag = false;
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   1: 161
    //                   100: 161
    //                   200: 161
    //                   701: 137
    //                   702: 149;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        if (jfq.h(a).a())
        {
            noy.a("MediaPlayerWrapper", a);
            noy.a("what", jfq.c(a, i));
            noy.a("extra", Integer.valueOf(j));
        }
        if (jfq.i(a) == null || jfq.i(a).onInfo(mediaplayer, i, j))
        {
            flag = true;
        }
        return flag;
_L3:
        jfq.a(a, true);
        continue; /* Loop/switch isn't completed */
_L4:
        jfq.a(a, false);
        continue; /* Loop/switch isn't completed */
_L2:
        jfq.a(a, jfv.a);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
