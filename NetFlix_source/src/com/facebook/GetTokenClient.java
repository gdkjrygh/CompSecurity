// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

// Referenced classes of package com.facebook:
//            NativeProtocol

final class GetTokenClient
    implements ServiceConnection
{
    static interface CompletedListener
    {

        public abstract void completed(Bundle bundle);
    }


    final String applicationId;
    final Context context;
    final Handler handler = new Handler() {

        final GetTokenClient this$0;

        public void handleMessage(Message message)
        {
            GetTokenClient.this.handleMessage(message);
        }

            
            {
                this$0 = GetTokenClient.this;
                super();
            }
    };
    CompletedListener listener;
    boolean running;
    Messenger sender;

    GetTokenClient(Context context1, String s)
    {
        Context context2 = context1.getApplicationContext();
        if (context2 != null)
        {
            context1 = context2;
        }
        context = context1;
        applicationId = s;
    }

    private void callback(Bundle bundle)
    {
        if (running)
        {
            running = false;
            CompletedListener completedlistener = listener;
            if (completedlistener != null)
            {
                completedlistener.completed(bundle);
                return;
            }
        }
    }

    private void getToken()
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", applicationId);
        Message message = Message.obtain(null, 0x10000);
        message.arg1 = 0x133060d;
        message.setData(bundle);
        message.replyTo = new Messenger(handler);
        try
        {
            sender.send(message);
            return;
        }
        catch (RemoteException remoteexception)
        {
            callback(null);
        }
    }

    private void handleMessage(Message message)
    {
        if (message.what == 0x10001)
        {
            message = message.getData();
            if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
            {
                callback(null);
            } else
            {
                callback(message);
            }
            context.unbindService(this);
        }
    }

    void cancel()
    {
        running = false;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        sender = new Messenger(ibinder);
        getToken();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        sender = null;
        context.unbindService(this);
        callback(null);
    }

    void setCompletedListener(CompletedListener completedlistener)
    {
        listener = completedlistener;
    }

    boolean start()
    {
        Intent intent = new Intent("com.facebook.platform.PLATFORM_SERVICE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent = NativeProtocol.validateKatanaServiceIntent(context, intent);
        if (intent == null)
        {
            callback(null);
            return false;
        } else
        {
            running = true;
            context.bindService(intent, this, 1);
            return true;
        }
    }

}
