// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import android.os.Handler;

final class eya
    implements Runnable
{

    private Handler a;
    private float b;
    private MediaPlayer c;

    public eya(Handler handler, MediaPlayer mediaplayer, float f)
    {
        a = handler;
        b = f;
        c = mediaplayer;
    }

    public final void run()
    {
        c.setVolume(b, b);
        if (b < 1.0F)
        {
            float f = b;
            a.postDelayed(new eya(a, c, f + 0.05F), 50L);
        }
    }
}
