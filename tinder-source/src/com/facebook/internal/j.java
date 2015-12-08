// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class j
    implements ServiceConnection
{
    public static interface a
    {

        public abstract void a(Bundle bundle);
    }


    public final Context a;
    public a b;
    public boolean c;
    int d;
    public final int e = 0x133060d;
    private final Handler f = new Handler() {

        final j a;

        public final void handleMessage(Message message)
        {
            j j1 = a;
            if (message.what == j1.d)
            {
                message = message.getData();
                if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
                {
                    j1.a(null);
                } else
                {
                    j1.a(message);
                }
                j1.a.unbindService(j1);
            }
        }

            
            {
                a = j.this;
                super();
            }
    };
    private Messenger g;
    private int h;
    private final String i;

    public j(Context context, String s)
    {
        Context context1 = context.getApplicationContext();
        if (context1 != null)
        {
            context = context1;
        }
        a = context;
        h = 0x10000;
        d = 0x10001;
        i = s;
    }

    final void a(Bundle bundle)
    {
        if (c)
        {
            c = false;
            a a1 = b;
            if (a1 != null)
            {
                a1.a(bundle);
                return;
            }
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        g = new Messenger(ibinder);
        componentname = new Bundle();
        componentname.putString("com.facebook.platform.extra.APPLICATION_ID", i);
        ibinder = Message.obtain(null, h);
        ibinder.arg1 = e;
        ibinder.setData(componentname);
        ibinder.replyTo = new Messenger(f);
        try
        {
            g.send(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            a(null);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        g = null;
        try
        {
            a.unbindService(this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        a(null);
    }
}
