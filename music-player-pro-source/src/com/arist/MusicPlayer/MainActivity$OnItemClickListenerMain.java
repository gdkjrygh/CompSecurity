// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.AdapterView;
import com.arist.biz.MusicBiz;
import com.arist.dao.MusicDao;
import com.arist.util.Constant;
import com.arist.util.MainGridPreference;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements android.widget.erMain
{

    final MainActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            MainActivity.access$9(MainActivity.this, 2);
            MainActivity.access$10(MainActivity.this, 2);
            return;

        case 2: // '\002'
            MainActivity.access$9(MainActivity.this, 3);
            MainActivity.access$10(MainActivity.this, 2);
            return;

        case 3: // '\003'
            MainActivity.access$9(MainActivity.this, 4);
            MainActivity.access$10(MainActivity.this, 2);
            return;

        case 0: // '\0'
            MainActivity.access$9(MainActivity.this, 1);
            MainActivity.access$10(MainActivity.this, 3);
            return;

        case 4: // '\004'
            try
            {
                MainActivity.access$9(MainActivity.this, 5);
                MainActivity.access$10(MainActivity.this, 3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                adapterview.printStackTrace();
            }
            return;

        case 5: // '\005'
            MainActivity.access$11(MainActivity.this).saveAdd(MainActivity.access$7(MainActivity.this).getRecentAddMusic().size());
            MainActivity.access$9(MainActivity.this, 6);
            MainActivity.access$10(MainActivity.this, 3);
            return;

        case 6: // '\006'
            MainActivity.access$11(MainActivity.this).saveDownload(MainActivity.access$5(MainActivity.this).getMusic(Constant.BASE_DOWNLOAD_PATH.substring(0, Constant.BASE_DOWNLOAD_PATH.length() - 1)).size());
            MainActivity.access$9(MainActivity.this, 7);
            MainActivity.access$10(MainActivity.this, 3);
            return;
        }
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
