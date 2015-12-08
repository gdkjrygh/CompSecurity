// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

public final class lff
    implements lgn
{

    private HttpClient a;

    public lff(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, kyw kyw1)
    {
        if (false)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(null));
        }
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    public final HttpResponse a(kyw kyw1, Map map)
    {
        kyw1.a;
        JVM INSTR tableswitch -1 7: default 56
    //                   -1 66
    //                   0 177
    //                   1 207
    //                   2 237
    //                   3 192
    //                   4 267
    //                   5 282
    //                   6 297
    //                   7 312;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj;
        byte abyte0[] = kyw1.c();
        int i;
        if (abyte0 != null)
        {
            obj = new HttpPost(kyw1.b);
            ((HttpPost) (obj)).addHeader("Content-Type", kyw1.b());
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(abyte0));
        } else
        {
            obj = new HttpGet(kyw1.b);
        }
_L12:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), kyw1.a());
        map = ((HttpUriRequest) (obj)).getParams();
        i = kyw1.e();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(kyw1.b);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(kyw1.b);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(kyw1.b);
        ((HttpPost) (obj)).addHeader("Content-Type", kyw1.d());
        a(((HttpEntityEnclosingRequestBase) (obj)), kyw1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(kyw1.b);
        ((HttpPut) (obj)).addHeader("Content-Type", kyw1.d());
        a(((HttpEntityEnclosingRequestBase) (obj)), kyw1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new HttpHead(kyw1.b);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new HttpOptions(kyw1.b);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new HttpTrace(kyw1.b);
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new lfg(kyw1.b);
        ((lfg) (obj)).addHeader("Content-Type", kyw1.d());
        a(((HttpEntityEnclosingRequestBase) (obj)), kyw1);
        if (true) goto _L12; else goto _L11
_L11:
    }
}
