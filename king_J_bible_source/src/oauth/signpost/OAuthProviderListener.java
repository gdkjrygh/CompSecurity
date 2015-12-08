// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import oauth.signpost.http.HttpRequest;
import oauth.signpost.http.HttpResponse;

public interface OAuthProviderListener
{

    public abstract boolean onResponseReceived(HttpRequest httprequest, HttpResponse httpresponse)
        throws Exception;

    public abstract void prepareRequest(HttpRequest httprequest)
        throws Exception;

    public abstract void prepareSubmission(HttpRequest httprequest)
        throws Exception;
}
