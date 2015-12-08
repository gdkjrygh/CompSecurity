// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.roidapp.videolib.core.a.b;
import com.roidapp.videolib.e;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.videolib.core:
//            j, k

public class VideoEncodeService extends Service
{

    private Messenger a;
    private Messenger b;
    private WeakReference c;
    private b d;
    private Handler e;

    public VideoEncodeService()
    {
        d = new j(this);
        e = new k(this);
    }

    static Messenger a(VideoEncodeService videoencodeservice, Messenger messenger)
    {
        videoencodeservice.b = messenger;
        return messenger;
    }

    static WeakReference a(VideoEncodeService videoencodeservice)
    {
        return videoencodeservice.c;
    }

    static WeakReference a(VideoEncodeService videoencodeservice, WeakReference weakreference)
    {
        videoencodeservice.c = weakreference;
        return weakreference;
    }

    private void a(Message message)
    {
        if (b == null || message == null)
        {
            return;
        }
        message.replyTo = a;
        try
        {
            b.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
        }
    }

    static void a(VideoEncodeService videoencodeservice, int i, int l, String s, String s1, String s2)
    {
        Message message = Message.obtain(null, 47875, i, l);
        Bundle bundle = new Bundle();
        bundle.putString("eclass", s);
        bundle.putString("emsg", s1);
        bundle.putString("errorpath", s2);
        message.setData(bundle);
        videoencodeservice.a(message);
    }

    static void a(VideoEncodeService videoencodeservice, Message message)
    {
        videoencodeservice.a(message);
    }

    static b b(VideoEncodeService videoencodeservice)
    {
        return videoencodeservice.d;
    }

    public IBinder onBind(Intent intent)
    {
        return a.getBinder();
    }

    public void onCreate()
    {
        a = new Messenger(e);
        com.roidapp.videolib.e.a().e(this);
    }

    public void onDestroy()
    {
        b = null;
        super.onDestroy();
    }

    public void onRebind(Intent intent)
    {
    }

    public int onStartCommand(Intent intent, int i, int l)
    {
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }
}
