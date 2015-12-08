// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.badges.Badge;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface h
    extends ao
{

    public abstract void deleteByUserId(Long long1);

    public abstract Badge getByUserId(String s, Long long1);
}
