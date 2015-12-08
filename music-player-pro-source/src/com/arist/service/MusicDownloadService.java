// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.format.Formatter;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.arist.MusicPlayer.MainActivity;
import com.arist.util.Constant;
import com.arist.util.HttpService;
import com.arist.util.StreamService;
import java.io.File;
import java.io.IOException;

public class MusicDownloadService extends IntentService
{

    private static final int MSG_TAG_EXISTS = 1;
    private static final int MSG_TAG_FAILED = 4;
    private static final int MSG_TAG_FINISHED = 3;
    private static final int MSG_TAG_STARTED = 2;
    private static final int NOTI_ID = 1000;
    private String albumName;
    private long fileLength;
    private Handler handler;
    private NotificationManager manager;
    private String musicName;
    private Notification noti;
    private StreamService streamService;

    public MusicDownloadService()
    {
        super("workThread");
    }

    private String formatFileLength(long l)
    {
        return Formatter.formatFileSize(this, l);
    }

    public void onCreate()
    {
        super.onCreate();
        streamService = new StreamService();
        manager = (NotificationManager)getSystemService("notification");
        noti = new Notification(0x7f020064, getString(0x7f08007e), System.currentTimeMillis());
        noti.defaults = 4;
        noti.flags = 32;
        PendingIntent pendingintent = PendingIntent.getActivity(this, 0, new Intent(this, com/arist/MusicPlayer/MainActivity), 0x8000000);
        noti.contentIntent = pendingintent;
        noti.contentView = new RemoteViews(getPackageName(), 0x7f030009);
        handler = new Handler() {

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
                    noti.contentView.setTextViewText(0x7f0d0037, (new StringBuilder(String.valueOf(musicName))).append(".mp3").toString());
                    noti.contentView.setTextViewText(0x7f0d003a, formatFileLength(0L));
                    if (fileLength == -1L || fileLength == 0L)
                    {
                        noti.contentView.setTextViewText(0x7f0d0038, formatFileLength(0L));
                        noti.contentView.setProgressBar(0x7f0d003b, 0, 0, true);
                    } else
                    {
                        noti.contentView.setTextViewText(0x7f0d0038, formatFileLength(fileLength));
                        noti.contentView.setProgressBar(0x7f0d003b, (int)fileLength, 0, false);
                    }
                    manager.notify(1000, noti);
                    return;

                case 6: // '\006'
                    noti.contentView.setTextViewText(0x7f0d0037, (new StringBuilder(String.valueOf(musicName))).append(".mp3").toString());
                    noti.contentView.setTextViewText(0x7f0d003a, formatFileLength(message.arg1 * 1024));
                    if (fileLength == -1L || fileLength == 0L)
                    {
                        noti.contentView.setTextViewText(0x7f0d0038, formatFileLength(message.arg1 * 1024));
                    } else
                    {
                        noti.contentView.setTextViewText(0x7f0d0038, formatFileLength(fileLength));
                        noti.contentView.setProgressBar(0x7f0d003b, (int)fileLength, message.arg1 * 1024, false);
                    }
                    manager.notify(1000, noti);
                    return;

                case 4: // '\004'
                    message = new Notification(0x7f020064, getString(0x7f080080), System.currentTimeMillis());
                    message.setLatestEventInfo(MusicDownloadService.this, getString(0x7f080080), (new StringBuilder(String.valueOf(getString(0x7f080081)))).append(musicName).toString(), PendingIntent.getActivity(MusicDownloadService.this, 0, new Intent(MusicDownloadService.this, com/arist/MusicPlayer/MainActivity), 0x8000000));
                    message.flags = 16;
                    message.defaults = 4;
                    manager.notify(1, message);
                    // fall through

                case 3: // '\003'
                    message = new Intent("com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW");
                    message.putExtra("name", musicName);
                    message.putExtra("albumName", albumName);
                    sendBroadcast(message);
                    manager.cancel(1000);
                    return;
                }
            }

            
            {
                this$0 = MusicDownloadService.this;
                super();
            }
        };
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = intent.getStringExtra("uri");
        musicName = intent.getStringExtra("musicName");
        albumName = intent.getStringExtra("AlbumName");
        intent = (new StringBuilder(String.valueOf(Constant.BASE_DOWNLOAD_PATH))).append(musicName).append(".mp3").toString();
        File file = new File(intent);
        if (!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        if ((new File(intent)).exists())
        {
            obj = Message.obtain();
            obj.what = 1;
            obj.obj = intent;
            handler.sendMessage(((Message) (obj)));
            return;
        }
        try
        {
            obj = HttpService.getEntity(((String) (obj)), null, 1);
            fileLength = HttpService.getLength(((org.apache.http.HttpEntity) (obj)));
            handler.sendEmptyMessage(2);
            obj = HttpService.getStream(((org.apache.http.HttpEntity) (obj)));
            streamService.save(((java.io.InputStream) (obj)), intent, handler);
            intent = Message.obtain();
            intent.what = 3;
            handler.sendMessage(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
        }
        intent = Message.obtain();
        intent.what = 4;
        handler.sendMessage(intent);
    }






}
