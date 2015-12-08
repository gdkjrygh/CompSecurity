// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.client:
//            Client, Header, Request, Response

public class OkClient
    implements Client
{

    private final OkHttpClient client;

    public OkClient()
    {
        this(generateDefaultOkHttp());
    }

    public OkClient(OkHttpClient okhttpclient)
    {
        if (okhttpclient == null)
        {
            throw new NullPointerException("client == null");
        } else
        {
            client = okhttpclient;
            return;
        }
    }

    private static List createHeaders(Headers headers)
    {
        int j = headers.a();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new Header(headers.a(i), headers.b(i)));
        }

        return arraylist;
    }

    static Request createRequest(retrofit.client.Request request)
    {
        com.squareup.okhttp.Request.Builder builder = (new com.squareup.okhttp.Request.Builder()).a(request.getUrl()).a(request.getMethod(), createRequestBody(request.getBody()));
        List list = request.getHeaders();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            Header header = (Header)list.get(i);
            String s = header.getValue();
            request = s;
            if (s == null)
            {
                request = "";
            }
            builder.b(header.getName(), request);
        }

        return builder.a();
    }

    private static RequestBody createRequestBody(TypedOutput typedoutput)
    {
        if (typedoutput == null)
        {
            return null;
        } else
        {
            return new _cls1();
        }
    }

    private static TypedInput createResponseBody(final ResponseBody body)
    {
        if (body.b() == 0L)
        {
            return null;
        } else
        {
            return new _cls2();
        }
    }

    private static OkHttpClient generateDefaultOkHttp()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.a(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.b(20000L, TimeUnit.MILLISECONDS);
        return okhttpclient;
    }

    static retrofit.client.Response parseResponse(Response response)
    {
        return new retrofit.client.Response(response.a().c(), response.c(), response.d(), createHeaders(response.f()), createResponseBody(response.g()));
    }

    public retrofit.client.Response execute(retrofit.client.Request request)
    {
        return parseResponse(client.a(createRequest(request)).a());
    }

    private class _cls1 extends RequestBody
    {

        final TypedOutput val$body;
        final MediaType val$mediaType;

        public final long contentLength()
        {
            return body.length();
        }

        public final MediaType contentType()
        {
            return mediaType;
        }

        public final void writeTo(BufferedSink bufferedsink)
        {
            body.writeTo(bufferedsink.d());
        }

        _cls1()
        {
            mediaType = mediatype;
            body = typedoutput;
            super();
        }
    }


    private class _cls2
        implements TypedInput
    {

        final ResponseBody val$body;

        public final InputStream in()
        {
            return body.d();
        }

        public final long length()
        {
            return body.b();
        }

        public final String mimeType()
        {
            MediaType mediatype = body.a();
            if (mediatype == null)
            {
                return null;
            } else
            {
                return mediatype.toString();
            }
        }

        _cls2()
        {
            body = responsebody;
            super();
        }
    }

}
