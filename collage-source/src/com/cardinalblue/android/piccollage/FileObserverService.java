// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileObserver;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.h;
import com.cardinalblue.android.piccollage.activities.PhotoProtoActivity;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            InAppNotificationService

public class FileObserverService extends Service
{

    private final String a = "FileObserverService";
    private NotificationManager b;
    private FileObserver c;
    private AtomicInteger d;

    public FileObserverService()
    {
        d = new AtomicInteger(0);
    }

    static Notification a(FileObserverService fileobserverservice, File file, Bitmap bitmap)
    {
        return fileobserverservice.a(file, bitmap);
    }

    private Notification a(File file, Bitmap bitmap)
    {
        String s = getString(0x7f070243);
        String s1 = getString(0x7f070240);
        file = Uri.fromFile(file);
        Object obj = new Bundle();
        ((Bundle) (obj)).putParcelable("android.intent.extra.STREAM", file);
        ((Bundle) (obj)).putInt("key_notification_id", 0xf4240);
        ((Bundle) (obj)).putBoolean("key_is_gcm_notification", false);
        file = (new h(this)).a(com/cardinalblue/android/piccollage/activities/PhotoProtoActivity).a("android.intent.action.SEND").b("image/*").b(0x14000000).a(((Bundle) (obj))).c(0x10000000);
        obj = new Bundle();
        ((Bundle) (obj)).putString("extra_pref_name", "key_create_collage_reminder_notification");
        ((Bundle) (obj)).putInt("key_notification_id", 0xf4240);
        obj = (new h(this)).a(com/cardinalblue/android/piccollage/InAppNotificationService).a("piccollage.intent.action.DISABLE_PREF").b(0x14000000).a(((Bundle) (obj))).d(0x10000000);
        android.support.v4.app.NotificationCompat.BigPictureStyle bigpicturestyle = new android.support.v4.app.NotificationCompat.BigPictureStyle();
        bigpicturestyle.setBigContentTitle(s).setSummaryText(s1).bigPicture(bitmap).bigLargeIcon(bitmap);
        return (new android.support.v4.app.NotificationCompat.Builder(this)).setStyle(bigpicturestyle).setSmallIcon(0x7f02020f).setLargeIcon(bitmap).setContentTitle(s).setContentText(s1).addAction(0, getString(0x7f070241), ((PendingIntent) (obj))).setAutoCancel(true).setContentIntent(file).build();
    }

    static AtomicInteger a(FileObserverService fileobserverservice)
    {
        return fileobserverservice.d;
    }

    static boolean a(FileObserverService fileobserverservice, String s)
    {
        return fileobserverservice.a(s);
    }

    private boolean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = s.toLowerCase(Locale.getDefault())).endsWith(".png") || s.endsWith(".jpg"))
            {
                return true;
            }
        }
        return false;
    }

    static NotificationManager b(FileObserverService fileobserverservice)
    {
        return fileobserverservice.b;
    }

    public IBinder onBind(Intent intent)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate()
    {
        super.onCreate();
        b = (NotificationManager)getSystemService("notification");
        AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
        String s = (new StringBuilder()).append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)).append("/Camera").toString();
        Log.v("FileObserverService", (new StringBuilder()).append("FileObserverService monitor path ").append(s).toString());
        c = new FileObserver(s, 8, s) {

            final String a;
            final FileObserverService b;

            public void onEvent(int i, String s1)
            {
                if (k.j().getBoolean("key_create_collage_reminder_notification", true) && FileObserverService.a(b, s1))
                {
                    Log.v("FileObserverService", (new StringBuilder()).append("File created [").append(s1).append("] : ").append(i).toString());
                    if (FileObserverService.a(b).incrementAndGet() % 10 == 0)
                    {
                        s1 = new File(a, s1);
                        j.a(new Callable(this, s1) {

                            final File a;
                            final _cls1 b;

                            public Bitmap a()
                                throws Exception
                            {
                                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                                options.inSampleSize = 8;
                                return BitmapFactory.decodeFile(a.getAbsolutePath(), options);
                            }

                            public Object call()
                                throws Exception
                            {
                                return a();
                            }

            
            {
                b = _pcls1;
                a = file;
                super();
            }
                        }).c(new i(this, s1) {

                            final File a;
                            final _cls1 b;

                            public Object then(j j1)
                                throws Exception
                            {
                                if (j1.e() == null)
                                {
                                    return null;
                                } else
                                {
                                    FileObserverService.b(b.b).notify(0xf4240, FileObserverService.a(b.b, a, (Bitmap)j1.e()));
                                    return null;
                                }
                            }

            
            {
                b = _pcls1;
                a = file;
                super();
            }
                        }, k.a).a(new i(this) {

                            final _cls1 a;

                            public Object then(j j1)
                                throws Exception
                            {
                                if (j1.d())
                                {
                                    j1.f().printStackTrace();
                                }
                                return null;
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        return;
                    }
                }
            }

            
            {
                b = FileObserverService.this;
                a = s1;
                super(s, i);
            }
        };
        c.startWatching();
        if (alarmmanager != null)
        {
            Intent intent = new Intent(this, com/cardinalblue/android/piccollage/FileObserverService);
            alarmmanager.setInexactRepeating(3, SystemClock.elapsedRealtime() + 0x1b7740L, 0x1b7740L, PendingIntent.getService(this, 0, intent, 0));
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        c.stopWatching();
    }
}
