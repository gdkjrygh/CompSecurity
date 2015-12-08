// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.app.Service;
import android.content.ContentResolver;
import android.os.Handler;
import de.greenrobot.event.EventBus;
import java.util.ArrayDeque;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

private static class contentResolver
{

    private final Handler callbackHandler;
    private final ContentResolver contentResolver;
    private nextSync currentSyncItem;
    private final HostConnection hostConnection;
    private long partialStartTime;
    private final int serviceStartId;
    private long startTime;
    private ArrayDeque syncItems;
    private Service syncService;

    public void addSyncItem(contentResolver contentresolver)
    {
        syncItems.add(contentresolver);
    }

    public void nextSync()
    {
        if (syncItems.size() > 0)
        {
            partialStartTime = System.currentTimeMillis();
            currentSyncItem = (currentSyncItem)syncItems.poll();
            currentSyncItem.currentSyncItem(this, hostConnection, callbackHandler, contentResolver);
            return;
        } else
        {
            LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Sync finished for all items. Total time: ").append(System.currentTimeMillis() - startTime).toString());
            syncService.stopSelf(serviceStartId);
            return;
        }
    }

    public void startSync()
    {
        startTime = System.currentTimeMillis();
        nextSync();
    }

    public void syncItemFailed(int i, String s)
    {
        LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("A Sync item has got an error. Sync item: ").append(currentSyncItem.iption()).append(". Error description: ").append(s).toString());
        EventBus.getDefault().post(new MediaSyncEvent(currentSyncItem.ype(), currentSyncItem.xtras(), 0, i, s));
        nextSync();
    }

    public void syncItemFinished()
    {
        LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Sync finished for item: ").append(currentSyncItem.iption()).append(". Total time: ").append(System.currentTimeMillis() - partialStartTime).toString());
        EventBus.getDefault().post(new MediaSyncEvent(currentSyncItem.ype(), currentSyncItem.xtras(), 1));
        nextSync();
    }

    public (Service service, int i, HostConnection hostconnection, Handler handler, ContentResolver contentresolver)
    {
        startTime = -1L;
        syncService = service;
        syncItems = new ArrayDeque();
        serviceStartId = i;
        hostConnection = hostconnection;
        callbackHandler = handler;
        contentResolver = contentresolver;
    }
}
