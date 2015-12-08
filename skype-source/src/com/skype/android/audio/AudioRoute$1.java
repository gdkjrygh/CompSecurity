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
        return "EARPIECE";
    }

    protected final void a(AudioManager audiomanager)
    {
        if (audiomanager.isSpeakerphoneOn())
        {
            audiomanager.setSpeakerphoneOn(false);
        }
        if (audiomanager.isBluetoothScoOn())
        {
            audiomanager.setBluetoothScoOn(false);
        }
    }

    public final Boolean b()
    {
        return Boolean.valueOf(true);
    }

    protected final void b(AudioManager audiomanager)
    {
    }

    public final Boolean c(AudioManager audiomanager)
    {
        boolean flag;
        if (!audiomanager.isBluetoothA2dpOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    (String s)
    {
        super(s, 0, (byte)0);
    }
}
