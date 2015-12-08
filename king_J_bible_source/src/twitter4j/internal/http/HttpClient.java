// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import twitter4j.TwitterException;

// Referenced classes of package twitter4j.internal.http:
//            HttpRequest, HttpResponse

public interface HttpClient
{

    public abstract HttpResponse request(HttpRequest httprequest)
        throws TwitterException;

    public abstract void shutdown();
}
