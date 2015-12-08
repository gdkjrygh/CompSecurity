// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Timer;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.view.tener
{

    final MainActivity this$0;

    public void onClick(View view)
    {
        if (!MainActivity.access$35(MainActivity.this))
        {
            view = MainActivity.access$36(MainActivity.this).inflate(0x7f030023, null);
            EditText edittext = (EditText)view.findViewById(0x7f0d00a1);
            edittext.setText((new StringBuilder()).append(MyApplication.getDefaultSharedPreferences().getInt("sleep_time", 15)).toString());
            MainActivity.access$37(MainActivity.this, view, edittext).show();
            return;
        } else
        {
            MainActivity.access$38(MainActivity.this, false);
            MainActivity.access$39(MainActivity.this).cancel();
            Toast.makeText(MainActivity.this, getString(0x7f080054), 1).show();
            return;
        }
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
