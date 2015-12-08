// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.arist.util.MusicPreference;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication, MainActivity

class this._cls1
    implements android.content.nClickListener
{

    final  this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i++;
        MyApplication.playMode = i;
        MyApplication.musicPref.savePlayMode(i);
        MainActivity.access$32(_fld0);
        dialoginterface.dismiss();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/arist/MusicPlayer/MainActivity$5

/* anonymous class */
    class MainActivity._cls5
        implements android.view.View.OnClickListener
    {

        final MainActivity this$0;

        public void onClick(View view)
        {
            (new android.app.AlertDialog.Builder(MainActivity.this)).setTitle(getString(0x7f080056)).setCancelable(true).setNegativeButton(getString(0x7f080051), null).setSingleChoiceItems(MainActivity.access$31(MainActivity.this), MyApplication.playMode - 1, new MainActivity._cls5._cls1()).create().show();
        }


            
            {
                this$0 = MainActivity.this;
                super();
            }
    }

}
