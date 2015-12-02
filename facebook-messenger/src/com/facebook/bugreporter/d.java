// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.net.Uri;
import android.os.Build;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.http.a.a.a.a;
import com.facebook.http.protocol.aa;
import com.facebook.http.protocol.ad;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.hq;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.bugreporter:
//            e

public class d
    implements f
{

    private static final Class a = com/facebook/bugreporter/d;

    public d()
    {
    }

    public com.facebook.http.protocol.n a(e e1)
    {
        ArrayList arraylist;
        Object obj;
        arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("desc", e1.a()));
        arraylist.add(new BasicNameValuePair("log", e1.e()));
        arraylist.add(new BasicNameValuePair("format", "json-strings"));
        obj = new ObjectNode(JsonNodeFactory.instance);
        ((ObjectNode) (obj)).put("Git_Hash", e1.g());
        String s = e1.j();
        if (s != null)
        {
            ((ObjectNode) (obj)).put("Git_Branch", s);
        }
        s = e1.i();
        if (s != null)
        {
            ((ObjectNode) (obj)).put("Build_Time", s);
        }
        ((ObjectNode) (obj)).put("Build_Num", e1.h());
        ((ObjectNode) (obj)).put("OS_Version", android.os.Build.VERSION.RELEASE);
        ((ObjectNode) (obj)).put("Manufacturer", Build.MANUFACTURER);
        ((ObjectNode) (obj)).put("Model", Build.MODEL);
        ((ObjectNode) (obj)).put("Locale", Locale.getDefault().getDisplayName(Locale.US));
        ((ObjectNode) (obj)).put("Network_Type", e1.k());
        ((ObjectNode) (obj)).put("Network_Subtype", e1.l());
        arraylist.add(new BasicNameValuePair("info", ((ObjectNode) (obj)).toString()));
        if (e1.f() != null)
        {
            arraylist.add(new BasicNameValuePair("category_id", e1.f()));
        }
        obj = new ArrayList();
        if (e1.b() == null || e1.b().isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        obj1 = e1.b().iterator();
        i = 0;
_L3:
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Uri)((Iterator) (obj1)).next();
        try
        {
            obj2 = new File(new URI(((Uri) (obj2)).toString()));
            if (!((File) (obj2)).exists() || !((File) (obj2)).canRead())
            {
                b.d(a, "Ignoring invalid screen shot file");
                continue; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            b.d(a, "Ignoring invalid screen shot", ((Throwable) (obj2)));
            continue; /* Loop/switch isn't completed */
        }
        String s1 = m.a("screenshot-%d.png", new Object[] {
            Integer.valueOf(i)
        });
        ((List) (obj)).add(new a(s1, new ad(((File) (obj2)), "image/png", s1)));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        obj1 = new StringBuilder();
        java.util.Map.Entry entry;
        for (obj2 = e1.c().a().iterator(); ((Iterator) (obj2)).hasNext(); ((StringBuilder) (obj1)).append(((String)entry.getKey()).replaceAll("[^a-zA-Z0-9_ ]", "_")).append('\t').append((String)entry.getValue()).append('\n'))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
        }

        ((List) (obj)).add(new a("extra_data.txt", new aa(n.c(((StringBuilder) (obj1)).toString()), "text/plain", "extra_data.txt")));
        obj1 = e1.d().a().iterator();
_L10:
        if (!((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        e1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        obj2 = (String)e1.getKey();
        e1 = (String)e1.getValue();
        e1 = new File(new URI(e1));
        if (!((String) (obj2)).endsWith(".jpg") && !((String) (obj2)).endsWith(".jpeg")) goto _L7; else goto _L6
_L6:
        e1 = new ad(e1, "image/jpeg", ((String) (obj2)));
_L8:
        ((List) (obj)).add(new a(((String) (obj2)), e1));
        continue; /* Loop/switch isn't completed */
_L7:
        try
        {
            e1 = new aa(n.c(com.google.common.b.f.b(e1, Charset.defaultCharset())), "text/plain", ((String) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            b.e(a, (new StringBuilder()).append("Ignoring invalid debug attachment: ").append(((String) (obj2))).toString(), e1);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L8; else goto _L5
_L5:
        return com.facebook.http.protocol.n.newBuilder().a("bugReportUpload").b("POST").c("method/bug.create").a(arraylist).a(t.JSON).b(((List) (obj))).k();
        if (true) goto _L10; else goto _L9
_L9:
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((e)obj);
    }

    public Boolean a(e e1, r r1)
    {
        boolean flag = false;
        if (r1.a() != 200)
        {
            b.e(a, m.b("Bug report upload failed: %s", new Object[] {
                m.a("error code: %d, msg: %s", new Object[] {
                    Integer.valueOf(r1.a()), r1.d().toString()
                })
            }));
        } else
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((e)obj, r1);
    }

}
