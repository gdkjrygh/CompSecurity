// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.util.Date;
import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            RESTUtility

public class <init>
{

    public final Date expires;
    public final String url;

    private (String s, boolean flag)
    {
        String s1 = s;
        if (!flag)
        {
            s1 = s;
            if (s.startsWith("https://"))
            {
                s1 = s.replaceFirst("https://", "http://").replaceFirst(":443/", "/");
            }
        }
        url = s1;
        expires = null;
    }

    private expires(Map map)
    {
        this(map, true);
    }

    <init>(Map map, <init> <init>1)
    {
        this(map);
    }

    private <init>(Map map, boolean flag)
    {
        String s = (String)map.get("url");
        map = (String)map.get("expires");
        if (map != null)
        {
            expires = RESTUtility.parseDate(map);
        } else
        {
            expires = null;
        }
        map = s;
        if (!flag)
        {
            map = s;
            if (s.startsWith("https://"))
            {
                map = s.replaceFirst("https://", "http://").replaceFirst(":443/", "/");
            }
        }
        url = map;
    }

    url(Map map, boolean flag, url url1)
    {
        this(map, flag);
    }
}
