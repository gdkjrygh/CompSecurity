// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

// Referenced classes of package com.facebook.android:
//            Facebook

class serviceListener
    implements ServiceConnection
{

    final Context applicationsContext;
    final Messenger messageReceiver;
    Messenger messageSender;
    final applicationsContext serviceListener;
    final Facebook this$0;

    private void refreshToken()
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", Facebook.access$100(Facebook.this));
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
            serviceListener.serviceListener(new Error("Service connection error"));
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        messageSender = new Messenger(ibinder);
        refreshToken();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        serviceListener.serviceListener(new Error("Service disconnected"));
        try
        {
            applicationsContext.unbindService(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public A(Context context, A a)
    {
        this$0 = Facebook.this;
        super();
        messageReceiver = new Messenger(new <init>(Facebook.this, this));
        messageSender = null;
        applicationsContext = context;
        serviceListener = a;
    }
}
