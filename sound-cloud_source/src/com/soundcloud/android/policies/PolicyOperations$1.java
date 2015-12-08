// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.model.Urn;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.policies:
//            ApiPolicyInfo

final class 
    implements f
{

    public final Urn call(ApiPolicyInfo apipolicyinfo)
    {
        return apipolicyinfo.getUrn();
    }

    public final volatile Object call(Object obj)
    {
        return call((ApiPolicyInfo)obj);
    }

    ()
    {
    }
}
