// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

public class AudioType
{
    public static class DetailsAlbum extends DetailsMedia
    {

        public final int albumid;
        public final String albumlabel;
        public final String description;
        public final List mood;
        public final int playcount;
        public final List style;
        public final List theme;
        public final String type;

        public DetailsAlbum(JsonNode jsonnode)
        {
            super(jsonnode);
            albumid = JsonUtils.intFromJsonNode(jsonnode, "albumid");
            albumlabel = JsonUtils.stringFromJsonNode(jsonnode, "albumlabel");
            description = JsonUtils.stringFromJsonNode(jsonnode, "description");
            mood = JsonUtils.stringListFromJsonNode(jsonnode, "mood");
            playcount = JsonUtils.intFromJsonNode(jsonnode, "playcount");
            style = JsonUtils.stringListFromJsonNode(jsonnode, "style");
            theme = JsonUtils.stringListFromJsonNode(jsonnode, "theme");
            type = JsonUtils.stringFromJsonNode(jsonnode, "type");
        }
    }

    public static class DetailsArtist extends DetailsBase
    {

        public final String artist;
        public final int artistid;
        public final String born;
        public final boolean compilationartist;
        public final String description;
        public final String died;
        public final String disbanded;
        public final String formed;
        public final List instrument;
        public final List mood;
        public final String musicbrainzartistid;
        public final List style;
        public final List yearsactive;

        public DetailsArtist(JsonNode jsonnode)
        {
            super(jsonnode);
            artist = JsonUtils.stringFromJsonNode(jsonnode, "artist");
            artistid = JsonUtils.intFromJsonNode(jsonnode, "artistid");
            born = JsonUtils.stringFromJsonNode(jsonnode, "born");
            compilationartist = JsonUtils.booleanFromJsonNode(jsonnode, "compilationartist", false);
            description = JsonUtils.stringFromJsonNode(jsonnode, "description");
            died = JsonUtils.stringFromJsonNode(jsonnode, "died");
            disbanded = JsonUtils.stringFromJsonNode(jsonnode, "disbanded");
            formed = JsonUtils.stringFromJsonNode(jsonnode, "formed");
            instrument = JsonUtils.stringListFromJsonNode(jsonnode, "instrument");
            mood = JsonUtils.stringListFromJsonNode(jsonnode, "mood");
            musicbrainzartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzartistid");
            style = JsonUtils.stringListFromJsonNode(jsonnode, "style");
            yearsactive = JsonUtils.stringListFromJsonNode(jsonnode, "yearsactive");
        }
    }

    public static class DetailsBase extends MediaType.DetailsBase
    {

        public final List genre;

        public DetailsBase(JsonNode jsonnode)
        {
            super(jsonnode);
            genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
        }
    }

    public static class DetailsMedia extends DetailsBase
    {

        public final List artist;
        public final List artistid;
        public final String displayartist;
        public final List genreid;
        public final String musicbrainzalbumartistid;
        public final String musicbrainzalbumid;
        public final int rating;
        public final String title;
        public final int year;

        public DetailsMedia(JsonNode jsonnode)
        {
            super(jsonnode);
            artist = JsonUtils.stringListFromJsonNode(jsonnode, "artist");
            artistid = JsonUtils.integerListFromJsonNode(jsonnode, "artistid");
            displayartist = JsonUtils.stringFromJsonNode(jsonnode, "displayartist");
            genreid = JsonUtils.integerListFromJsonNode(jsonnode, "genreid");
            musicbrainzalbumartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumartistid");
            musicbrainzalbumid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumid");
            rating = JsonUtils.intFromJsonNode(jsonnode, "rating");
            title = JsonUtils.stringFromJsonNode(jsonnode, "title");
            year = JsonUtils.intFromJsonNode(jsonnode, "year");
        }
    }

    public static class DetailsSong extends DetailsMedia
    {

        public final String album;
        public final List albumartist;
        public final List albumartistid;
        public final int albumid;
        public final String comment;
        public final int disc;
        public final int duration;
        public final String file;
        public final String lastplayed;
        public final String lyrics;
        public final String musicbrainzartistid;
        public final String musicbrainztrackid;
        public final int playcount;
        public final int songid;
        public final int track;

        public DetailsSong(JsonNode jsonnode)
        {
            super(jsonnode);
            album = JsonUtils.stringFromJsonNode(jsonnode, "album");
            albumid = JsonUtils.intFromJsonNode(jsonnode, "albumid");
            albumartist = JsonUtils.stringListFromJsonNode(jsonnode, "albumartist");
            albumartistid = JsonUtils.integerListFromJsonNode(jsonnode, "albumartistid");
            comment = JsonUtils.stringFromJsonNode(jsonnode, "comment");
            disc = JsonUtils.intFromJsonNode(jsonnode, "disc");
            duration = JsonUtils.intFromJsonNode(jsonnode, "duration");
            file = JsonUtils.stringFromJsonNode(jsonnode, "file");
            lastplayed = JsonUtils.stringFromJsonNode(jsonnode, "lastplayed");
            lyrics = JsonUtils.stringFromJsonNode(jsonnode, "lyrics");
            musicbrainzartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzartistid");
            musicbrainztrackid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainztrackid");
            playcount = JsonUtils.intFromJsonNode(jsonnode, "playcount");
            songid = JsonUtils.intFromJsonNode(jsonnode, "songid");
            track = JsonUtils.intFromJsonNode(jsonnode, "track");
        }
    }

}
