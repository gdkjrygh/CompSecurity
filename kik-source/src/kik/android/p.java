// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.m.h;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Vector;
import kik.a.e.v;
import kik.a.f.k;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.net.a.i;
import kik.android.net.a.j;
import kik.android.net.d;
import kik.android.util.DeviceUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.c.b;
import org.c.c;

public final class p
{
    public static final class a
    {

        public int a;

        public a()
        {
        }
    }


    private static final b a = c.a("AndroidPhotoHandler");
    private static Vector b = new Vector();

    public static d a(String s, z z1)
    {
        Object obj;
        int l;
        int i1;
        obj = null;
        i1 = -1;
        l = i1;
        z1 = new i(s, z1);
        l = i1;
        z1.a();
        l = i1;
        z1 = a(((HttpUriRequest) (z1)));
        l = i1;
        i1 = z1.getStatusLine().getStatusCode();
        if (i1 != 200) goto _L2; else goto _L1
_L1:
        l = i1;
        s = z1.getHeaders("Content-Length");
        l = i1;
        if (s.length != 1)
        {
            return null;
        }
        l = i1;
        long l1 = Long.parseLong(s[0].getValue());
        l = i1;
        s = h.a(z1.getEntity());
        if (s == null) goto _L4; else goto _L3
_L3:
        l = i1;
        int j1 = s.length;
        if ((long)j1 != l1) goto _L4; else goto _L5
_L5:
        l = i1;
_L6:
        return new d(s, l);
_L2:
        l = i1;
        (new StringBuilder("Unexpected response code while downloading picture: ")).append(i1).append(" at url: ").append(s);
        l = i1;
        s = obj;
        continue; /* Loop/switch isn't completed */
        s;
        s = obj;
        if (true) goto _L6; else goto _L4
_L4:
        s = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static a a(Object obj, String s, k k1, boolean flag, v v)
    {
        v = b(obj, k1, v);
        if (s != null)
        {
            s = (new StringBuilder()).append(k1.e()).append("?g=").append(s);
            if (flag)
            {
                obj = "&silent=1";
            } else
            {
                obj = "";
            }
            v.setURI(URI.create(s.append(((String) (obj))).toString()));
        }
        return a(((j) (v)));
    }

    public static a a(Object obj, k k1, v v)
    {
        return a(b(obj, k1, v));
    }

    private static a a(j j1)
    {
        a a1 = new a();
        int l = -1;
        j1 = a(((HttpUriRequest) (j1)));
        if (j1 != null)
        {
            l = j1.getStatusLine().getStatusCode();
        }
        a1.a = l;
        return a1;
    }

    private static HttpResponse a(HttpUriRequest httpurirequest)
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        httpurirequest.setHeader("User-Agent", KikApplication.a(System.getProperty("http.agent")));
        return defaulthttpclient.execute(httpurirequest, basichttpcontext);
    }

    private static j b(Object obj, k k1, v v)
    {
        Object obj1 = (File)obj;
        obj = new byte[(int)((File) (obj1)).length()];
        obj1 = new FileInputStream(((File) (obj1)));
        ((FileInputStream) (obj1)).read(((byte []) (obj)));
        ((FileInputStream) (obj1)).close();
        k1 = k1.e();
        v = z.b(v);
        obj = new ByteArrayEntity(((byte []) (obj)));
        k1 = new j(k1, v);
        k1.addHeader("User-Agent", DeviceUtils.a("Content"));
        k1.setEntity(((org.apache.http.HttpEntity) (obj)));
        k1.a();
        return k1;
    }

}
