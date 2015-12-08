// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService, SyncUtils

class val.startIdx
    implements ApiCallback
{

    final val.contentResolver this$0;
    final long val$albumSyncStartTime;
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
        Object obj;
        ContentValues acontentvalues[];
        obj = list;
        if (list == null)
        {
            obj = new ArrayList(0);
        }
        list = new ContentValues[((List) (obj)).size()];
        int i1 = 0;
        int k = 0;
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.cess cess = (org.xbmc.kore.jsonrpc.type.cess)((List) (obj)).get(i);
            list[i] = SyncUtils.contentValuesFromAlbum(cess._mth1200(this._cls0.this), cess);
            i1 += cess..size();
            k += cess..size();
        }

        val$contentResolver.bulkInsert(org.xbmc.kore.provider.I, list);
        LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Finished inserting albums in: ").append(System.currentTimeMillis() - val$albumSyncStartTime).toString());
        list = new ContentValues[i1];
        acontentvalues = new ContentValues[k];
        int l1 = 0;
        int j = 0;
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                org.xbmc.kore.jsonrpc.type.cess cess1 = (org.xbmc.kore.jsonrpc.type.lbumSyncStartTime)iterator.next();
                Iterator iterator1 = cess1..iterator();
                int l;
                for (l = l1; iterator1.hasNext(); l++)
                {
                    int j1 = ((Integer)iterator1.next()).intValue();
                    list[l] = new ContentValues();
                    list[l].put("host_id", Integer.valueOf(cess._mth1200(this._cls0.this)));
                    list[l].put("albumid", Integer.valueOf(cess1._fld0));
                    list[l].put("artistid", Integer.valueOf(j1));
                }

                iterator1 = cess1._fld0.iterator();
                int k1 = j;
                do
                {
                    l1 = l;
                    j = k1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    j = ((Integer)iterator1.next()).intValue();
                    acontentvalues[k1] = new ContentValues();
                    acontentvalues[k1].put("host_id", Integer.valueOf(cess._mth1200(this._cls0.this)));
                    acontentvalues[k1].put("albumid", Integer.valueOf(cess1._fld0));
                    acontentvalues[k1].put("genreid", Integer.valueOf(j));
                    k1++;
                } while (true);
            }
        } while (true);
        val$contentResolver.bulkInsert(org.xbmc.kore.provider.ENT_URI, list);
        val$contentResolver.bulkInsert(org.xbmc.kore.provider.NT_URI, acontentvalues);
        LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Finished inserting artists and genres in: ").append(System.currentTimeMillis() - val$albumSyncStartTime).toString());
        if (((List) (obj)).size() == 300)
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncAlbums: More results on media center, recursing.");
            cess._mth1500(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, val$startIdx + 300);
            return;
        } else
        {
            LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncAlbums: Got all results, continuing");
            cess._mth1600(this._cls0.this, val$orchestrator, val$hostConnection, val$callbackHandler, val$contentResolver, 0);
            return;
        }
    }

    ator()
    {
        this$0 = final_ator;
        val$contentResolver = contentresolver;
        val$albumSyncStartTime = l;
        val$orchestrator = ator1;
        val$hostConnection = hostconnection;
        val$callbackHandler = handler;
        val$startIdx = I.this;
        super();
    }
}
