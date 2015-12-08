// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.looksery.core;

import android.media.MediaPlayer;
import android.os.SystemClock;

// Referenced classes of package com.looksery.core:
//            LSSoundManager

static final class a
    implements Runnable
{

    private MediaPlayer a;

    public final void run()
    {
        float f = 1.0F;
        do
        {
            f -= 0.1F;
            if (f > 0.0F)
            {
                a.setVolume(f, f);
                SystemClock.sleep(50L);
            } else
            {
                a.stop();
                a.release();
                return;
            }
        } while (true);
    }

    (MediaPlayer mediaplayer)
    {
        a = mediaplayer;
        super();
    }
}
