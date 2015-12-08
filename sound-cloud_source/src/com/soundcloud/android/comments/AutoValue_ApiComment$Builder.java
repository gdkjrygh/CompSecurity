// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.Urn;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            AutoValue_ApiComment, ApiComment

static final class user extends user
{

    private String body;
    private Date createdAt;
    private Long trackTime;
    private Urn trackUrn;
    private Urn urn;
    private ApiUser user;

    public final user body(String s)
    {
        body = s;
        return this;
    }

    public final ApiComment build()
    {
        String s1 = "";
        if (urn == null)
        {
            s1 = (new StringBuilder()).append("").append(" urn").toString();
        }
        String s = s1;
        if (trackUrn == null)
        {
            s = (new StringBuilder()).append(s1).append(" trackUrn").toString();
        }
        s1 = s;
        if (body == null)
        {
            s1 = (new StringBuilder()).append(s).append(" body").toString();
        }
        s = s1;
        if (trackTime == null)
        {
            s = (new StringBuilder()).append(s1).append(" trackTime").toString();
        }
        s1 = s;
        if (createdAt == null)
        {
            s1 = (new StringBuilder()).append(s).append(" createdAt").toString();
        }
        s = s1;
        if (user == null)
        {
            s = (new StringBuilder()).append(s1).append(" user").toString();
        }
        if (!s.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Missing required properties:")).append(s).toString());
        } else
        {
            return new AutoValue_ApiComment(urn, trackUrn, body, trackTime.longValue(), createdAt, user, null);
        }
    }

    public final user createdAt(Date date)
    {
        createdAt = date;
        return this;
    }

    public final createdAt trackTime(long l)
    {
        trackTime = Long.valueOf(l);
        return this;
    }

    public final trackTime trackUrn(Urn urn1)
    {
        trackUrn = urn1;
        return this;
    }

    public final trackUrn urn(Urn urn1)
    {
        urn = urn1;
        return this;
    }

    public final urn user(ApiUser apiuser)
    {
        user = apiuser;
        return this;
    }

    ()
    {
    }

    (ApiComment apicomment)
    {
        urn = apicomment.getUrn();
        trackUrn = apicomment.getTrackUrn();
        body = apicomment.getBody();
        trackTime = Long.valueOf(apicomment.getTrackTime());
        createdAt = apicomment.getCreatedAt();
        user = apicomment.getUser();
    }
}
