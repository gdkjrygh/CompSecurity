// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;


// Referenced classes of package com.netflix.mediaclient.event.service:
//            AuthorizationFailed, Service

public class Deauthorization extends AuthorizationFailed
{

    public Deauthorization(Service service)
    {
        super(service);
    }
}
