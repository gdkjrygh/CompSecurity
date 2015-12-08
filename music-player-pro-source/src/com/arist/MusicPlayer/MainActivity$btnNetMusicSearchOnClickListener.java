// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.yong.jamendo.api.JamendoGet2ApiImpl;
import com.yong.jamendo.api.WSError;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

private class <init>
    implements android.view.Listener
{

    final MainActivity this$0;

    public void onClick(final View text)
    {
        text = MainActivity.access$24(MainActivity.this).getText().toString();
        if (text != null && !"".equals(text.trim()))
        {
            MainActivity.access$25(MainActivity.this).setVisibility(8);
            if (!MainActivity.access$26(MainActivity.this))
            {
                (new Thread() {

                    final MainActivity.btnNetMusicSearchOnClickListener this$1;
                    private final String val$text;

                    public void run()
                    {
                        MainActivity.access$27(this$0, true);
                        Message message1;
                        try
                        {
                            Message message = MainActivity.access$23(this$0).obtainMessage();
                            message.what = 7;
                            message.arg1 = 0;
                            MainActivity.access$23(this$0).sendMessage(message);
                            MainActivity.access$28(this$0, (new JamendoGet2ApiImpl()).searchForTracksByTag(text));
                            if (MainActivity.access$29(this$0) == null || MainActivity.access$29(this$0).size() < 1)
                            {
                                MainActivity.access$23(this$0).sendEmptyMessage(10);
                            }
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        catch (WSError wserror)
                        {
                            Toast.makeText(getApplicationContext(), 0x7f080084, 1).show();
                            MainActivity.access$23(this$0).sendEmptyMessage(10);
                            wserror.printStackTrace();
                        }
                        message1 = MainActivity.access$23(this$0).obtainMessage();
                        message1.what = 7;
                        message1.arg1 = 1;
                        MainActivity.access$23(this$0).sendMessage(message1);
                        MainActivity.access$23(this$0).sendMessage(MainActivity.access$23(this$0).obtainMessage(9));
                        MainActivity.access$27(this$0, false);
                    }

            
            {
                this$1 = MainActivity.btnNetMusicSearchOnClickListener.this;
                text = s;
                super();
            }
                }).start();
                return;
            }
        }
    }


    private _cls1.val.text()
    {
        this$0 = MainActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
