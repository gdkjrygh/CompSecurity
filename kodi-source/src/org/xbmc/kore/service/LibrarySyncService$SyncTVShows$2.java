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

class val.startIdx
    implements ApiCallback
{

    final val.allResults this$0;
    final List val$allResults;
    final Handler val$callbackHandler;
    final ContentResolver val$contentResolver;
    final HostConnection val$hostConnection;
    final or val$orchestrator;
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
        val$allResults.addAll(list);
        if (list.size() == 300)
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "syncAllTVShows: More tv shows on media center, recursing.");
            cess._mth900(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$startIdx + 300, val$allResults);
            return;
        } else
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "syncAllTVShows: Got all tv shows");
            cess._mth700(this._cls0.this, val$contentResolver, cess._mth500(this._cls0.this), -1);
            cess._mth800(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$allResults);
            return;
        }
    }

    or()
    {
        this$0 = final_or;
        val$allResults = list;
        val$orchestrator = or1;
        val$hostConnection = hostconnection;
        val$callbackHandler = handler;
        val$contentResolver = contentresolver;
        val$startIdx = I.this;
        super();
    }
}
