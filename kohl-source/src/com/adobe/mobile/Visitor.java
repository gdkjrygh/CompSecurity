// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            VisitorIDService

public final class Visitor
{

    public Visitor()
    {
    }

    public static String getMarketingCloudId()
    {
        return VisitorIDService.sharedInstance().getMarketingCloudID();
    }

    public static void syncIdentifiers(Map map)
    {
        VisitorIDService.sharedInstance().idSync(map);
    }
}
