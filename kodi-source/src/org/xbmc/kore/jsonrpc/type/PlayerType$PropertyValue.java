// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            PlayerType

public static class type
{

    public final List audiostreams;
    public final boolean canchangespeed;
    public final boolean canmove;
    public final boolean canrepeat;
    public final boolean canrotate;
    public final boolean canseek;
    public final boolean canshuffle;
    public final boolean canzoom;
    public final ended currentaudiostream;
    public final ended currentsubtitle;
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
    public final ended time;
    public final ended totaltime;
    public final String type;

    public ended(JsonNode jsonnode)
    {
        Object obj1 = null;
        super();
        Object obj;
        if (jsonnode.has("audiostreams"))
        {
            obj = tListAudioStream(jsonnode.get("audiostreams"));
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
            obj = new ended(jsonnode.get("currentaudiostream"));
        } else
        {
            obj = null;
        }
        currentaudiostream = ((ended) (obj));
        if (jsonnode.has("currentsubtitle"))
        {
            obj = new >(jsonnode.get("currentsubtitle"));
        } else
        {
            obj = null;
        }
        currentsubtitle = ((currentsubtitle) (obj));
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
            obj = stSubtitle(jsonnode.get("subtitles"));
        } else
        {
            obj = null;
        }
        subtitles = ((List) (obj));
        if (jsonnode.has("time"))
        {
            obj = new subtitles(jsonnode.get("time"));
        } else
        {
            obj = null;
        }
        time = ((time) (obj));
        obj = obj1;
        if (jsonnode.has("totaltime"))
        {
            obj = new time(jsonnode.get("totaltime"));
        }
        totaltime = ((totaltime) (obj));
        type = JsonUtils.stringFromJsonNode(jsonnode, "type", "video");
    }
}
