// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.SystemClock;
import android.view.KeyEvent;

public abstract class TransportPerformer
{

    static final int AUDIOFOCUS_GAIN = 1;
    static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    static final int AUDIOFOCUS_LOSS = -1;
    static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;

    public TransportPerformer()
    {
    }

    public void onAudioFocusChange(int i)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 67;
           goto _L1 _L2
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        if (i != 0)
        {
            long l = SystemClock.uptimeMillis();
            onMediaButtonDown(i, new KeyEvent(l, l, 0, i, 0));
            onMediaButtonUp(i, new KeyEvent(l, l, 1, i, 0));
        }
        return;
_L2:
        i = 127;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int onGetBufferPercentage()
    {
        return 100;
    }

    public abstract long onGetCurrentPosition();

    public abstract long onGetDuration();

    public int onGetTransportControlFlags()
    {
        return 60;
    }

    public abstract boolean onIsPlaying();

    public boolean onMediaButtonDown(int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            return true;

        case 126: // '~'
            onStart();
            return true;

        case 127: // '\177'
            onPause();
            return true;

        case 86: // 'V'
            onStop();
            return true;

        case 79: // 'O'
        case 85: // 'U'
            break;
        }
        if (onIsPlaying())
        {
            onPause();
            return true;
        } else
        {
            onStart();
            return true;
        }
    }

    public boolean onMediaButtonUp(int i, KeyEvent keyevent)
    {
        return true;
    }

    public abstract void onPause();

    public abstract void onSeekTo(long l);

    public abstract void onStart();

    public abstract void onStop();
}
