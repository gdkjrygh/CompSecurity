// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.AdapterView;
import com.arist.Adapter.NetMusicAdapter;
import com.yong.jamendo.api.JamendoMusic;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.widget.tMusic
{

    final MainActivity this$0;

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        currentNetMusic = (JamendoMusic)MainActivity.access$16(MainActivity.this).getItem(i);
        showDialog(5);
        return true;
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
