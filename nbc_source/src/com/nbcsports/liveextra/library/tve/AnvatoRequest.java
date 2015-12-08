// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.adobe.adobepass.accessenabler.models.Mvpd;

public class AnvatoRequest
{
    static class User
    {

        public static final String device = "android";
        public String adobeMvpdId;
        public String authorizedResources[];
        public String encryptedServiceZip;
        public String serviceZip;

        User()
        {
        }
    }


    private static Mvpd mvpd;
    public User user;

    private AnvatoRequest(User user1)
    {
        user = user1;
    }

    public static AnvatoRequest buildBlackoutRequest(Mvpd mvpd1, String s)
    {
        mvpd = mvpd1;
        User user1 = new User();
        if (mvpd1 != null)
        {
            user1.adobeMvpdId = mvpd1.getId();
        }
        user1.authorizedResources = (new String[] {
            s
        });
        return new AnvatoRequest(user1);
    }

    public static AnvatoRequest buildEntitlementRequest(String s, Mvpd mvpd1, String s1, boolean flag)
    {
        User user1 = new User();
        user1.authorizedResources = (new String[] {
            s
        });
        if (mvpd1 != null)
        {
            user1.adobeMvpdId = mvpd1.getId();
        }
        if (flag)
        {
            user1.encryptedServiceZip = s1;
        } else
        {
            user1.serviceZip = s1;
        }
        return new AnvatoRequest(user1);
    }

    public String getMvpdDisplayName()
    {
        if (mvpd == null)
        {
            return null;
        } else
        {
            return mvpd.getDisplayName();
        }
    }
}
