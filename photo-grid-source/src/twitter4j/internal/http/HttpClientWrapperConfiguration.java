// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.util.Map;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientConfiguration

public interface HttpClientWrapperConfiguration
    extends HttpClientConfiguration
{

    public abstract Map getRequestHeaders();
}
