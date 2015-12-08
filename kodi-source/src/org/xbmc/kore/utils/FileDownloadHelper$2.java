// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;
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
    final List val$mediaInfoList;

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
        diaInfo diainfo;
        for (Iterator iterator = val$mediaInfoList.iterator(); iterator.hasNext(); FileDownloadHelper.access$000(val$context, val$httpHostConnection, val$hostInfo, diainfo, val$fileHandlingMode, s, val$callbackHandler))
        {
            diainfo = (diaInfo)iterator.next();
        }

    }

    diaInfo(Context context1, List list, HostConnection hostconnection, HostInfo hostinfo, int i, Handler handler)
    {
        val$context = context1;
        val$mediaInfoList = list;
        val$httpHostConnection = hostconnection;
        val$hostInfo = hostinfo;
        val$fileHandlingMode = i;
        val$callbackHandler = handler;
        super();
    }
}
