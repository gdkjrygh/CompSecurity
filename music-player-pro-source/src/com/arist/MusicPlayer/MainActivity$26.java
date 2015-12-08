// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.arist.Adapter.MusicAdapter;
import com.arist.Adapter.NetMusicAdapter;
import com.arist.dao.MusicDao;
import com.arist.entity.Music;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0 extends Handler
{

    final MainActivity this$0;

    public void handleMessage(Message message)
    {
        int i = 0;
        message.what;
        JVM INSTR tableswitch 1 10: default 60
    //                   1 66
    //                   2 179
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 60
    //                   7 284
    //                   8 348
    //                   9 517
    //                   10 554;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L4 _L5 _L6 _L7
_L1:
        super.handleMessage(message);
        return;
_L2:
        i = message.getData().getInt("text");
        if (i == 1)
        {
            MainActivity.access$59(MainActivity.this, MyApplication.mediaPlayer.getCurrentPosition());
        }
        MainActivity mainactivity = MainActivity.this;
        if (MainActivity.access$50(MainActivity.this) + i * 200 > MyApplication.getMusicDuration())
        {
            i = MyApplication.getMusicDuration();
        } else
        {
            i = MainActivity.access$50(MainActivity.this) + i * 200;
        }
        MainActivity.access$59(mainactivity, i);
        MainActivity.access$18(MainActivity.this).setProgress((MainActivity.access$50(MainActivity.this) * 1000) / MyApplication.getMusicDuration());
        continue; /* Loop/switch isn't completed */
_L3:
        int k = message.getData().getInt("text");
        if (k == 1)
        {
            MainActivity.access$59(MainActivity.this, MyApplication.mediaPlayer.getCurrentPosition());
        }
        MainActivity mainactivity1 = MainActivity.this;
        if (MainActivity.access$50(MainActivity.this) - k * 200 >= 0)
        {
            i = MainActivity.access$50(MainActivity.this) - k * 200;
        }
        MainActivity.access$59(mainactivity1, i);
        MainActivity.access$18(MainActivity.this).setProgress((MainActivity.access$50(MainActivity.this) * 1000) / MyApplication.getMusicDuration());
        continue; /* Loop/switch isn't completed */
_L4:
        if (message.arg1 == 0)
        {
            MainActivity.access$60(MainActivity.this).setVisibility(1);
            MainActivity.access$60(MainActivity.this).startAnimation(AnimationUtils.loadAnimation(MainActivity.this, 0x7f040004));
        } else
        {
            MainActivity.access$60(MainActivity.this).setVisibility(-1);
            MainActivity.access$60(MainActivity.this).clearAnimation();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        String s = String.valueOf(message.obj);
        MainActivity.access$13(MainActivity.this, MainActivity.access$5(MainActivity.this).getAllMusic());
        MainActivity.access$45(MainActivity.this).setCurrentItem(2);
        ArrayList arraylist = new ArrayList();
        int j = 0;
        do
        {
            if (j >= MainActivity.access$14(MainActivity.this).size())
            {
                MainActivity.access$13(MainActivity.this, arraylist);
                MainActivity.access$15(MainActivity.this).changeData(arraylist);
                continue; /* Loop/switch isn't completed */
            }
            if (((Music)MainActivity.access$14(MainActivity.this).get(j)).getTitle().toLowerCase().contains(s) || ((Music)MainActivity.access$14(MainActivity.this).get(j)).getArtist().toLowerCase().contains(s))
            {
                arraylist.add((Music)MainActivity.access$14(MainActivity.this).get(j));
            }
            j++;
        } while (true);
_L6:
        if (MainActivity.access$29(MainActivity.this).size() > 0)
        {
            try
            {
                MainActivity.access$16(MainActivity.this).changeData(MainActivity.access$29(MainActivity.this));
            }
            catch (Exception exception) { }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        MainActivity.access$25(MainActivity.this).setVisibility(0);
        MainActivity.access$16(MainActivity.this).changeData(MainActivity.access$29(MainActivity.this));
        if (true) goto _L1; else goto _L8
_L8:
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
