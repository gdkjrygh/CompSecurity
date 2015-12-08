// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Handler;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity

class val.callbackHandler
    implements ApiCallback
{

    final RemoteActivity this$0;
    final Handler val$callbackHandler;
    final HostConnection val$connection;
    final String val$kodiAddonUrl;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(RemoteActivity.access$300(), "Couldn't get active player when handling start intent.");
        Toast.makeText(RemoteActivity.this, String.format(getString(0x7f0700d3), new Object[] {
            s
        }), 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((ArrayList)obj);
    }

    public void onSuccess(ArrayList arraylist)
    {
        boolean flag = false;
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            if (((org.xbmc.kore.jsonrpc.type.ivePlayersReturnType)arraylist.next()).type.equals("video"))
            {
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            RemoteActivity.access$100(RemoteActivity.this, val$kodiAddonUrl, val$connection, val$callbackHandler);
            return;
        } else
        {
            RemoteActivity.access$200(RemoteActivity.this, val$kodiAddonUrl, false, val$connection, val$callbackHandler);
            return;
        }
    }

    on()
    {
        this$0 = final_remoteactivity;
        val$kodiAddonUrl = s;
        val$connection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
