// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            VersionedSerializable

public class familiarName extends VersionedSerializable
{

    private static int MY_VERSION = 0;
    private static final long serialVersionUID = 0x1d1be5b63d0357f6L;
    public final String familiarName;
    public final String givenName;
    public final String surname;

    public int getLatestVersion()
    {
        return MY_VERSION;
    }

    static 
    {
        MY_VERSION = 1;
    }

    protected (String s, String s1, String s2)
    {
        givenName = s;
        surname = s1;
        familiarName = s2;
    }

    protected familiarName(Map map)
    {
        givenName = (String)map.get("given_name");
        surname = (String)map.get("surname");
        familiarName = (String)map.get("familiar_name");
    }
}
