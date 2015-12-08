// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.List;

public class MediaContract
{
    public static class AlbumArtists
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "host_id", "albumid", "artistid"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildAlbumsForArtistListUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("artists").appendPath(String.valueOf(l1)).appendPath("albums").build();
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("album_artists").build();
        }
    }

    public static class AlbumGenres
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "host_id", "albumid", "genreid"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildAlbumsForGenreListUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("audio_genres").appendPath(String.valueOf(l1)).appendPath("albums").build();
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("album_genres").build();
        }
    }

    public static class Albums
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "albumid", "fanart", "thumbnail", "displayartist", "rating", "title", "year", 
            "albumlabel", "description", "playcount", "genre"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildAlbumUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("albums").appendPath(String.valueOf(l1)).build();
        }

        public static Uri buildAlbumsListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("albums").build();
        }

        public static String getAlbumId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("albums").build();
        }
    }

    public static class Artists
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "artistid", "artist", "description", "genre", "fanart", "thumbnail"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildArtistsListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("artists").build();
        }

        public static String getArtistId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("artists").build();
        }
    }

    public static class AudioGenres
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "genreid", "thumbnail", "title"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildAudioGenresListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("audio_genres").build();
        }

        public static String getAudioGenreId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("audio_genres").build();
        }
    }

    public static class Episodes
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "episodeid", "tvshowid", "season", "episode", "fanart", "thumbnail", "playcount", 
            "title", "dateadded", "file", "plot", "director", "runtime", "firstaired", "rating", "showtitle", "writer", 
            "audio_channels", "audio_coded", "audio_language", "subtitles_languages", "video_aspect", "video_codec", "video_height", "video_width"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildTVShowEpisodeUri(long l, long l1, long l2)
        {
            return TVShows.buildTVShowUri(l, l1).buildUpon().appendPath("episodes").appendPath(String.valueOf(l2)).build();
        }

        public static Uri buildTVShowEpisodesListUri(long l, long l1)
        {
            return TVShows.buildTVShowUri(l, l1).buildUpon().appendPath("episodes").build();
        }

        public static Uri buildTVShowSeasonEpisodesListUri(long l, long l1, long l2)
        {
            return Seasons.buildTVShowSeasonUri(l, l1, l2).buildUpon().appendPath("episodes").build();
        }

        public static String getTVShowEpisodeId(Uri uri)
        {
            return (String)uri.getPathSegments().get(5);
        }

        public static String getTVShowSeasonEpisodeId(Uri uri)
        {
            return (String)uri.getPathSegments().get(7);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("episodes").build();
        }
    }

    public static class Hosts
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "name", "address", "protocol", "http_port", "tcp_port", "username", "password", "mac_address", 
            "wol_port", "use_event_server", "event_server_port"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildHostUri(long l)
        {
            return CONTENT_URI.buildUpon().appendPath(String.valueOf(l)).build();
        }

        public static String getHostId(Uri uri)
        {
            return (String)uri.getPathSegments().get(1);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("hosts").build();
        }
    }

    public static class MovieCast
        implements BaseColumns
    {

        public static final Uri CONTENT_URI;

        public static Uri buildMovieCastListUri(long l, long l1)
        {
            return Movies.buildMovieUri(l, l1).buildUpon().appendPath("movie_cast").build();
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("movie_cast").build();
        }
    }

    public static class Movies
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "movieid", "fanart", "thumbnail", "playcount", "title", "file", "plot", 
            "director", "runtime", "audio_channels", "audio_coded", "audio_language", "subtitles_languages", "video_aspect", "video_codec", "video_height", "video_width", 
            "countries", "genres", "imdbnumber", "mpaa", "rating", "movie_set", "setid", "studios", "tagline", "top250", 
            "trailer", "votes", "writers", "year", "dateadded"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildMovieUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("movies").appendPath(String.valueOf(l1)).build();
        }

        public static Uri buildMoviesListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("movies").build();
        }

        public static String getMovieId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("movies").build();
        }
    }

    public static class MusicVideos
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "musicvideoid", "fanart", "thumbnail", "playcount", "title", "file", "plot", 
            "director", "runtime", "audio_channels", "audio_coded", "audio_language", "subtitles_languages", "video_aspect", "video_codec", "video_height", "video_width", 
            "album", "artist", "genre", "studio", "tag", "track", "year"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildMusicVideoUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("music_videos").appendPath(String.valueOf(l1)).build();
        }

        public static Uri buildMusicVideosListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("music_videos").build();
        }

        public static String getMusicVideoId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("music_videos").build();
        }
    }

    public static class Seasons
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "tvshowid", "season", "label", "fanart", "thumbnail", "episode", "showtitle", 
            "watchedepisodes"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildTVShowSeasonUri(long l, long l1, long l2)
        {
            return TVShows.buildTVShowUri(l, l1).buildUpon().appendPath("seasons").appendPath(String.valueOf(l2)).build();
        }

        public static Uri buildTVShowSeasonsListUri(long l, long l1)
        {
            return TVShows.buildTVShowUri(l, l1).buildUpon().appendPath("seasons").build();
        }

        public static String getTVShowSeasonId(Uri uri)
        {
            return (String)uri.getPathSegments().get(5);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("seasons").build();
        }
    }

    public static class Songs
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "albumid", "songid", "duration", "thumbnail", "file", "track", "title"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildSongsListUri(long l, long l1)
        {
            return Albums.buildAlbumUri(l, l1).buildUpon().appendPath("songs").build();
        }

        public static String getSongId(Uri uri)
        {
            return (String)uri.getPathSegments().get(5);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("songs").build();
        }
    }

    public static class TVShowCast
        implements BaseColumns
    {

        public static final Uri CONTENT_URI;

        public static Uri buildTVShowCastListUri(long l, long l1)
        {
            return TVShows.buildTVShowUri(l, l1).buildUpon().appendPath("tvshow_cast").build();
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("tvshow_cast").build();
        }
    }

    public static class TVShows
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "_id", "updated", "host_id", "tvshowid", "fanart", "thumbnail", "playcount", "title", "dateadded", "file", 
            "plot", "episode", "imdbnumber", "mpaa", "premiered", "rating", "studio", "watchedepisodes", "genres"
        };
        public static final Uri CONTENT_URI;

        public static Uri buildTVShowUri(long l, long l1)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("tvshows").appendPath(String.valueOf(l1)).build();
        }

        public static Uri buildTVShowsListUri(long l)
        {
            return Hosts.buildHostUri(l).buildUpon().appendPath("tvshows").build();
        }

        public static String getTVShowId(Uri uri)
        {
            return (String)uri.getPathSegments().get(3);
        }

        static 
        {
            CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().appendPath("tvshows").build();
        }
    }


    public static final Uri BASE_CONTENT_URI = Uri.parse("content://org.xbmc.kore.provider");

}
