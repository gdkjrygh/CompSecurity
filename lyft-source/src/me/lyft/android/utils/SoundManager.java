// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.media.AudioManager;
import android.media.SoundPool;
import java.util.HashMap;
import me.lyft.android.LyftApplication;

public class SoundManager
    implements android.media.SoundPool.OnLoadCompleteListener
{

    public static final int CANCEL_ERROR_SOUND = 2;
    public static final int DRIVER_COUNTDOWN_SOUND = 3;
    public static final int DRIVER_NEW_REQUEST_SOUND = 4;
    public static final int NOTIFICATION_SOUND = 1;
    public static final int SLIDE_SOUND = 5;
    final AudioManager audioManager;
    private HashMap soundMap;
    private SoundPool soundPool;

    public SoundManager(LyftApplication lyftapplication, AudioManager audiomanager)
    {
        soundMap = new HashMap();
        audioManager = audiomanager;
        soundPool = new SoundPool(5, 2, 0);
        soundMap.put(Integer.valueOf(1), Integer.valueOf(soundPool.load(lyftapplication, 0x7f060007, 0)));
        soundMap.put(Integer.valueOf(2), Integer.valueOf(soundPool.load(lyftapplication, 0x7f060002, 1)));
        soundMap.put(Integer.valueOf(3), Integer.valueOf(soundPool.load(lyftapplication, 0x7f060003, 2)));
        soundMap.put(Integer.valueOf(4), Integer.valueOf(soundPool.load(lyftapplication, 0x7f060004, 3)));
        soundMap.put(Integer.valueOf(5), Integer.valueOf(soundPool.load(lyftapplication, 0x7f060008, 4)));
        soundPool.setOnLoadCompleteListener(this);
        getVolume();
    }

    private float getVolume()
    {
        return (float)audioManager.getStreamVolume(2) / (float)audioManager.getStreamMaxVolume(2);
    }

    public void onLoadComplete(SoundPool soundpool, int i, int j)
    {
    }

    public void play(int i)
    {
        this;
        JVM INSTR monitorenter ;
        soundPool.play(((Integer)soundMap.get(Integer.valueOf(i))).intValue(), getVolume(), getVolume(), 1, 0, 1.0F);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void release()
    {
        soundPool.release();
    }
}
