// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.debug.log.b;
import com.facebook.http.a.a.a.a.d;
import com.facebook.http.a.a.a.i;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.hq;
import com.google.common.base.Charsets;
import java.util.Iterator;
import java.util.List;
import javax.inject.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.facebook.http.protocol:
//            a, an, s, e, 
//            l, y, f, n, 
//            q, u, ao, m, 
//            x, ac, t, r

class ap extends com.facebook.http.protocol.a
{

    final an a;

    private ap(an an1)
    {
        a = an1;
        super();
    }

    ap(an an1, ao ao1)
    {
        this(an1);
    }

    private void a(JsonParser jsonparser)
    {
        if (jsonparser.getCurrentToken() != JsonToken.START_ARRAY)
        {
            jsonparser = (JsonNode)an.m(a).readTree(jsonparser);
            an.k(a).a(jsonparser);
            throw new JsonMappingException("Batch request must return an array");
        } else
        {
            return;
        }
    }

    public void a(String s1, l l1)
    {
        Object obj;
        List list;
        java.util.ArrayList arraylist;
        Object obj4;
        obj = l1;
        if (l1 == null)
        {
            obj = new l();
        }
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        list = a();
        Object obj1 = hq.a();
        arraylist = hq.a();
        n n1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(n1))
        {
            y y1 = (y)iterator.next();
            n1 = y1.a().a(y1.b());
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("method", n1.b());
            Object obj6 = com.facebook.http.protocol.an.a(a).a(n1);
            if (((Boolean)com.facebook.http.protocol.an.b(a).b()).booleanValue())
            {
                ((List) (obj6)).add(new BasicNameValuePair("phprof_sample", "1"));
                l1 = (String)an.c(a).b();
                if (l1 != null)
                {
                    ((List) (obj6)).add(new BasicNameValuePair("phprof_user", l1));
                }
            }
            if (((Boolean)com.facebook.http.protocol.an.d(a).b()).booleanValue())
            {
                ((List) (obj6)).add(new BasicNameValuePair("teak_sample", "1"));
                l1 = (String)an.c(a).b();
                if (l1 != null)
                {
                    ((List) (obj6)).add(new BasicNameValuePair("teak_user", l1));
                }
            }
            if (((Boolean)an.e(a).b()).booleanValue())
            {
                ((List) (obj6)).add(new BasicNameValuePair("wirehog_sample", "1"));
                l1 = (String)an.c(a).b();
                if (l1 != null)
                {
                    ((List) (obj6)).add(new BasicNameValuePair("wirehog_user", l1));
                }
            }
            l1 = n1.c();
            if ("GET".equals(n1.b()))
            {
                obj6 = URLEncodedUtils.format(((List) (obj6)), "UTF-8");
                l1 = (new StringBuilder()).append(l1).append("?").append(((String) (obj6))).toString();
            } else
            if ("POST".equals(n1.b()))
            {
                objectnode.put("body", URLEncodedUtils.format(((List) (obj6)), "UTF-8"));
            } else
            if ("DELETE".equals(n1.b()))
            {
                obj6 = URLEncodedUtils.format(((List) (obj6)), "UTF-8");
                l1 = (new StringBuilder()).append(l1).append("?").append(((String) (obj6))).toString();
            } else
            {
                throw new Exception((new StringBuilder()).append("Unsupported method: ").append(n1.b()).toString());
            }
            if (y1.c() != null)
            {
                objectnode.put("name", y1.c());
            }
            if (y1.d() != null)
            {
                objectnode.put("depends_on", y1.d());
            }
            if (n1.e() != null)
            {
                ObjectNode objectnode1 = new ObjectNode(JsonNodeFactory.instance);
                com.facebook.http.a.a.a.a a1;
                for (obj6 = n1.e().iterator(); ((Iterator) (obj6)).hasNext(); ((List) (obj1)).add(a1))
                {
                    a1 = (com.facebook.http.a.a.a.a)((Iterator) (obj6)).next();
                    objectnode1.put(a1.a(), a1.());
                }

                objectnode.put("attached_files", objectnode1);
            }
            objectnode.put("omit_response_on_success", false);
            objectnode.put("relative_url", l1);
            arraynode.add(objectnode);
        }

        l1 = (ViewerContext)an.f(a).b();
        obj4 = new i();
        if (l1 != null)
        {
            l1 = l1.b();
        } else
        {
            l1 = null;
        }
        if (l1 == null)
        {
            throw new u("auth token is null, user logged out?");
        }
        ((i) (obj4)).a("access_token", new d(l1, Charsets.UTF_8));
        l1 = arraynode.toString();
        if (b.b(2))
        {
            b.a(com.facebook.http.protocol.an.b(), (new StringBuilder()).append("Request JSON: ").append(l1).toString());
        }
        ((i) (obj4)).a("batch", new d(l1, Charsets.UTF_8));
        for (l1 = ((List) (obj1)).iterator(); l1.hasNext(); ((i) (obj4)).a(((com.facebook.http.a.a.a.a) (obj1)).a(), ((com.facebook.http.a.a.a.a) (obj1)).b()))
        {
            obj1 = (com.facebook.http.a.a.a.a)l1.next();
        }

