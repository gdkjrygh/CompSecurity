// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService, SyncUtils

private static class syncExtras
    implements syncExtras
{

    private static final String getAlbumsProperties[] = {
        "title", "description", "artist", "genre", "albumlabel", "rating", "year", "fanart", "thumbnail", "playcount", 
        "genreid", "artistid", "displayartist"
    };
    private static final String getArtistsProperties[] = {
        "description", "genre", "fanart", "thumbnail"
    };
    private static final String getGenresProperties[] = {
        "title", "thumbnail"
    };
    private static final String getSongsProperties[] = {
        "title", "track", "duration", "thumbnail", "file", "albumid"
    };
    private final int hostId;
    private final Bundle syncExtras;

    private void chainCallSyncAlbums(final trator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final int startIdx)
    {
        final long albumSyncStartTime = System.currentTimeMillis();
        (new org.xbmc.kore.jsonrpc.method.(new org.xbmc.kore.jsonrpc.type.t>(startIdx, startIdx + 300), getAlbumsProperties)).e(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncMusic this$0;
            final long val$albumSyncStartTime;
            final Handler val$callbackHandler;
            final ContentResolver val$contentResolver;
            final HostConnection val$hostConnection;
            final LibrarySyncService.SyncOrchestrator val$orchestrator;
            final int val$startIdx;

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
                    org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum detailsalbum = (org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum)((List) (obj)).get(i);
                    list[i] = SyncUtils.contentValuesFromAlbum(hostId, detailsalbum);
                    i1 += detailsalbum.artistid.size();
                    k += detailsalbum.genreid.size();
                }

                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Albums.CONTENT_URI, list);
                LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Finished inserting albums in: ").append(System.currentTimeMillis() - albumSyncStartTime).toString());
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
                        org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum detailsalbum1 = (org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum)iterator.next();
                        Iterator iterator1 = detailsalbum1.artistid.iterator();
                        int l;
                        for (l = l1; iterator1.hasNext(); l++)
                        {
                            int j1 = ((Integer)iterator1.next()).intValue();
                            list[l] = new ContentValues();
                            list[l].put("host_id", Integer.valueOf(hostId));
                            list[l].put("albumid", Integer.valueOf(detailsalbum1.albumid));
                            list[l].put("artistid", Integer.valueOf(j1));
                        }

                        iterator1 = detailsalbum1.genreid.iterator();
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
                            acontentvalues[k1].put("host_id", Integer.valueOf(hostId));
                            acontentvalues[k1].put("albumid", Integer.valueOf(detailsalbum1.albumid));
                            acontentvalues[k1].put("genreid", Integer.valueOf(j));
                            k1++;
                        } while (true);
                    }
                } while (true);
                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.AlbumArtists.CONTENT_URI, list);
                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.AlbumGenres.CONTENT_URI, acontentvalues);
                LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Finished inserting artists and genres in: ").append(System.currentTimeMillis() - albumSyncStartTime).toString());
                if (((List) (obj)).size() == 300)
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncAlbums: More results on media center, recursing.");
                    chainCallSyncAlbums(orchestrator, hostConnection, callbackHandler, contentResolver, startIdx + 300);
                    return;
                } else
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncAlbums: Got all results, continuing");
                    chainCallSyncSongs(orchestrator, hostConnection, callbackHandler, contentResolver, 0);
                    return;
                }
            }

            
            {
                this$0 = LibrarySyncService.SyncMusic.this;
                contentResolver = contentresolver;
                albumSyncStartTime = l;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                startIdx = i;
                super();
            }
        }, callbackHandler);
    }

    private void chainCallSyncGenres(final trator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver)
    {
        (new org.xbmc.kore.jsonrpc.method.(getGenresProperties)).e(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncMusic this$0;
            final Handler val$callbackHandler;
            final ContentResolver val$contentResolver;
            final HostConnection val$hostConnection;
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
                Object obj = list;
                if (list == null)
                {
                    obj = new ArrayList(0);
                }
                list = new ContentValues[((List) (obj)).size()];
                for (int i = 0; i < ((List) (obj)).size(); i++)
                {
                    org.xbmc.kore.jsonrpc.type.LibraryType.DetailsGenre detailsgenre = (org.xbmc.kore.jsonrpc.type.LibraryType.DetailsGenre)((List) (obj)).get(i);
                    list[i] = SyncUtils.contentValuesFromAudioGenre(hostId, detailsgenre);
                }

                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.AudioGenres.CONTENT_URI, list);
                chainCallSyncAlbums(orchestrator, hostConnection, callbackHandler, contentResolver, 0);
            }

            
            {
                this$0 = LibrarySyncService.SyncMusic.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, callbackHandler);
    }

    private void chainCallSyncSongs(final trator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final int startIdx)
    {
        (new org.xbmc.kore.jsonrpc.method.ontentResolver(new org.xbmc.kore.jsonrpc.type.>(startIdx, startIdx + 600), getSongsProperties)).(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncMusic this$0;
            final Handler val$callbackHandler;
            final ContentResolver val$contentResolver;
            final HostConnection val$hostConnection;
            final LibrarySyncService.SyncOrchestrator val$orchestrator;
            final int val$startIdx;

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
                Object obj = list;
                if (list == null)
                {
                    obj = new ArrayList(0);
                }
                list = new ContentValues[((List) (obj)).size()];
                for (int i = 0; i < ((List) (obj)).size(); i++)
                {
                    org.xbmc.kore.jsonrpc.type.AudioType.DetailsSong detailssong = (org.xbmc.kore.jsonrpc.type.AudioType.DetailsSong)((List) (obj)).get(i);
                    list[i] = SyncUtils.contentValuesFromSong(hostId, detailssong);
                }

                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Songs.CONTENT_URI, list);
                if (((List) (obj)).size() == 600)
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncSongs: More results on media center, recursing.");
                    chainCallSyncSongs(orchestrator, hostConnection, callbackHandler, contentResolver, startIdx + 600);
                    return;
                } else
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncSongs: Got all results, continuing");
                    orchestrator.syncItemFinished();
                    return;
                }
            }

            
            {
                this$0 = LibrarySyncService.SyncMusic.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                startIdx = i;
                super();
            }
        }, callbackHandler);
    }

    private void deleteMusicInfo(ContentResolver contentresolver, int i)
    {
        contentresolver.delete(org.xbmc.kore.provider.NTENT_URI, "host_id=?", new String[] {
            String.valueOf(i)
        });
        contentresolver.delete(org.xbmc.kore.provider.TENT_URI, "host_id=?", new String[] {
            String.valueOf(i)
        });
        contentresolver.delete(org.xbmc.kore.provider.RI, "host_id=?", new String[] {
            String.valueOf(i)
        });
        contentresolver.delete(org.xbmc.kore.provider.TENT_URI, "host_id=?", new String[] {
            String.valueOf(i)
        });
        contentresolver.delete(org.xbmc.kore.provider.URI, "host_id=?", new String[] {
            String.valueOf(i)
        });
        contentresolver.delete(org.xbmc.kore.provider._URI, "host_id=?", new String[] {
            String.valueOf(i)
        });
    }

    public void chainCallSyncArtists(final trator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final int startIdx)
    {
        (new org.xbmc.kore.jsonrpc.method.>(new org.xbmc.kore.jsonrpc.type.it>(startIdx, startIdx + 300), true, getArtistsProperties)).te(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncMusic this$0;
            final Handler val$callbackHandler;
            final ContentResolver val$contentResolver;
            final HostConnection val$hostConnection;
            final LibrarySyncService.SyncOrchestrator val$orchestrator;
            final int val$startIdx;

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
                Object obj = list;
                if (list == null)
                {
                    obj = new ArrayList(0);
                }
                if (startIdx == 0)
                {
                    deleteMusicInfo(contentResolver, hostId);
                }
                list = new ContentValues[((List) (obj)).size()];
                for (int i = 0; i < ((List) (obj)).size(); i++)
                {
                    org.xbmc.kore.jsonrpc.type.AudioType.DetailsArtist detailsartist = (org.xbmc.kore.jsonrpc.type.AudioType.DetailsArtist)((List) (obj)).get(i);
                    list[i] = SyncUtils.contentValuesFromArtist(hostId, detailsartist);
                }

                contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Artists.CONTENT_URI, list);
                if (((List) (obj)).size() == 300)
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncArtists: More results on media center, recursing.");
                    chainCallSyncArtists(orchestrator, hostConnection, callbackHandler, contentResolver, startIdx + 300);
                    return;
                } else
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "chainCallSyncArtists: Got all results, continuing");
                    chainCallSyncGenres(orchestrator, hostConnection, callbackHandler, contentResolver);
                    return;
                }
            }

            
            {
                this$0 = LibrarySyncService.SyncMusic.this;
                startIdx = i;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                super();
            }
        }, callbackHandler);
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("Sync music for host: ").append(hostId).toString();
    }

    public Bundle getSyncExtras()
    {
        return syncExtras;
    }

    public String getSyncType()
    {
        return "sync_all_music";
    }

    public void sync(trator trator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver)
    {
        chainCallSyncArtists(trator, hostconnection, handler, contentresolver, 0);
    }







    public _cls4.val.startIdx(int i, Bundle bundle)
    {
        hostId = i;
        syncExtras = bundle;
    }
}
