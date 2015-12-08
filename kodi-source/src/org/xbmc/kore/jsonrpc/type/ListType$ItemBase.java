// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ListType

public static class 
{

    public final String album;
    public final List albumartist;
    public final List albumartistid;
    public final int albumid;
    public final String albumlabel;
    public  art;
    public final List artist;
    public final List artistid;
    public final List cast;
    public final String comment;
    public final List country;
    public final String dateadded;
    public final String description;
    public final List director;
    public final int disc;
    public final String displayartist;
    public final int duration;
    public final int episode;
    public final String episodeguide;
    public final String fanart;
    public final String file;
    public final String firstaired;
    public final List genre;
    public final List genreid;
    public final int id;
    public final String imdbnumber;
    public final String label;
    public final String lastplayed;
    public final String lyrics;
    public final List mood;
    public final String mpaa;
    public final String musicbrainzalbumartistid;
    public final String musicbrainzalbumid;
    public final String musicbrainzartistid;
    public final String musicbrainztrackid;
    public final String originaltitle;
    public int playcount;
    public final String plot;
    public final String plotoutline;
    public final String premiered;
    public final String productioncode;
    public final double rating;
    public final  resume;
    public final int runtime;
    public final int season;
    public final String set;
    public final int setid;
    public final List showlink;
    public final String showtitle;
    public final String sorttitle;
    public final  streamdetails;
    public final List studio;
    public final List style;
    public final List tag;
    public final String tagline;
    public final List theme;
    public final String thumbnail;
    public final String title;
    public final int top250;
    public final int track;
    public final String trailer;
    public final int tvshowid;
    public final String type;
    public final String votes;
    public final int watchedepisodes;
    public final List writer;
    public final int year;

    public (JsonNode jsonnode)
    {
        album = JsonUtils.stringFromJsonNode(jsonnode, "album", null);
        albumartist = JsonUtils.stringListFromJsonNode(jsonnode, "albumartist");
        albumartistid = JsonUtils.integerListFromJsonNode(jsonnode, "albumartistid");
        albumid = JsonUtils.intFromJsonNode(jsonnode, "albumid", -1);
        albumlabel = JsonUtils.stringFromJsonNode(jsonnode, "albumlabel", null);
        art = new <init>(jsonnode.get("art"));
        artist = JsonUtils.stringListFromJsonNode(jsonnode, "artist");
        artistid = JsonUtils.integerListFromJsonNode(jsonnode, "artistid");
        cast = tListFromJsonNode(jsonnode, "cast");
        comment = JsonUtils.stringFromJsonNode(jsonnode, "comment", null);
        country = JsonUtils.stringListFromJsonNode(jsonnode, "country");
        dateadded = JsonUtils.stringFromJsonNode(jsonnode, "dateadded", null);
        description = JsonUtils.stringFromJsonNode(jsonnode, "description", null);
        director = JsonUtils.stringListFromJsonNode(jsonnode, "director");
        disc = JsonUtils.intFromJsonNode(jsonnode, "disc", 0);
        displayartist = JsonUtils.stringFromJsonNode(jsonnode, "displayartist", null);
        duration = JsonUtils.intFromJsonNode(jsonnode, "duration", 0);
        episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
        episodeguide = JsonUtils.stringFromJsonNode(jsonnode, "episodeguide", null);
        fanart = JsonUtils.stringFromJsonNode(jsonnode, "fanart", null);
        file = JsonUtils.stringFromJsonNode(jsonnode, "file", null);
        firstaired = JsonUtils.stringFromJsonNode(jsonnode, "firstaired", null);
        genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
        genreid = JsonUtils.integerListFromJsonNode(jsonnode, "genreid");
        id = JsonUtils.intFromJsonNode(jsonnode, "id", -1);
        imdbnumber = JsonUtils.stringFromJsonNode(jsonnode, "imdbnumber", null);
        label = JsonUtils.stringFromJsonNode(jsonnode, "label", null);
        lastplayed = JsonUtils.stringFromJsonNode(jsonnode, "lastplayed", null);
        lyrics = JsonUtils.stringFromJsonNode(jsonnode, "lyrics", null);
        mood = JsonUtils.stringListFromJsonNode(jsonnode, "mood");
        mpaa = JsonUtils.stringFromJsonNode(jsonnode, "mpaa", null);
        musicbrainzalbumartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumartistid", null);
        musicbrainzalbumid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzalbumid", null);
        musicbrainzartistid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainzartistid", null);
        musicbrainztrackid = JsonUtils.stringFromJsonNode(jsonnode, "musicbrainztrackid", null);
        originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle", null);
        playcount = JsonUtils.intFromJsonNode(jsonnode, "playcount", 0);
        plot = JsonUtils.stringFromJsonNode(jsonnode, "plot", null);
        plotoutline = JsonUtils.stringFromJsonNode(jsonnode, "plotoutline", null);
        premiered = JsonUtils.stringFromJsonNode(jsonnode, "premiered", null);
        productioncode = JsonUtils.stringFromJsonNode(jsonnode, "productioncode", null);
        rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
        Object obj;
        if (jsonnode.has("resume"))
        {
            obj = new init>(jsonnode.get("resume"));
        } else
        {
            obj = null;
        }
        resume = ((resume) (obj));
        runtime = JsonUtils.intFromJsonNode(jsonnode, "runtime", -1);
        season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
        set = JsonUtils.stringFromJsonNode(jsonnode, "set", null);
        setid = JsonUtils.intFromJsonNode(jsonnode, "setid", -1);
        showlink = JsonUtils.stringListFromJsonNode(jsonnode, "showlink");
        showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle", null);
        sorttitle = JsonUtils.stringFromJsonNode(jsonnode, "sorttitle", null);
        if (jsonnode.has("streamdetails"))
        {
            obj = new <init>(jsonnode.get("streamdetails"));
        } else
        {
            obj = null;
        }
        streamdetails = ((streamdetails) (obj));
        studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
        style = JsonUtils.stringListFromJsonNode(jsonnode, "style");
        tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
        tagline = JsonUtils.stringFromJsonNode(jsonnode, "tagline", null);
        theme = JsonUtils.stringListFromJsonNode(jsonnode, "theme");
        thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail", null);
        title = JsonUtils.stringFromJsonNode(jsonnode, "title", null);
        top250 = JsonUtils.intFromJsonNode(jsonnode, "top250", 0);
        track = JsonUtils.intFromJsonNode(jsonnode, "track", 0);
        trailer = JsonUtils.stringFromJsonNode(jsonnode, "trailer", null);
        tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid", -1);
        type = JsonUtils.stringFromJsonNode(jsonnode, "type", null);
        votes = JsonUtils.stringFromJsonNode(jsonnode, "votes", null);
        watchedepisodes = JsonUtils.intFromJsonNode(jsonnode, "watchedepisodes", -1);
        writer = JsonUtils.stringListFromJsonNode(jsonnode, "writer");
        year = JsonUtils.intFromJsonNode(jsonnode, "year", -1);
    }
}
