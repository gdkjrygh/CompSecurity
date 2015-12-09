// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class UserList extends Message
{

    public static final Long DEFAULT_COUNT = Long.valueOf(0L);
    public static final Boolean DEFAULT_INCLUDE_REQUESTING_USER = Boolean.valueOf(false);
    public static final List DEFAULT_USERNAMES = Collections.emptyList();
    public final Long count;
    public final Boolean include_requesting_user;
    public final List usernames;

    private UserList(Builder builder)
    {
        super(builder);
        usernames = e(builder.usernames);
        count = builder.count;
        include_requesting_user = builder.include_requesting_user;
    }

    UserList(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof UserList))
            {
                return false;
            }
            obj = (UserList)obj;
            if (!a(usernames, ((UserList) (obj)).usernames) || !a(count, ((UserList) (obj)).count) || !a(include_requesting_user, ((UserList) (obj)).include_requesting_user))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (usernames != null)
            {
                i = usernames.hashCode();
            } else
            {
                i = 1;
            }
            if (count != null)
            {
                k = count.hashCode();
            } else
            {
                k = 0;
            }
            if (include_requesting_user != null)
            {
                l = include_requesting_user.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Long count;
        public Boolean include_requesting_user;
        public List usernames;

        public final UserList build()
        {
            return new UserList(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder count(Long long1)
        {
            count = long1;
            return this;
        }

        public final Builder include_requesting_user(Boolean boolean1)
        {
            include_requesting_user = boolean1;
            return this;
        }

        public final Builder usernames(List list)
        {
            usernames = checkForNulls(list);
            return this;
        }

        public Builder()
        {
        }

        public Builder(UserList userlist)
        {
            super(userlist);
            if (userlist == null)
            {
                return;
            } else
            {
                usernames = UserList.a(userlist.usernames);
                count = userlist.count;
                include_requesting_user = userlist.include_requesting_user;
                return;
            }
        }
    }

}
