// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.am;
import java.util.Date;

// Referenced classes of package com.facebook:
//            f, d, q, AccessToken

final class e
    implements ServiceConnection
{

    final Messenger a;
    Messenger b;
    final d c;

    e(d d1, AccessToken accesstoken)
    {
        c = d1;
        super();
        b = null;
        a = new Messenger(new f(accesstoken, this));
    }

    static void a(e e1)
    {
        e1.b();
    }

    private void b()
    {
        if (d.a(c) == this)
        {
            d.b(c);
        }
    }

    public final void a()
    {
        Context context = q.f();
        android.content.Intent intent = am.a(context);
        if (intent != null && context.bindService(intent, this, 1))
        {
            d.a(c, new Date());
            return;
        } else
        {
            b();
            return;
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b = new Messenger(ibinder);
        componentname = new Bundle();
        componentname.putString("access_token", c.b().b());
        ibinder = Message.obtain();
        ibinder.setData(componentname);
        ibinder.replyTo = a;
        try
        {
            b.send(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            b();
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b();
        try
        {
            q.f().unbindService(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }
}
