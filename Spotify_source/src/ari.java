// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class ari
    implements ServiceConnection
{

    final Context a;
    public arj b;
    public boolean c;
    int d;
    private final Handler e = new Handler() {

        private ari a;

        public final void handleMessage(Message message)
        {
            ari ari1 = a;
            if (message.what == ari1.d)
            {
                message = message.getData();
                if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
                {
                    ari1.b(null);
                } else
                {
                    ari1.b(message);
                }
                ari1.a.unbindService(ari1);
            }
        }

            
            {
                a = ari.this;
                super();
            }
    };
    private Messenger f;
    private int g;
    private final String h;
    private final int i;

    public ari(Context context, int j, int k, int l, String s)
    {
        Context context1 = context.getApplicationContext();
        if (context1 != null)
        {
            context = context1;
        }
        a = context;
        g = j;
        d = k;
        h = s;
        i = l;
    }

    public abstract void a(Bundle bundle);

    public final boolean a()
    {
        if (!c && arc.a(a, i) != -1)
        {
            android.content.Intent intent = arc.b(a);
            if (intent != null)
            {
                c = true;
                a.bindService(intent, this, 1);
                return true;
            }
        }
        return false;
    }

    final void b(Bundle bundle)
    {
        if (c)
        {
            c = false;
            arj arj1 = b;
            if (arj1 != null)
            {
                arj1.a(bundle);
                return;
            }
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        f = new Messenger(ibinder);
        componentname = new Bundle();
        componentname.putString("com.facebook.platform.extra.APPLICATION_ID", h);
        a(componentname);
        ibinder = Message.obtain(null, g);
        ibinder.arg1 = i;
        ibinder.setData(componentname);
        ibinder.replyTo = new Messenger(e);
        try
        {
            f.send(ibinder);
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
        f = null;
        a.unbindService(this);
        b(null);
    }
}
