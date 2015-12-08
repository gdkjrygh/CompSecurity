// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Arrays;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.SelectionBuilder;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaDatabase

public class MediaProvider extends ContentProvider
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/provider/MediaProvider);
    private static final UriMatcher sUriMatcher = buildUriMatcher();
    private MediaDatabase mOpenHelper;

    public MediaProvider()
    {
    }

    private SelectionBuilder buildQuerySelection(Uri uri, int i)
    {
        SelectionBuilder selectionbuilder = new SelectionBuilder();
        String s19;
        switch (i)
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());

        case 100: // 'd'
            return selectionbuilder.table("hosts");

        case 101: // 'e'
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("hosts").where("_id=?", new String[] {
                uri
            });

        case 200: 
            return selectionbuilder.table("movies");

        case 201: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("movies").where("host_id=?", new String[] {
                uri
            });

        case 202: 
            String s = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Movies.getMovieId(uri);
            return selectionbuilder.table("movies").where("host_id=?", new String[] {
                s
            }).where("movieid=?", new String[] {
                uri
            });

        case 210: 
            return selectionbuilder.table("movie_cast");

        case 211: 
            String s1 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Movies.getMovieId(uri);
            return selectionbuilder.table("movie_cast").where("host_id=?", new String[] {
                s1
            }).where("movieid=?", new String[] {
                uri
            });

        case 300: 
            return selectionbuilder.table("tvshows");

        case 302: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("tvshows").where("host_id=?", new String[] {
                uri
            });

        case 303: 
            String s2 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.TVShows.getTVShowId(uri);
            return selectionbuilder.table("tvshows").where("host_id=?", new String[] {
                s2
            }).where("tvshowid=?", new String[] {
                uri
            });

        case 310: 
            return selectionbuilder.table("tvshows_cast");

        case 311: 
            String s3 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.TVShows.getTVShowId(uri);
            return selectionbuilder.table("tvshows_cast").where("host_id=?", new String[] {
                s3
            }).where("tvshowid=?", new String[] {
                uri
            });

        case 400: 
            return selectionbuilder.table("seasons");

        case 401: 
            String s4 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.TVShows.getTVShowId(uri);
            return selectionbuilder.table("seasons").where("host_id=?", new String[] {
                s4
            }).where("tvshowid=?", new String[] {
                uri
            });

        case 402: 
            String s5 = MediaContract.Hosts.getHostId(uri);
            String s20 = MediaContract.TVShows.getTVShowId(uri);
            uri = MediaContract.Seasons.getTVShowSeasonId(uri);
            return selectionbuilder.table("seasons").where("host_id=?", new String[] {
                s5
            }).where("tvshowid=?", new String[] {
                s20
            }).where("season=?", new String[] {
                uri
            });

        case 500: 
            return selectionbuilder.table("episodes");

        case 501: 
            String s6 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.TVShows.getTVShowId(uri);
            return selectionbuilder.table("episodes").where("host_id=?", new String[] {
                s6
            }).where("tvshowid=?", new String[] {
                uri
            });

        case 502: 
            String s7 = MediaContract.Hosts.getHostId(uri);
            String s21 = MediaContract.TVShows.getTVShowId(uri);
            uri = MediaContract.Episodes.getTVShowEpisodeId(uri);
            return selectionbuilder.table("episodes").where("host_id=?", new String[] {
                s7
            }).where("tvshowid=?", new String[] {
                s21
            }).where("episodeid=?", new String[] {
                uri
            });

        case 503: 
            String s8 = MediaContract.Hosts.getHostId(uri);
            String s22 = MediaContract.TVShows.getTVShowId(uri);
            uri = MediaContract.Seasons.getTVShowSeasonId(uri);
            return selectionbuilder.table("episodes").where("host_id=?", new String[] {
                s8
            }).where("tvshowid=?", new String[] {
                s22
            }).where("season=?", new String[] {
                uri
            });

        case 504: 
            String s9 = MediaContract.Hosts.getHostId(uri);
            String s23 = MediaContract.TVShows.getTVShowId(uri);
            String s25 = MediaContract.Seasons.getTVShowSeasonId(uri);
            uri = MediaContract.Episodes.getTVShowSeasonEpisodeId(uri);
            return selectionbuilder.table("episodes").where("host_id=?", new String[] {
                s9
            }).where("tvshowid=?", new String[] {
                s23
            }).where("season=?", new String[] {
                s25
            }).where("episodeid=?", new String[] {
                uri
            });

        case 600: 
            return selectionbuilder.table("artists");

        case 601: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("artists").where("host_id=?", new String[] {
                uri
            });

        case 602: 
            String s10 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Artists.getArtistId(uri);
            return selectionbuilder.table("artists").where("host_id=?", new String[] {
                s10
            }).where("artistid=?", new String[] {
                uri
            });

        case 700: 
            return selectionbuilder.table("albums");

        case 701: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("albums").where("host_id=?", new String[] {
                uri
            });

        case 702: 
            String s11 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Albums.getAlbumId(uri);
            return selectionbuilder.table("albums").where("host_id=?", new String[] {
                s11
            }).where("albumid=?", new String[] {
                uri
            });

        case 800: 
            return selectionbuilder.table("songs");

        case 802: 
            String s12 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Albums.getAlbumId(uri);
            return selectionbuilder.table("songs").where("host_id=?", new String[] {
                s12
            }).where("albumid=?", new String[] {
                uri
            });

        case 803: 
            String s13 = MediaContract.Hosts.getHostId(uri);
            String s24 = MediaContract.Albums.getAlbumId(uri);
            uri = MediaContract.Songs.getSongId(uri);
            return selectionbuilder.table("songs").where("host_id=?", new String[] {
                s13
            }).where("albumid=?", new String[] {
                s24
            }).where("songid=?", new String[] {
                uri
            });

        case 900: 
            return selectionbuilder.table("audio_genres");

        case 901: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("audio_genres").where("host_id=?", new String[] {
                uri
            });

        case 902: 
            String s14 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.AudioGenres.getAudioGenreId(uri);
            return selectionbuilder.table("audio_genres").where("host_id=?", new String[] {
                s14
            }).where("genreid=?", new String[] {
                uri
            });

        case 1000: 
            return selectionbuilder.table("album_artists");

        case 1001: 
            return selectionbuilder.table("album_genres");

        case 610: 
            String s15 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Artists.getArtistId(uri);
            return selectionbuilder.table("album_artists JOIN albums ON album_artists.host_id=albums.host_id AND album_artists.albumid=albums.albumid").mapToTable("_id", "albums").mapToTable("host_id", "albums").mapToTable("albumid", "albums").mapToTable("artistid", "album_artists").where("album_artists.host_id=?", new String[] {
                s15
            }).where("album_artists.artistid=?", new String[] {
                uri
            });

        case 710: 
            String s16 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Albums.getAlbumId(uri);
            return selectionbuilder.table("album_artists JOIN artists ON album_artists.host_id=artists.host_id AND album_artists.artistid=artists.artistid").mapToTable("_id", "artists").mapToTable("host_id", "artists").mapToTable("artistid", "artists").mapToTable("albumid", "album_artists").where("album_artists.host_id=?", new String[] {
                s16
            }).where("album_artists.albumid=?", new String[] {
                uri
            });

        case 711: 
            String s17 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.Albums.getAlbumId(uri);
            return selectionbuilder.table("album_genres JOIN audio_genres ON album_genres.host_id=audio_genres.host_id AND album_genres.genreid=audio_genres.genreid").mapToTable("_id", "audio_genres").mapToTable("host_id", "audio_genres").mapToTable("genreid", "audio_genres").mapToTable("albumid", "album_genres").where("album_genres.host_id=?", new String[] {
                s17
            }).where("album_genres.albumid=?", new String[] {
                uri
            });

        case 910: 
            String s18 = MediaContract.Hosts.getHostId(uri);
            uri = MediaContract.AudioGenres.getAudioGenreId(uri);
            return selectionbuilder.table("album_genres JOIN albums ON album_genres.host_id=albums.host_id AND album_genres.albumid=albums.albumid").mapToTable("_id", "albums").mapToTable("host_id", "albums").mapToTable("albumid", "albums").mapToTable("genreid", "album_genres").where("album_genres.host_id=?", new String[] {
                s18
            }).where("album_genres.genreid=?", new String[] {
                uri
            });

        case 1100: 
            return selectionbuilder.table("music_videos");

        case 1101: 
            uri = MediaContract.Hosts.getHostId(uri);
            return selectionbuilder.table("music_videos").where("host_id=?", new String[] {
                uri
            });

        case 1102: 
            s19 = MediaContract.Hosts.getHostId(uri);
            break;
        }
        uri = MediaContract.MusicVideos.getMusicVideoId(uri);
        return selectionbuilder.table("music_videos").where("host_id=?", new String[] {
            s19
        }).where("musicvideoid=?", new String[] {
            uri
        });
    }

    private static UriMatcher buildUriMatcher()
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts", 100);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*", 101);
        urimatcher.addURI("org.xbmc.kore.provider", "movies", 200);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/movies", 201);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/movies/*", 202);
        urimatcher.addURI("org.xbmc.kore.provider", "movie_cast", 210);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/movies/*/movie_cast", 211);
        urimatcher.addURI("org.xbmc.kore.provider", "tvshows", 300);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows", 302);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*", 303);
        urimatcher.addURI("org.xbmc.kore.provider", "tvshow_cast", 310);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/tvshow_cast", 311);
        urimatcher.addURI("org.xbmc.kore.provider", "seasons", 400);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/seasons", 401);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/seasons/*", 402);
        urimatcher.addURI("org.xbmc.kore.provider", "episodes", 500);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/episodes", 501);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/episodes/*", 502);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/seasons/*/episodes", 503);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/tvshows/*/seasons/*/episodes/*", 504);
        urimatcher.addURI("org.xbmc.kore.provider", "artists", 600);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/artists", 601);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/artists/*", 602);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/artists/*/albums", 610);
        urimatcher.addURI("org.xbmc.kore.provider", "albums", 700);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums", 701);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums/*", 702);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums/*/artists", 710);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums/*/audio_genres", 711);
        urimatcher.addURI("org.xbmc.kore.provider", "songs", 800);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums/*/songs", 802);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/albums/*/songs/*", 803);
        urimatcher.addURI("org.xbmc.kore.provider", "audio_genres", 900);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/audio_genres", 901);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/audio_genres/*", 902);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/audio_genres/*/albums", 910);
        urimatcher.addURI("org.xbmc.kore.provider", "album_artists", 1000);
        urimatcher.addURI("org.xbmc.kore.provider", "album_genres", 1001);
        urimatcher.addURI("org.xbmc.kore.provider", "music_videos", 1100);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/music_videos", 1101);
        urimatcher.addURI("org.xbmc.kore.provider", "hosts/*/music_videos/*", 1102);
        return urimatcher;
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        int j;
        long l;
        l = System.currentTimeMillis();
        j = sUriMatcher.match(uri);
        j;
        JVM INSTR lookupswitch 13: default 132
    //                   200: 159
    //                   210: 223
    //                   300: 229
    //                   310: 235
    //                   400: 241
    //                   500: 247
    //                   600: 253
    //                   700: 259
    //                   800: 265
    //                   900: 271
    //                   1000: 283
    //                   1001: 277
    //                   1100: 289;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());
