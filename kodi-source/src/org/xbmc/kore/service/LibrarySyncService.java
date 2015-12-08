// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import de.greenrobot.event.EventBus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.jsonrpc.event.MediaSyncEvent;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.service:
//            SyncUtils

public class LibrarySyncService extends Service
{
    private static interface SyncItem
    {

        public abstract String getDescription();

        public abstract Bundle getSyncExtras();

        public abstract String getSyncType();

        public abstract void sync(SyncOrchestrator syncorchestrator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver);
    }

    private static class SyncMovies
        implements SyncItem
    {

        private final int hostId;
        private final int movieId;
        private final Bundle syncExtras;

        private void deleteMovies(ContentResolver contentresolver, int i, int j)
        {
            if (j == -1)
            {
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.MovieCast.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Movies.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                return;
            } else
            {
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.MovieCast.buildMovieCastListUri(i, j), null, null);
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Movies.buildMovieUri(i, j), null, null);
                return;
            }
        }

        private void insertMovies(SyncOrchestrator syncorchestrator, ContentResolver contentresolver, List list)
        {
            syncorchestrator = new ContentValues[list.size()];
            int k = 0;
            for (int i = 0; i < list.size(); i++)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie detailsmovie = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie)list.get(i);
                syncorchestrator[i] = SyncUtils.contentValuesFromMovie(hostId, detailsmovie);
                k += detailsmovie.cast.size();
            }

            contentresolver.bulkInsert(org.xbmc.kore.provider.MediaContract.Movies.CONTENT_URI, syncorchestrator);
            syncorchestrator = new ContentValues[k];
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
                    org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie detailsmovie1 = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie)list.next();
                    Iterator iterator = detailsmovie1.cast.iterator();
                    int l = j;
                    do
                    {
                        j = l;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        org.xbmc.kore.jsonrpc.type.VideoType.Cast cast = (org.xbmc.kore.jsonrpc.type.VideoType.Cast)iterator.next();
                        syncorchestrator[l] = SyncUtils.contentValuesFromCast(hostId, cast);
                        syncorchestrator[l].put("movieid", Integer.valueOf(detailsmovie1.movieid));
                        l++;
                    } while (true);
                }
            } while (true);
            contentresolver.bulkInsert(org.xbmc.kore.provider.MediaContract.MovieCast.CONTENT_URI, syncorchestrator);
            return;
        }

        private void syncAllMovies(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, String as[], final int startIdx)
        {
            (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetMovies(new org.xbmc.kore.jsonrpc.type.ListType.Limits(startIdx, startIdx + 300), as)).execute(hostConnection, as. new ApiCallback() {

                final SyncMovies this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;
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
                this$0 = final_syncmovies;
                startIdx = i;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                properties = _5B_Ljava.lang.String_3B_.this;
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

        public void sync(SyncOrchestrator syncorchestrator, HostConnection hostconnection, Handler handler, final ContentResolver contentResolver)
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
                syncAllMovies(syncorchestrator, hostconnection, handler, contentResolver, as, 0);
                return;
            } else
            {
                (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetMovieDetails(movieId, as)).execute(hostconnection, syncorchestrator. new ApiCallback() {

                    final SyncMovies this$0;
                    final ContentResolver val$contentResolver;
                    final SyncOrchestrator val$orchestrator;

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
                this$0 = final_syncmovies;
                contentResolver = contentresolver;
                orchestrator = SyncOrchestrator.this;
                super();
            }
                }, handler);
                return;
            }
        }






        public SyncMovies(int i, int j, Bundle bundle)
        {
            hostId = i;
            movieId = j;
            syncExtras = bundle;
        }

        public SyncMovies(int i, Bundle bundle)
        {
            hostId = i;
            movieId = -1;
            syncExtras = bundle;
        }
    }

    private static class SyncMusic
        implements SyncItem
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

        private void chainCallSyncAlbums(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, int i)
        {
            final long albumSyncStartTime = System.currentTimeMillis();
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.GetAlbums(new org.xbmc.kore.jsonrpc.type.ListType.Limits(i, i + 300), getAlbumsProperties)).execute(hostConnection, i. new ApiCallback() {

                final SyncMusic this$0;
                final long val$albumSyncStartTime;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;
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
                this$0 = final_syncmusic;
                contentResolver = contentresolver;
                albumSyncStartTime = l;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                startIdx = I.this;
                super();
            }
            }, callbackHandler);
        }

        private void chainCallSyncGenres(final SyncOrchestrator orchestrator, final HostConnection hostConnection, Handler handler, final ContentResolver contentResolver)
        {
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.GetGenres(getGenresProperties)).execute(hostConnection, handler. new ApiCallback() {

                final SyncMusic this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;

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
                this$0 = final_syncmusic;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = Handler.this;
                super();
            }
            }, handler);
        }

        private void chainCallSyncSongs(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, int i)
        {
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.GetSongs(new org.xbmc.kore.jsonrpc.type.ListType.Limits(i, i + 600), getSongsProperties)).execute(hostConnection, i. new ApiCallback() {

                final SyncMusic this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;
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
                this$0 = final_syncmusic;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                startIdx = I.this;
                super();
            }
            }, callbackHandler);
        }

        private void deleteMusicInfo(ContentResolver contentresolver, int i)
        {
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.AlbumArtists.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.AlbumGenres.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.Songs.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.AudioGenres.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.Albums.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.Artists.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
        }

        public void chainCallSyncArtists(final SyncOrchestrator orchestrator, final HostConnection hostConnection, Handler handler, final ContentResolver contentResolver, final int startIdx)
        {
            (new org.xbmc.kore.jsonrpc.method.AudioLibrary.GetArtists(new org.xbmc.kore.jsonrpc.type.ListType.Limits(startIdx, startIdx + 300), true, getArtistsProperties)).execute(hostConnection, handler. new ApiCallback() {

                final SyncMusic this$0;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;
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
                this$0 = final_syncmusic;
                startIdx = i;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = Handler.this;
                super();
            }
            }, handler);
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

        public void sync(SyncOrchestrator syncorchestrator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver)
        {
            chainCallSyncArtists(syncorchestrator, hostconnection, handler, contentresolver, 0);
        }







        public SyncMusic(int i, Bundle bundle)
        {
            hostId = i;
            syncExtras = bundle;
        }
    }

    private static class SyncMusicVideos
        implements SyncItem
    {

        private final int hostId;
        private final Bundle syncExtras;

        private void deleteMusicVideos(ContentResolver contentresolver, int i)
        {
            contentresolver.delete(org.xbmc.kore.provider.MediaContract.MusicVideos.CONTENT_URI, "host_id=?", new String[] {
                String.valueOf(i)
            });
        }

        private void insertMusicVideos(SyncOrchestrator syncorchestrator, ContentResolver contentresolver, List list)
        {
            ContentValues acontentvalues[] = new ContentValues[list.size()];
            for (int i = 0; i < list.size(); i++)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.DetailsMusicVideo detailsmusicvideo = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsMusicVideo)list.get(i);
                acontentvalues[i] = SyncUtils.contentValuesFromMusicVideo(hostId, detailsmusicvideo);
            }

            contentresolver.bulkInsert(org.xbmc.kore.provider.MediaContract.MusicVideos.CONTENT_URI, acontentvalues);
            syncorchestrator.syncItemFinished();
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

        public void sync(SyncOrchestrator syncorchestrator, HostConnection hostconnection, Handler handler, final ContentResolver contentResolver)
        {
            (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetMusicVideos(new String[] {
                "title", "playcount", "runtime", "director", "studio", "year", "plot", "album", "artist", "genre", 
                "track", "streamdetails", "fanart", "thumbnail", "file", "tag"
            })).execute(hostconnection, syncorchestrator. new ApiCallback() {

                final SyncMusicVideos this$0;
                final ContentResolver val$contentResolver;
                final SyncOrchestrator val$orchestrator;

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
                this$0 = final_syncmusicvideos;
                contentResolver = contentresolver;
                orchestrator = SyncOrchestrator.this;
                super();
            }
            }, handler);
        }




        public SyncMusicVideos(int i, Bundle bundle)
        {
            hostId = i;
            syncExtras = bundle;
        }
    }

    private static class SyncOrchestrator
    {

        private final Handler callbackHandler;
        private final ContentResolver contentResolver;
        private SyncItem currentSyncItem;
        private final HostConnection hostConnection;
        private long partialStartTime;
        private final int serviceStartId;
        private long startTime;
        private ArrayDeque syncItems;
        private Service syncService;

        public void addSyncItem(SyncItem syncitem)
        {
            syncItems.add(syncitem);
        }

        public void nextSync()
        {
            if (syncItems.size() > 0)
            {
                partialStartTime = System.currentTimeMillis();
                currentSyncItem = (SyncItem)syncItems.poll();
                currentSyncItem.sync(this, hostConnection, callbackHandler, contentResolver);
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
            LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("A Sync item has got an error. Sync item: ").append(currentSyncItem.getDescription()).append(". Error description: ").append(s).toString());
            EventBus.getDefault().post(new MediaSyncEvent(currentSyncItem.getSyncType(), currentSyncItem.getSyncExtras(), 0, i, s));
            nextSync();
        }

        public void syncItemFinished()
        {
            LogUtils.LOGD(LibrarySyncService.TAG, (new StringBuilder()).append("Sync finished for item: ").append(currentSyncItem.getDescription()).append(". Total time: ").append(System.currentTimeMillis() - partialStartTime).toString());
            EventBus.getDefault().post(new MediaSyncEvent(currentSyncItem.getSyncType(), currentSyncItem.getSyncExtras(), 1));
            nextSync();
        }

        public SyncOrchestrator(Service service, int i, HostConnection hostconnection, Handler handler, ContentResolver contentresolver)
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

    private static class SyncTVShows
        implements SyncItem
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

        private void chainSyncEpisodes(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final List tvShows, int i)
        {
            if (i < tvShows.size())
            {
                (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetEpisodes(((org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow)tvShows.get(i)).tvshowid, getEpisodesProperties)).execute(hostConnection, i. new ApiCallback() {

                    final SyncTVShows this$0;
                    final Handler val$callbackHandler;
                    final ContentResolver val$contentResolver;
                    final HostConnection val$hostConnection;
                    final SyncOrchestrator val$orchestrator;
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
                this$0 = final_synctvshows;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                tvShows = list;
                position = I.this;
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

        private void chainSyncSeasons(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, final List tvShows, int i)
        {
            if (i < tvShows.size())
            {
                final org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow tvShow = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow)tvShows.get(i);
                (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetSeasons(tvShow.tvshowid, seasonsProperties)).execute(hostConnection, i. new ApiCallback() {

                    final SyncTVShows this$0;
                    final Handler val$callbackHandler;
                    final ContentResolver val$contentResolver;
                    final HostConnection val$hostConnection;
                    final SyncOrchestrator val$orchestrator;
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
                this$0 = final_synctvshows;
                contentResolver = contentresolver;
                tvShow = detailstvshow;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                tvShows = list;
                position = I.this;
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
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Episodes.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Seasons.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.TVShowCast.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.TVShows.CONTENT_URI, "host_id=?", new String[] {
                    String.valueOf(i)
                });
                return;
            } else
            {
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Episodes.buildTVShowEpisodesListUri(i, j), null, null);
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.Seasons.buildTVShowSeasonsListUri(i, j), null, null);
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.TVShowCast.buildTVShowCastListUri(i, j), null, null);
                contentresolver.delete(org.xbmc.kore.provider.MediaContract.TVShows.buildTVShowUri(i, j), null, null);
                return;
            }
        }

        private void insertTVShowsAndGetDetails(SyncOrchestrator syncorchestrator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver, List list)
        {
            ContentValues acontentvalues[];
            acontentvalues = new ContentValues[list.size()];
            int k = 0;
            for (int i = 0; i < list.size(); i++)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow detailstvshow = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow)list.get(i);
                acontentvalues[i] = SyncUtils.contentValuesFromTVShow(hostId, detailstvshow);
                k += detailstvshow.cast.size();
            }

            contentresolver.bulkInsert(org.xbmc.kore.provider.MediaContract.TVShows.CONTENT_URI, acontentvalues);
            acontentvalues = new ContentValues[k];
            int j = 0;
            Iterator iterator = list.iterator();
            do
            {
label0:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow detailstvshow1 = (org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow)iterator.next();
                    Iterator iterator1 = detailstvshow1.cast.iterator();
                    int l = j;
                    do
                    {
                        j = l;
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        org.xbmc.kore.jsonrpc.type.VideoType.Cast cast = (org.xbmc.kore.jsonrpc.type.VideoType.Cast)iterator1.next();
                        acontentvalues[l] = SyncUtils.contentValuesFromCast(hostId, cast);
                        acontentvalues[l].put("tvshowid", Integer.valueOf(detailstvshow1.tvshowid));
                        l++;
                    } while (true);
                }
            } while (true);
            contentresolver.bulkInsert(org.xbmc.kore.provider.MediaContract.TVShowCast.CONTENT_URI, acontentvalues);
            chainSyncSeasons(syncorchestrator, hostconnection, handler, contentresolver, list, 0);
            return;
        }

        private void syncAllTVShows(final SyncOrchestrator orchestrator, final HostConnection hostConnection, final Handler callbackHandler, final ContentResolver contentResolver, int i, final List allResults)
        {
            (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetTVShows(new org.xbmc.kore.jsonrpc.type.ListType.Limits(i, i + 300), getTVShowsProperties)).execute(hostConnection, i. new ApiCallback() {

                final SyncTVShows this$0;
                final List val$allResults;
                final Handler val$callbackHandler;
                final ContentResolver val$contentResolver;
                final HostConnection val$hostConnection;
                final SyncOrchestrator val$orchestrator;
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
                this$0 = final_synctvshows;
                allResults = list;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = handler;
                contentResolver = contentresolver;
                startIdx = I.this;
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

        public void sync(final SyncOrchestrator orchestrator, final HostConnection hostConnection, Handler handler, final ContentResolver contentResolver)
        {
            if (tvshowId == -1)
            {
                syncAllTVShows(orchestrator, hostConnection, handler, contentResolver, 0, new ArrayList());
                return;
            } else
            {
                (new org.xbmc.kore.jsonrpc.method.VideoLibrary.GetTVShowDetails(tvshowId, getTVShowsProperties)).execute(hostConnection, handler. new ApiCallback() {

                    final SyncTVShows this$0;
                    final Handler val$callbackHandler;
                    final ContentResolver val$contentResolver;
                    final HostConnection val$hostConnection;
                    final SyncOrchestrator val$orchestrator;

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
                this$0 = final_synctvshows;
                contentResolver = contentresolver;
                orchestrator = syncorchestrator;
                hostConnection = hostconnection;
                callbackHandler = Handler.this;
                super();
            }
                }, handler);
                return;
            }
        }









        public SyncTVShows(int i, int j, Bundle bundle)
        {
            hostId = i;
            tvshowId = j;
            syncExtras = bundle;
        }

        public SyncTVShows(int i, Bundle bundle)
        {
            hostId = i;
            tvshowId = -1;
            syncExtras = bundle;
        }
    }


    public static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/service/LibrarySyncService);
    private Handler callbackHandler;
    private HandlerThread handlerThread;

    public LibrarySyncService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        handlerThread = new HandlerThread("LibrarySyncService", 10);
        handlerThread.start();
        callbackHandler = new Handler(handlerThread.getLooper());
    }

    public void onDestroy()
    {
        LogUtils.LOGD(TAG, "Destroying the service.");
        if (Utils.isJellybeanMR2OrLater())
        {
            handlerThread.quitSafely();
            return;
        } else
        {
            handlerThread.quit();
            return;
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        HostInfo hostinfo = HostManager.getInstance(this).getHostInfo();
        Object obj = new HostConnection(hostinfo);
        ((HostConnection) (obj)).setProtocol(1);
        obj = new SyncOrchestrator(this, j, ((HostConnection) (obj)), callbackHandler, getContentResolver());
        Bundle bundle = intent.getBundleExtra("sync_extras");
        if (intent.getBooleanExtra("sync_all_movies", false))
        {
            ((SyncOrchestrator) (obj)).addSyncItem(new SyncMovies(hostinfo.getId(), bundle));
        }
        if (intent.getBooleanExtra("sync_single_movie", false))
        {
            i = intent.getIntExtra("sync_movieid", -1);
            if (i != -1)
            {
                ((SyncOrchestrator) (obj)).addSyncItem(new SyncMovies(hostinfo.getId(), i, bundle));
            }
        }
        if (intent.getBooleanExtra("sync_all_tvshows", false))
        {
            ((SyncOrchestrator) (obj)).addSyncItem(new SyncTVShows(hostinfo.getId(), bundle));
        }
        if (intent.getBooleanExtra("sync_single_tvshow", false))
        {
            i = intent.getIntExtra("sync_tvshowid", -1);
            if (i != -1)
            {
                ((SyncOrchestrator) (obj)).addSyncItem(new SyncTVShows(hostinfo.getId(), i, bundle));
            }
        }
        if (intent.getBooleanExtra("sync_all_music", false))
        {
            ((SyncOrchestrator) (obj)).addSyncItem(new SyncMusic(hostinfo.getId(), bundle));
        }
        if (intent.getBooleanExtra("sync_all_music_videos", false))
        {
            ((SyncOrchestrator) (obj)).addSyncItem(new SyncMusicVideos(hostinfo.getId(), bundle));
        }
        ((SyncOrchestrator) (obj)).startSync();
        return 2;
    }

}
