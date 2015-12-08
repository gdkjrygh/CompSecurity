// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import android.util.Xml;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.a.g;
import com.microsoft.onlineid.sts.t;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, j

public final class r
{

    private final t a = new t();
    private final byte b[];
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private byte e[];
    private String f;
    private String g;

    public r(byte abyte0[])
    {
        b = abyte0;
    }

    static String a(r r1)
    {
        return r1.f;
    }

    static String a(r r1, String s)
    {
        r1.f = s;
        return s;
    }

    static void a(r r1, a a1)
        throws f, IOException, XmlPullParserException
    {
        r1.g = a1.f();
        a1 = Xml.newPullParser();
        a1.setInput(new StringReader(r1.g));
        (r1. new a(a1, "SignedInfo") {

            final r d;

            protected final void b()
                throws XmlPullParserException, IOException, f
            {
                String s;
                Object obj;
                for (; a("Reference"); r.c(d).put(s, obj))
                {
                    s = a.getAttributeValue(null, "URI");
                    obj = h();
                    if (!((j) (obj)).a("DigestValue"))
                    {
                        throw new g((new StringBuilder("Missing DigestValue for URI ")).append(s).toString(), new Object[0]);
                    }
                    obj = ((j) (obj)).f();
                    if (TextUtils.isEmpty(s) || !s.startsWith("#"))
                    {
                        throw new g((new StringBuilder("Invalid digest URI: ")).append(s).toString(), new Object[0]);
                    }
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        throw new g((new StringBuilder("Invalid digest: ")).append(((String) (obj))).toString(), new Object[0]);
                    }
                    s = s.substring(1);
                }

            }

            
            {
                d = r.this;
                super(xmlpullparser, null, s);
            }
        }).a();
    }

    static String b(r r1)
    {
        return r1.g;
    }

    static Map c(r r1)
    {
        return r1.d;
    }

    public final XmlPullParser a(a a1)
        throws XmlPullParserException, IOException, f
    {
        Object obj = a1.a;
        ((XmlPullParser) (obj)).require(2, null, null);
        String s = ((XmlPullParser) (obj)).getAttributeValue(null, "Id");
        if (!TextUtils.isEmpty(s))
        {
            a1 = a1.f();
            obj = a.a(a1);
            if (c.containsKey(s))
            {
                throw new g((new StringBuilder("Duplicate element for Id=\"")).append(s).append("\"").toString(), new Object[0]);
            }
            c.put(s, obj);
            obj = Xml.newPullParser();
            ((XmlPullParser) (obj)).setInput(new StringReader(a1));
        }
        return ((XmlPullParser) (obj));
    }

    public final void a(byte abyte0[])
    {
        e = abyte0;
    }

    public final boolean a()
    {
        return b != null && !TextUtils.isEmpty(g) && e != null && !TextUtils.isEmpty(f);
    }

    public final void b()
        throws g
    {
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (d.containsKey(entry.getKey()))
            {
                String s1 = (String)d.remove(entry.getKey());
                if (!s1.equals(entry.getValue()))
                {
                    throw new g(String.format(Locale.US, "Digest mismatch: id=\"%s\", expected=\"%s\", actual=\"%s\"", new Object[] {
                        entry.getKey(), s1, entry.getValue()
                    }), new Object[0]);
                }
            }
        }

        if (!d.isEmpty())
        {
            throw new g((new StringBuilder("Failed to compute digests for element ids ")).append(Arrays.toString(d.keySet().toArray())).toString(), new Object[0]);
        }
        if (TextUtils.isEmpty(g))
        {
            throw new g("<SignedInfo> node was missing.", new Object[0]);
        }
        if (e == null || e.length == 0)
        {
            throw new g("SignKey nonce was missing or invalid.", new Object[0]);
        }
        String s = t.a(b, e, g);
        if (!f.equals(s))
        {
            throw new g(String.format(Locale.US, "Signature mismatch: expected=\"%s\", actual=\"%s\"", new Object[] {
                f, s
            }), new Object[0]);
        } else
        {
            return;
        }
    }

    public final void b(a a1)
        throws f, IOException, XmlPullParserException
    {
        (new a(a1.a, "http://www.w3.org/2000/09/xmldsig#", "Signature") {

            final r d;

            protected final void b()
                throws XmlPullParserException, IOException, f
            {
                while (c()) 
                {
                    String s = g();
                    if ("SignedInfo".equals(s))
                    {
                        r.a(d, this);
                    } else
                    if ("SignatureValue".equals(s))
                    {
                        r.a(d, d());
                    } else
                    {
                        e();
                    }
                }
                if (TextUtils.isEmpty(r.a(d)))
                {
                    throw new g("<SignatureValue> node was missing.", new Object[0]);
                }
                if (TextUtils.isEmpty(r.b(d)))
                {
                    throw new g("<SignedInfo> node was missing.", new Object[0]);
                } else
                {
                    return;
                }
            }

            
            {
                d = r.this;
                super(xmlpullparser, s, s1);
            }
        }).a();
    }
}
