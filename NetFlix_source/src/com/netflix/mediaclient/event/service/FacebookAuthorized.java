// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;


// Referenced classes of package com.netflix.mediaclient.event.service:
//            Authorized, Service

public class FacebookAuthorized extends Authorized
{

    public static final String TYPE = "nrdp-service-authorize-didauthorize";

    public FacebookAuthorized(String s)
    {
        super("nrdp-service-authorize-didauthorize", Service.facebook, s);
    }

    public int getVersion()
    {
        return 1;
    }
}
