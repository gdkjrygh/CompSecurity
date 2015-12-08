// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.yong.jamendo.api.JamendoGet2ApiImpl;
import com.yong.jamendo.api.WSError;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class val.text extends Thread
{

    final this._cls1 this$1;
    private final String val$text;

    public void run()
    {
        MainActivity.access$27(cess._mth1(this._cls1.this), true);
        Message message1;
        try
        {
            Message message = MainActivity.access$23(cess._mth1(this._cls1.this)).obtainMessage();
            message.what = 7;
            message.arg1 = 0;
            MainActivity.access$23(cess._mth1(this._cls1.this)).sendMessage(message);
            MainActivity.access$28(cess._mth1(this._cls1.this), (new JamendoGet2ApiImpl()).searchForTracksByTag(val$text));
            if (MainActivity.access$29(cess._mth1(this._cls1.this)) == null || MainActivity.access$29(cess._mth1(this._cls1.this)).size() < 1)
            {
                MainActivity.access$23(cess._mth1(this._cls1.this)).sendEmptyMessage(10);
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        catch (WSError wserror)
        {
            Toast.makeText(cess._mth1(this._cls1.this).getApplicationContext(), 0x7f080084, 1).show();
            MainActivity.access$23(cess._mth1(this._cls1.this)).sendEmptyMessage(10);
            wserror.printStackTrace();
        }
        message1 = MainActivity.access$23(cess._mth1(this._cls1.this)).obtainMessage();
        message1.what = 7;
        message1.arg1 = 1;
        MainActivity.access$23(cess._mth1(this._cls1.this)).sendMessage(message1);
        MainActivity.access$23(cess._mth1(this._cls1.this)).sendMessage(MainActivity.access$23(cess._mth1(this._cls1.this)).obtainMessage(9));
        MainActivity.access$27(cess._mth1(this._cls1.this), false);
    }

    ()
    {
        this$1 = final_;
        val$text = String.this;
        super();
    }
}
