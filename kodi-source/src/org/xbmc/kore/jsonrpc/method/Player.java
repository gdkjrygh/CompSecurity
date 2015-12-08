// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.utils.JsonUtils;

public class Player
{
    public static final class GetActivePlayers extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.GetActivePlayers";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public ArrayList resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            Object obj = (ArrayNode)objectnode.get("result");
            objectnode = new ArrayList();
            if (obj != null)
            {
                for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); objectnode.add(new org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType((JsonNode)((Iterator) (obj)).next()))) { }
            }
            return objectnode;
        }

        public GetActivePlayers()
        {
        }
    }

    public static final class GetItem extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.GetItem";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.ListType.ItemsAll resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.ListType.ItemsAll(objectnode.get("result").get("item"));
        }

        public transient GetItem(int i, String as[])
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static final class GetProperties extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.GetProperties";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue(objectnode.get("result"));
        }

        public transient GetProperties(int i, String as[])
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static final class GoTo extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.GoTo";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public GoTo(int i, String s)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("to", s);
        }
    }

    public static final class Open extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.Open";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public Open(int i)
        {
            ObjectNode objectnode = objectMapper.createObjectNode();
            objectnode.put("playlistid", i);
            addParameterToRequest("item", objectnode);
        }

        public Open(int i, int j)
        {
            ObjectNode objectnode = objectMapper.createObjectNode();
            objectnode.put("playlistid", i);
            objectnode.put("position", j);
            addParameterToRequest("item", objectnode);
        }

        public Open(org.xbmc.kore.jsonrpc.type.PlaylistType.Item item)
        {
            addParameterToRequest("item", item.toJsonNode());
        }
    }

    public static final class PlayPause extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.PlayPause";
        }

        public Integer resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return Integer.valueOf(JsonUtils.intFromJsonNode(objectnode.get("result"), "speed"));
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public PlayPause(int i)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("play", "toggle");
        }
    }

    public static final class Seek extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.Seek";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType(objectnode.get("result"));
        }

        public Seek(int i, org.xbmc.kore.jsonrpc.type.PlayerType.PositionTime positiontime)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("value", positiontime);
        }
    }

    public static final class SetAudioStream extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.SetAudioStream";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public SetAudioStream(int i, int j)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("stream", j);
        }
    }

    public static final class SetRepeat extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.SetRepeat";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public SetRepeat(int i, String s)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("repeat", s);
        }
    }

    public static final class SetShuffle extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.SetShuffle";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public SetShuffle(int i)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("shuffle", "toggle");
        }
    }

    public static final class SetSpeed extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.SetSpeed";
        }

        public Integer resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return Integer.valueOf(JsonUtils.intFromJsonNode(objectnode.get("result"), "speed"));
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public SetSpeed(int i, String s)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("speed", s);
        }
    }

    public static final class SetSubtitle extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.SetSubtitle";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public SetSubtitle(int i, int j, boolean flag)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("subtitle", j);
            addParameterToRequest("enable", flag);
        }

        public SetSubtitle(int i, String s, boolean flag)
        {
            addParameterToRequest("playerid", i);
            addParameterToRequest("subtitle", s);
            addParameterToRequest("enable", flag);
        }
    }

    public static final class Stop extends ApiMethod
    {

        public String getMethodName()
        {
            return "Player.Stop";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public String resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return objectnode.get("result").textValue();
        }

        public Stop(int i)
        {
            addParameterToRequest("playerid", i);
        }
    }

}
