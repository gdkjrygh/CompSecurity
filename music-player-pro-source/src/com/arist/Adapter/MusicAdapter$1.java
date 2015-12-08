// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.view.View;
import com.arist.MusicPlayer.MainActivity;
import com.arist.entity.Music;
import java.util.ArrayList;

// Referenced classes of package com.arist.Adapter:
//            MusicAdapter

class val.position
    implements android.view.tener
{

    final MusicAdapter this$0;
    private final int val$position;

    public void onClick(View view)
    {
        ((MainActivity)MusicAdapter.access$0(MusicAdapter.this)).selMusic = (Music)MusicAdapter.access$1(MusicAdapter.this).get(val$position);
        view = (MainActivity)MusicAdapter.access$0(MusicAdapter.this);
        MainActivity mainactivity = (MainActivity)MusicAdapter.access$0(MusicAdapter.this);
        view.showDialog(1);
    }

    y()
    {
        this$0 = final_musicadapter;
        val$position = I.this;
        super();
    }
}
