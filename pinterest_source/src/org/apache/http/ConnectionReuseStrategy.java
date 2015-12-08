// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http:
//            HttpResponse

public interface ConnectionReuseStrategy
{

    public abstract boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext);
}
