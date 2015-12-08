// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            UserAssociation

final class 
    implements Function
{

    public final volatile Object apply(Object obj)
    {
        return apply((UserAssociation)obj);
    }

    public final String apply(UserAssociation userassociation)
    {
        return userassociation.getToken();
    }

    ()
    {
    }
}
