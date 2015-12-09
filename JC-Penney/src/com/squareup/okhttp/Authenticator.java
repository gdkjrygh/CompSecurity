// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.Proxy;

// Referenced classes of package com.squareup.okhttp:
//            Response, Request

public interface Authenticator
{

    public abstract Request authenticate(Proxy proxy, Response response);

    public abstract Request authenticateProxy(Proxy proxy, Response response);
}
