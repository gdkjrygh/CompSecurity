// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Handler;
import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity

class val.callbackHandler
    implements ApiCallback
{

    final RemoteActivity this$0;
    final Handler val$callbackHandler;
    final HostConnection val$connection;
    final String val$file;

    public void onError(int i, String s)
    {
        Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d6), new Object[] {
            s
        }), 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        RemoteActivity.access$200(RemoteActivity.this, val$file, true, val$connection, val$callbackHandler);
    }

    on()
    {
        this$0 = final_remoteactivity;
        val$file = s;
        val$connection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
