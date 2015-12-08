// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.AdapterView;
import com.arist.Adapter.FolderAdapter;
import com.arist.dao.MusicDao;
import com.arist.entity.MusicFolder;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.widget.Folder
{

    final MainActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (MusicFolder)MainActivity.access$12(MainActivity.this).getItem(i);
        if ("artist".equals(adapterview.getPath()))
        {
            MainActivity.access$13(MainActivity.this, MainActivity.access$5(MainActivity.this).getMusicsByArtist(adapterview.getName()));
        } else
        if ("album".equals(adapterview.getPath()))
        {
            MainActivity.access$13(MainActivity.this, MainActivity.access$5(MainActivity.this).getMusicsByAlbumId(adapterview.getId()));
        } else
        {
            MainActivity.access$13(MainActivity.this, MainActivity.access$5(MainActivity.this).getMusic(adapterview.getPath()));
        }
        MainActivity.access$9(MainActivity.this, 111);
        MainActivity.access$10(MainActivity.this, 3);
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
