// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public interface HttpRequestHandler
{

    public abstract void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext);
}
