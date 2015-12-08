// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

public interface HttpUriRequest
    extends HttpRequest
{

    public abstract void abort()
        throws UnsupportedOperationException;

    public abstract String getMethod();

    public abstract URI getURI();

    public abstract boolean isAborted();
}
