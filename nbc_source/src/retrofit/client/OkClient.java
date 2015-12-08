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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;
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
        int j = headers.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new Header(headers.name(i), headers.value(i)));
        }

        return arraylist;
    }

    static Request createRequest(retrofit.client.Request request)
    {
        com.squareup.okhttp.Request.Builder builder = (new com.squareup.okhttp.Request.Builder()).url(request.getUrl()).method(request.getMethod(), createRequestBody(request.getBody()));
        List list = request.getHeaders();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            Header header = (Header)list.get(i);
            String s = header.getValue();
            request = s;
            if (s == null)
            {
                request = "";
            }
            builder.addHeader(header.getName(), request);
        }

        return builder.build();
    }

    private static RequestBody createRequestBody(TypedOutput typedoutput)
    {
        if (typedoutput == null)
        {
            return null;
        } else
        {
            return new RequestBody(MediaType.parse(typedoutput.mimeType()), typedoutput) {

                final TypedOutput val$body;
                final MediaType val$mediaType;

                public long contentLength()
                {
                    return body.length();
                }

                public MediaType contentType()
                {
                    return mediaType;
                }

                public void writeTo(BufferedSink bufferedsink)
                    throws IOException
                {
                    body.writeTo(bufferedsink.outputStream());
                }

            
            {
                mediaType = mediatype;
                body = typedoutput;
                super();
            }
            };
        }
    }

    private static TypedInput createResponseBody(ResponseBody responsebody)
    {
        if (responsebody.contentLength() == 0L)
        {
            return null;
        } else
        {
            return new TypedInput(responsebody) {

                final ResponseBody val$body;

                public InputStream in()
                    throws IOException
                {
                    return body.byteStream();
                }

                public long length()
                {
                    return body.contentLength();
                }

                public String mimeType()
                {
                    MediaType mediatype = body.contentType();
                    if (mediatype == null)
                    {
                        return null;
                    } else
                    {
                        return mediatype.toString();
                    }
                }

            
            {
                body = responsebody;
                super();
            }
            };
        }
    }

    private static OkHttpClient generateDefaultOkHttp()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(20000L, TimeUnit.MILLISECONDS);
        return okhttpclient;
    }

    static retrofit.client.Response parseResponse(Response response)
    {
        return new retrofit.client.Response(response.request().urlString(), response.code(), response.message(), createHeaders(response.headers()), createResponseBody(response.body()));
    }

    public retrofit.client.Response execute(retrofit.client.Request request)
        throws IOException
    {
        return parseResponse(client.newCall(createRequest(request)).execute());
    }
}
