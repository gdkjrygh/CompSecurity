// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.arist.util.MusicPreference;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        (new android.app.lder(MainActivity.this)).setTitle(getString(0x7f080056)).setCancelable(true).setNegativeButton(getString(0x7f080051), null).setSingleChoiceItems(MainActivity.access$31(MainActivity.this), MyApplication.playMode - 1, new android.content.DialogInterface.OnClickListener() {

            final MainActivity._cls5 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                i++;
                MyApplication.playMode = i;
                MyApplication.musicPref.savePlayMode(i);
                MainActivity.access$32(this$0);
                dialoginterface.dismiss();
            }

            
            {
                this$1 = MainActivity._cls5.this;
                super();
            }
        }).create().show();
    }


    _cls1.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }
}
