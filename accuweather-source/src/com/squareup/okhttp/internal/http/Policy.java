// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.net.HttpURLConnection;
import java.net.URL;

public interface Policy
{

    public abstract int getChunkLength();

    public abstract long getFixedContentLength();

    public abstract HttpURLConnection getHttpConnectionToCache();

    public abstract long getIfModifiedSince();

    public abstract URL getURL();

    public abstract boolean getUseCaches();

    public abstract boolean usingProxy();
}
