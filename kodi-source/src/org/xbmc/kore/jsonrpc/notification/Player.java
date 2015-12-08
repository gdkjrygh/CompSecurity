// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;
import org.xbmc.kore.utils.JsonUtils;

public class Player
{
    public static class NotificationsData
    {

        public final NotificationsItem item;
        public final NotificationsPlayer player;

        public NotificationsData(JsonNode jsonnode)
        {
            item = new NotificationsItem((ObjectNode)jsonnode.get("item"));
            player = new NotificationsPlayer((ObjectNode)jsonnode.get("player"));
        }
    }

    public static class NotificationsItem
    {

        public final String album;
        public final String artist;
        public final int episode;
        public final int id;
        public final int season;
        public final String showtitle;
        public final String title;
        public final int track;
        public final String type;
        public final int year;

        public NotificationsItem(JsonNode jsonnode)
        {
            type = JsonUtils.stringFromJsonNode(jsonnode, "type", "unknown");
            id = JsonUtils.intFromJsonNode(jsonnode, "speed");
            title = JsonUtils.stringFromJsonNode(jsonnode, "title");
            year = JsonUtils.intFromJsonNode(jsonnode, "year", 0);
            episode = JsonUtils.intFromJsonNode(jsonnode, "episode", 0);
            season = JsonUtils.intFromJsonNode(jsonnode, "season", 0);
            showtitle = JsonUtils.stringFromJsonNode(jsonnode, "showtitle");
            album = JsonUtils.stringFromJsonNode(jsonnode, "album");
            artist = JsonUtils.stringFromJsonNode(jsonnode, "artist");
            track = JsonUtils.intFromJsonNode(jsonnode, "track", 0);
        }
    }

    public static class NotificationsPlayer
    {

        public final int playerId;
        public final int speed;

        public NotificationsPlayer(JsonNode jsonnode)
        {
            playerId = JsonUtils.intFromJsonNode(jsonnode, "playerid");
            speed = JsonUtils.intFromJsonNode(jsonnode, "speed", 0);
        }
    }

    public static class OnPause extends ApiNotification
    {

        public final NotificationsData data;

        public OnPause(ObjectNode objectnode)
        {
            super(objectnode);
            data = new NotificationsData(objectnode.get("data"));
        }
    }

    public static class OnPlay extends ApiNotification
    {

        public final NotificationsData data;

        public OnPlay(ObjectNode objectnode)
        {
            super(objectnode);
            data = new NotificationsData(objectnode.get("data"));
        }
    }

    public static class OnSeek extends ApiNotification
    {

        public final NotificationsItem item;
        public final org.xbmc.kore.jsonrpc.type.GlobalType.Time seekoffset;
        public final org.xbmc.kore.jsonrpc.type.GlobalType.Time time;

        public OnSeek(ObjectNode objectnode)
        {
            super(objectnode);
            objectnode = (ObjectNode)objectnode.get("data");
            item = new NotificationsItem(objectnode.get("item"));
            objectnode = (ObjectNode)objectnode.get("player");
            time = new org.xbmc.kore.jsonrpc.type.GlobalType.Time(objectnode.get("time"));
            seekoffset = new org.xbmc.kore.jsonrpc.type.GlobalType.Time(objectnode.get("seekoffset"));
        }
    }

    public static class OnSpeedChanged extends ApiNotification
    {

        public final NotificationsData data;

        public OnSpeedChanged(ObjectNode objectnode)
        {
            super(objectnode);
            data = new NotificationsData(objectnode.get("data"));
        }
    }

    public static class OnStop extends ApiNotification
    {

        public final boolean end;
        public final NotificationsItem item;

        public OnStop(ObjectNode objectnode)
        {
            super(objectnode);
            objectnode = (ObjectNode)objectnode.get("data");
            end = JsonUtils.booleanFromJsonNode(objectnode, "end");
            item = new NotificationsItem(objectnode.get("item"));
        }
    }

}
