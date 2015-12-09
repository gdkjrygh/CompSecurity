// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.util.ErrorUtil;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.model:
//            MetadataObject

public class Playlist extends MetadataObject
{

    private List b;

    public Playlist(Map map)
    {
        super(map);
    }

    public Playlist(Map map, List list)
    {
        super(map);
        if (list == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("videosRequired"));
        } else
        {
            b = list;
            return;
        }
    }

    public Integer getCount()
    {
        return Integer.valueOf(b.size());
    }

    public List getVideos()
    {
        return b;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Playlist{");
        if (a.get("name") != null)
        {
            stringbuilder.append("name: ");
            stringbuilder.append(a.get("name"));
        }
        if (a.get("shortDescription") != null)
        {
            stringbuilder.append(" shortDescription: ");
            stringbuilder.append(a.get("shortDescription"));
        }
        stringbuilder.append(" videos: ");
        int i;
        if (b != null)
        {
            i = b.size();
        } else
        {
            i = 0;
        }
        stringbuilder.append(i);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
