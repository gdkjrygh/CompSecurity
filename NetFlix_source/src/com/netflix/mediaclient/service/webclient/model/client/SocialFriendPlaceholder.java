// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.client;

import com.netflix.mediaclient.servicemgr.FriendProfile;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.client:
//            SocialPlaceholder

public class SocialFriendPlaceholder extends SocialPlaceholder
{

    public SocialFriendPlaceholder(LoMo lomo)
    {
        super(lomo);
    }

    public String getTitle()
    {
        if (getFacebookFriends() != null && getFacebookFriends().size() > 0)
        {
            return ((FriendProfile)getFacebookFriends().get(0)).getFullName();
        } else
        {
            return "";
        }
    }

    public VideoType getType()
    {
        return VideoType.SOCIAL_FRIEND;
    }
}
