// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService, SyncUtils

class val.startIdx
    implements ApiCallback
{

    final ator.syncItemFinished this$0;
    final Handler val$callbackHandler;
    final ContentResolver val$contentResolver;
    final HostConnection val$hostConnection;
    final ator val$orchestrator;
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
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList(0);
        }
        list = new ContentValues[((List) (obj)).size()];
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.cess cess = (org.xbmc.kore.jsonrpc.type.cess)((List) (obj)).get(i);
            list[i] = SyncUtils.contentValuesFromSong(cess._mth1200(this._cls0.this), cess);
        }

        val$contentResolver.bulkInsert(org.xbmc.kore.provider., list);
        if (((List) (obj)).size() == 600)
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncSongs: More results on media center, recursing.");
            cess._mth1600(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$startIdx + 600);
            return;
        } else
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncSongs: Got all results, continuing");
            val$orchestrator.syncItemFinished();
            return;
        }
    }

    ator()
    {
        this$0 = final_ator;
        val$contentResolver = contentresolver;
        val$orchestrator = ator1;
        val$hostConnection = hostconnection;
        val$callbackHandler = handler;
        val$startIdx = I.this;
        super();
    }
}
