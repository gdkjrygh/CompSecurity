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

class val.callbackHandler
    implements ApiCallback
{

    final val.contentResolver this$0;
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
        if (val$startIdx == 0)
        {
            cess._mth1300(this._cls0.this, val$contentResolver, cess._mth1200(this._cls0.this));
        }
        list = new ContentValues[((List) (obj)).size()];
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.cess cess = (org.xbmc.kore.jsonrpc.type._cls0)((List) (obj)).get(i);
            list[i] = SyncUtils.contentValuesFromArtist(cess._mth1200(this._cls0.this), cess);
        }

        val$contentResolver.bulkInsert(org.xbmc.kore.provider.RI, list);
        if (((List) (obj)).size() == 300)
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncArtists: More results on media center, recursing.");
            ainCallSyncArtists(val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$startIdx + 300);
            return;
        } else
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncArtists: Got all results, continuing");
            cess._mth1400(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver);
            return;
        }
    }

    ator()
    {
        this$0 = final_ator;
        val$startIdx = i;
        val$contentResolver = contentresolver;
        val$orchestrator = ator1;
        val$hostConnection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
