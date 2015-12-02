// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.w.i;
import com.facebook.config.a.c;
import com.facebook.http.b.ap;
import com.facebook.http.d.a.b;
import com.facebook.http.d.a.d;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.hq;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.http.protocol:
//            b, n, as, q, 
//            u, au, at, l, 
//            av, m, g, ah, 
//            t, r, o, al, 
//            aw, ae, ag, af, 
//            f, s, h

public class ar extends com.facebook.http.protocol.b
{

    private static final Class a = com/facebook/http/protocol/ar;
    private final a b;
    private final com.facebook.http.c.i c;
    private final com.facebook.http.c.i d;
    private final ap e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final c k;
    private final JsonFactory l;
    private final ObjectMapper m;
    private final s n;
    private final q o;

    public ar(a a1, com.facebook.http.c.i i1, com.facebook.http.c.i j1, ap ap1, a a2, a a3, a a4, 
            a a5, a a6, c c1, JsonFactory jsonfactory, ObjectMapper objectmapper, s s, q q1)
    {
        b = a1;
        c = i1;
        d = j1;
        e = ap1;
        f = a2;
        g = a3;
        h = a4;
        i = a5;
        j = a6;
        k = c1;
        l = jsonfactory;
        m = objectmapper;
        n = s;
        o = q1;
    }

    private d a(n n1, h h1)
    {
        if (n1.e() != null && n1.e().size() > 0)
        {
            throw new IllegalArgumentException("Cannot add attachment to string entities");
        }
        n1 = new d(URLEncodedUtils.format(a(n1), Charsets.UTF_8.displayName()), Charsets.UTF_8.displayName());
        if (h1 != null)
        {
            long l1 = n1.getContentLength();
            if (l1 > 0L)
            {
                n1.a(new as(this, h1, l1));
            }
        }
        return n1;
    }

