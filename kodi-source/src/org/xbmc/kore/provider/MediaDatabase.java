// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.xbmc.kore.utils.LogUtils;

public class MediaDatabase extends SQLiteOpenHelper
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/provider/MediaDatabase);
    private static String commonTokens[] = {
        "The"
    };

    public MediaDatabase(Context context)
    {
        super(context, "xbmc.sqlite", null, 5);
    }

    private String buildHostsDeleteTrigger(String s, String s1)
    {
        return (new StringBuilder()).append("CREATE TRIGGER host_").append(s).append("_delete AFTER DELETE ON ").append("hosts").append(" BEGIN DELETE FROM ").append(s).append(" WHERE ").append(s).append(".").append(s1).append("=old.").append("_id").append(";").append(" END;").toString();
    }

    public static String sortCommonTokens(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(" (CASE ");
        String as[] = commonTokens;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            stringbuilder.append((new StringBuilder()).append(" WHEN ").append(s).append(" LIKE '").append(s1).append(" %'").append(" THEN SUBSTR(").append(s).append(",").append(String.valueOf(s1.length() + 2)).append(")").append(" || ', ").append(s1).append("' ").toString());
        }

        stringbuilder.append((new StringBuilder()).append(" ELSE ").append(s).append(" END) ").toString());
        return stringbuilder.toString();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE hosts(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,name TEXT, address TEXT, protocol INTEGER, http_port INTEGER, tcp_port INTEGER, username TEXT, password TEXT, mac_address TEXT, wol_port INTEGER, use_event_server INTEGER, event_server_port INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE movies(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), movieid INTEGER NOT NULL, fanart TEXT, thumbnail TEXT, playcount INTEGER, title TEXT, file TEXT, plot TEXT, director TEXT, runtime INTEGER, audio_channels INTEGER, audio_coded TEXT, audio_language TEXT, subtitles_languages TEXT, video_aspect REAL, video_codec TEXT, video_height INTEGER, video_width INTEGER, countries TEXT, genres TEXT, imdbnumber TEXT, mpaa TEXT, rating REAL, movie_set TEXT, setid INTEGER, studios TEXT, tagline TEXT, top250 INTEGER, trailer TEXT, votes TEXT, writers TEXT, year INTEGER, dateadded TEXT, UNIQUE (host_id, movieid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE movie_cast(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), movieid INTEGER NOT NULL, name TEXT, cast_order INTEGER, role TEXT, thumbnail TEXT, UNIQUE (host_id, movieid, name) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE tvshows(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), tvshowid INTEGER NOT NULL, fanart TEXT, thumbnail TEXT, playcount INTEGER, title TEXT, dateadded TEXT, file TEXT, plot TEXT, episode INTEGER, imdbnumber TEXT, mpaa TEXT, premiered TEXT, rating REAL, studio TEXT, watchedepisodes INTEGER, genres TEXT, UNIQUE (host_id, tvshowid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE tvshows_cast(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), tvshowid INTEGER NOT NULL, name TEXT, cast_order INTEGER, role TEXT, thumbnail TEXT, UNIQUE (host_id, tvshowid, name) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE seasons(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), tvshowid INTEGER NOT NULL, season INTEGER NOT NULL, label TEXT, fanart TEXT, thumbnail TEXT, episode INTEGER, showtitle TEXT, watchedepisodes INTEGER, UNIQUE (host_id, tvshowid, season) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE episodes(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), episodeid INTEGER NOT NULL, tvshowid INTEGER NOT NULL, season INTEGER NOT NULL, episode INTEGER NOT NULL, fanart TEXT, thumbnail TEXT, playcount INTEGER, title TEXT, dateadded TEXT, file TEXT, plot TEXT, director TEXT, runtime INTEGER, firstaired TEXT, rating REAL, showtitle TEXT, writer TEXT, audio_channels INTEGER, audio_coded TEXT, audio_language TEXT, subtitles_languages TEXT, video_aspect REAL, video_codec TEXT, video_height INTEGER, video_width INTEGER, UNIQUE (host_id, episodeid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE artists(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), artistid INTEGER NOT NULL, artist TEXT, description TEXT, genre TEXT, fanart TEXT, thumbnail TEXT, UNIQUE (host_id, artistid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE albums(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), albumid INTEGER NOT NULL, fanart TEXT, thumbnail TEXT, displayartist TEXT, rating INTEGER, title TEXT, year INTEGER, albumlabel TEXT, description TEXT, playcount INTEGER, genre TEXT, UNIQUE (host_id, albumid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE songs(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), albumid INTEGER NOT NULL, songid INTEGER NOT NULL, duration INTEGER, thumbnail TEXT, file TEXT, track INTEGER, title TEXT, UNIQUE (host_id, albumid, songid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE audio_genres(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), genreid INTEGER NOT NULL, thumbnail TEXT, title TEXT, UNIQUE (host_id, genreid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE album_artists(_id INTEGER PRIMARY KEY AUTOINCREMENT, host_id INTEGER NOT NULL REFERENCES hosts(_id), albumid INTEGER NOT NULL REFERENCES albums(albumid), artistid INTEGER NOT NULL REFERENCES artists(artistid), UNIQUE (host_id, albumid, artistid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE album_genres(_id INTEGER PRIMARY KEY AUTOINCREMENT, host_id INTEGER NOT NULL REFERENCES hosts(_id), albumid INTEGER NOT NULL REFERENCES albums(albumid), genreid INTEGER NOT NULL REFERENCES audio_genres(genreid), UNIQUE (host_id, albumid, genreid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL("CREATE TABLE music_videos(_id INTEGER PRIMARY KEY AUTOINCREMENT, updated INTEGER NOT NULL,host_id INTEGER NOT NULL REFERENCES hosts(_id), musicvideoid INTEGER NOT NULL, fanart TEXT, thumbnail TEXT, playcount INTEGER, title TEXT, file TEXT, plot TEXT, director TEXT, runtime INTEGER, audio_channels INTEGER, audio_coded TEXT, audio_language TEXT, subtitles_languages TEXT, video_aspect REAL, video_codec TEXT, video_height INTEGER, video_width INTEGER, album TEXT, artist TEXT, genre TEXT, studio TEXT, tag TEXT, track INTEGER, year INTEGER, UNIQUE (host_id, musicvideoid) ON CONFLICT REPLACE)");
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("movies", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("movie_cast", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("tvshows", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("tvshows_cast", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("episodes", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("seasons", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("artists", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("albums", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("songs", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("audio_genres", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("album_artists", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("album_genres", "host_id"));
        sqlitedatabase.execSQL(buildHostsDeleteTrigger("music_videos", "host_id"));
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 4: // '\004'
            sqlitedatabase.execSQL("ALTER TABLE hosts ADD COLUMN use_event_server INTEGER DEFAULT 1;");
            break;
        }
        sqlitedatabase.execSQL("ALTER TABLE hosts ADD COLUMN event_server_port INTEGER DEFAULT 9777;");
    }

}
