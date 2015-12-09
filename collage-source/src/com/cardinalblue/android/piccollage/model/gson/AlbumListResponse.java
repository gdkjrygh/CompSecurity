// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            AlbumList

public class AlbumListResponse
{

    private AlbumList albumList;
    private String stat;

    public AlbumListResponse()
    {
    }

    public AlbumList getAlbumListObject()
    {
        return albumList;
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
