// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;

// Referenced classes of package yong.powerfull.equalizer:
//            EquzeHelper

public class CompatEq
{

    public final Equalizer mEq;

    public CompatEq(MediaPlayer mediaplayer)
    {
        mediaplayer = new Equalizer(0, mediaplayer.getAudioSessionId());
        mediaplayer.setEnabled(true);
        mEq = mediaplayer;
    }

    public int getBandMaxLevel()
    {
        return mEq.getBandLevelRange()[1];
    }

    public short getNumberOfBands()
    {
        return mEq.getNumberOfBands();
    }

    public void setBandLevel(short word0, short word1)
    {
        if (mEq.getBandLevelRange()[0] > word1)
        {
            EquzeHelper.setEe(word0, mEq.getBandLevelRange()[0]);
            mEq.setBandLevel(word0, mEq.getBandLevelRange()[0]);
            return;
        }
        if (mEq.getBandLevelRange()[1] < word1)
        {
            EquzeHelper.setEe(word0, mEq.getBandLevelRange()[1]);
            mEq.setBandLevel(word0, mEq.getBandLevelRange()[1]);
            return;
        } else
        {
            EquzeHelper.setEe(word0, word1);
            mEq.setBandLevel(word0, word1);
            return;
        }
    }
}
