// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Profile;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface am
    extends ao
{

    public abstract Profile getByEncodedId(String s);
}
