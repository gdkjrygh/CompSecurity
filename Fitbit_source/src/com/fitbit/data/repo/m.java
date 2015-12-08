// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface m
    extends ao
{

    public abstract void deleteByDate(Date date, boolean flag);

    public abstract void deleteOlderThanDate(Date date, boolean flag);

    public transient abstract List getByDate(Date date, com.fitbit.data.domain.Entity.EntityStatus aentitystatus[]);
}
