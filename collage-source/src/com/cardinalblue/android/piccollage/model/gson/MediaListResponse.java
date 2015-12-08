// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            MediaList

public class MediaListResponse
{

    private MediaList mediaList;
    private String stat;

    public MediaListResponse()
    {
    }

    public MediaList getMediaListObject()
    {
        return mediaList;
    }

    public String getStat()
    {
        return stat;
    }

    public boolean isOk()
    {
        return stat.equalsIgnoreCase("ok");
    }
}
