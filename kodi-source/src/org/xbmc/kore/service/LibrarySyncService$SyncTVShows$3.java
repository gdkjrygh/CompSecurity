// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Handler;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService, SyncUtils

class val.position
    implements ApiCallback
{

    final val.position this$0;
    final Handler val$callbackHandler;
    final ContentResolver val$contentResolver;
    final HostConnection val$hostConnection;
    final or val$orchestrator;
    final int val$position;
    final org.xbmc.kore.jsonrpc.type.osition val$tvShow;
    final List val$tvShows;

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
        ContentValues acontentvalues[] = new ContentValues[list.size()];
        int j = 0;
        for (int i = 0; i < list.size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.cess cess = (org.xbmc.kore.jsonrpc.type.cess)list.get(i);
            acontentvalues[i] = SyncUtils.contentValuesFromSeason(cess._mth500(this._cls0.this), cess);
            j += cess.isodes;
        }

        val$contentResolver.bulkInsert(org.xbmc.kore.provider., acontentvalues);
        if (tSyncType().equals("sync_single_tvshow"))
        {
            list = org.xbmc.kore.provider.Uri(cess._mth500(this._cls0.this), val$tvShow.vShow);
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("watchedepisodes", Integer.valueOf(j));
            val$contentResolver.update(list, contentvalues, null, null);
        }
        cess._mth1000(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$tvShows, val$position + 1);
    }

    or()
    {
        this$0 = final_or;
        val$contentResolver = contentresolver;
        val$tvShow = a;
        val$orchestrator = or1;
        val$hostConnection = hostconnection;
        val$callbackHandler = handler;
        val$tvShows = list;
        val$position = I.this;
        super();
    }
}
