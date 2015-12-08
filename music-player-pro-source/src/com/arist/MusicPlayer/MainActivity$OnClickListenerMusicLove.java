// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.Toast;
import com.arist.util.FavMusicXmlUtil;
import com.arist.util.MainGridPreference;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

private class <init>
    implements android.view.usicLove
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        Toast.makeText(MainActivity.this, getString(0x7f080064), 0).show();
        (new Thread() {

            final MainActivity.OnClickListenerMusicLove this$1;

            public void run()
            {
                ArrayList arraylist;
                arraylist = FavMusicXmlUtil.getFavMusic();
                if (arraylist.contains(selMusic))
                {
                    return;
                }
                try
                {
                    arraylist.add(selMusic);
                    FavMusicXmlUtil.saveFavMusic(arraylist);
                    MainActivity.access$11(this$0).saveFav(arraylist.size());
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                return;
            }

            
            {
                this$1 = MainActivity.OnClickListenerMusicLove.this;
                super();
            }
        }).start();
        dismissDialog(1);
        removeDialog(1);
    }


    private _cls1.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
