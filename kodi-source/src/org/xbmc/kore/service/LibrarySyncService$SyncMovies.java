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

    private final int hostId;
    private final int movieId;
    private final Bundle syncExtras;

    private void deleteMovies(ContentResolver contentresolver, int i, int j)
    {
        if (j == -1)
        {
            contentresolver.delete(org.xbmc.kore.provider.T_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.RI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            return;
        } else
        {
            contentresolver.delete(org.xbmc.kore.provider.ovieCastListUri(i, j), null, null);
            contentresolver.delete(org.xbmc.kore.provider.eUri(i, j), null, null);
            return;
        }
    }

    private void insertMovies(rator rator, ContentResolver contentresolver, List list)
    {
        rator = new ContentValues[list.size()];
        int k = 0;
        for (int i = 0; i < list.size(); i++)
        {
            org.xbmc.kore.jsonrpc.type.  = (org.xbmc.kore.jsonrpc.type.)list.get(i);
            rator[i] = SyncUtils.contentValuesFromMovie(hostId, );
            k += .d.size();
        }

        contentresolver.bulkInsert(org.xbmc.kore.provider.RI, rator);
        rator = new ContentValues[k];
        int j = 0;
        list = list.iterator();
        do
        {
label0:
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                org.xbmc.kore.jsonrpc.type. 1 = (org.xbmc.kore.jsonrpc.type.d)list.next();
                Iterator iterator = 1.d.iterator();
                int l = j;
                do
                {
                    j = l;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    org.xbmc.kore.jsonrpc.type. 2 = (org.xbmc.kore.jsonrpc.type.d)iterator.next();
                    rator[l] = SyncUtils.contentValuesFromCast(hostId, 2);
                    rator[l].put("movieid", Integer.valueOf(1.));
                    l++;
                } while (true);
            }
        } while (true);
        contentresolver.bulkInsert(org.xbmc.kore.provider.T_URI, rator);
        return;
    }

    private void syncAllMovies(final rator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final String properties[], final int startIdx)
    {
        (new org.xbmc.kore.jsonrpc.method.stListUri(new org.xbmc.kore.jsonrpc.type.>(startIdx, startIdx + 300), properties)).(hostConnection, new ApiCallback() {

            final LibrarySyncService.SyncMovies this$0;
            final Handler val$callbackHandler;
            final ContentResolver val$contentResolver;
            final HostConnection val$hostConnection;
            final LibrarySyncService.SyncOrchestrator val$orchestrator;
            final String val$properties[];
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
                if (startIdx == 0)
                {
                    deleteMovies(contentResolver, hostId, -1);
                }
                if (list.size() > 0)
                {
                    insertMovies(orchestrator, contentResolver, list);
                }
                LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("syncAllMovies, movies gotten: ").append(list.size()).toString());
                if (list.size() == 300)
                {
                    syncAllMovies(orchestrator, hostConnection, callbackHandler, contentResolver, properties, startIdx + 300);
                    return;
                } else
                {
                    orchestrator.syncItemFinished();
                    return;
                }
            }

            
            {
                this$0 = LibrarySyncService.SyncMovies.this;
                startIdx = i;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                properties = as;
                super();
            }
        }, callbackHandler);
    }

    public String getDescription()
    {
        if (movieId != -1)
        {
            return (new StringBuilder()).append("Sync movies for host: ").append(hostId).toString();
        } else
        {
            return (new StringBuilder()).append("Sync movie ").append(movieId).append(" for host: ").append(hostId).toString();
        }
    }

    public Bundle getSyncExtras()
    {
        return syncExtras;
    }

    public String getSyncType()
    {
        if (movieId == -1)
        {
            return "sync_all_movies";
        } else
        {
            return "sync_single_movie";
        }
    }

    public void sync(final rator orchestrator, HostConnection hostconnection, Handler handler, final ContentResolver contentResolver)
    {
        String as[] = new String[25];
        as[0] = "title";
        as[1] = "genre";
        as[2] = "year";
        as[3] = "rating";
        as[4] = "director";
        as[5] = "trailer";
        as[6] = "tagline";
        as[7] = "plot";
        as[8] = "playcount";
        as[9] = "dateadded";
        as[10] = "writer";
        as[11] = "studio";
        as[12] = "mpaa";
        as[13] = "cast";
        as[14] = "country";
        as[15] = "imdbnumber";
        as[16] = "runtime";
        as[17] = "set";
        as[18] = "streamdetails";
        as[19] = "top250";
        as[20] = "votes";
        as[21] = "fanart";
        as[22] = "thumbnail";
        as[23] = "file";
        as[24] = "setid";
        if (movieId == -1)
        {
            syncAllMovies(orchestrator, hostconnection, handler, contentResolver, as, 0);
            return;
        } else
        {
            (new org.xbmc.kore.jsonrpc.method.init>(movieId, as)).xecute(hostconnection, new ApiCallback() {

                final LibrarySyncService.SyncMovies this$0;
                final ContentResolver val$contentResolver;
                final LibrarySyncService.SyncOrchestrator val$orchestrator;

                public void onError(int i, String s)
                {
                    orchestrator.syncItemFailed(i, s);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie)obj);
                }

                public void onSuccess(org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie detailsmovie)
                {
                    deleteMovies(contentResolver, hostId, movieId);
                    ArrayList arraylist = new ArrayList(1);
                    arraylist.add(detailsmovie);
                    insertMovies(orchestrator, contentResolver, arraylist);
                    orchestrator.syncItemFinished();
                }

            
            {
                this$0 = LibrarySyncService.SyncMovies.this;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                super();
            }
            }, handler);
            return;
        }
    }






    public _cls2.val.properties(int i, int j, Bundle bundle)
    {
        hostId = i;
        movieId = j;
        syncExtras = bundle;
    }

    public syncExtras(int i, Bundle bundle)
    {
        hostId = i;
        movieId = -1;
        syncExtras = bundle;
    }
}
