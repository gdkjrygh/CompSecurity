// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            AudioFocusManager

class ocusable
    implements android.media.FocusChangeListener
{

    final AudioFocusManager this$0;
    final ocusable val$focusable;

    public void onAudioFocusChange(int i)
    {
        if (i == 1)
        {
            if (AudioFocusManager.access$000(AudioFocusManager.this))
            {
                val$focusable.focusGained();
                AudioFocusManager.access$002(AudioFocusManager.this, false);
            }
        } else
        {
            if (i == -1)
            {
                AudioFocusManager.access$002(AudioFocusManager.this, true);
                val$focusable.focusLost(false, false);
                return;
            }
            if (i == -2)
            {
                AudioFocusManager.access$002(AudioFocusManager.this, true);
                val$focusable.focusLost(true, false);
                return;
            }
            if (i == -3)
            {
                AudioFocusManager.access$002(AudioFocusManager.this, true);
                val$focusable.focusLost(true, true);
                return;
            }
        }
    }

    ocusable()
    {
        this$0 = final_audiofocusmanager;
        val$focusable = ocusable.this;
        super();
    }
}
