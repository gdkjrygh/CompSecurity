// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Context;
import android.media.AudioManager;

// Referenced classes of package com.soundcloud.android.playback:
//            IAudioManager

public class AudioFocusManager
    implements IAudioManager
{

    private boolean audioFocusLost;
    private final Context context;
    private android.media.AudioManager.OnAudioFocusChangeListener listener;

    public AudioFocusManager(Context context1)
    {
        context = context1;
    }

    public boolean abandonMusicFocus(boolean flag)
    {
        if (listener != null)
        {
            if (getAudioManager().abandonAudioFocus(listener) == 1)
            {
                onFocusAbandoned();
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected AudioManager getAudioManager()
    {
        return (AudioManager)context.getSystemService("audio");
    }

    public boolean isFocusSupported()
    {
        return true;
    }

    public void onFocusAbandoned()
    {
    }

    public void onFocusObtained()
    {
    }

    public boolean requestMusicFocus(final IAudioManager.MusicFocusable focusable, int i)
    {
        if (listener == null)
        {
            listener = new _cls1();
        }
        if (getAudioManager().requestAudioFocus(listener, 3, i) == 1)
        {
            onFocusObtained();
            return true;
        } else
        {
            return false;
        }
    }



/*
    static boolean access$002(AudioFocusManager audiofocusmanager, boolean flag)
    {
        audiofocusmanager.audioFocusLost = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.media.AudioManager.OnAudioFocusChangeListener
    {

        final AudioFocusManager this$0;
        final IAudioManager.MusicFocusable val$focusable;

        public void onAudioFocusChange(int i)
        {
            if (i == 1)
            {
                if (audioFocusLost)
                {
                    focusable.focusGained();
                    audioFocusLost = false;
                }
            } else
            {
                if (i == -1)
                {
                    audioFocusLost = true;
                    focusable.focusLost(false, false);
                    return;
                }
                if (i == -2)
                {
                    audioFocusLost = true;
                    focusable.focusLost(true, false);
                    return;
                }
                if (i == -3)
                {
                    audioFocusLost = true;
                    focusable.focusLost(true, true);
                    return;
                }
            }
        }

        _cls1()
        {
            this$0 = AudioFocusManager.this;
            focusable = musicfocusable;
            super();
        }
    }

}
