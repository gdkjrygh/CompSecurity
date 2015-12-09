// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


// Referenced classes of package com.netflix.mediaclient.util:
//            WebApiUtils

public static class catalogId
{

    public int catalogId;
    public String catalogIdUrl;
    public boolean episode;
    public int episodeId;
    public String episodeIdUrl;

    public ()
    {
    }

    public (boolean flag, String s, String s1, int i, int j)
    {
        episode = flag;
        episodeIdUrl = s;
        catalogIdUrl = s1;
        episodeId = i;
        catalogId = j;
    }
}
