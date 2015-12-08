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

    private static final String getEpisodesProperties[] = {
        "title", "plot", "rating", "writer", "firstaired", "playcount", "runtime", "director", "season", "episode", 
        "showtitle", "streamdetails", "fanart", "thumbnail", "file", "tvshowid", "dateadded"
    };
    private static final String getTVShowsProperties[] = {
        "title", "genre", "rating", "plot", "studio", "mpaa", "cast", "playcount", "episode", "imdbnumber", 
        "premiered", "fanart", "thumbnail", "file", "watchedepisodes", "dateadded"
    };
    private static final String seasonsProperties[] = {
        "season", "showtitle", "episode", "fanart", "thumbnail", "tvshowid", "watchedepisodes"
    };
    private final int hostId;
    private final Bundle syncExtras;
    private final int tvshowId;

    private void chainSyncEpisodes(final ator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final List tvShows, final int position)
    {
        if (position < tvShows.size())
        {
            (new org.xbmc.kore.jsonrpc.method.(((org.xbmc.kore.jsonrpc.type.t>)tvShows.get(position)).d, getEpisodesProperties)).e(hostConnection, new ApiCallback() {

                final LibrarySyncService.SyncTVShows this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final LibrarySyncService.SyncOrchestrator val$orchestrator;
                final int val$position;
                final List val$tvShows;

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
                    ContentValues acontentvalues[] = new ContentValues[list.size()];
                    for (int i = 0; i < list.size(); i++)
                    {
                        org.xbmc.kore.jsonrpc.type.VideoType.DetailsEpisode detailsepisode = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsEpisode)list.get(i);
                        acontentvalues[i] = SyncUtils.contentValuesFromEpisode(hostId, detailsepisode);
                    }

                    contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Episodes.CONTENT_URI, acontentvalues);
                    chainSyncEpisodes(orchestrator, hostConnection, callbackHandler, contentResolver, tvShows, position + 1);
                }

            
            {
                this$0 = LibrarySyncService.SyncTVShows.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                tvShows = list;
                position = i;
                super();
            }
            }, callbackHandler);
            return;
        } else
        {
            orchestrator.syncItemFinished();
            return;
        }
    }

    private void chainSyncSeasons(final ator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final List tvShows, final int position)
    {
        if (position < tvShows.size())
        {
            final org.xbmc.kore.jsonrpc.type.syncItemFinished tvShow = (org.xbmc.kore.jsonrpc.type.syncItemFinished)tvShows.get(position);
            (new org.xbmc.kore.jsonrpc.method.ncItemFinished(tvShow.d, seasonsProperties)).(hostConnection, new ApiCallback() {

                final LibrarySyncService.SyncTVShows this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final LibrarySyncService.SyncOrchestrator val$orchestrator;
                final int val$position;
                final org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow val$tvShow;
                final List val$tvShows;

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
                    ContentValues acontentvalues[] = new ContentValues[list.size()];
                    int j = 0;
                    for (int i = 0; i < list.size(); i++)
                    {
                        org.xbmc.kore.jsonrpc.type.VideoType.DetailsSeason detailsseason = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsSeason)list.get(i);
                        acontentvalues[i] = SyncUtils.contentValuesFromSeason(hostId, detailsseason);
                        j += detailsseason.watchedepisodes;
                    }

                    contentResolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Seasons.CONTENT_URI, acontentvalues);
                    if (getSyncType().equals("sync_single_tvshow"))
                    {
                        list = org.xbmc.kore.provider.MediaContract.TVShows.buildTVShowUri(hostId, tvShow.tvshowid);
                        ContentValues contentvalues = new ContentValues(1);
                        contentvalues.put("watchedepisodes", Integer.valueOf(j));
                        contentResolver.update(list, contentvalues, null, null);
                    }
                    chainSyncSeasons(orchestrator, hostConnection, callbackHandler, contentResolver, tvShows, position + 1);
                }

            
            {
                this$0 = LibrarySyncService.SyncTVShows.this;
                contentResolver = contentresolver;
                tvShow = detailstvshow;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                tvShows = list;
                position = i;
                super();
            }
            }, callbackHandler);
            return;
        } else
        {
            chainSyncEpisodes(orchestrator, hostConnection, callbackHandler, contentResolver, tvShows, 0);
            return;
        }
    }

    private void deleteTVShows(ContentResolver contentresolver, int i, int j)
    {
        if (j == -1)
        {
            contentresolver.delete(org.xbmc.kore.provider.URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.RI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.T_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.RI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            return;
        } else
        {
            contentresolver.delete(org.xbmc.kore.provider.howEpisodesListUri(i, j), null, null);
            contentresolver.delete(org.xbmc.kore.provider.owSeasonsListUri(i, j), null, null);
            contentresolver.delete(org.xbmc.kore.provider.VShowCastListUri(i, j), null, null);
            contentresolver.delete(org.xbmc.kore.provider.owUri(i, j), null, null);
            return;
        }
    }

    private void insertTVShowsAndGetDetails(ator ator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver, List list)
    {
        ContentValues acontentvalues[];
        acontentvalues = new ContentValues[list.size()];
        int j1 = 0;
        for (int l = 0; l < list.size(); l++)
        {
            org.xbmc.kore.jsonrpc.type.i i = (org.xbmc.kore.jsonrpc.type.i)list.get(l);
            acontentvalues[l] = SyncUtils.contentValuesFromTVShow(hostId, i);
            j1 += i.d.size();
        }

        contentresolver.bulkInsert(org.xbmc.kore.provider.RI, acontentvalues);
        acontentvalues = new ContentValues[j1];
        int i1 = 0;
        Iterator iterator = list.iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                org.xbmc.kore.jsonrpc.type.i j = (org.xbmc.kore.jsonrpc.type.d)iterator.next();
                Iterator iterator1 = j.d.iterator();
                int k1 = i1;
                do
                {
                    i1 = k1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    org.xbmc.kore.jsonrpc.type.i k = (org.xbmc.kore.jsonrpc.type.d)iterator1.next();
                    acontentvalues[k1] = SyncUtils.contentValuesFromCast(hostId, k);
                    acontentvalues[k1].put("tvshowid", Integer.valueOf(j.d));
                    k1++;
                } while (true);
            }
        } while (true);
        contentresolver.bulkInsert(org.xbmc.kore.provider.T_URI, acontentvalues);
        chainSyncSeasons(ator, hostconnection, handler, contentresolver, list, 0);
        return;
    }

    private void syncAllTVShows(final ator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final int startIdx, final List allResults)
    {
        (new org.xbmc.kore.jsonrpc.method.ncSeasons(new org.xbmc.kore.jsonrpc.type.>(startIdx, startIdx + 300), getTVShowsProperties)).(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncTVShows this$0;
            final List val$allResults;
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
                allResults.addAll(list);
                if (list.size() == 300)
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "syncAllTVShows: More tv shows on media center, recursing.");
                    syncAllTVShows(orchestrator, hostConnection, callbackHandler, contentResolver, startIdx + 300, allResults);
                    return;
                } else
                {
                    LogUtils.LOGD(LibrarySyncService.TAG, "syncAllTVShows: Got all tv shows");
                    deleteTVShows(contentResolver, hostId, -1);
                    insertTVShowsAndGetDetails(orchestrator, hostConnection, callbackHandler, contentResolver, allResults);
                    return;
                }
            }

            
            {
                this$0 = LibrarySyncService.SyncTVShows.this;
                allResults = list;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                contentResolver = contentresolver;
                startIdx = i;
                super();
            }
        }, callbackHandler);
    }

    public String getDescription()
    {
        if (tvshowId != -1)
        {
            return (new StringBuilder()).append("Sync TV shows for host: ").append(hostId).toString();
        } else
        {
            return (new StringBuilder()).append("Sync TV show ").append(tvshowId).append(" for host: ").append(hostId).toString();
        }
    }

    public Bundle getSyncExtras()
    {
        return syncExtras;
    }

    public String getSyncType()
    {
        if (tvshowId == -1)
        {
            return "sync_all_tvshows";
        } else
        {
            return "sync_single_tvshow";
        }
    }

    public void sync(final ator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver)
    {
        if (tvshowId == -1)
        {
            syncAllTVShows(orchestrator, hostConnection, callbackHandler, contentResolver, 0, new ArrayList());
            return;
        } else
        {
            (new org.xbmc.kore.jsonrpc.method.init>(tvshowId, getTVShowsProperties)).xecute(hostConnection, new ApiCallback() {

                final LibrarySyncService.SyncTVShows this$0;
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
                    onSuccess((org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow)obj);
                }

                public void onSuccess(org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow detailstvshow)
                {
                    deleteTVShows(contentResolver, hostId, tvshowId);
                    ArrayList arraylist = new ArrayList(1);
                    arraylist.add(detailstvshow);
                    insertTVShowsAndGetDetails(orchestrator, hostConnection, callbackHandler, contentResolver, arraylist);
                }

            
            {
                this$0 = LibrarySyncService.SyncTVShows.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                super();
            }
            }, callbackHandler);
            return;
        }
    }









    public _cls4.val.position(int i, int j, Bundle bundle)
    {
        hostId = i;
        tvshowId = j;
        syncExtras = bundle;
    }

    public syncExtras(int i, Bundle bundle)
    {
        hostId = i;
        tvshowId = -1;
        syncExtras = bundle;
    }
}
