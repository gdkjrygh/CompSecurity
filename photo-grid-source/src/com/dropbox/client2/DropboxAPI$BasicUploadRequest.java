// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import com.dropbox.client2.exception.DropboxIOException;
import com.dropbox.client2.exception.DropboxPartialFileException;
import com.dropbox.client2.session.Session;
import java.util.Map;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.dropbox.client2:
//            RESTUtility

public final class session
    implements session
{

    private final HttpUriRequest request;
    private final Session session;

    public final void abort()
    {
        request.abort();
    }

    public final t upload()
    {
        org.apache.http.HttpResponse httpresponse;
        try
        {
            httpresponse = RESTUtility.execute(session, request, 0x2bf20);
        }
        catch (DropboxIOException dropboxioexception)
        {
            if (request.isAborted())
            {
                throw new DropboxPartialFileException(-1L);
            } else
            {
                throw dropboxioexception;
            }
        }
        return new ception((Map)RESTUtility.parseAsJSON(httpresponse));
    }

    public ception(HttpUriRequest httpurirequest, Session session1)
    {
        request = httpurirequest;
        session = session1;
    }
}
