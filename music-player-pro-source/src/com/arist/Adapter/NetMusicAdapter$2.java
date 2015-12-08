// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.view.View;
import com.arist.MusicPlayer.MainActivity;
import com.yong.jamendo.api.JamendoMusic;
import java.util.ArrayList;

// Referenced classes of package com.arist.Adapter:
//            NetMusicAdapter

class val.position
    implements android.view.er
{

    final NetMusicAdapter this$0;
    private final int val$position;

    public void onClick(View view)
    {
        ((MainActivity)NetMusicAdapter.access$0(NetMusicAdapter.this)).currentNetMusic = (JamendoMusic)NetMusicAdapter.access$1(NetMusicAdapter.this).get(val$position);
        view = (MainActivity)NetMusicAdapter.access$0(NetMusicAdapter.this);
        MainActivity mainactivity = (MainActivity)NetMusicAdapter.access$0(NetMusicAdapter.this);
        view.showDialog(5);
    }

    ()
    {
        this$0 = final_netmusicadapter;
        val$position = I.this;
        super();
    }
}
