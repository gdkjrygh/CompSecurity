// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            ApiComment

final class AutoValue_ApiComment extends ApiComment
{
    static final class Builder extends ApiComment.Builder
    {

        private String body;
        private Date createdAt;
        private Long trackTime;
        private Urn trackUrn;
        private Urn urn;
        private ApiUser user;

        public final ApiComment.Builder body(String s)
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

        public final ApiComment.Builder createdAt(Date date)
        {
            createdAt = date;
            return this;
        }

        public final ApiComment.Builder trackTime(long l)
        {
            trackTime = Long.valueOf(l);
            return this;
        }

        public final ApiComment.Builder trackUrn(Urn urn1)
        {
            trackUrn = urn1;
            return this;
        }

        public final ApiComment.Builder urn(Urn urn1)
        {
            urn = urn1;
            return this;
        }

        public final ApiComment.Builder user(ApiUser apiuser)
        {
            user = apiuser;
            return this;
        }

        Builder()
        {
        }

        Builder(ApiComment apicomment)
        {
            urn = apicomment.getUrn();
            trackUrn = apicomment.getTrackUrn();
            body = apicomment.getBody();
            trackTime = Long.valueOf(apicomment.getTrackTime());
            createdAt = apicomment.getCreatedAt();
            user = apicomment.getUser();
        }
    }


    private final String body;
    private final Date createdAt;
    private final long trackTime;
    private final Urn trackUrn;
    private final Urn urn;
    private final ApiUser user;

    private AutoValue_ApiComment(Urn urn1, Urn urn2, String s, long l, Date date, ApiUser apiuser)
    {
        if (urn1 == null)
        {
            throw new NullPointerException("Null urn");
        }
        urn = urn1;
        if (urn2 == null)
        {
            throw new NullPointerException("Null trackUrn");
        }
        trackUrn = urn2;
        if (s == null)
        {
            throw new NullPointerException("Null body");
        }
        body = s;
        trackTime = l;
        if (date == null)
        {
            throw new NullPointerException("Null createdAt");
        }
        createdAt = date;
        if (apiuser == null)
        {
            throw new NullPointerException("Null user");
        } else
        {
            user = apiuser;
            return;
        }
    }

    AutoValue_ApiComment(Urn urn1, Urn urn2, String s, long l, Date date, ApiUser apiuser, 
            _cls1 _pcls1)
    {
        this(urn1, urn2, s, l, date, apiuser);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ApiComment)
            {
                if (!urn.equals(((ApiComment) (obj = (ApiComment)obj)).getUrn()) || !trackUrn.equals(((ApiComment) (obj)).getTrackUrn()) || !body.equals(((ApiComment) (obj)).getBody()) || trackTime != ((ApiComment) (obj)).getTrackTime() || !createdAt.equals(((ApiComment) (obj)).getCreatedAt()) || !user.equals(((ApiComment) (obj)).getUser()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final String getBody()
    {
        return body;
    }

    public final Date getCreatedAt()
    {
        return createdAt;
    }

    public final long getTrackTime()
    {
        return trackTime;
    }

    public final Urn getTrackUrn()
    {
        return trackUrn;
    }

    public final Urn getUrn()
    {
        return urn;
    }

    public final ApiUser getUser()
    {
        return user;
    }

    public final volatile UserRecord getUser()
    {
        return getUser();
    }

    public final int hashCode()
    {
        return ((int)((long)((((urn.hashCode() ^ 0xf4243) * 0xf4243 ^ trackUrn.hashCode()) * 0xf4243 ^ body.hashCode()) * 0xf4243) ^ (trackTime >>> 32 ^ trackTime)) * 0xf4243 ^ createdAt.hashCode()) * 0xf4243 ^ user.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("ApiComment{urn=")).append(urn).append(", trackUrn=").append(trackUrn).append(", body=").append(body).append(", trackTime=").append(trackTime).append(", createdAt=").append(createdAt).append(", user=").append(user).append("}").toString();
    }
}
