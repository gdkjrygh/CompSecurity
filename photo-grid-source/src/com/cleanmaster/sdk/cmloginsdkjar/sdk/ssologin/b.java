// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin;

import com.cleanmaster.sdk.cmloginsdkjar.Response;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmObject;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmProxyReauth;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin:
//            a

final class b
    implements com.cleanmaster.sdk.cmloginsdkjar.Request.CmProxyReauthCallback
{

    final String a[];
    final a b;

    b(a a1, String as[])
    {
        b = a1;
        a = as;
        super();
    }

    public final void onCompleted(CmRawObject cmrawobject, Response response)
    {
        a[0] = ((CmProxyReauth)cmrawobject.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth)).getSid();
        a[1] = ((CmProxyReauth)cmrawobject.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth)).getSsoToken();
    }
}
