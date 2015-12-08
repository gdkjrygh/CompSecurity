// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMAuthenticationMethod

public class DRMLicenseDomain
{

    private String authDomain;
    private DRMAuthenticationMethod authMethod;
    private long peerObject;
    private String serverURL;

    protected DRMLicenseDomain(int i, String s, String s1, long l)
    {
        authMethod = DRMAuthenticationMethod.values()[i];
        authDomain = s;
        serverURL = s1;
        peerObject = l;
    }

    protected native void finalize();

    public String getAuthenticationDomain()
    {
        return authDomain;
    }

    public DRMAuthenticationMethod getAuthenticationMethod()
    {
        return authMethod;
    }

    public String getServerURL()
    {
        return serverURL;
    }

    public String toString()
    {
        return (new StringBuilder()).append("License domain registration URL: ").append(getServerURL()).append("\n").append("Authentication method: ").append(getAuthenticationMethod()).append("\n").append("Authentication domain: ").append(getAuthenticationDomain()).append("\n").toString();
    }
}
