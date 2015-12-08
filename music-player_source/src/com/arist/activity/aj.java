// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import com.arist.c.a;
import java.util.TimerTask;

// Referenced classes of package com.arist.activity:
//            MyApplication

final class aj extends TimerTask
{

    aj()
    {
    }

    public final void run()
    {
        try
        {
            if (MyApplication.d())
            {
                Intent intent = new Intent();
                intent.setAction(a.r);
                com.arist.activity.MyApplication.a(com.arist.activity.MyApplication.a.getCurrentPosition());
                intent.putExtra("musicProgress", MyApplication.i());
                MyApplication.d.sendBroadcast(intent);
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