    private List a(n n1)
    {
        String s;
        java.util.ArrayList arraylist;
        arraylist = hq.a(o.a(n1));
        if (b(n1))
        {
            Object obj = (ViewerContext)g.b();
            if (obj != null)
            {
                obj = ((ViewerContext) (obj)).b();
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                throw new u("auth token is null, user logged out?");
            }
            arraylist.add(new BasicNameValuePair("access_token", ((String) (obj))));
        }
        s = n1.c();
        if (!s.startsWith("method/")) goto _L2; else goto _L1
_L1:
        arraylist.add(new BasicNameValuePair("method", s.substring(7)));
_L4:
        if (c(n1))
        {
            a(((List) (arraylist)));
        }
        return arraylist;
_L2:
        if ("DELETE".equals(n1.b()))
        {
            arraylist.add(new BasicNameValuePair("method", "DELETE"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(List list)
    {
        list.add(new BasicNameValuePair("api_key", k.c()));
        Collections.sort(list, new au(this));
        StringBuilder stringbuilder = new StringBuilder();
        NameValuePair namevaluepair;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); stringbuilder.append(namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)iterator.next();
            stringbuilder.append(namevaluepair.getName());
            stringbuilder.append("=");
        }

        stringbuilder.append(k.d());
        list.add(new BasicNameValuePair("sig", com.facebook.common.w.i.b(stringbuilder.toString())));
    }

    private com.facebook.http.a.a.a.i b(n n1, h h1)
    {
        b b1 = new b();
        NameValuePair namevaluepair;
        for (Iterator iterator = a(n1).iterator(); iterator.hasNext(); b1.a(namevaluepair.getName(), new com.facebook.http.a.a.a.a.d(namevaluepair.getValue(), Charsets.UTF_8)))
        {
            namevaluepair = (NameValuePair)iterator.next();
        }

        n1 = n1.e();
        if (n1 != null && !n1.isEmpty())
        {
            com.facebook.http.a.a.a.a a1;
            for (n1 = n1.iterator(); n1.hasNext(); b1.a(a1.a(), a1.b()))
            {
                a1 = (com.facebook.http.a.a.a.a)n1.next();
            }

        }
        if (h1 != null)
        {
            long l1 = b1.getContentLength();
            if (l1 > 0L)
            {
                b1.a(new at(this, h1, l1));
            }
        }
        return b1;
    }

    private boolean b(n n1)
    {
        String s = n1.c();
        return !"method/auth.login".equalsIgnoreCase(s) && !"method/auth.getSessionForApp".equalsIgnoreCase(s) && !"method/logging.mobilelogs".equalsIgnoreCase(s) && !"method/mobile.sendPhoneConfirmationCode".equalsIgnoreCase(s) && !"method/user.validateRegistrationData".equalsIgnoreCase(s) && !"method/user.confirmPhoneAndRegisterPartialAccount".equalsIgnoreCase(s) && !"method/app.loggedoutsettings".equalsIgnoreCase(s) && !"method/user.register".equalsIgnoreCase(s) && !"fetchSessionlessAppInfo".equalsIgnoreCase(n1.a()) && !"lookupUser".equalsIgnoreCase(n1.a());
    }

    private boolean c(n n1)
    {
        String s = n1.c();
        return "method/auth.login".equalsIgnoreCase(s) || "method/logging.mobilelogs".equalsIgnoreCase(s) || "method/mobile.sendPhoneConfirmationCode".equalsIgnoreCase(s) || "method/user.validateRegistrationData".equalsIgnoreCase(s) || "method/user.confirmPhoneAndRegisterPartialAccount".equalsIgnoreCase(s) || "method/app.loggedoutsettings".equalsIgnoreCase(s) || "method/user.register".equalsIgnoreCase(s) || "fetchSessionlessAppInfo".equalsIgnoreCase(n1.a()) || "lookupUser".equalsIgnoreCase(n1.a());
    }

    public final r a(n n1, l l1, f f1, Object obj)
    {
        Object obj2;
        Object obj3;
        com.facebook.debug.log.b.b(a, "API request executing: %s", new Object[] {
            n1.a()
        });
        obj2 = l1;
        if (l1 == null)
        {
            obj2 = new l();
        }
        obj3 = n1.c();
        com.facebook.http.protocol.av.a[((l) (obj2)).c().ordinal()];
        JVM INSTR tableswitch 1 2: default 76
    //                   1 356
    //                   2 365;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_365;
_L1:
        Object obj1;
        obj1 = (com.facebook.http.c.i)b.b();
        break; /* Loop/switch isn't completed */
_L2:
        obj1 = c;
          goto _L4
        obj1 = d;
_L4:
        if (n1.h())
        {
            l1 = ((com.facebook.http.c.i) (obj1)).c();
        } else
        if (n1.i())
        {
            l1 = ((com.facebook.http.c.i) (obj1)).d();
        } else
        if (((String) (obj3)).startsWith("method"))
        {
            l1 = ((com.facebook.http.c.i) (obj1)).a();
        } else
        {
            l1 = ((com.facebook.http.c.i) (obj1)).b();
        }
        l1.appendEncodedPath(((String) (obj3)));
        if (!c(n1))
        {
            if (((Boolean)h.b()).booleanValue())
            {
                l1.appendQueryParameter("phprof_sample", "1");
                obj3 = (String)f.b();
                if (obj3 != null)
                {
                    l1.appendQueryParameter("phprof_user", ((String) (obj3)));
                }
            }
            if (((Boolean)i.b()).booleanValue())
            {
                l1.appendQueryParameter("teak_sample", "1");
                obj3 = (String)f.b();
                if (obj3 != null)
                {
                    l1.appendQueryParameter("teak_user", ((String) (obj3)));
                }
            }
            if (((Boolean)j.b()).booleanValue())
            {
                l1.appendQueryParameter("wirehog_sample", "1");
                obj3 = (String)f.b();
                if (obj3 != null)
                {
                    l1.appendQueryParameter("wirehog_user", ((String) (obj3)));
                }
            }
        }
        if ("GET".equals(n1.b()))
        {
            if (b(n1))
            {
                obj3 = (ViewerContext)g.b();
                if (obj3 != null)
                {
                    obj3 = ((ViewerContext) (obj3)).b();
                } else
                {
                    obj3 = null;
                }
                if (obj3 == null)
                {
                    throw new u("auth token is null, user logged out?");
                }
                l1.appendQueryParameter("access_token", ((String) (obj3)));
            }
            obj3 = hq.a(o.a(n1));
            if (c(n1))
            {
                a(((List) (obj3)));
            }
            NameValuePair namevaluepair;
            for (obj3 = ((List) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); l1.appendQueryParameter(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj3)).next();
            }

            l1 = new HttpGet(l1.build().toString());
        } else
        if ("POST".equals(n1.b()) || "DELETE".equals(n1.b()))
        {
            l1 = new HttpPost(l1.build().toString());
            if (n1.j() == o.SINGLE_STRING_ENTITY)
            {
                l1.setEntity(a(n1, ((l) (obj2)).a()));
            } else
            {
                l1.setEntity(b(n1, ((l) (obj2)).a()));
            }
        } else
        {
            throw new Exception((new StringBuilder()).append("Unsupported method: ").append(n1.b()).toString());
        }
        if (((l) (obj2)).b() != null)
        {
            l1.setParams(((l) (obj2)).b());
        }
        obj3 = ((com.facebook.http.c.i) (obj1)).e();
        if (obj3 != null)
        {
            l1.addHeader("User-Agent", ((String) (obj3)));
        }
        obj1 = ((com.facebook.http.c.i) (obj1)).f();
        if (obj1 != null)
        {
            l1.addHeader("X-FB-Connection-Type", ((String) (obj1)));
        }
        if (f1 != null && (f1 instanceof g))
        {
            f1 = (g)f1;
            f1.a(obj);
        } else
        {
            f1 = null;
        }
        obj1 = ((l) (obj2)).d();
        if (obj1 != null)
        {
            ((ah) (obj1)).a(l1);
        }
        if (n1.f() != t.JSONPARSER) goto _L6; else goto _L5
_L5:
        l1 = e.a(n1.a(), l1);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_680;
        }
        f1.b(obj);
        f1 = l1.getEntity();
        f1 = l.createJsonParser(f1.getContent());
        f1.setCodec(m);
        l1 = new r(l1.getStatusLine().getStatusCode(), Arrays.asList(l1.getAllHeaders()), f1, n, n1.g());
        n1 = l1;
        if (obj1 != null)
        {
            ((ah) (obj1)).a(null);
            n1 = l1;
        }
_L8:
        return n1;
_L6:
        if (n1.f() != t.JSON)
        {
            break MISSING_BLOCK_LABEL_993;
        }
        obj2 = new al(m, n);
        l1 = (JsonNode)e.a(n1.a(), l1, ((org.apache.http.client.ResponseHandler) (obj2)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_935;
        }
        f1.b(obj);
        f1 = ((al) (obj2)).a();
        l1 = new r(f1.getStatusLine().getStatusCode(), Arrays.asList(f1.getAllHeaders()), l1, n, n1.g());
        n1 = l1;
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        ((ah) (obj1)).a(null);
        return l1;
        if (n1.f() != t.STRING)
        {
            break MISSING_BLOCK_LABEL_1104;
        }
        obj2 = new aw(n);
        l1 = (String)e.a(n1.a(), l1, ((org.apache.http.client.ResponseHandler) (obj2)));
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        f1.b(obj);
        f1 = ((aw) (obj2)).a();
        l1 = new r(f1.getStatusLine().getStatusCode(), Arrays.asList(f1.getAllHeaders()), l1, n, n1.g());
        n1 = l1;
        if (obj1 == null) goto _L8; else goto _L9
_L9:
        ((ah) (obj1)).a(null);
        return l1;
        if (n1.f() != t.ENTITY)
        {
            break MISSING_BLOCK_LABEL_1196;
        }
        l1 = e.a(n1.a(), l1);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_1139;
        }
        f1.b(obj);
        l1 = new r(l1.getStatusLine().getStatusCode(), Arrays.asList(l1.getAllHeaders()), l1.getEntity(), n, n1.g());
        n1 = l1;
        if (obj1 == null) goto _L8; else goto _L10
_L10:
        ((ah) (obj1)).a(null);
        return l1;
        throw new IllegalArgumentException("Unknown api response type");
        n1;
        if (obj1 != null)
        {
            ((ah) (obj1)).a(null);
        }
        throw n1;
    }