_L2:
        String s = "movies";
_L16:
        SQLiteDatabase sqlitedatabase;
        long l1;
        sqlitedatabase = mOpenHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        l1 = System.currentTimeMillis();
        int k = acontentvalues.length;
        int i = 0;
          goto _L15
_L21:
        ContentValues contentvalues;
        contentvalues.put("updated", Long.valueOf(l1));
_L22:
        sqlitedatabase.insertOrThrow(s, null, contentvalues);
        i++;
          goto _L15
_L3:
        s = "movie_cast";
          goto _L16
_L4:
        s = "tvshows";
          goto _L16
_L5:
        s = "tvshows_cast";
          goto _L16
_L6:
        s = "seasons";
          goto _L16
_L7:
        s = "episodes";
          goto _L16
_L8:
        s = "artists";
          goto _L16
_L9:
        s = "albums";
          goto _L16
_L10:
        s = "songs";
          goto _L16
_L11:
        s = "audio_genres";
          goto _L16
_L13:
        s = "album_genres";
          goto _L16
_L12:
        s = "album_artists";
          goto _L16
_L14:
        s = "music_videos";
          goto _L16
_L20:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L18:
        getContext().getContentResolver().notifyChange(uri, null);
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Bulk insert finished for uri (").append(uri).append(") in (ms): ").append(System.currentTimeMillis() - l).toString());
        return acontentvalues.length;
        Exception exception;
        exception;
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Couldn't bulk insert records. Exception: ").append(exception.getMessage()).toString());
        sqlitedatabase.endTransaction();
        if (true) goto _L18; else goto _L17
