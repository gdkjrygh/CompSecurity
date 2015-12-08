// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.x;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.facebook.ak;
import com.roidapp.cloudlib.twitter.TwitterVerifyActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import twitter4j.TwitterException;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            a, c, w, UploadManagerActivity, 
//            u, v, f, t

public class UploadPhotoService extends a
{

    private NotificationManager a;
    private android.support.v4.app.NotificationCompat.Builder b;
    private c c;
    private int d;
    private boolean e;

    public UploadPhotoService()
    {
        super("PhotoGridUploadPhotoService");
        d = 0;
    }

    public UploadPhotoService(String s)
    {
        super(s);
        d = 0;
    }

    private void a()
    {
        String s;
        String s1;
label0:
        {
            s = getString(at.bf, new Object[] {
                Integer.valueOf(c.d()), Integer.valueOf(c.e() - c.d())
            });
            if (!c.f())
            {
                s1 = getString(at.bh);
                if (c.d() != c.c())
                {
                    break label0;
                }
                a(s1, s, aq.t);
            }
            return;
        }
        a(s1, s, aq.v);
    }

    static void a(UploadPhotoService uploadphotoservice)
    {
        String s = uploadphotoservice.getString(at.bf, new Object[] {
            Integer.valueOf(uploadphotoservice.c.d()), Integer.valueOf(uploadphotoservice.c.e() - uploadphotoservice.c.d())
        });
        uploadphotoservice.a(uploadphotoservice.getString(at.bg, new Object[] {
            Integer.valueOf(uploadphotoservice.c.c())
        }), s, -1);
    }

    private void a(String s, String s1, int i)
    {
        w.a(this);
        if (b == null)
        {
            b = new android.support.v4.app.NotificationCompat.Builder(this);
        }
        if (i != -1)
        {
            b.setSmallIcon(i);
        }
        b.setLargeIcon(BitmapFactory.decodeResource(getResources(), aq.E));
        b.setTicker("");
        Object obj = new Intent(this, com/roidapp/cloudlib/upload/UploadManagerActivity);
        ((Intent) (obj)).setFlags(0x10000000);
        obj = PendingIntent.getActivity(this, 0, ((Intent) (obj)), 0);
        b.setContentIntent(((PendingIntent) (obj)));
        b.setContentTitle(s);
        b.setContentText(s1);
        if (i != -1)
        {
            if (i != aq.b)
            {
                b.setAutoCancel(true);
                b.setOngoing(false);
                e = true;
            } else
            {
                b.setAutoCancel(false);
                b.setOngoing(true);
                e = false;
            }
        }
        a.notify(3366, b.build());
    }

