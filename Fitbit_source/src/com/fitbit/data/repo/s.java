// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.FavoriteFoodItem;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface s
    extends ao
{

    public transient abstract FavoriteFoodItem getByEntityId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[]);

    public transient abstract FavoriteFoodItem getByServerId(long l, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[]);
}
