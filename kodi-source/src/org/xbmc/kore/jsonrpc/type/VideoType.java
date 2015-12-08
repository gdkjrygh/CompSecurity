// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;
import org.xbmc.kore.utils.LogUtils;

public class VideoType
{
    public static class Cast
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Cast createFromParcel(Parcel parcel)
            {
                return new Cast(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public Cast[] newArray(int i)
            {
                return new Cast[i];
            }

        };
        public final String name;
        public final int order;
        public final String role;
        public final String thumbnail;

        public static List castListFromJsonNode(JsonNode jsonnode, String s)
        {
            if (jsonnode != null && jsonnode.has(s)) goto _L2; else goto _L1
_L1:
            jsonnode = new ArrayList(0);
_L4:
            return jsonnode;
_L2:
            jsonnode = jsonnode.get(s);
            if (!jsonnode.isArray())
            {
                LogUtils.LOGD(VideoType.TAG, (new StringBuilder()).append("Cast node isn't an array, it's a: ").append(jsonnode.getNodeType()).toString());
                return new ArrayList(0);
            }
            jsonnode = (ArrayNode)jsonnode;
            s = new ArrayList(jsonnode.size());
            Iterator iterator = jsonnode.iterator();
            do
            {
                jsonnode = s;
                if (!iterator.hasNext())
                {
                    continue;
                }
                s.add(new Cast((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(name);
            parcel.writeInt(order);
            parcel.writeString(role);
            parcel.writeString(thumbnail);
        }


        public Cast(JsonNode jsonnode)
        {
            name = JsonUtils.stringFromJsonNode(jsonnode, "name");
            order = JsonUtils.intFromJsonNode(jsonnode, "order", 0);
            role = JsonUtils.stringFromJsonNode(jsonnode, "role");
            thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail");
        }

        public Cast(String s, int i, String s1, String s2)
        {
            name = s;
            order = i;
            role = s1;
            thumbnail = s2;
        }
    }

    public static class DetailsBase extends MediaType.DetailsBase
    {

        public final MediaType.Artwork art;
        public final Integer playcount;

        public DetailsBase(JsonNode jsonnode)
        {
            super(jsonnode);
            MediaType.Artwork artwork;
            if (jsonnode.has("art"))
            {
                artwork = new MediaType.Artwork(jsonnode.get("art"));
            } else
            {
                artwork = null;
            }
            art = artwork;
            playcount = Integer.valueOf(JsonUtils.intFromJsonNode(jsonnode, "playcount", 0));
        }
    }

    public static class DetailsEpisode extends DetailsFile
    {

        public final List cast;
        public final int episode;
        public final int episodeid;
        public final String firstaired;
        public final String originaltitle;
        public final String productioncode;
        public final double rating;
        public final int season;
        public final String showtitle;
        public final int tvshowid;
        public final String votes;
        public final List writer;

        public DetailsEpisode(JsonNode jsonnode)
        {
            super(jsonnode);
            cast = Cast.castListFromJsonNode(jsonnode, "cast");
            episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
            episodeid = JsonUtils.intFromJsonNode(jsonnode, "episodeid");
            firstaired = JsonUtils.stringFromJsonNode(jsonnode, "firstaired");
            originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
            productioncode = JsonUtils.stringFromJsonNode(jsonnode, "productioncode");
            rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
            season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
            showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
            tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid");
            votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
            writer = JsonUtils.stringListFromJsonNode(jsonnode, "writer");
        }
    }

    public static class DetailsFile extends DetailsItem
    {

        public final List director;
        public final Resume resume;
        public final int runtime;
        public final Streams streamdetails;

        public DetailsFile(JsonNode jsonnode)
        {
            Object obj1 = null;
            super(jsonnode);
            director = JsonUtils.stringListFromJsonNode(jsonnode, "director");
            Object obj;
            if (jsonnode.has("resume"))
            {
                obj = new Resume(jsonnode.get("resume"));
            } else
            {
                obj = null;
            }
            resume = ((Resume) (obj));
            runtime = JsonUtils.intFromJsonNode(jsonnode, "runtime", 0);
            obj = obj1;
            if (jsonnode.has("streamdetails"))
            {
                obj = new Streams(jsonnode.get("streamdetails"));
            }
            streamdetails = ((Streams) (obj));
        }
    }

    public static class DetailsItem extends DetailsMedia
    {

        public final String dateadded;
        public final String file;
        public final String lastplayed;
        public final String plot;

        public DetailsItem(JsonNode jsonnode)
        {
            super(jsonnode);
            dateadded = JsonUtils.stringFromJsonNode(jsonnode, "dateadded", null);
            file = JsonUtils.stringFromJsonNode(jsonnode, "file", null);
            lastplayed = JsonUtils.stringFromJsonNode(jsonnode, "lastplayed", null);
            plot = JsonUtils.stringFromJsonNode(jsonnode, "plot", null);
        }
    }

    public static class DetailsMedia extends DetailsBase
    {

        public final String title;

        public DetailsMedia(JsonNode jsonnode)
        {
            super(jsonnode);
            title = JsonUtils.stringFromJsonNode(jsonnode, "title", null);
        }
    }

    public static class DetailsMovie extends DetailsFile
    {

        public final List cast;
        public final List country;
        public final List genre;
        public final String imdbnumber;
        public final int movieid;
        public final String mpaa;
        public final String originaltitle;
        public final String plotoutline;
        public final double rating;
        public final String set;
        public final int setid;
        public final List showlink;
        public final String sorttitle;
        public final List studio;
        public final List tag;
        public final String tagline;
        public final int top250;
        public final String trailer;
        public final String votes;
        public final List writer;
        public final int year;

        public DetailsMovie(JsonNode jsonnode)
        {
            super(jsonnode);
            cast = Cast.castListFromJsonNode(jsonnode, "cast");
            country = JsonUtils.stringListFromJsonNode(jsonnode, "country");
            genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
            imdbnumber = JsonUtils.stringFromJsonNode(jsonnode, "imdbnumber");
            movieid = JsonUtils.intFromJsonNode(jsonnode, "movieid");
            mpaa = JsonUtils.stringFromJsonNode(jsonnode, "mpaa");
            originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
            plotoutline = JsonUtils.stringFromJsonNode(jsonnode, "plotoutline");
            rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
            set = JsonUtils.stringFromJsonNode(jsonnode, "set");
            setid = JsonUtils.intFromJsonNode(jsonnode, "setid", -1);
            showlink = JsonUtils.stringListFromJsonNode(jsonnode, "showlink");
            sorttitle = JsonUtils.stringFromJsonNode(jsonnode, "sorttitle");
            studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
            tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
            tagline = JsonUtils.stringFromJsonNode(jsonnode, "tagline");
            top250 = JsonUtils.intFromJsonNode(jsonnode, "top250", 0);
            trailer = JsonUtils.stringFromJsonNode(jsonnode, "trailer");
            votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
            writer = JsonUtils.stringListFromJsonNode(jsonnode, "writer");
            year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
        }
    }

    public static class DetailsMusicVideo extends DetailsFile
    {

        public final String album;
        public final List artist;
        public final List genre;
        public final int musicvideoid;
        public final List studio;
        public final List tag;
        public final int track;
        public final int year;

        public DetailsMusicVideo(JsonNode jsonnode)
        {
            super(jsonnode);
            album = JsonUtils.stringFromJsonNode(jsonnode, "album");
            artist = JsonUtils.stringListFromJsonNode(jsonnode, "artist");
            genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
            musicvideoid = JsonUtils.intFromJsonNode(jsonnode, "musicvideoid");
            studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
            tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
            track = JsonUtils.intFromJsonNode(jsonnode, "track", 0);
            year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
        }
    }

    public static class DetailsSeason extends DetailsBase
    {

        public final int episode;
        public final int season;
        public final String showtitle;
        public final int tvshowid;
        public final int watchedepisodes;

        public DetailsSeason(JsonNode jsonnode)
        {
            super(jsonnode);
            episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
            season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
            showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
            tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid", -1);
            watchedepisodes = JsonUtils.intFromJsonNode(jsonnode, "watchedepisodes", 0);
        }
    }

    public static class DetailsTVShow extends DetailsItem
    {

        public final List cast;
        public final int episode;
        public final String episodeguide;
        public final List genre;
        public final String imdbnumber;
        public final String mpaa;
        public final String originaltitle;
        public final String premiered;
        public final double rating;
        public final int season;
        public final String sorttitle;
        public final List studio;
        public final List tag;
        public final int tvshowid;
        public final String votes;
        public final int watchedepisodes;
        public final int year;

        public DetailsTVShow(JsonNode jsonnode)
        {
            super(jsonnode);
            cast = Cast.castListFromJsonNode(jsonnode, "cast");
            episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
            episodeguide = JsonUtils.stringFromJsonNode(jsonnode, "episodeguide");
            genre = JsonUtils.stringListFromJsonNode(jsonnode, "genre");
            imdbnumber = JsonUtils.stringFromJsonNode(jsonnode, "imdbnumber");
            mpaa = JsonUtils.stringFromJsonNode(jsonnode, "mpaa");
            originaltitle = JsonUtils.stringFromJsonNode(jsonnode, "originaltitle");
            premiered = JsonUtils.stringFromJsonNode(jsonnode, "premiered");
            rating = JsonUtils.doubleFromJsonNode(jsonnode, "rating", 0.0D);
            season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
            sorttitle = JsonUtils.stringFromJsonNode(jsonnode, "sorttitle");
            studio = JsonUtils.stringListFromJsonNode(jsonnode, "studio");
            tag = JsonUtils.stringListFromJsonNode(jsonnode, "tag");
            tvshowid = JsonUtils.intFromJsonNode(jsonnode, "tvshowid", 0);
            votes = JsonUtils.stringFromJsonNode(jsonnode, "votes");
            watchedepisodes = JsonUtils.intFromJsonNode(jsonnode, "watchedepisodes", 0);
            year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
        }
    }

    public static class Resume
    {

        public final double position;
        public final double total;

        public Resume(JsonNode jsonnode)
        {
            position = JsonUtils.doubleFromJsonNode(jsonnode, "position", 0.0D);
            total = JsonUtils.doubleFromJsonNode(jsonnode, "total", 0.0D);
        }
    }

    public static class Streams
    {

        public final List audio = new ArrayList();
        public final List subtitle = new ArrayList();
        public final List video = new ArrayList();

        public Streams(JsonNode jsonnode)
        {
            if (jsonnode.has("audio"))
            {
                JsonNode jsonnode2;
                for (Iterator iterator = ((ArrayNode)jsonnode.get("audio")).iterator(); iterator.hasNext(); audio.add(new Audio(jsonnode2)))
                {
                    jsonnode2 = (JsonNode)iterator.next();
                }

            }
            if (jsonnode.has("subtitle"))
            {
                JsonNode jsonnode3;
                for (Iterator iterator1 = ((ArrayNode)jsonnode.get("subtitle")).iterator(); iterator1.hasNext(); subtitle.add(new Subtitle(jsonnode3)))
                {
                    jsonnode3 = (JsonNode)iterator1.next();
                }

            }
            if (jsonnode.has("video"))
            {
                JsonNode jsonnode1;
                for (jsonnode = ((ArrayNode)jsonnode.get("video")).iterator(); jsonnode.hasNext(); video.add(new Video(jsonnode1)))
                {
                    jsonnode1 = (JsonNode)jsonnode.next();
                }

            }
        }
    }

    public static class Streams.Audio
    {

        public final int channels;
        public final String codec;
        public final String language;

        public Streams.Audio(JsonNode jsonnode)
        {
            channels = JsonUtils.intFromJsonNode(jsonnode, "channels", 0);
            codec = JsonUtils.stringFromJsonNode(jsonnode, "codec");
            language = JsonUtils.stringFromJsonNode(jsonnode, "language");
        }
    }

    public static class Streams.Subtitle
    {

        public final String language;

        public Streams.Subtitle(JsonNode jsonnode)
        {
            language = JsonUtils.stringFromJsonNode(jsonnode, "language", null);
        }
    }

    public static class Streams.Video
    {

        public final double aspect;
        public final String codec;
        public final int duration;
        public final int height;
        public final int width;

        public Streams.Video(JsonNode jsonnode)
        {
            aspect = JsonUtils.doubleFromJsonNode(jsonnode, "aspect", 0.0D);
            codec = JsonUtils.stringFromJsonNode(jsonnode, "codec", null);
            duration = JsonUtils.intFromJsonNode(jsonnode, "duration", -1);
            height = JsonUtils.intFromJsonNode(jsonnode, "height", -1);
            width = JsonUtils.intFromJsonNode(jsonnode, "width", -1);
        }
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/jsonrpc/type/VideoType);

    public VideoType()
    {
    }


}
