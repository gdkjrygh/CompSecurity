// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

public final class dct
{

    public final AudioManager a;
    public final android.media.AudioManager.OnAudioFocusChangeListener b = new dcu(this);
    public dcv c;

    public dct(AudioManager audiomanager)
    {
        a = (AudioManager)b.a(audiomanager, "audioManager", null);
    }

    public final void a(dcv dcv)
    {
        c.a(c, "requestFocus must be called before calling abandonFocus()", null);
        b.a(dcv, "listener", c);
        c = null;
        a.abandonAudioFocus(b);
    }
}