    protected final void a(Intent intent)
    {
        String s;
        String s1;
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        boolean flag2 = false;
        s = intent.getStringExtra("service_name");
        s1 = intent.getStringExtra("image_path");
        obj = intent.getStringExtra("message");
        String s2 = intent.getStringExtra("image_format");
        String s3 = intent.getStringExtra("ga_mode");
        d = intent.getIntExtra("current_index", 0x80000000);
        if (d == 0x80000000)
        {
            return;
        }
        if (!c.b(d))
        {
            break MISSING_BLOCK_LABEL_569;
        }
        intent = getString(at.bf, new Object[] {
            Integer.valueOf(c.d()), Integer.valueOf(c.e() - c.d())
        });
        a(getString(at.bg, new Object[] {
            Integer.valueOf(c.c())
        }), ((String) (intent)), aq.b);
        long l;
        if (s2 != null && s2.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent = new CountDownLatch(1);
        obj = new u(this, s1, s, flag, ((String) (obj)), s2, s3, intent);
        ((v) (obj)).start();
        if (flag)
        {
            l = 1200L;
        } else
        {
            l = 300L;
        }
        flag = flag2;
        flag2 = intent.await(l, TimeUnit.SECONDS);
        flag = flag2;
        flag1 = flag2;
        (new StringBuilder("upload ")).append(s).append(" finish, thread result=").append(flag2);
        (new StringBuilder("uploadTo")).append(s).append(" end, result=").append(((v) (obj)).j);
        ((v) (obj)).interrupt();
        if (((v) (obj)).i != null && !((v) (obj)).i.equals(s1))
        {
            (new File(((v) (obj)).i)).delete();
        }
        if (!flag2)
        {
            c.a(d, f.c);
        }
        a();
        return;
        intent;
        flag1 = flag;
        intent.printStackTrace();
        (new StringBuilder("uploadTo")).append(s).append(" end, result=").append(((v) (obj)).j);
        ((v) (obj)).interrupt();
        if (((v) (obj)).i != null && !((v) (obj)).i.equals(s1))
        {
            (new File(((v) (obj)).i)).delete();
        }
        if (!flag)
        {
            c.a(d, f.c);
        }
        a();
        return;
        intent;
        (new StringBuilder("uploadTo")).append(s).append(" end, result=").append(((v) (obj)).j);
        ((v) (obj)).interrupt();
        if (((v) (obj)).i != null && !((v) (obj)).i.equals(s1))
        {
            (new File(((v) (obj)).i)).delete();
        }
        if (!flag1)
        {
            c.a(d, f.c);
        }
        a();
        throw intent;
        (new StringBuilder("Task[")).append(d).append("] has been removed");
        return;
    }

    public final volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public final boolean a(String s, String s1, String s2)
    {
        (new StringBuilder("uploadToTwitter, taskid=")).append(d).append(",imgPath=").append(s).append(",msg=").append(s1);
        c.a(d, com.roidapp.cloudlib.upload.f.b);
        TwitterVerifyActivity.a(getBaseContext(), s, s1);
        boolean flag = true;
_L2:
        if (flag)
        {
            c.a(d, f.d);
            al.g().a(this, String.format("Cloud/Share/%s/Twitter/OK", new Object[] {
                s2
            }));
            com.roidapp.baselib.c.b.e("Twitter", s2);
        }
        return flag;
        s;
        s.printStackTrace();
        c.a(d, f.c);
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a(String s, String s1, boolean flag, String s2)
    {
        AccessToken accesstoken;
        (new StringBuilder("uploadToFacebook, taskid=")).append(d).append(",imgPath=").append(s).append(",msg=").append(s1);
        accesstoken = com.roidapp.cloudlib.facebook.al.b();
        if (accesstoken == null || accesstoken.isExpired()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new ak(this, Uri.parse((new StringBuilder("file://")).append(s).toString()));
        c.a(d, com.roidapp.cloudlib.upload.f.b);
        obj = ((ak) (obj)).a();
        if (obj != null) goto _L4; else goto _L3
_L3:
        int i = 1;
          goto _L5
_L18:
        s = new File(s);
        obj = new Bundle(2);
        if (!flag) goto _L7; else goto _L6
_L6:
        ((Bundle) (obj)).putString("description", s1);
_L11:
        s1 = ParcelFileDescriptor.open(s, 0x10000000);
        ((Bundle) (obj)).putParcelable(s.getName(), s1);
        if (flag)
        {
            s = "me/videos";
        } else
        {
            s = "me/photos";
        }
        s = new GraphRequestBatch(new GraphRequest[] {
            new GraphRequest(accesstoken, s, ((Bundle) (obj)), HttpMethod.POST)
        });
        if (flag)
        {
            i = 0x1d4c0;
        } else
        {
            i = 30000;
        }
        s.setTimeout(i);
        s = GraphRequest.executeBatchAndWait(s);
        if (s == null) goto _L9; else goto _L8
_L8:
        if (s.size() == 1) goto _L10; else goto _L9
_L9:
        Log.w("UploadPhotoService", "uploadToFacebook failed.");
        c.a(d, f.c);
        return false;
_L4:
        if (((Integer)((x) (obj)).b).intValue() < 480)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L5
_L7:
        ((Bundle) (obj)).putString("caption", s1);
          goto _L11
        s;
        flag = false;
_L17:
        c.a(d, f.c);
        s.printStackTrace();
_L12:
        return flag;
_L10:
        if (((GraphResponse)s.get(0)).getError() != null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        c.a(d, f.d);
        al.g().a(this, String.format("Cloud/Share/%s/Facebook/OK", new Object[] {
            s2
        }));
        com.roidapp.baselib.c.b.e("Facebook", s2);
        flag = true;
          goto _L12
        c.a(d, f.c);
        flag = false;
          goto _L12
_L19:
        s = new File(s);
        Bundle bundle = new Bundle(2);
        bundle.putString("caption", s1);
        s1 = ParcelFileDescriptor.open(s, 0x10000000);
        bundle.putParcelable(s.getName(), s1);
        s = new GraphRequestBatch(new GraphRequest[] {
            new GraphRequest(accesstoken, "me/photos", bundle, HttpMethod.POST)
        });
        s.setTimeout(30000);
        s = GraphRequest.executeBatchAndWait(s);
        if (s == null) goto _L14; else goto _L13
_L13:
        if (s.size() == 1) goto _L15; else goto _L14
_L14:
        Log.w("UploadPhotoService", "uploadToFacebook failed.");
        c.a(d, f.c);
        return false;
        s;
        flag = false;
_L16:
        c.a(d, f.c);
        s.printStackTrace();
          goto _L12
_L15:
        if (((GraphResponse)s.get(0)).getError() != null)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        c.a(d, f.d);
        al.g().a(this, String.format("Cloud/Share/%s/Facebook/OK", new Object[] {
            s2
        }));
        com.roidapp.baselib.c.b.e("Facebook", s2);
        flag = true;
          goto _L12
        c.a(d, f.c);
        flag = false;
          goto _L12
_L2:
        c.a(d, f.c);
        Log.e("UploadPhotoService", "facebook session not open !");
        flag = false;
          goto _L12
        s;
        flag = true;
          goto _L16
        s;
        flag = true;
          goto _L17
_L5:
        if (!flag && i == 0) goto _L19; else goto _L18
    }

    public volatile IBinder onBind(Intent intent)
    {
        return super.onBind(intent);
    }

    public void onCreate()
    {
        super.onCreate();
        super.a(true);
        c = com.roidapp.cloudlib.upload.c.a(this);
        c.a(new t(this));
        a = (NotificationManager)getSystemService("notification");
    }

    public void onDestroy()
    {
        if (a != null && !e)
        {
            a.cancel(3366);
        }
        super.onDestroy();
    }

    public void onStart(Intent intent, int i)
    {
        if (w.a(this, intent))
        {
            stopSelf(i);
            return;
        } else
        {
            super.onStart(intent, i);
            return;
        }
    }

    public volatile int onStartCommand(Intent intent, int i, int j)
    {
        return super.onStartCommand(intent, i, j);
    }
}
