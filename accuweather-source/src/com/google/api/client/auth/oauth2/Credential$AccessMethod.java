// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpRequest;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            Credential

public static interface 
{

    public abstract String getAccessTokenFromRequest(HttpRequest httprequest);

    public abstract void intercept(HttpRequest httprequest, String s)
        throws IOException;
}
