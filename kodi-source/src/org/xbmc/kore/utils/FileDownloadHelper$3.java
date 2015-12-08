// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.widget.Toast;
import java.io.File;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.utils:
//            FileDownloadHelper

static final class val.downloadManager
    implements ApiCallback
{

    final Context val$context;
    final DownloadManager val$downloadManager;
    final int val$fileHandlingMode;
    final HostInfo val$hostInfo;
    final diaInfo val$mediaInfo;

    public void onError(int i, String s)
    {
        Toast.makeText(val$context, String.format(val$context.getString(0x7f07003f), new Object[] {
            val$mediaInfo.getDownloadTitle(val$context)
        }), 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.loadReturnType)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type.loadReturnType loadreturntype)
    {
        if (val$fileHandlingMode == 0)
        {
            File file = new File(val$mediaInfo.getAbsoluteFilePath());
            if (file.exists())
            {
                file.delete();
            }
        }
        loadreturntype = new android.app.st(Uri.parse((new StringBuilder()).append(val$hostInfo.getHttpURL()).append("/").append(loadreturntype.path).toString()));
        if (val$hostInfo.getUsername() != null && !val$hostInfo.getUsername().isEmpty() && val$hostInfo.getPassword() != null && !val$hostInfo.getPassword().isEmpty())
        {
            String s = Base64.encodeToString((new StringBuilder()).append(val$hostInfo.getUsername()).append(":").append(val$hostInfo.getPassword()).toString().getBytes(), 0);
            loadreturntype.addRequestHeader("Authorization", (new StringBuilder()).append("Basic ").append(s).toString());
        }
        loadreturntype.allowScanningByMediaScanner();
        loadreturntype.setAllowedNetworkTypes(2);
        loadreturntype.setTitle(val$mediaInfo.getDownloadTitle(val$context));
        loadreturntype.setDescription(val$mediaInfo.getDownloadDescrition(val$context));
        loadreturntype.setDestinationInExternalPublicDir(val$mediaInfo.getExternalPublicDirType(), val$mediaInfo.getRelativeFilePath());
        val$downloadManager.enqueue(loadreturntype);
    }

    diaInfo(int i, diaInfo diainfo, HostInfo hostinfo, Context context1, DownloadManager downloadmanager)
    {
        val$fileHandlingMode = i;
        val$mediaInfo = diainfo;
        val$hostInfo = hostinfo;
        val$context = context1;
        val$downloadManager = downloadmanager;
        super();
    }
}