_L17:
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
_L15:
        if (i >= k) goto _L20; else goto _L19
_L19:
        contentvalues = acontentvalues[i];
        j;
        JVM INSTR tableswitch 1000 1001: default 444
    //                   1000 204
    //                   1001 204;
           goto _L21 _L22 _L22
    }

    public int delete(Uri uri, String s, String as[])
    {
        int i = sUriMatcher.match(uri);
        SQLiteDatabase sqlitedatabase = mOpenHelper.getWritableDatabase();
        i = buildQuerySelection(uri, i).where(s, as).delete(sqlitedatabase);
        LogUtils.LOGD(TAG, (new StringBuilder()).append("delete(uri=").append(uri).append("). Rows affected: ").append(i).toString());
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public String getType(Uri uri)
    {
        switch (sUriMatcher.match(uri))
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());

        case 100: // 'd'
            return "vnd.android.cursor.dir/vnd.org.xbmc.hosts";

        case 101: // 'e'
            return "vnd.android.cursor.item/vnd.org.xbmc.hosts";

        case 200: 
        case 201: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.movies";

        case 202: 
            return "vnd.android.cursor.item/vnd.org.xbmc.movies";

        case 210: 
        case 211: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.movie_cast";

        case 300: 
        case 302: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.tvshows";

        case 303: 
            return "vnd.android.cursor.item/vnd.org.xbmc.tvshows";

        case 310: 
        case 311: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.tvshow_cast";

        case 400: 
        case 401: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.seasons";

        case 402: 
            return "vnd.android.cursor.item/vnd.org.xbmc.seasons";

        case 500: 
        case 501: 
        case 503: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.episodes";

        case 502: 
        case 504: 
            return "vnd.android.cursor.item/vnd.org.xbmc.episodes";

        case 600: 
        case 601: 
        case 710: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.artists";

        case 602: 
            return "vnd.android.cursor.item/vnd.org.xbmc.artists";

        case 610: 
        case 700: 
        case 701: 
        case 910: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.albums";

        case 702: 
            return "vnd.android.cursor.item/vnd.org.xbmc.albums";

        case 800: 
        case 802: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.songs";

        case 803: 
            return "vnd.android.cursor.item/vnd.org.xbmc.songs";

        case 711: 
        case 900: 
        case 901: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.audio_genres";

        case 902: 
            return "vnd.android.cursor.item/vnd.org.xbmc.audio_genres";

        case 1000: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.album_artists";

        case 1001: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.album_genres";

        case 1100: 
        case 1101: 
            return "vnd.android.cursor.dir/vnd.org.xbmc.music_videos";

        case 1102: 
            return "vnd.android.cursor.item/vnd.org.xbmc.music_videos";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        LogUtils.LOGV(TAG, (new StringBuilder()).append("insert(uri=").append(uri).append(", values=").append(contentvalues.toString()).append(")").toString());
        SQLiteDatabase sqlitedatabase = mOpenHelper.getWritableDatabase();
        switch (sUriMatcher.match(uri))
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unsuported uri: ").append(uri).toString());

        case 100: // 'd'
            contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
            break;
        }
        contentvalues = MediaContract.Hosts.buildHostUri(sqlitedatabase.insertOrThrow("hosts", null, contentvalues));
        getContext().getContentResolver().notifyChange(uri, null);
        return contentvalues;
    }

    public boolean onCreate()
    {
        mOpenHelper = new MediaDatabase(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        LogUtils.LOGV(TAG, (new StringBuilder()).append("query(uri=").append(uri).append(", proj=").append(Arrays.toString(as)).append(")").toString());
        SQLiteDatabase sqlitedatabase = mOpenHelper.getReadableDatabase();
        return buildQuerySelection(uri, sUriMatcher.match(uri)).where(s, as1).query(sqlitedatabase, as, s1);
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        LogUtils.LOGD(TAG, (new StringBuilder()).append("update(uri=").append(uri).append(", values=").append(contentvalues.toString()).append(")").toString());
        int i = sUriMatcher.match(uri);
        switch (i)
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri for update: ").append(uri).toString());

        case 101: // 'e'
        case 202: 
        case 303: 
        case 402: 
        case 502: 
        case 602: 
        case 702: 
        case 803: 
        case 902: 
        case 1102: 
            contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
            break;
        }
        SQLiteDatabase sqlitedatabase = mOpenHelper.getWritableDatabase();
        i = buildQuerySelection(uri, i).where(s, as).update(sqlitedatabase, contentvalues);
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

}
