// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.client;

import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.VideoType;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.client:
//            SocialPlaceholder

public class SocialGroupPlaceholder extends SocialPlaceholder
{

    public SocialGroupPlaceholder(LoMo lomo)
    {
        super(lomo);
    }

    public VideoType getType()
    {
        return VideoType.SOCIAL_GROUP;
    }
}
