// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.utils:
//            FileDownloadHelper

static final class val.callbackHandler
    implements ApiCallback
{

    final Handler val$callbackHandler;
    final Context val$context;
    final int val$fileHandlingMode;
    final HostInfo val$hostInfo;
    final HostConnection val$httpHostConnection;
    final diaInfo val$mediaInfo;

    public void onError(int i, String s)
    {
        Toast.makeText(val$context, 0x7f0700a2, 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        s = (DownloadManager)val$context.getSystemService("download");
        FileDownloadHelper.access$000(val$context, val$httpHostConnection, val$hostInfo, val$mediaInfo, val$fileHandlingMode, s, val$callbackHandler);
    }

    diaInfo(Context context1, HostConnection hostconnection, HostInfo hostinfo, diaInfo diainfo, int i, Handler handler)
    {
        val$context = context1;
        val$httpHostConnection = hostconnection;
        val$hostInfo = hostinfo;
        val$mediaInfo = diainfo;
        val$fileHandlingMode = i;
        val$callbackHandler = handler;
        super();
    }
}
