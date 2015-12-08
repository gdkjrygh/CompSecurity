// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            OAuth2Scheme, PublicApi

public static class api
    implements AuthSchemeFactory
{

    private final PublicApi api;

    public AuthScheme newInstance(HttpParams httpparams)
    {
        return new OAuth2Scheme(api, httpparams);
    }

    public (PublicApi publicapi)
    {
        api = publicapi;
    }
}
