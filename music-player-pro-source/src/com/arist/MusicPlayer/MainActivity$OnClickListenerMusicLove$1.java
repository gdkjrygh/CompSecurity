// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import com.arist.util.FavMusicXmlUtil;
import com.arist.util.MainGridPreference;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls1 extends Thread
{

    final this._cls1 this$1;

    public void run()
    {
        ArrayList arraylist;
        arraylist = FavMusicXmlUtil.getFavMusic();
        if (arraylist.contains(cess._mth1(this._cls1.this).selMusic))
        {
            return;
        }
        try
        {
            arraylist.add(cess._mth1(this._cls1.this).selMusic);
            FavMusicXmlUtil.saveFavMusic(arraylist);
            MainActivity.access$11(cess._mth1(this._cls1.this)).saveFav(arraylist.size());
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
