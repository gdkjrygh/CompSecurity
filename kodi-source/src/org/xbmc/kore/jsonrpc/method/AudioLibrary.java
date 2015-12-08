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

public class AudioLibrary
{
    public static class Clean extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.Clean";
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

        public Clean()
        {
        }
    }

    public static class GetAlbums extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.GetAlbums";
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
            if (objectnode.has("albums"))
            {
                objectnode = (ArrayNode)objectnode.get("albums");
            } else
            {
                objectnode = null;
            }
            if (objectnode != null) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.AudioType.DetailsAlbum((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetAlbums(org.xbmc.kore.jsonrpc.type.ListType.Limits limits, String as[])
        {
            addParameterToRequest("limits", limits);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetArtists extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.GetArtists";
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
            if (objectnode.has("artists"))
            {
                objectnode = (ArrayNode)objectnode.get("artists");
            } else
            {
                objectnode = null;
            }
            if (objectnode != null) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.AudioType.DetailsArtist((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetArtists(org.xbmc.kore.jsonrpc.type.ListType.Limits limits, boolean flag, String as[])
        {
            addParameterToRequest("limits", limits);
            addParameterToRequest("albumartistsonly", flag);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetGenres extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.GetGenres";
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
            if (objectnode.has("genres"))
            {
                objectnode = (ArrayNode)objectnode.get("genres");
            } else
            {
                objectnode = null;
            }
            if (objectnode != null) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.LibraryType.DetailsGenre((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetGenres(String as[])
        {
            addParameterToRequest("properties", as);
        }
    }

    public static class GetSongs extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.GetSongs";
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
            if (objectnode.has("songs"))
            {
                objectnode = (ArrayNode)objectnode.get("songs");
            } else
            {
                objectnode = null;
            }
            if (objectnode != null) goto _L2; else goto _L1
_L1:
            objectnode = new ArrayList(0);
_L4:
            return objectnode;
_L2:
            ArrayList arraylist = new ArrayList(objectnode.size());
            Iterator iterator = objectnode.iterator();
            do
            {
                objectnode = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(new org.xbmc.kore.jsonrpc.type.AudioType.DetailsSong((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetSongs(org.xbmc.kore.jsonrpc.type.ListType.Limits limits, String as[])
        {
            addParameterToRequest("limits", limits);
            addParameterToRequest("properties", as);
        }
    }

    public static class Scan extends ApiMethod
    {

        public String getMethodName()
        {
            return "AudioLibrary.Scan";
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

        public Scan()
        {
        }
    }

}
