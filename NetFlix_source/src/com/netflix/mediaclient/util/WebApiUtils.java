// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import java.security.InvalidParameterException;

// Referenced classes of package com.netflix.mediaclient.util:
//            StringUtils

public final class WebApiUtils
{
    public static class VideoIds
    {

        public int catalogId;
        public String catalogIdUrl;
        public boolean episode;
        public int episodeId;
        public String episodeIdUrl;

        public VideoIds()
        {
        }

        public VideoIds(boolean flag, String s, String s1, int i, int j)
        {
            episode = flag;
            episodeIdUrl = s;
            catalogIdUrl = s1;
            episodeId = i;
            catalogId = j;
        }
    }


    private WebApiUtils()
    {
    }

    public static VideoIds extractIsd(String s, String s1)
        throws InvalidParameterException
    {
        VideoIds videoids = new VideoIds();
        videoids.catalogIdUrl = s;
        videoids.episodeIdUrl = s1;
        if (s1 != null && !"".equals(s1.trim()) && !s1.equals(s))
        {
            videoids.episode = true;
            int i = s1.lastIndexOf("/");
            if (i < 0)
            {
                throw new InvalidParameterException((new StringBuilder()).append("Wrong episodeID URL ").append(s1).toString());
            }
            videoids.episodeId = Integer.parseInt(s1.substring(i + 1));
            s = s1.substring(0, i);
            i = s.lastIndexOf("/");
            if (i < 0)
            {
                return null;
            } else
            {
                videoids.catalogId = Integer.parseInt(s.substring(i + 1));
                return videoids;
            }
        }
        videoids.episode = false;
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        int j = s.lastIndexOf("/");
        if (j < 0)
        {
            throw new InvalidParameterException((new StringBuilder()).append("Wrong catalogID URL ").append(s).toString());
        } else
        {
            videoids.catalogId = Integer.parseInt(s.substring(j + 1));
            return videoids;
        }
    }
}
