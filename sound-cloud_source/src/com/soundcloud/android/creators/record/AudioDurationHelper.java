// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.media.MediaPlayer;
import java.io.File;
import java.io.IOException;

public class AudioDurationHelper
{

    private MediaPlayer mediaPlayer;

    public AudioDurationHelper()
    {
    }

    public int getDuration(File file)
    {
        if (mediaPlayer == null)
        {
            mediaPlayer = new MediaPlayer();
        }
        mediaPlayer.reset();
        int i;
        try
        {
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            i = mediaPlayer.getDuration();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return -1;
        }
        return i;
    }
}
