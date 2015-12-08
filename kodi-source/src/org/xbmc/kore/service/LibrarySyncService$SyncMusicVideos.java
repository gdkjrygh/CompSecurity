// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService, SyncUtils

private static class syncExtras
    implements syncExtras
{

    private final int hostId;
    private final Bundle syncExtras;

    private void deleteMusicVideos(ContentResolver contentresolver, int i)
    {
        contentresolver.delete(org.xbmc.kore.provider.RI, "host_id=?", new String[] {
            String.valueOf(i)
        });
    }

    private void insertMusicVideos( , ContentResolver contentresolver, List list)
    {
        ContentValues acontentvalues[] = new ContentValues[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.xtras xtras = (org.xbmc.kore.jsonrpc.type.xtras)list.get(i);
            acontentvalues[i] = SyncUtils.contentValuesFromMusicVideo(hostId, xtras);
        }

        contentresolver.bulkInsert(org.xbmc.kore.provider.RI, acontentvalues);
        .syncItemFinished();
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("Sync music videos for host: ").append(hostId).toString();
    }

    public Bundle getSyncExtras()
    {
        return syncExtras;
    }

    public String getSyncType()
    {
        return "sync_all_music_videos";
    }

    public void sync(final  orchestrator, HostConnection hostconnection, Handler handler, final ContentResolver contentResolver)
    {
        (new org.xbmc.kore.jsonrpc.method.ras(new String[] {
            "title", "playcount", "runtime", "director", "studio", "year", "plot", "album", "artist", "genre", 
            "track", "streamdetails", "fanart", "thumbnail", "file", "tag"
        })).(hostconnection, new ApiCallback() {

            final LibrarySyncService.SyncMusicVideos this$0;
            final ContentResolver val$contentResolver;
            final LibrarySyncService.SyncOrchestrator val$orchestrator;

            public void onError(int i, String s)
            {
                orchestrator.syncItemFailed(i, s);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list)
            {
                deleteMusicVideos(contentResolver, hostId);
                insertMusicVideos(orchestrator, contentResolver, list);
            }

            
            {
                this$0 = LibrarySyncService.SyncMusicVideos.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                super();
            }
        }, handler);
    }




    public _cls1.val.orchestrator(int i, Bundle bundle)
    {
        hostId = i;
        syncExtras = bundle;
    }
}
