// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.audio:
//            AudioRoute

public class VoiceStreamControl
{

    private AudioManager a;
    private int b;
    private int c;
    private AtomicInteger d;
    private android.media.AudioManager.OnAudioFocusChangeListener e;

    private VoiceStreamControl(AudioManager audiomanager, android.media.AudioManager.OnAudioFocusChangeListener onaudiofocuschangelistener)
    {
        a = audiomanager;
        b = 0;
        c = 2;
        e = onaudiofocuschangelistener;
        d = new AtomicInteger();
    }

    public VoiceStreamControl(AudioManager audiomanager, android.media.AudioManager.OnAudioFocusChangeListener onaudiofocuschangelistener, byte byte0)
    {
        this(audiomanager, onaudiofocuschangelistener);
    }

    private void d()
    {
        a.setMode(0);
    }

    public final void a()
    {
        if (d.incrementAndGet() == 1)
        {
            a.requestAudioFocus(e, b, c);
            if (a.getMode() != 3)
            {
                a.setMode(3);
            }
        }
    }

    public final void b()
    {
        if (d.decrementAndGet() == 0)
        {
            a.abandonAudioFocus(e);
            d();
        }
    }

    public final void c()
    {
        AudioRoute.d(a);
        if (d.get() > 0)
        {
            a.abandonAudioFocus(e);
            d();
            d.set(0);
        }
    }
}
