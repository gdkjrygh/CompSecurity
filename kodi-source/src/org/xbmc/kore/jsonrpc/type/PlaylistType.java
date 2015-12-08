// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ApiParameter

public class PlaylistType
{
    public static final class GetPlaylistsReturnType
    {

        public final int playlistid;
        public final String type;

        public GetPlaylistsReturnType(JsonNode jsonnode)
        {
            playlistid = jsonnode.get("playlistid").asInt(-1);
            type = JsonUtils.stringFromJsonNode(jsonnode, "type", "unknown");
        }
    }

    public static class Item
        implements ApiParameter
    {

        protected static final ObjectMapper objectMapper = new ObjectMapper();
        public int albumid;
        public int artistid;
        public String directory;
        public int episodeid;
        public String file;
        public int genreid;
        public int movieid;
        public int musicvideoid;
        public int songid;

        public JsonNode toJsonNode()
        {
            ObjectNode objectnode = objectMapper.createObjectNode();
            if (albumid != -1)
            {
                objectnode.put("albumid", albumid);
            }
            if (artistid != -1)
            {
                objectnode.put("artistid", artistid);
            }
            if (directory != null)
            {
                objectnode.put("directory", directory);
            }
            if (episodeid != -1)
            {
                objectnode.put("episodeid", episodeid);
            }
            if (file != null)
            {
                objectnode.put("file", file);
            }
            if (genreid != -1)
            {
                objectnode.put("genreid", genreid);
            }
            if (movieid != -1)
            {
                objectnode.put("movieid", movieid);
            }
            if (musicvideoid != -1)
            {
                objectnode.put("musicvideoid", musicvideoid);
            }
            if (songid != -1)
            {
                objectnode.put("songid", songid);
            }
            return objectnode;
        }


        public Item()
        {
            albumid = -1;
            artistid = -1;
            directory = null;
            episodeid = -1;
            file = null;
            genreid = -1;
            movieid = -1;
            musicvideoid = -1;
            songid = -1;
        }
    }

}