    public Object a(af af1, Object obj, l l1)
    {
        Object obj1;
        r r1;
        r1 = a(af1.b(obj), l1, ((f) (af1)), obj);
        obj1 = r1;
        Object obj2 = af1.a(obj, r1);
        l1 = ((l) (obj2));
        r1.e();
        obj1 = r1;
_L1:
        af1.b(obj, ((r) (obj1)));
        return l1;
        obj1;
        obj1 = r1;
        r1.e();
        obj1 = r1;
        r1 = a(af1.a(obj), l1, ((f) (af1)), obj);
        obj1 = r1;
        l1 = ((l) (af1.a(obj, r1)));
        r1.e();
        obj1 = r1;
          goto _L1
        obj1;
        obj1 = r1;
        af1.a(obj, false);
        obj1 = r1;
        r1.e();
        obj1 = r1;
        r1 = a(af1.a(obj), l1, ((f) (af1)), obj);
        obj1 = r1;
        l1 = ((l) (af1.a(obj, r1)));
        r1.e();
        obj1 = r1;
          goto _L1
        af1;
        ((r) (obj1)).e();
        throw af1;
    }

    public Object a(f f1, Object obj, l l1)
    {
        if (f1 instanceof af)
        {
            af af1 = (af)f1;
            if (af1.c(obj))
            {
                return a(af1, obj, l1);
            }
        }
        l1 = a(f1.a(obj), l1, f1, obj);
        f1 = ((f) (f1.a(obj, l1)));
        l1.e();
        return f1;
        f1;
        l1.e();
        throw f1;
    }

}
