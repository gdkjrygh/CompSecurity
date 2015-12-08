// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class Video
{
    public static class Audio
    {

        public final int channels;
        public final String codec;
        public final String language;

        public Audio(JsonNode jsonnode)
        {
            channels = JsonUtils.intFromJsonNode(jsonnode, "channels", 0);
            codec = JsonUtils.stringFromJsonNode(jsonnode, "codec");
            language = JsonUtils.stringFromJsonNode(jsonnode, "language");
        }
    }

    public static class Subtitle
    {

        public final String language;

        public Subtitle(JsonNode jsonnode)
        {
            language = JsonUtils.stringFromJsonNode(jsonnode, "language", null);
        }
    }

    public static class Video
    {

        public final double aspect;
        public final String codec;
        public final int duration;
        public final int height;
        public final int width;

        public Video(JsonNode jsonnode)
        {
            aspect = JsonUtils.doubleFromJsonNode(jsonnode, "aspect", 0.0D);
            codec = JsonUtils.stringFromJsonNode(jsonnode, "codec", null);
            duration = JsonUtils.intFromJsonNode(jsonnode, "duration", -1);
            height = JsonUtils.intFromJsonNode(jsonnode, "height", -1);
            width = JsonUtils.intFromJsonNode(jsonnode, "width", -1);
        }
    }


    public final List audio = new ArrayList();
    public final List subtitle = new ArrayList();
    public final List video = new ArrayList();

    public (JsonNode jsonnode)
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
