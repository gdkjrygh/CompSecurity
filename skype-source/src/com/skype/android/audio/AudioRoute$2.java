// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.bluetooth.BluetoothAdapter;
import android.media.AudioManager;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.audio:
//            AudioRoute, BluetoothReceiver

static final class nit> extends AudioRoute
{

    protected final String a()
    {
        return "BLUETOOTH";
    }

    protected final void a(AudioManager audiomanager)
    {
        if (audiomanager.isSpeakerphoneOn())
        {
            audiomanager.setSpeakerphoneOn(false);
        }
    }

    protected final void b(AudioManager audiomanager)
    {
        if (audiomanager.isBluetoothScoOn())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        audiomanager.setBluetoothScoOn(true);
        audiomanager.startBluetoothSco();
        g++;
        return;
        audiomanager;
        f.log(Level.WARNING, String.format("NPE by AudioManager.startBluetoothSco() detected. Audio will not be routed to BT device.", new Object[0]), audiomanager);
        return;
    }

    public final Boolean c(AudioManager audiomanager)
    {
        boolean flag1 = true;
        boolean flag2 = audiomanager.isBluetoothScoAvailableOffCall();
        boolean flag3 = audiomanager.isBluetoothA2dpOn();
        audiomanager = BluetoothAdapter.getDefaultAdapter();
        boolean flag;
        boolean flag4;
        if (audiomanager != null && audiomanager.isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag4 = BluetoothReceiver.a().booleanValue();
        if (!flag || !flag2 && !flag3 || !flag4)
        {
            flag1 = false;
        }
        return Boolean.valueOf(flag1);
    }

    iver(String s)
    {
        super(s, 1, (byte)0);
    }
}
