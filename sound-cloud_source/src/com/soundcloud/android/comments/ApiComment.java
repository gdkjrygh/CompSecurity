// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentRecord

public abstract class ApiComment
    implements CommentRecord
{
    public static abstract class Builder
    {

        public abstract Builder body(String s);

        public abstract ApiComment build();

        public abstract Builder createdAt(Date date);

        public abstract Builder trackTime(long l);

        public abstract Builder trackUrn(Urn urn1);

        public abstract Builder urn(Urn urn1);

        public abstract Builder user(ApiUser apiuser);

        public Builder()
        {
        }
    }


    public ApiComment()
    {
    }

    public static Builder builder()
    {
        return new AutoValue_ApiComment.Builder();
    }

    public static ApiComment create(String s, String s1, long l, String s2, Date date, ApiUser apiuser)
    {
        return builder().urn(new Urn(s)).trackUrn(new Urn(s1)).trackTime(l).body(s2).createdAt(date).user(apiuser).build();
    }

    public abstract String getBody();

    public abstract Date getCreatedAt();

    public abstract long getTrackTime();

    public abstract Urn getTrackUrn();

    public abstract Urn getUrn();

    public abstract ApiUser getUser();

    public volatile UserRecord getUser()
    {
        return getUser();
    }
}