        com.facebook.http.protocol.ao.a[((l) (obj)).c().ordinal()];
        JVM INSTR tableswitch 1 2: default 912
    //                   1 1301
    //                   2 1312;
           goto _L1 _L2 _L3
_L1:
        l1 = (com.facebook.http.c.i)com.facebook.http.protocol.an.i(a).b();
_L8:
        Object obj2;
        Object obj3;
        obj2 = l1.b();
        if (((Boolean)com.facebook.http.protocol.an.b(a).b()).booleanValue())
        {
            ((android.net.Uri.Builder) (obj2)).appendQueryParameter("phprof_sample", "1");
            String s2 = (String)an.c(a).b();
            if (s2 != null)
            {
                ((android.net.Uri.Builder) (obj2)).appendQueryParameter("phprof_user", s2);
            }
        }
        if (((Boolean)an.e(a).b()).booleanValue())
        {
            ((android.net.Uri.Builder) (obj2)).appendQueryParameter("wirehog_sample", "1");
            String s3 = (String)an.c(a).b();
            if (s3 != null)
            {
                ((android.net.Uri.Builder) (obj2)).appendQueryParameter("wirehog_user", s3);
            }
        }
        com.facebook.http.protocol.an.a(a).a(((android.net.Uri.Builder) (obj2)));
        obj2 = new HttpPost(((android.net.Uri.Builder) (obj2)).build().toString());
        ((HttpPost) (obj2)).setEntity(((HttpEntity) (obj4)));
        obj3 = l1.e();
        if (obj3 != null)
        {
            ((HttpPost) (obj2)).addHeader("User-Agent", ((String) (obj3)));
        }
        l1 = l1.f();
        if (l1 != null)
        {
            ((HttpPost) (obj2)).addHeader("X-FB-Connection-Type", l1);
        }
        if (((l) (obj)).b() != null)
        {
            ((HttpPost) (obj2)).setParams(((l) (obj)).b());
        }
        s1 = an.j(a).a(s1, ((org.apache.http.client.methods.HttpUriRequest) (obj2)));
        obj3 = s1.getEntity();
        obj2 = null;
        int j;
        s1 = s1.getStatusLine();
        j = s1.getStatusCode();
        if (j <= 300) goto _L5; else goto _L4
_L4:
        obj = s1.getReasonPhrase();
        if (obj3 != null) goto _L7; else goto _L6
_L6:
        s1 = null;
_L9:
        l1 = ((l) (obj));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1250;
        }
        l1 = (new StringBuilder()).append(((String) (obj))).append("\n").append(s1).toString();
        if (j != 400)
        {
            break MISSING_BLOCK_LABEL_1269;
        }
        an.k(a).a(s1);
        throw new HttpResponseException(j, l1);
        s1;
        l1 = ((l) (obj2));
_L17:
        if (l1 != null)
        {
            l1.close();
        }
        ((HttpEntity) (obj3)).consumeContent();
        throw s1;
_L2:
        l1 = an.g(a);
          goto _L8
_L3:
        l1 = an.h(a);
          goto _L8
_L7:
        s1 = EntityUtils.toString(((HttpEntity) (obj3)));
          goto _L9
_L5:
        obj = an.l(a).createJsonParser(((HttpEntity) (obj3)).getContent());
        ((JsonParser) (obj)).nextToken();
        a(((JsonParser) (obj)));
        s1 = null;
        obj2 = an.m(a).readValues(((JsonParser) (obj)), com/fasterxml/jackson/databind/JsonNode);
        j = 0;
_L11:
        f f1;
        Object obj5;
        if (!((MappingIterator) (obj2)).hasNextValue())
        {
            break MISSING_BLOCK_LABEL_1728;
        }
        obj5 = (JsonNode)((MappingIterator) (obj2)).nextValue();
        obj4 = (y)list.get(j);
        f1 = ((y) (obj4)).a();
        l1 = (n)arraylist.get(j);
        if (obj5 == NullNode.instance)
        {
            throw new x(((y) (obj4)).c());
        }
          goto _L10
_L16:
        a(((y) (obj4)).c(), ((Exception) (l1)));
_L14:
        j++;
          goto _L11
_L10:
        ac ac1;
        ac1 = new ac(an.k(a));
        obj5 = ac1.a(((JsonNode) (obj5)));
        if (l1.f() != t.JSONPARSER) goto _L13; else goto _L12
_L12:
        obj5 = an.l(a).createJsonParser(((String) (obj5)));
        ((JsonParser) (obj5)).setCodec(an.m(a));
        l1 = new r(ac1.b(), ac1.a(), ((JsonParser) (obj5)), an.k(a), l1.g());
_L15:
        l1 = ((l) (f1.a(((y) (obj4)).b(), l1)));
        a(((y) (obj4)).c(), l1);
          goto _L14
_L13:
label0:
        {
            if (l1.f() != t.JSON)
            {
                break label0;
            }
            l1 = new r(ac1.b(), ac1.a(), an.m(a).readTree(((String) (obj5))), an.k(a), l1.g());
        }
          goto _L15
label1:
        {
            if (l1.f() != t.STRING)
            {
                break label1;
            }
            l1 = new r(ac1.b(), ac1.a(), ((String) (obj5)), an.k(a), l1.g());
        }
          goto _L15
        try
        {
            if (l1.f() == t.ENTITY)
            {
                throw new IllegalArgumentException("Response type entity not supported for batch requests");
            } else
            {
                throw new IllegalArgumentException("Unknown api response type");
            }
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            if (s1 == null)
            {
                s1 = l1;
            }
        }
          goto _L16
        if (j != list.size())
        {
            throw new Exception("Received wrong number of batches in response");
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1757;
        }
        throw s1;
        if (obj != null)
        {
            ((JsonParser) (obj)).close();
        }
        ((HttpEntity) (obj3)).consumeContent();
        return;
        s1;
        l1 = ((l) (obj));
          goto _L17
    }
}
