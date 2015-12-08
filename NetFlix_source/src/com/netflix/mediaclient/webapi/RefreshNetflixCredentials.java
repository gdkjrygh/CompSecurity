// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;


// Referenced classes of package com.netflix.mediaclient.webapi:
//            NoResponseWebApiCommand, AuthorizationCredentials

public class RefreshNetflixCredentials extends NoResponseWebApiCommand
{

    public RefreshNetflixCredentials(String s, String s1, String s2)
    {
        super(s, new AuthorizationCredentials(s1, s2), null);
    }

    public String getCommandPath()
    {
        return "/users/current";
    }
}
