// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class cpa
    implements coz
{

    public cpa()
    {
        this((byte)0);
    }

    private cpa(byte byte0)
    {
        this('\0');
    }

    private cpa(char c)
    {
    }

    private static HttpEntity a(HttpURLConnection httpurlconnection)
    {
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        java.io.InputStream inputstream;
        try
        {
            inputstream = httpurlconnection.getInputStream();
        }
        catch (IOException ioexception)
        {
            ioexception = httpurlconnection.getErrorStream();
        }
        basichttpentity.setContent(inputstream);
        basichttpentity.setContentLength(httpurlconnection.getContentLength());
        basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
        basichttpentity.setContentType(httpurlconnection.getContentType());
        return basichttpentity;
    }

    public final HttpResponse a(zzk zzk1, Map map)
    {
        Object obj = zzk1.a;
        HashMap hashmap = new HashMap();
        hashmap.putAll(zzk1.a());
        hashmap.putAll(map);
        obj = new URL(((String) (obj)));
        map = (HttpURLConnection)((URL) (obj)).openConnection();
        int i = zzk1.b();
        map.setConnectTimeout(i);
        map.setReadTimeout(i);
        map.setUseCaches(false);
        map.setDoInput(true);
        "https".equals(((URL) (obj)).getProtocol());
        String s;
        for (zzk1 = hashmap.keySet().iterator(); zzk1.hasNext(); map.addRequestProperty(s, (String)hashmap.get(s)))
        {
            s = (String)zzk1.next();
        }

        map.setRequestMethod("GET");
        zzk1 = new ProtocolVersion("HTTP", 1, 1);
        if (map.getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        zzk1 = new BasicHttpResponse(new BasicStatusLine(zzk1, map.getResponseCode(), map.getResponseMessage()));
        zzk1.setEntity(a(((HttpURLConnection) (map))));
        map = map.getHeaderFields().entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null)
            {
                zzk1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return zzk1;
    }
}
