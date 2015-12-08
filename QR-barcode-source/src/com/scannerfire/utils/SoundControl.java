// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.content.Context;
import android.media.SoundPool;

public class SoundControl
{

    public static final int NUM_SAMPLE = 1;
    public static final int SAMPLE[] = new int[1];
    private static int soundId = 0;
    private static boolean soundLoaded = false;
    private static SoundPool soundPool;

    public SoundControl()
    {
    }

    public static void destroySound()
    {
        soundPool.release();
        soundLoaded = false;
    }

    public static void init(Context context)
    {
        soundPool = new SoundPool(2, 3, 100);
        soundPool.setOnLoadCompleteListener(new android.media.SoundPool.OnLoadCompleteListener() {

            public void onLoadComplete(SoundPool soundpool, int i, int j)
            {
                SoundControl.soundLoaded = true;
            }

        });
        SAMPLE[0] = soundPool.load(context, 0x7f060000, 0);
    }

    public static boolean isSoundLoaded()
    {
        return soundLoaded;
    }

    public static void playSound(int i)
    {
        soundId = soundPool.play(SAMPLE[i], 1.0F, 1.0F, 1, 0, 1.0F);
    }

    public static void stopSound()
    {
        soundPool.stop(soundId);
    }


}
