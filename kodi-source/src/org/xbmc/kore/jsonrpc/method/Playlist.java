// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.method;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiException;
import org.xbmc.kore.jsonrpc.ApiMethod;

public class Playlist
{
    public static final class Add extends ApiMethod
    {

        public String getMethodName()
        {
            return "Playlist.Add";
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

        public Add(int i, org.xbmc.kore.jsonrpc.type.PlaylistType.Item item)
        {
            addParameterToRequest("playlistid", i);
            addParameterToRequest("item", item);
        }
    }

    public static final class Clear extends ApiMethod
    {

        public String getMethodName()
        {
            return "Playlist.Clear";
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

        public Clear(int i)
        {
            addParameterToRequest("playlistid", i);
        }
    }

    public static final class GetItems extends ApiMethod
    {

        public String getMethodName()
        {
            return "Playlist.GetItems";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public List resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            objectnode = objectnode.get("result");
            if (objectnode.has("items") && objectnode.get("items").isArray() && objectnode.get("items").size() != 0) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            objectnode = (ArrayNode)objectnode.get("items");
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.ListType.ItemsAll((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetItems(int i, String as[])
        {
            addParameterToRequest("playlistid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static final class GetPlaylists extends ApiMethod
    {

        public String getMethodName()
        {
            return "Playlist.GetPlaylists";
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
                for (obj = ((ArrayNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); objectnode.add(new org.xbmc.kore.jsonrpc.type.PlaylistType.GetPlaylistsReturnType((JsonNode)((Iterator) (obj)).next()))) { }
            }
            return objectnode;
        }

        public GetPlaylists()
        {
        }
    }

    public static final class Remove extends ApiMethod
    {

        public String getMethodName()
        {
            return "Playlist.Remove";
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

        public Remove(int i, int j)
        {
            addParameterToRequest("playlistid", i);
            addParameterToRequest("position", j);
        }
    }

}
