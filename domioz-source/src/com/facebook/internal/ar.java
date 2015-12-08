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

// Referenced classes of package com.facebook.internal:
//            as, at, am

public abstract class ar
    implements ServiceConnection
{

    private final Context a;
    private final Handler b = new as(this);
    private at c;
    private boolean d;
    private Messenger e;
    private int f;
    private int g;
    private final String h;
    private final int i;

    public ar(Context context, int j, int k, int l, String s)
    {
        Context context1 = context.getApplicationContext();
        if (context1 != null)
        {
            context = context1;
        }
        a = context;
        f = j;
        g = k;
        h = s;
        i = l;
    }

    private void b(Bundle bundle)
    {
        if (d)
        {
            d = false;
            at at1 = c;
            if (at1 != null)
            {
                at1.a(bundle);
                return;
            }
        }
    }

    protected abstract void a(Bundle bundle);

    protected final void a(Message message)
    {
        if (message.what == g)
        {
            message = message.getData();
            if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
            {
                b(null);
            } else
            {
                b(message);
            }
            a.unbindService(this);
        }
    }

    public final void a(at at1)
    {
        c = at1;
    }

    public final boolean a()
    {
        if (!d && am.a(i) != -1)
        {
            android.content.Intent intent = am.b(a);
            if (intent != null)
            {
                d = true;
                a.bindService(intent, this, 1);
                return true;
            }
        }
        return false;
    }

    public final void b()
    {
        d = false;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e = new Messenger(ibinder);
        componentname = new Bundle();
        componentname.putString("com.facebook.platform.extra.APPLICATION_ID", h);
        a(componentname);
        ibinder = Message.obtain(null, f);
        ibinder.arg1 = i;
        ibinder.setData(componentname);
        ibinder.replyTo = new Messenger(b);
        try
        {
            e.send(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            b(null);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        e = null;
        try
        {
            a.unbindService(this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        b(null);
    }
}
