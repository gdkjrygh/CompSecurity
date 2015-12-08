// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpRequest

public interface HttpIOExceptionHandler
{

    public abstract boolean handleIOException(HttpRequest httprequest, boolean flag)
        throws IOException;
}
