// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpResponse;

// Referenced classes of package com.netflix.mediaclient.nccp:
//            NccpResponseHandler, NccpResponse

public interface NccpTransaction
{

    public abstract String getContentType();

    public abstract String getEndpoint();

    public abstract String getName();

    public abstract String getNccpVersion();

    public abstract String getRequestBody();

    public abstract List getRequestHeaders();

    public abstract NccpResponseHandler getResponseHandler();

    public abstract String getUserAgent();

    public abstract NccpResponse processError(Throwable throwable);

    public abstract NccpResponse processResponse(HttpResponse httpresponse)
        throws IOException;
}
