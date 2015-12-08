// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import b.a.a.a;
import com.dropbox.client2.jsonextract.JsonExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            DropboxAPI

public class contents
{

    public static final JsonExtractor JsonExtractor = new _cls1();
    public long bytes;
    public String clientMtime;
    public List contents;
    public String hash;
    public String icon;
    public boolean isDeleted;
    public boolean isDir;
    public String mimeType;
    public String modified;
    public String path;
    public boolean readOnly;
    public String rev;
    public String root;
    public String size;
    public boolean thumbExists;

    public String fileName()
    {
        int i = path.lastIndexOf('/');
        return path.substring(i + 1, path.length());
    }

    public String parentPath()
    {
        if (path.equals("/"))
        {
            return "";
        } else
        {
            int i = path.lastIndexOf('/');
            return path.substring(0, i + 1);
        }
    }


    public xtractor()
    {
    }

    public xtractor(Map map)
    {
        bytes = DropboxAPI.getFromMapAsLong(map, "bytes");
        hash = (String)map.get("hash");
        icon = (String)map.get("icon");
        isDir = DropboxAPI.getFromMapAsBoolean(map, "is_dir");
        modified = (String)map.get("modified");
        clientMtime = (String)map.get("client_mtime");
        path = (String)map.get("path");
        readOnly = DropboxAPI.getFromMapAsBoolean(map, "read_only");
        root = (String)map.get("root");
        size = (String)map.get("size");
        mimeType = (String)map.get("mime_type");
        rev = (String)map.get("rev");
        thumbExists = DropboxAPI.getFromMapAsBoolean(map, "thumb_exists");
        isDeleted = DropboxAPI.getFromMapAsBoolean(map, "is_deleted");
        map = ((Map) (map.get("contents")));
        if (map != null && (map instanceof a))
        {
            contents = new ArrayList();
            map = ((a)map).iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                Object obj = map.next();
                if (obj instanceof Map)
                {
                    contents.add(new <init>((Map)obj));
                }
            } while (true);
        } else
        {
            contents = null;
        }
    }

    class _cls1 extends JsonExtractor
    {

        public final DropboxAPI.Entry extract(JsonThing jsonthing)
        {
            return new DropboxAPI.Entry((Map)jsonthing.expectMap().internal);
        }

        public final volatile Object extract(JsonThing jsonthing)
        {
            return extract(jsonthing);
        }

            _cls1()
            {
            }
    }

}
