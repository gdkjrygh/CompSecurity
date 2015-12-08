// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.RankedUser;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface an
    extends ao
{

    public abstract List getAllFitbitUsers();

    public abstract RankedUser getByEncodedId(String s);

    public abstract List getInvites();

    public abstract List getLeaderboard(String s);

    public abstract List getUnreadInvites();

    public abstract RankedUser getUserByInviteId(long l);

    public abstract List getUserFriends(String s);

    public abstract List getUserFriendsByInviteId(long l);

    public abstract List getUsersOnFitbit();

    public abstract List getUsersOutOfFitbit();

    public abstract boolean hasNewInvites();
}
