// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiActivity

public class ApiUserFollowActivity
    implements ApiActivity
{

    private final Date createdAt;
    private final ApiUser user;

    public ApiUserFollowActivity(ApiUser apiuser, Date date)
    {
        user = apiuser;
        createdAt = date;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public ApiUser getUser()
    {
        return user;
    }

    public volatile UserRecord getUser()
    {
        return getUser();
    }

    public Urn getUserUrn()
    {
        return user.getUrn();
    }
}
