// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import com.cardinalblue.android.b.g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.StringBody;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.network:
//            g

public final class b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/controller/network/b$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("CREATE_AND_SHARE", 0);
            b = new a("CREATE", 1);
            c = new a("UPDATE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final a a;
    private final String b = "collages/create_and_share";
    private final List c;
    private String d;
    private byte e[];
    private byte f[];

    public b(a a1)
        throws com.cardinalblue.android.piccollage.controller.network.g
    {
        c = new ArrayList();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 60
    //                   2 72
    //                   3 72;
           goto _L1 _L2 _L3 _L3
_L1:
        throw new com.cardinalblue.android.piccollage.controller.network.g(a1.name());
_L2:
_L5:
        a = a1;
        return;
_L3:
        b = "collages";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(MultipartEntity multipartentity)
    {
        if (multipartentity == null)
        {
            throw new IllegalStateException("Collages request must have entity!!!");
        }
        if (e == null)
        {
            throw new IllegalStateException("Create or update collage to server must have image data");
        } else
        {
            multipartentity.addPart("image", new ByteArrayBody(e, "image/jpeg", "collage.jpeg"));
            return;
        }
    }

    private void b(MultipartEntity multipartentity)
    {
        if (multipartentity == null)
        {
            throw new IllegalStateException("Collages request must have entity!!!");
        }
        if (f == null)
        {
            switch (_cls1.a[a.ordinal()])
            {
            case 2: // '\002'
            default:
                return;

            case 1: // '\001'
            case 3: // '\003'
                throw new IllegalStateException("Create or update collage to server must have image data");
            }
        } else
        {
            multipartentity.addPart("struct_json", new ByteArrayBody(f, "metadata.json"));
            return;
        }
    }

    private void c(MultipartEntity multipartentity)
        throws UnsupportedEncodingException
    {
        Charset charset = Charset.forName("utf-8");
        String s;
        NameValuePair namevaluepair;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); multipartentity.addPart(namevaluepair.getName(), new StringBody(s, "text/plain", charset)))
        {
            namevaluepair = (NameValuePair)iterator.next();
            String s1 = namevaluepair.getValue();
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
        }

    }

    public b a(String s)
    {
        d = s;
        return this;
    }

    public b a(List list)
    {
        c.addAll(list);
        return this;
    }

    public b a(byte abyte0[])
    {
        e = abyte0;
        return this;
    }

    public transient b a(NameValuePair anamevaluepair[])
    {
        Collections.addAll(c, anamevaluepair);
        return this;
    }

    public HttpURLConnection a()
    {
        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 3: default 189
    //                   1 122
    //                   2 122
    //                   3 156;
           goto _L1 _L2 _L2 _L3
_L1:
        break MISSING_BLOCK_LABEL_189;
_L4:
        Object obj;
        MultipartEntity multipartentity = new MultipartEntity();
        a(multipartentity);
        b(multipartentity);
        c(multipartentity);
        ((HttpURLConnection) (obj)).addRequestProperty("Content-length", String.valueOf(multipartentity.getContentLength()));
        ((HttpURLConnection) (obj)).addRequestProperty(multipartentity.getContentType().getName(), multipartentity.getContentType().getValue());
        ((HttpURLConnection) (obj)).setDoOutput(true);
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        multipartentity.writeTo(bufferedoutputstream);
        bufferedoutputstream.close();
        return ((HttpURLConnection) (obj));
_L2:
        try
        {
            obj = (HttpURLConnection)(new URL(g.a(d, b))).openConnection();
            ((HttpURLConnection) (obj)).setRequestMethod("POST");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
          goto _L4
_L3:
        obj = (HttpURLConnection)(new URL(d)).openConnection();
        ((HttpURLConnection) (obj)).setRequestMethod("PUT");
          goto _L4
        obj = null;
          goto _L4
    }

    public b b(byte abyte0[])
    {
        f = abyte0;
        return this;
    }
}
