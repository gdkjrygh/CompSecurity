// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import java.util.Locale;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.dropbox.client2.session:
//            AccessTokenPair, AppKeyPair

public interface Session
{

    public abstract String getAPIServer();

    public abstract AccessTokenPair getAccessTokenPair();

    public abstract AccessType getAccessType();

    public abstract AppKeyPair getAppKeyPair();

    public abstract String getContentServer();

    public abstract HttpClient getHttpClient();

    public abstract Locale getLocale();

    public abstract ProxyInfo getProxyInfo();

    public abstract String getWebServer();

    public abstract boolean isLinked();

    public abstract void setRequestTimeout(HttpUriRequest httpurirequest);

    public abstract void sign(HttpRequest httprequest);

    public abstract void unlink();
}
