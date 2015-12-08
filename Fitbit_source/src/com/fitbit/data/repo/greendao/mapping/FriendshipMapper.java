// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Friendship;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class FriendshipMapper
    implements EntityMapper
{

    public FriendshipMapper()
    {
    }

    public Friendship fromDbEntity(com.fitbit.data.repo.greendao.social.Friendship friendship)
    {
        return new Friendship(friendship.getId().longValue(), friendship.getLeftId().longValue(), friendship.getRightId().longValue());
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.social.Friendship)obj);
    }

    public com.fitbit.data.repo.greendao.social.Friendship toDbEntity(Friendship friendship)
    {
        return new com.fitbit.data.repo.greendao.social.Friendship(friendship.getEntityId(), Long.valueOf(friendship.a()), Long.valueOf(friendship.b()));
    }

    public com.fitbit.data.repo.greendao.social.Friendship toDbEntity(Friendship friendship, com.fitbit.data.repo.greendao.social.Friendship friendship1)
    {
        return friendship1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Friendship)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Friendship)obj, (com.fitbit.data.repo.greendao.social.Friendship)obj1);
    }
}
