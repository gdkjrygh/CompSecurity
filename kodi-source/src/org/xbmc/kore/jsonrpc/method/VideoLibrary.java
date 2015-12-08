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

public class VideoLibrary
{
    public static class Clean extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.Clean";
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

    public static class GetEpisodes extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetEpisodes";
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
            if (objectnode.has("episodes"))
            {
                objectnode = (ArrayNode)objectnode.get("episodes");
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
                arraylist.add(new org.xbmc.kore.jsonrpc.type.VideoType.DetailsEpisode((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetEpisodes(int i, String as[])
        {
            addParameterToRequest("tvshowid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetMovieDetails extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetMovieDetails";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie(objectnode.get("result").get("moviedetails"));
        }

        public transient GetMovieDetails(int i, String as[])
        {
            addParameterToRequest("movieid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetMovies extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetMovies";
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
            if (objectnode.has("movies"))
            {
                objectnode = (ArrayNode)objectnode.get("movies");
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
                arraylist.add(new org.xbmc.kore.jsonrpc.type.VideoType.DetailsMovie((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetMovies(org.xbmc.kore.jsonrpc.type.ListType.Limits limits, String as[])
        {
            addParameterToRequest("properties", as);
            addParameterToRequest("limits", limits);
        }
    }

    public static class GetMusicVideos extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetMusicVideos";
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
            if (objectnode.has("musicvideos"))
            {
                objectnode = (ArrayNode)objectnode.get("musicvideos");
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
                arraylist.add(new org.xbmc.kore.jsonrpc.type.VideoType.DetailsMusicVideo((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetMusicVideos(String as[])
        {
            addParameterToRequest("properties", as);
        }
    }

    public static class GetSeasons extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetSeasons";
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
            if (objectnode.has("seasons"))
            {
                objectnode = (ArrayNode)objectnode.get("seasons");
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
                arraylist.add(new org.xbmc.kore.jsonrpc.type.VideoType.DetailsSeason((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetSeasons(int i, String as[])
        {
            addParameterToRequest("tvshowid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetTVShowDetails extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetTVShowDetails";
        }

        public volatile Object resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return resultFromJson(objectnode);
        }

        public org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow resultFromJson(ObjectNode objectnode)
            throws ApiException
        {
            return new org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow(objectnode.get("result").get("tvshowdetails"));
        }

        public transient GetTVShowDetails(int i, String as[])
        {
            addParameterToRequest("tvshowid", i);
            addParameterToRequest("properties", as);
        }
    }

    public static class GetTVShows extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.GetTVShows";
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
            if (objectnode.has("tvshows"))
            {
                objectnode = (ArrayNode)objectnode.get("tvshows");
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
                arraylist.add(new org.xbmc.kore.jsonrpc.type.VideoType.DetailsTVShow((JsonNode)iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public transient GetTVShows(org.xbmc.kore.jsonrpc.type.ListType.Limits limits, String as[])
        {
            addParameterToRequest("properties", as);
            addParameterToRequest("limits", limits);
        }
    }

    public static class Scan extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.Scan";
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

    public static class SetEpisodeDetails extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.SetEpisodeDetails";
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

        public SetEpisodeDetails(int i, Integer integer, Double double1)
        {
            addParameterToRequest("episodeid", i);
            if (integer != null)
            {
                addParameterToRequest("playcount", integer);
            }
            if (double1 != null)
            {
                addParameterToRequest("rating", double1);
            }
        }
    }

    public static class SetMovieDetails extends ApiMethod
    {

        public String getMethodName()
        {
            return "VideoLibrary.SetMovieDetails";
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

        public SetMovieDetails(int i, Integer integer, Double double1)
        {
            addParameterToRequest("movieid", i);
            if (integer != null)
            {
                addParameterToRequest("playcount", integer);
            }
            if (double1 != null)
            {
                addParameterToRequest("rating", double1);
            }
        }
    }

}
