// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.os.Handler;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

class val.properties
    implements ApiCallback
{

    final tor.syncItemFinished this$0;
    final Handler val$callbackHandler;
    final ContentResolver val$contentResolver;
    final HostConnection val$hostConnection;
    final tor val$orchestrator;
    final String val$properties[];
    final int val$startIdx;

    public void onError(int i, String s)
    {
        val$orchestrator.syncItemFailed(i, s);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        if (val$startIdx == 0)
        {
            cess._mth200(this._cls0.this, val$contentResolver, cess._mth000(this._cls0.this), -1);
        }
        if (list.size() > 0)
        {
            cess._mth300(this._cls0.this, val$orchestrator, val$contentResolver, list);
        }
        LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("syncAllMovies, movies gotten: ").append(list.size()).toString());
        if (list.size() == 300)
        {
            cess._mth400(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$properties, val$startIdx + 300);
            return;
        } else
        {
            val$orchestrator.syncItemFinished();
            return;
        }
    }

    tor()
    {
        this$0 = final_tor;
        val$startIdx = i;
        val$contentResolver = contentresolver;
        val$orchestrator = tor1;
        val$hostConnection = hostconnection;
        val$callbackHandler = handler;
        val$properties = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
