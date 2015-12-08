// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.media.AudioManager;

// Referenced classes of package com.skype.android.audio:
//            AudioRoute

static final class nit> extends AudioRoute
{

    protected final String a()
    {
        return "SPEAKER";
    }

    protected final void a(AudioManager audiomanager)
    {
        if (audiomanager.isBluetoothScoOn())
        {
            audiomanager.setBluetoothScoOn(false);
        }
        if (!audiomanager.isSpeakerphoneOn())
        {
            audiomanager.setSpeakerphoneOn(true);
        }
    }

    protected final void b(AudioManager audiomanager)
    {
    }

    public final Boolean c(AudioManager audiomanager)
    {
        return Boolean.valueOf(true);
    }

    (String s)
    {
        super(s, 2, (byte)0);
    }
}
