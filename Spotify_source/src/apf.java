// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.AccessToken;
import com.facebook.Session;

public final class apf
    implements ServiceConnection
{

    public final Session a;
    private Messenger b;
    private Messenger c;

    public apf(Session session)
    {
        a = session;
        super();
        b = new Messenger(new apg(a, this));
        c = null;
    }

    static void a(apf apf1)
    {
        apf1.a();
    }

    public final void a()
    {
        if (Session.d(a) == this)
        {
            Session.e(a);
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c = new Messenger(ibinder);
        componentname = new Bundle();
        componentname.putString("access_token", a.tokenInfo.token);
        ibinder = Message.obtain();
        ibinder.setData(componentname);
        ibinder.replyTo = b;
        try
        {
            c.send(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a();
        Session.i().unbindService(this);
    }
}
