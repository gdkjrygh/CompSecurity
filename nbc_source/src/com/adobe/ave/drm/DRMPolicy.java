// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMAuthenticationMethod, DRMLicenseDomain

public class DRMPolicy
{

    String authDomain;
    DRMAuthenticationMethod authMethod;
    String dispName;
    DRMLicenseDomain licenseDomain;

    protected DRMPolicy(String s, int i, String s1, DRMLicenseDomain drmlicensedomain)
    {
        dispName = s;
        authMethod = DRMAuthenticationMethod.values()[i];
        authDomain = s1;
        licenseDomain = drmlicensedomain;
    }

    public String getAuthenticationDomain()
    {
        return authDomain;
    }

    public DRMAuthenticationMethod getAuthenticationMethod()
    {
        return authMethod;
    }

    public String getDisplayName()
    {
        return dispName;
    }

    public DRMLicenseDomain getLicenseDomain()
    {
        return licenseDomain;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (getDisplayName() != null)
        {
            stringbuffer.append((new StringBuilder()).append("Display name: ").append(getDisplayName()).append("\n").toString());
        }
        stringbuffer.append((new StringBuilder()).append("Authentication method: ").append(getAuthenticationMethod()).append("\n").toString());
        if (getLicenseDomain() != null)
        {
            stringbuffer.append(getLicenseDomain());
        }
        return stringbuffer.toString();
    }
}
