// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package com.taplytics:
//            ij

public final class c
    implements Serializable
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c k;
    public static final c l = a("*/*", null);
    public static final c m;
    public static final c n;
    private static final long serialVersionUID = 0x94300d50674e5d48L;
    final String o;
    final Charset p;
    private final NameValuePair q[] = null;

    private c(String s, Charset charset)
    {
        o = s;
        p = charset;
    }

    public static c a(String s)
    {
        return new c(s, null);
    }

    private static c a(String s, Charset charset)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
_L8:
        if (i1 >= s.length()) goto _L2; else goto _L1
_L1:
        if (Character.isWhitespace(s.charAt(i1))) goto _L4; else goto _L3
_L3:
        i1 = ((flag) ? 1 : 0);
_L6:
        if (i1 != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("MIME type").append(" may not be blank").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
        s = ((String)s).toLowerCase(Locale.ROOT);
        if (!b(s))
        {
            throw new IllegalArgumentException("MIME type may not contain reserved characters");
        }
        return new c(s, charset);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static boolean b(String s)
    {
        for (int i1 = 0; i1 < s.length(); i1++)
        {
            char c1 = s.charAt(i1);
            if (c1 == '"' || c1 == ',' || c1 == ';')
            {
                return false;
            }
        }

        return true;
    }

    public final String toString()
    {
        CharArrayBuffer chararraybuffer;
        chararraybuffer = new CharArrayBuffer(64);
        chararraybuffer.append(o);
        if (q == null) goto _L2; else goto _L1
_L1:
        chararraybuffer.append("; ");
        BasicHeaderValueFormatter.DEFAULT.formatParameters(chararraybuffer, q, false);
_L4:
        return chararraybuffer.toString();
_L2:
        if (p != null)
        {
            chararraybuffer.append("; charset=");
            chararraybuffer.append(p.name());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        a = a("application/atom+xml", ij.c);
        b = a("application/x-www-form-urlencoded", ij.c);
        c = a("application/json", ij.a);
        d = a("application/octet-stream", null);
        e = a("application/svg+xml", ij.c);
        f = a("application/xhtml+xml", ij.c);
        g = a("application/xml", ij.c);
        h = a("multipart/form-data", ij.c);
        i = a("text/html", ij.c);
        j = a("text/plain", ij.c);
        k = a("text/xml", ij.c);
        m = j;
        n = d;
    }
}
