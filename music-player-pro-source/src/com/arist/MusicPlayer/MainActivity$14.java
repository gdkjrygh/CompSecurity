// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import com.arist.Adapter.FolderAdapter;
import com.arist.dao.MusicDao;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements Runnable
{

    final MainActivity this$0;

    public void run()
    {
        MainActivity.access$43(MainActivity.this, MainActivity.access$5(MainActivity.this).getAlbums());
        MainActivity.access$12(MainActivity.this).changeData(MainActivity.access$44(MainActivity.this));
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
