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
            list[i] = SyncUtils.contentValuesFromAudioGenre(cess._mth1200(this._cls0.this), cess);
        }

        val$contentResolver.bulkInsert(org.xbmc.kore.provider.NT_URI, list);
        cess._mth1500(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, 0);
    }

    ator()
    {
        this$0 = final_ator;
        val$contentResolver = contentresolver;
        val$orchestrator = ator1;
        val$hostConnection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
