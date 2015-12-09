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
import com.facebook.internal.NativeProtocol;
import java.util.Date;

// Referenced classes of package com.facebook:
//            Session, AccessToken

class messageSender
    implements ServiceConnection
{

    final Messenger messageReceiver;
    Messenger messageSender;
    final Session this$0;

    private void cleanup()
    {
        if (Session.access$1600(Session.this) == this)
        {
            Session.access$1602(Session.this, null);
        }
    }

    private void refreshToken()
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", getTokenInfo().getToken());
        Message message = Message.obtain();
        message.setData(bundle);
        message.replyTo = messageReceiver;
        try
        {
            messageSender.send(message);
            return;
        }
        catch (RemoteException remoteexception)
        {
            cleanup();
        }
    }

    public void bind()
    {
        android.content.Intent intent = NativeProtocol.createTokenRefreshIntent(Session.getStaticContext());
        if (intent != null && Session.access$1500().bindService(intent, this, 1))
        {
            setLastAttemptedTokenExtendDate(new Date());
            return;
        } else
        {
            cleanup();
            return;
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        messageSender = new Messenger(ibinder);
        refreshToken();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        cleanup();
        Session.access$1500().unbindService(this);
    }


    andler()
    {
        this$0 = Session.this;
        super();
        messageReceiver = new Messenger(new andler(Session.this, this));
        messageSender = null;
    }
}
