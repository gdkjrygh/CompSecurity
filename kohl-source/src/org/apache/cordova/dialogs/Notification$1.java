// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.app.Activity;
import android.media.Ringtone;
import android.media.RingtoneManager;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class val.count
    implements Runnable
{

    final Notification this$0;
    final long val$count;

    public void run()
    {
        Object obj = RingtoneManager.getDefaultUri(2);
        obj = RingtoneManager.getRingtone(cordova.getActivity().getBaseContext(), ((android.net.Uri) (obj)));
        if (obj != null)
        {
            for (long l = 0L; l < val$count; l++)
            {
                ((Ringtone) (obj)).play();
                for (long l1 = 5000L; ((Ringtone) (obj)).isPlaying() && l1 > 0L;)
                {
                    l1 -= 100L;
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException interruptedexception) { }
                }

            }

        }
    }

    ()
    {
        this$0 = final_notification;
        val$count = J.this;
        super();
    }
}
