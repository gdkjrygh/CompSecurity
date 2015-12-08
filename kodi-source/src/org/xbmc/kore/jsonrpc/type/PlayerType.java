// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApiParameter

public class PlayerType
{
    public static class AudioStream
    {

        public final int index;
        public final String language;
        public final String name;

        public static List getListAudioStream(JsonNode jsonnode)
        {
            Object obj = (ArrayNode)jsonnode;
            jsonnode = new ArrayList(jsonnode.size());
            for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonnode.add(new AudioStream((JsonNode)((Iterator) (obj)).next()))) { }
            return jsonnode;
        }

        public AudioStream(JsonNode jsonnode)
        {
            index = JsonUtils.intFromJsonNode(jsonnode, "index");
            language = JsonUtils.stringFromJsonNode(jsonnode, "language");
            name = JsonUtils.stringFromJsonNode(jsonnode, "name");
        }
    }

    public static class AudioStreamExtended extends AudioStream
    {

        public final int bitrate;
        public final int channels;
        public final String codec;

        public AudioStreamExtended(JsonNode jsonnode)
        {
            super(jsonnode);
            bitrate = JsonUtils.intFromJsonNode(jsonnode, "bitrate");
            channels = JsonUtils.intFromJsonNode(jsonnode, "channels");
            codec = JsonUtils.stringFromJsonNode(jsonnode, "codec");
        }
    }

    public static final class GetActivePlayersReturnType
    {

        public final int playerid;
        public final String type;

        public GetActivePlayersReturnType(JsonNode jsonnode)
        {
            int i = -1;
            super();
            if (jsonnode.has("playerid"))
            {
                i = jsonnode.get("playerid").asInt(-1);
            }
            playerid = i;
            if (jsonnode.has("type"))
            {
                jsonnode = jsonnode.get("type").textValue();
            } else
            {
                jsonnode = null;
            }
            type = jsonnode;
        }
    }

    public static class PositionTime
        implements ApiParameter
    {

        protected static final ObjectMapper objectMapper = new ObjectMapper();
        public final int hours;
        public final int milliseconds;
        public final int minutes;
        public final int seconds;

        public JsonNode toJsonNode()
        {
            ObjectNode objectnode = objectMapper.createObjectNode();
            objectnode.put("hours", hours);
            objectnode.put("milliseconds", milliseconds);
            objectnode.put("minutes", minutes);
            objectnode.put("seconds", seconds);
            return objectnode;
        }


        public PositionTime(int i, int j, int k, int l)
        {
            hours = i;
            minutes = j;
            seconds = k;
            milliseconds = l;
        }
    }

    public static class PropertyValue
    {

        public final List audiostreams;
        public final boolean canchangespeed;
        public final boolean canmove;
        public final boolean canrepeat;
        public final boolean canrotate;
        public final boolean canseek;
        public final boolean canshuffle;
        public final boolean canzoom;
        public final AudioStreamExtended currentaudiostream;
        public final Subtitle currentsubtitle;
        public final boolean live;
        public final boolean partymode;
        public final double percentage;
        public final int playlistid;
        public final int position;
        public final String repeat;
        public final boolean shuffled;
        public final int speed;
        public final boolean subtitleenabled;
        public final List subtitles;
        public final GlobalType.Time time;
        public final GlobalType.Time totaltime;
        public final String type;

        public PropertyValue(JsonNode jsonnode)
        {
            Object obj1 = null;
            super();
            Object obj;
            if (jsonnode.has("audiostreams"))
            {
                obj = AudioStream.getListAudioStream(jsonnode.get("audiostreams"));
            } else
            {
                obj = null;
            }
            audiostreams = ((List) (obj));
            canchangespeed = JsonUtils.booleanFromJsonNode(jsonnode, "canchangespeed", false);
            canmove = JsonUtils.booleanFromJsonNode(jsonnode, "canmove", false);
            canrepeat = JsonUtils.booleanFromJsonNode(jsonnode, "canrepeat", false);
            canrotate = JsonUtils.booleanFromJsonNode(jsonnode, "canrotate", false);
            canseek = JsonUtils.booleanFromJsonNode(jsonnode, "canseek", false);
            canshuffle = JsonUtils.booleanFromJsonNode(jsonnode, "canshuffle", false);
            canzoom = JsonUtils.booleanFromJsonNode(jsonnode, "canzoom", false);
            if (jsonnode.has("currentaudiostream"))
            {
                obj = new AudioStreamExtended(jsonnode.get("currentaudiostream"));
            } else
            {
                obj = null;
            }
            currentaudiostream = ((AudioStreamExtended) (obj));
            if (jsonnode.has("currentsubtitle"))
            {
                obj = new Subtitle(jsonnode.get("currentsubtitle"));
            } else
            {
                obj = null;
            }
            currentsubtitle = ((Subtitle) (obj));
            live = JsonUtils.booleanFromJsonNode(jsonnode, "live", false);
            partymode = JsonUtils.booleanFromJsonNode(jsonnode, "partymode", false);
            percentage = JsonUtils.doubleFromJsonNode(jsonnode, "percentage", 0.0D);
            playlistid = JsonUtils.intFromJsonNode(jsonnode, "playlistid", -1);
            position = JsonUtils.intFromJsonNode(jsonnode, "position", -1);
            repeat = JsonUtils.stringFromJsonNode(jsonnode, "repeat", "off");
            shuffled = JsonUtils.booleanFromJsonNode(jsonnode, "shuffled", false);
            speed = JsonUtils.intFromJsonNode(jsonnode, "speed", 0);
            subtitleenabled = JsonUtils.booleanFromJsonNode(jsonnode, "subtitleenabled", false);
            if (jsonnode.has("subtitles"))
            {
                obj = Subtitle.getListSubtitle(jsonnode.get("subtitles"));
            } else
            {
                obj = null;
            }
            subtitles = ((List) (obj));
            if (jsonnode.has("time"))
            {
                obj = new GlobalType.Time(jsonnode.get("time"));
            } else
            {
                obj = null;
            }
            time = ((GlobalType.Time) (obj));
            obj = obj1;
            if (jsonnode.has("totaltime"))
            {
                obj = new GlobalType.Time(jsonnode.get("totaltime"));
            }
            totaltime = ((GlobalType.Time) (obj));
            type = JsonUtils.stringFromJsonNode(jsonnode, "type", "video");
        }
    }

    public static final class SeekReturnType
    {

        public final int percentage;
        public final GlobalType.Time time;
        public final GlobalType.Time totalTime;

        public SeekReturnType(JsonNode jsonnode)
        {
            percentage = JsonUtils.intFromJsonNode(jsonnode, "percentage");
            time = new GlobalType.Time(jsonnode.get("time"));
            totalTime = new GlobalType.Time(jsonnode.get("totaltime"));
        }
    }

    public static class Subtitle
    {

        public final int index;
        public final String language;
        public final String name;

        public static List getListSubtitle(JsonNode jsonnode)
        {
            Object obj = (ArrayNode)jsonnode;
            jsonnode = new ArrayList(jsonnode.size());
            for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonnode.add(new Subtitle((JsonNode)((Iterator) (obj)).next()))) { }
            return jsonnode;
        }

        public Subtitle(JsonNode jsonnode)
        {
            index = JsonUtils.intFromJsonNode(jsonnode, "index");
            language = JsonUtils.stringFromJsonNode(jsonnode, "language");
            name = JsonUtils.stringFromJsonNode(jsonnode, "name");
        }
    }

}
