// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.media.AudioManager;
import com.skype.android.util.ref.ReferenceCounted;

// Referenced classes of package com.skype.android.audio:
//            VoiceStreamControl

public class VoiceStreamControlWrapper
    implements ReferenceCounted
{

    private VoiceStreamControl a;

    public VoiceStreamControlWrapper(AudioManager audiomanager, android.media.AudioManager.OnAudioFocusChangeListener onaudiofocuschangelistener)
    {
        a = new VoiceStreamControl(audiomanager, onaudiofocuschangelistener, (byte)0);
    }

    public void acquireOnce()
    {
        a.a();
    }

    public void releaseFully()
    {
        a.c();
    }

    public void releaseOnce()
    {
        a.b();
    }
}
