// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            UserAssociation

final class 
    implements Predicate
{

    public final boolean apply(UserAssociation userassociation)
    {
        return userassociation.hasToken();
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((UserAssociation)obj);
    }

    ()
    {
    }
}
