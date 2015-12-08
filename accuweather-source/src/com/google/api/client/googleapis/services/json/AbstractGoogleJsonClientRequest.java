// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.batch.json.JsonBatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonErrorContainer;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.google.api.client.googleapis.services.json:
//            AbstractGoogleJsonClient

public abstract class AbstractGoogleJsonClientRequest extends AbstractGoogleClientRequest
{

    private final Object jsonContent;

    protected AbstractGoogleJsonClientRequest(AbstractGoogleJsonClient abstractgooglejsonclient, String s, String s1, Object obj, Class class1)
    {
        Object obj1 = null;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            JsonHttpContent jsonhttpcontent = new JsonHttpContent(abstractgooglejsonclient.getJsonFactory(), obj);
            if (!abstractgooglejsonclient.getObjectParser().getWrapperKeys().isEmpty())
            {
                obj1 = "data";
            }
            obj1 = jsonhttpcontent.setWrapperKey(((String) (obj1)));
        }
        super(abstractgooglejsonclient, s, s1, ((com.google.api.client.http.HttpContent) (obj1)), class1);
        jsonContent = obj;
    }

    public volatile AbstractGoogleClient getAbstractGoogleClient()
    {
        return getAbstractGoogleClient();
    }

    public AbstractGoogleJsonClient getAbstractGoogleClient()
    {
        return (AbstractGoogleJsonClient)super.getAbstractGoogleClient();
    }

    public Object getJsonContent()
    {
        return jsonContent;
    }

    protected GoogleJsonResponseException newExceptionOnError(HttpResponse httpresponse)
    {
        return GoogleJsonResponseException.from(getAbstractGoogleClient().getJsonFactory(), httpresponse);
    }

    protected volatile IOException newExceptionOnError(HttpResponse httpresponse)
    {
        return newExceptionOnError(httpresponse);
    }

    public final void queue(BatchRequest batchrequest, JsonBatchCallback jsonbatchcallback)
        throws IOException
    {
        super.queue(batchrequest, com/google/api/client/googleapis/json/GoogleJsonErrorContainer, jsonbatchcallback);
    }

    public volatile AbstractGoogleClientRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AbstractGoogleJsonClientRequest set(String s, Object obj)
    {
        return (AbstractGoogleJsonClientRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AbstractGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public AbstractGoogleJsonClientRequest setDisableGZipContent(boolean flag)
    {
        return (AbstractGoogleJsonClientRequest)super.setDisableGZipContent(flag);
    }

    public volatile AbstractGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public AbstractGoogleJsonClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return (AbstractGoogleJsonClientRequest)super.setRequestHeaders(httpheaders);
    }
}
