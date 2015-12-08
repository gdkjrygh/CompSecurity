// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            VersionedSerializable

public class teamId extends VersionedSerializable
{

    private static int MY_VERSION = 0;
    private static final long serialVersionUID = 0x1d1be5b63d0357f5L;
    public final String name;
    public final String teamId;

    public int getLatestVersion()
    {
        return MY_VERSION;
    }

    static 
    {
        MY_VERSION = 1;
    }

    protected e(String s, String s1)
    {
        teamId = s;
        name = s1;
    }

    protected name(Map map)
    {
        name = (String)map.get("name");
        teamId = (String)map.get("team_id");
    }
}
