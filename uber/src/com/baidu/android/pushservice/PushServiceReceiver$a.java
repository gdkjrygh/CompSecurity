// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.baidu.android.pushservice.message.PublicMsg;
import com.baidu.android.pushservice.richmedia.MediaViewActivity;
import com.baidu.android.pushservice.richmedia.b;
import com.baidu.android.pushservice.richmedia.m;
import com.baidu.android.pushservice.richmedia.n;
import com.baidu.android.pushservice.richmedia.p;
import com.baidu.android.pushservice.richmedia.q;
import com.baidu.android.pushservice.util.PushDatabase;
import java.io.File;

class g
    implements q
{

    public Context a;
    public RemoteViews b;
    public int c;
    public int d;
    public int e;
    public int f;
    NotificationManager g;

    public void a(b b1)
    {
        b1 = a.getResources();
        String s = a.getPackageName();
        if (b1 != null)
        {
            int i = b1.getIdentifier("bpush_download_progress", "layout", s);
            b = new RemoteViews(a.getPackageName(), i);
            if (i != 0)
            {
                c = b1.getIdentifier("bpush_download_progress", "id", s);
                d = b1.getIdentifier("bpush_progress_percent", "id", s);
                e = b1.getIdentifier("bpush_progress_text", "id", s);
                f = b1.getIdentifier("bpush_download_icon", "id", s);
                b.setImageViewResource(f, a.getApplicationInfo().icon);
                return;
            }
        }
    }

    public void a(b b1, m m1)
    {
        b1 = b1.d.d();
        if (m1.a != m1.b && b != null)
        {
            int i = (int)(((double)m1.a * 100D) / (double)m1.b);
            b.setTextViewText(d, (new StringBuilder()).append(i).append("%").toString());
            b.setTextViewText(e, (new StringBuilder("\u6B63\u5728\u4E0B\u8F7D\u5BCC\u5A92\u4F53:")).append(b1).toString());
            b.setProgressBar(c, 100, i, false);
            m1 = new Notification(0x1080081, null, System.currentTimeMillis());
            m1.contentView = b;
            m1.contentIntent = PendingIntent.getActivity(a, 0, new Intent(), 0);
            m1.flags = ((Notification) (m1)).flags | 0x20;
            m1.flags = ((Notification) (m1)).flags | 2;
            g.notify(b1, 0, m1);
        }
    }

    public void a(b b1, p p)
    {
        b1 = b1.d.d();
        g.cancel(b1, 0);
        p = PushDatabase.getFileDownloadingInfo(a, b1);
        if (p != null && ((com.baidu.android.pushservice.util.wnloadingInfo) (p)).wnloadingInfo == b.f)
        {
            b1 = ((com.baidu.android.pushservice.util.wnloadingInfo) (p)).wnloadingInfo;
            p = ((com.baidu.android.pushservice.util.wnloadingInfo) (p)).wnloadingInfo;
            b1 = (new StringBuilder()).append(b1).append("/").append(p.substring(0, p.lastIndexOf("."))).append("/index.html").toString();
            p = new Intent();
            p.setClass(a, com/baidu/android/pushservice/richmedia/MediaViewActivity);
            p.setData(Uri.fromFile(new File(b1)));
            p.addFlags(0x10000000);
            a.startActivity(p);
        }
    }

    public void a(b b1, Throwable throwable)
    {
        b1 = b1.d.d();
        g.cancel(b1, 0);
        b1 = Toast.makeText(a, (new StringBuilder("\u4E0B\u8F7D\u5BCC\u5A92\u4F53")).append(Uri.parse(b1).getAuthority()).append("\u5931\u8D25").toString(), 1);
        b1.setGravity(17, 0, 0);
        b1.show();
    }

    public void b(b b1)
    {
        b1 = b1.d.d();
        g.cancel(b1, 0);
    }

    ivity(Context context, PublicMsg publicmsg)
    {
        a = null;
        b = null;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        a = context;
        g = (NotificationManager)context.getSystemService("notification");
    }
}
