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
//            AccessTokenManager, AccessToken, FacebookSdk

class andler
    implements ServiceConnection
{

    final Messenger messageReceiver;
    Messenger messageSender;
    final AccessTokenManager this$0;

    private void cleanup()
    {
        if (AccessTokenManager.access$100(AccessTokenManager.this) == this)
        {
            AccessTokenManager.access$102(AccessTokenManager.this, null);
        }
    }

    private void refreshToken()
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", getCurrentAccessToken().getToken());
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
        Context context = FacebookSdk.getApplicationContext();
        android.content.Intent intent = NativeProtocol.createTokenRefreshIntent(context);
        if (intent != null && context.bindService(intent, this, 1))
        {
            AccessTokenManager.access$002(AccessTokenManager.this, new Date());
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
        try
        {
            FacebookSdk.getApplicationContext().unbindService(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }


    andler(AccessToken accesstoken)
    {
        this$0 = AccessTokenManager.this;
        super();
        messageSender = null;
        messageReceiver = new Messenger(new andler(accesstoken, this));
    }
}
