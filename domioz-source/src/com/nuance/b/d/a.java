// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.d;

import android.util.Xml;
import com.nuance.b.b.az;
import com.nuance.b.b.v;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package com.nuance.b.d:
//            b

public final class a
{

    private static final Pattern g = Pattern.compile("(((((([a-z]){2,3})(\\-(([a-z]){3,3}(\\-([a-z]){3,3}){0,2}))?)|(([a-z]){4,8}))(\\-(([a-z]){4,4}))?(\\-((([a-z]){2,2})|(([0-9]){3,3})))?(\\-(((([a-z])|([0-9])){5,8})|(([0-9])(([a-z])|([0-9])){3,3})))*(\\-((([0-9])|[a-wy-z])(\\-(([a-z])|([0-9])){2,8})+))*(\\-(x(\\-(([a-z])|([0-9])){1,8})+))?)|(x(\\-(([a-z])|([0-9])){1,8})+)|((en-gb-oed|i-ami|i-bnn|i-default|i-enochian|i-hak|i-klingon|i-lux|i-mingo|i-navajo|i-pwn|i-tao|i-tay|i-tsu|sgn-be-fr|sgn-be-nl|sgn-ch-de)|(art-lojban|cel-gaulish|no-bok|no-nyn|zh-guoyu|zh-hakka|zh-min|zh-min-nan|zh-xiang)))");
    private StringWriter a;
    private XmlSerializer b;
    private String c;
    private int d;
    private int e;
    private final b f;

    private a(b b1)
    {
        d = 0;
        e = 0;
        f = b1;
        a = new StringWriter();
        b = Xml.newSerializer();
        try
        {
            b.setOutput(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", b1);
        }
    }

    public static a a(String s, boolean flag)
    {
        return a(s, flag, b());
    }

    private static a a(String s, boolean flag, b b1)
    {
        if (s == null)
        {
            throw new NullPointerException("xmlLang cannot be null");
        }
        s = s.replace('_', '-');
        Object obj = s.toLowerCase(Locale.US);
        boolean flag1;
        if ("en-us".equals(obj) || "en-uk".equals(obj))
        {
            flag1 = true;
        } else
        {
            flag1 = g.matcher(((CharSequence) (obj))).matches();
        }
        if (!flag1)
        {
            throw new IllegalArgumentException((new StringBuilder("xmlLang '")).append(s).append("' does not match pattern described in BCP 47.").toString());
        }
        obj = new a(b1);
        try
        {
            ((a) (obj)).b.startDocument("UTF-8", null);
            ((a) (obj)).b.startTag(null, "speak");
            ((a) (obj)).b.attribute(null, "version", "1.1");
            ((a) (obj)).b.attribute(null, "xml:lang", s);
            ((a) (obj)).b.attribute(null, "xmlns", "http://www.w3.org/2001/10/synthesis");
            ((a) (obj)).b.attribute(null, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            ((a) (obj)).b.attribute(null, "xsi:schemaLocation", "http://www.w3.org/2001/10/synthesis http://www.w3.org/TR/speech-synthesis11/synthesis.xsd");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", s);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        ((a) (obj)).b.startTag(null, "meta");
        ((a) (obj)).b.attribute(null, "name", "secure_context");
        ((a) (obj)).b.attribute(null, "content", "1");
        ((a) (obj)).b.endTag(null, "meta");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        ((a) (obj)).a(b1);
        return ((a) (obj));
    }

    public static String a(String s, String s1)
    {
        s = a(s, false, b());
        s.b(s1);
        return s.a();
    }

    private static b b()
    {
        String s = v.r().j().q();
        if (s != null)
        {
            return new b(s);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        if (b == null)
        {
            return toString();
        }
        String s;
        try
        {
            s = b.getName();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", ioexception);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        b.endTag(null, s);
        s = b.getName();
        break MISSING_BLOCK_LABEL_22;
        b.endDocument();
        b.flush();
        c = a.toString();
        b = null;
        a = null;
        s = toString();
        return s;
    }

    public final void a(b b1)
    {
        if (b == null)
        {
            throw new IllegalStateException("Cannot changeVoice. SsmlBuilder already closed.");
        }
        if (b1 == null)
        {
            throw new NullPointerException("voice is null");
        }
        String s;
        try
        {
            if (d <= 0)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            s = b.getName();
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", b1);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if ("voice".equals(s))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        b.endTag(null, s);
        if ("lang".equals(s))
        {
            e = e - 1;
        }
        s = b.getName();
        break MISSING_BLOCK_LABEL_48;
        b.endTag(null, "voice");
        d = d - 1;
        b1.a(b);
        d = d + 1;
        return;
    }

    public final void a(String s)
    {
        if (b == null)
        {
            throw new IllegalStateException("Cannot addSsml. SsmlBuilder already closed.");
        }
        if (s == null)
        {
            throw new NullPointerException("ssml is null");
        }
        try
        {
            b.flush();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", s);
        }
        a.append(s);
    }

    public final void b(String s)
    {
        if (b == null)
        {
            throw new IllegalStateException("Cannot addText. SsmlBuilder already closed.");
        }
        if (s == null)
        {
            throw new NullPointerException("text is null");
        }
        try
        {
            b.text(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("SsmlBuilder IOException can't happen.", s);
        }
    }

    public final String toString()
    {
        if (a != null)
        {
            try
            {
                b.flush();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException("SsmlBuilder IOException can't happen.", ioexception);
            }
            return a.toString();
        } else
        {
            return c;
        }
    }

}
