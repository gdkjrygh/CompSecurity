// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import com.arist.Adapter.MusicAdapter;
import com.arist.dao.MusicDao;
import com.arist.entity.Music;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

private class <init>
    implements android.view.icRemove
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        MainActivity.access$5(MainActivity.this).deleteMusic(selMusic.getId());
        dismissDialog(1);
        removeDialog(1);
        MainActivity.access$14(MainActivity.this).remove(selMusic);
        MainActivity.access$15(MainActivity.this).notifyDataSetChanged();
    }

    private ()
    {
        this$0 = MainActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
