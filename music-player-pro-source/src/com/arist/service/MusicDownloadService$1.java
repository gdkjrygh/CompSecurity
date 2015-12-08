// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.arist.MusicPlayer.MainActivity;

// Referenced classes of package com.arist.service:
//            MusicDownloadService

class this._cls0 extends Handler
{

    final MusicDownloadService this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            Toast.makeText(MusicDownloadService.this, (new StringBuilder(String.valueOf(getString(0x7f08007f)))).append(message.obj.toString()).toString(), 1).show();
            return;

        case 2: // '\002'
            MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0037, (new StringBuilder(String.valueOf(MusicDownloadService.access$1(MusicDownloadService.this)))).append(".mp3").toString());
            MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d003a, MusicDownloadService.access$2(MusicDownloadService.this, 0L));
            if (MusicDownloadService.access$3(MusicDownloadService.this) == -1L || MusicDownloadService.access$3(MusicDownloadService.this) == 0L)
            {
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0038, MusicDownloadService.access$2(MusicDownloadService.this, 0L));
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setProgressBar(0x7f0d003b, 0, 0, true);
            } else
            {
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0038, MusicDownloadService.access$2(MusicDownloadService.this, MusicDownloadService.access$3(MusicDownloadService.this)));
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setProgressBar(0x7f0d003b, (int)MusicDownloadService.access$3(MusicDownloadService.this), 0, false);
            }
            MusicDownloadService.access$4(MusicDownloadService.this).notify(1000, MusicDownloadService.access$0(MusicDownloadService.this));
            return;

        case 6: // '\006'
            MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0037, (new StringBuilder(String.valueOf(MusicDownloadService.access$1(MusicDownloadService.this)))).append(".mp3").toString());
            MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d003a, MusicDownloadService.access$2(MusicDownloadService.this, message.arg1 * 1024));
            if (MusicDownloadService.access$3(MusicDownloadService.this) == -1L || MusicDownloadService.access$3(MusicDownloadService.this) == 0L)
            {
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0038, MusicDownloadService.access$2(MusicDownloadService.this, message.arg1 * 1024));
            } else
            {
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setTextViewText(0x7f0d0038, MusicDownloadService.access$2(MusicDownloadService.this, MusicDownloadService.access$3(MusicDownloadService.this)));
                MusicDownloadService.access$0(MusicDownloadService.this).contentView.setProgressBar(0x7f0d003b, (int)MusicDownloadService.access$3(MusicDownloadService.this), message.arg1 * 1024, false);
            }
            MusicDownloadService.access$4(MusicDownloadService.this).notify(1000, MusicDownloadService.access$0(MusicDownloadService.this));
            return;

        case 4: // '\004'
            message = new Notification(0x7f020064, getString(0x7f080080), System.currentTimeMillis());
            message.setLatestEventInfo(MusicDownloadService.this, getString(0x7f080080), (new StringBuilder(String.valueOf(getString(0x7f080081)))).append(MusicDownloadService.access$1(MusicDownloadService.this)).toString(), PendingIntent.getActivity(MusicDownloadService.this, 0, new Intent(MusicDownloadService.this, com/arist/MusicPlayer/MainActivity), 0x8000000));
            message.flags = 16;
            message.defaults = 4;
            MusicDownloadService.access$4(MusicDownloadService.this).notify(1, message);
            // fall through

        case 3: // '\003'
            message = new Intent("com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW");
            message.putExtra("name", MusicDownloadService.access$1(MusicDownloadService.this));
            message.putExtra("albumName", MusicDownloadService.access$5(MusicDownloadService.this));
            sendBroadcast(message);
            MusicDownloadService.access$4(MusicDownloadService.this).cancel(1000);
            return;
        }
    }

    ()
    {
        this$0 = MusicDownloadService.this;
        super();
    }
}
