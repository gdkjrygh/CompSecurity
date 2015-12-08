// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiBaseAdVisual, ApiDisplayProperties

class ApiCompanionAd extends ApiBaseAdVisual
{

    public final ApiDisplayProperties displayProperties;

    public ApiCompanionAd(String s, String s1, String s2, List list, List list1, ApiDisplayProperties apidisplayproperties)
    {
        super(s, s1, s2, list, list1);
        displayProperties = apidisplayproperties;
    }
}
