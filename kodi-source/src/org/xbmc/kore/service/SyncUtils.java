// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import org.xbmc.kore.utils.Utils;

public class SyncUtils
{

    public static ContentValues contentValuesFromAlbum(int i, org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum detailsalbum)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("albumid", Integer.valueOf(detailsalbum.albumid));
        contentvalues.put("fanart", detailsalbum.fanart);
        contentvalues.put("thumbnail", detailsalbum.thumbnail);
        contentvalues.put("displayartist", detailsalbum.displayartist);
        contentvalues.put("rating", Integer.valueOf(detailsalbum.rating));
        contentvalues.put("title", detailsalbum.title);
        contentvalues.put("year", Integer.valueOf(detailsalbum.year));
        contentvalues.put("albumlabel", detailsalbum.albumlabel);
        contentvalues.put("description", detailsalbum.description);
        contentvalues.put("playcount", Integer.valueOf(detailsalbum.playcount));
        contentvalues.put("genre", Utils.listStringConcat(detailsalbum.genre, ", "));
        return contentvalues;
    }

    public static ContentValues contentValuesFromArtist(int i, org.xbmc.kore.jsonrpc.type.AudioType.DetailsArtist detailsartist)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("artistid", Integer.valueOf(detailsartist.artistid));
        contentvalues.put("artist", detailsartist.artist);
        contentvalues.put("description", detailsartist.description);
        contentvalues.put("genre", Utils.listStringConcat(detailsartist.genre, ", "));
        contentvalues.put("fanart", detailsartist.fanart);
        contentvalues.put("thumbnail", detailsartist.thumbnail);
        return contentvalues;
    }

    public static ContentValues contentValuesFromAudioGenre(int i, org.xbmc.kore.jsonrpc.type.LibraryType.DetailsGenre detailsgenre)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("genreid", detailsgenre.genreid);
        contentvalues.put("title", detailsgenre.title);
        contentvalues.put("thumbnail", detailsgenre.thumbnail);
        return contentvalues;
    }

    public static ContentValues contentValuesFromCast(int i, org.xbmc.kore.jsonrpc.type.VideoType.Cast cast)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("name", cast.name);
        contentvalues.put("cast_order", Integer.valueOf(cast.order));
        contentvalues.put("role", cast.role);
        contentvalues.put("thumbnail", cast.thumbnail);
        return contentvalues;
    }

    public static ContentValues contentValuesFromEpisode(int i, org.xbmc.kore.jsonrpc.type.VideoType.DetailsEpisode detailsepisode)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("episodeid", Integer.valueOf(detailsepisode.episodeid));
        contentvalues.put("tvshowid", Integer.valueOf(detailsepisode.tvshowid));
        contentvalues.put("season", Integer.valueOf(detailsepisode.season));
        contentvalues.put("episode", Integer.valueOf(detailsepisode.episode));
        contentvalues.put("fanart", detailsepisode.fanart);
        contentvalues.put("thumbnail", detailsepisode.thumbnail);
        contentvalues.put("playcount", detailsepisode.playcount);
        contentvalues.put("dateadded", detailsepisode.dateadded);
        contentvalues.put("title", detailsepisode.title);
        contentvalues.put("file", detailsepisode.file);
        contentvalues.put("plot", detailsepisode.plot);
        contentvalues.put("director", Utils.listStringConcat(detailsepisode.director, ", "));
        contentvalues.put("runtime", Integer.valueOf(detailsepisode.runtime));
        contentvalues.put("firstaired", detailsepisode.firstaired);
        contentvalues.put("rating", Double.valueOf(detailsepisode.rating));
        contentvalues.put("showtitle", detailsepisode.showtitle);
        contentvalues.put("writer", Utils.listStringConcat(detailsepisode.writer, ", "));
        if (detailsepisode.streamdetails.audio.size() > 0)
        {
            org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsepisode.streamdetails.audio.get(0);
            ArrayList arraylist1 = new ArrayList(detailsepisode.streamdetails.audio.size());
            for (i = 0; i < detailsepisode.streamdetails.audio.size();)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio2 = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsepisode.streamdetails.audio.get(0);
                org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio1 = audio;
                if (audio2.channels > audio.channels)
                {
                    audio1 = audio2;
                }
                arraylist1.add(audio2.language);
                i++;
                audio = audio1;
            }

            contentvalues.put("audio_channels", Integer.valueOf(audio.channels));
            contentvalues.put("audio_coded", audio.codec);
            contentvalues.put("audio_language", Utils.listStringConcat(arraylist1, ", "));
        }
        if (detailsepisode.streamdetails.subtitle.size() > 0)
        {
            ArrayList arraylist = new ArrayList(detailsepisode.streamdetails.subtitle.size());
            for (i = 0; i < detailsepisode.streamdetails.subtitle.size(); i++)
            {
                arraylist.add(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Subtitle)detailsepisode.streamdetails.subtitle.get(i)).language);
            }

            contentvalues.put("subtitles_languages", Utils.listStringConcat(arraylist, ", "));
        }
        if (detailsepisode.streamdetails.video.size() > 0)
        {
            contentvalues.put("video_aspect", Double.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsepisode.streamdetails.video.get(0)).aspect));
            contentvalues.put("video_codec", ((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsepisode.streamdetails.video.get(0)).codec);
            contentvalues.put("video_height", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsepisode.streamdetails.video.get(0)).height));
            contentvalues.put("video_width", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsepisode.streamdetails.video.get(0)).width));
        }
        return contentvalues;
    }

    public static ContentValues contentValuesFromMovie(int i, org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie detailsmovie)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("movieid", Integer.valueOf(detailsmovie.movieid));
        contentvalues.put("fanart", detailsmovie.fanart);
        contentvalues.put("thumbnail", detailsmovie.thumbnail);
        contentvalues.put("playcount", detailsmovie.playcount);
        contentvalues.put("dateadded", detailsmovie.dateadded);
        contentvalues.put("title", detailsmovie.title);
        contentvalues.put("file", detailsmovie.file);
        contentvalues.put("plot", detailsmovie.plot);
        contentvalues.put("director", Utils.listStringConcat(detailsmovie.director, ", "));
        contentvalues.put("runtime", Integer.valueOf(detailsmovie.runtime));
        if (detailsmovie.streamdetails != null)
        {
            if (detailsmovie.streamdetails.audio.size() > 0)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsmovie.streamdetails.audio.get(0);
                ArrayList arraylist1 = new ArrayList(detailsmovie.streamdetails.audio.size());
                for (i = 0; i < detailsmovie.streamdetails.audio.size();)
                {
                    org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio2 = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsmovie.streamdetails.audio.get(0);
                    org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio1 = audio;
                    if (audio2.channels > audio.channels)
                    {
                        audio1 = audio2;
                    }
                    arraylist1.add(audio2.language);
                    i++;
                    audio = audio1;
                }

                contentvalues.put("audio_channels", Integer.valueOf(audio.channels));
                contentvalues.put("audio_coded", audio.codec);
                contentvalues.put("audio_language", Utils.listStringConcat(arraylist1, ", "));
            }
            if (detailsmovie.streamdetails.subtitle.size() > 0)
            {
                ArrayList arraylist = new ArrayList(detailsmovie.streamdetails.subtitle.size());
                for (i = 0; i < detailsmovie.streamdetails.subtitle.size(); i++)
                {
                    arraylist.add(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Subtitle)detailsmovie.streamdetails.subtitle.get(i)).language);
                }

                contentvalues.put("subtitles_languages", Utils.listStringConcat(arraylist, ", "));
            }
            if (detailsmovie.streamdetails.video.size() > 0)
            {
                contentvalues.put("video_aspect", Double.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmovie.streamdetails.video.get(0)).aspect));
                contentvalues.put("video_codec", ((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmovie.streamdetails.video.get(0)).codec);
                contentvalues.put("video_height", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmovie.streamdetails.video.get(0)).height));
                contentvalues.put("video_width", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmovie.streamdetails.video.get(0)).width));
            }
        }
        contentvalues.put("countries", Utils.listStringConcat(detailsmovie.country, ", "));
        contentvalues.put("genres", Utils.listStringConcat(detailsmovie.genre, ", "));
        contentvalues.put("imdbnumber", detailsmovie.imdbnumber);
        contentvalues.put("mpaa", detailsmovie.mpaa);
        contentvalues.put("rating", Double.valueOf(detailsmovie.rating));
        contentvalues.put("movie_set", detailsmovie.set);
        contentvalues.put("setid", Integer.valueOf(detailsmovie.setid));
        contentvalues.put("studios", Utils.listStringConcat(detailsmovie.studio, ", "));
        contentvalues.put("tagline", detailsmovie.tagline);
        contentvalues.put("top250", Integer.valueOf(detailsmovie.top250));
        contentvalues.put("trailer", detailsmovie.trailer);
        contentvalues.put("votes", detailsmovie.votes);
        contentvalues.put("writers", Utils.listStringConcat(detailsmovie.writer, ", "));
        contentvalues.put("year", Integer.valueOf(detailsmovie.year));
        return contentvalues;
    }

    public static ContentValues contentValuesFromMusicVideo(int i, org.xbmc.kore.jsonrpc.type.VideoType.DetailsMusicVideo detailsmusicvideo)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("musicvideoid", Integer.valueOf(detailsmusicvideo.musicvideoid));
        contentvalues.put("fanart", detailsmusicvideo.fanart);
        contentvalues.put("thumbnail", detailsmusicvideo.thumbnail);
        contentvalues.put("playcount", detailsmusicvideo.playcount);
        contentvalues.put("title", detailsmusicvideo.title);
        contentvalues.put("file", detailsmusicvideo.file);
        contentvalues.put("plot", detailsmusicvideo.plot);
        contentvalues.put("director", Utils.listStringConcat(detailsmusicvideo.director, ", "));
        contentvalues.put("runtime", Integer.valueOf(detailsmusicvideo.runtime));
        if (detailsmusicvideo.streamdetails != null)
        {
            if (detailsmusicvideo.streamdetails.audio.size() > 0)
            {
                org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsmusicvideo.streamdetails.audio.get(0);
                ArrayList arraylist1 = new ArrayList(detailsmusicvideo.streamdetails.audio.size());
                for (i = 0; i < detailsmusicvideo.streamdetails.audio.size();)
                {
                    org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio2 = (org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio)detailsmusicvideo.streamdetails.audio.get(0);
                    org.xbmc.kore.jsonrpc.type.VideoType.Streams.Audio audio1 = audio;
                    if (audio2.channels > audio.channels)
                    {
                        audio1 = audio2;
                    }
                    arraylist1.add(audio2.language);
                    i++;
                    audio = audio1;
                }

                contentvalues.put("audio_channels", Integer.valueOf(audio.channels));
                contentvalues.put("audio_coded", audio.codec);
                contentvalues.put("audio_language", Utils.listStringConcat(arraylist1, ", "));
            }
            if (detailsmusicvideo.streamdetails.subtitle.size() > 0)
            {
                ArrayList arraylist = new ArrayList(detailsmusicvideo.streamdetails.subtitle.size());
                for (i = 0; i < detailsmusicvideo.streamdetails.subtitle.size(); i++)
                {
                    arraylist.add(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Subtitle)detailsmusicvideo.streamdetails.subtitle.get(i)).language);
                }

                contentvalues.put("subtitles_languages", Utils.listStringConcat(arraylist, ", "));
            }
            if (detailsmusicvideo.streamdetails.video.size() > 0)
            {
                contentvalues.put("video_aspect", Double.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmusicvideo.streamdetails.video.get(0)).aspect));
                contentvalues.put("video_codec", ((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmusicvideo.streamdetails.video.get(0)).codec);
                contentvalues.put("video_height", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmusicvideo.streamdetails.video.get(0)).height));
                contentvalues.put("video_width", Integer.valueOf(((org.xbmc.kore.jsonrpc.type.VideoType.Streams.Video)detailsmusicvideo.streamdetails.video.get(0)).width));
            }
        }
        contentvalues.put("album", detailsmusicvideo.album);
        contentvalues.put("artist", Utils.listStringConcat(detailsmusicvideo.artist, ", "));
        contentvalues.put("genre", Utils.listStringConcat(detailsmusicvideo.genre, ", "));
        contentvalues.put("studio", Utils.listStringConcat(detailsmusicvideo.studio, ", "));
        contentvalues.put("tag", Utils.listStringConcat(detailsmusicvideo.tag, ", "));
        contentvalues.put("track", Integer.valueOf(detailsmusicvideo.track));
        contentvalues.put("year", Integer.valueOf(detailsmusicvideo.year));
        return contentvalues;
    }

    public static ContentValues contentValuesFromSeason(int i, org.xbmc.kore.jsonrpc.type.VideoType.DetailsSeason detailsseason)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("tvshowid", Integer.valueOf(detailsseason.tvshowid));
        contentvalues.put("season", Integer.valueOf(detailsseason.season));
        contentvalues.put("label", detailsseason.label);
        contentvalues.put("fanart", detailsseason.fanart);
        contentvalues.put("thumbnail", detailsseason.thumbnail);
        contentvalues.put("episode", Integer.valueOf(detailsseason.episode));
        contentvalues.put("showtitle", detailsseason.showtitle);
        contentvalues.put("watchedepisodes", Integer.valueOf(detailsseason.watchedepisodes));
        return contentvalues;
    }

    public static ContentValues contentValuesFromSong(int i, org.xbmc.kore.jsonrpc.type.AudioType.DetailsSong detailssong)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("albumid", Integer.valueOf(detailssong.albumid));
        contentvalues.put("songid", Integer.valueOf(detailssong.songid));
        contentvalues.put("duration", Integer.valueOf(detailssong.duration));
        contentvalues.put("thumbnail", detailssong.thumbnail);
        contentvalues.put("file", detailssong.file);
        contentvalues.put("track", Integer.valueOf(detailssong.track));
        contentvalues.put("title", detailssong.title);
        return contentvalues;
    }

    public static ContentValues contentValuesFromTVShow(int i, org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow detailstvshow)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("host_id", Integer.valueOf(i));
        contentvalues.put("tvshowid", Integer.valueOf(detailstvshow.tvshowid));
        contentvalues.put("fanart", detailstvshow.fanart);
        contentvalues.put("thumbnail", detailstvshow.thumbnail);
        contentvalues.put("playcount", detailstvshow.playcount);
        contentvalues.put("title", detailstvshow.title);
        contentvalues.put("dateadded", detailstvshow.dateadded);
        contentvalues.put("file", detailstvshow.file);
        contentvalues.put("plot", detailstvshow.plot);
        contentvalues.put("episode", Integer.valueOf(detailstvshow.episode));
        contentvalues.put("imdbnumber", detailstvshow.imdbnumber);
        contentvalues.put("mpaa", detailstvshow.mpaa);
        contentvalues.put("premiered", detailstvshow.premiered);
        contentvalues.put("rating", Double.valueOf(detailstvshow.rating));
        contentvalues.put("studio", Utils.listStringConcat(detailstvshow.studio, ", "));
        contentvalues.put("watchedepisodes", Integer.valueOf(detailstvshow.watchedepisodes));
        contentvalues.put("genres", Utils.listStringConcat(detailstvshow.genre, ", "));
        return contentvalues;
    }
}
