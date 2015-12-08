// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.policies:
//            ApiPolicyInfo

final class 
    implements f
{

    public final Boolean call(ApiPolicyInfo apipolicyinfo)
    {
        boolean flag;
        if (!apipolicyinfo.isMonetizable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((ApiPolicyInfo)obj);
    }

    ()
    {
    }
}
