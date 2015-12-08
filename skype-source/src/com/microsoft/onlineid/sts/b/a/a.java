// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            j

public abstract class a
{

    protected final XmlPullParser a;
    protected final String b;
    protected final String c;
    private final j d = h();
    private boolean e;

    public a(XmlPullParser xmlpullparser, String s, String s1)
    {
        e = false;
        a = xmlpullparser;
        b = s1;
        c = s;
    }

    protected static String a(XmlPullParser xmlpullparser)
        throws XmlPullParserException
    {
        int k = xmlpullparser.getEventType();
        if (k != 2 && k != 3)
        {
            throw new XmlPullParserException("Tag name should only be retrieved on a start or end tag.");
        }
        String s = xmlpullparser.getPrefix();
        xmlpullparser = xmlpullparser.getName();
        if (TextUtils.isEmpty(s))
        {
            return xmlpullparser;
        } else
        {
            return (new StringBuilder()).append(s).append(":").append(xmlpullparser).toString();
        }
    }

    public final void a()
        throws IOException, f
    {
        try
        {
            if (e)
            {
                throw new IllegalStateException("Parse has already been called.");
            }
        }
        catch (XmlPullParserException xmlpullparserexception)
        {
            throw new f("XML was either invalid or failed to parse.", xmlpullparserexception, new Object[0]);
        }
        e = true;
        if (d.c() == 0)
        {
            a.require(0, null, null);
            a.next();
        }
        a.require(2, c, b);
        b();
        d.b();
        return;
    }

    protected final boolean a(String s)
        throws XmlPullParserException, IOException
    {
        return d.a(s);
    }

    protected abstract void b()
        throws XmlPullParserException, IOException, f;

    protected final void b(String s)
        throws XmlPullParserException, IOException, f
    {
        d.b(s);
    }

    protected final boolean c()
        throws XmlPullParserException, IOException
    {
        return d.e();
    }

    protected final String d()
        throws XmlPullParserException, IOException, f
    {
        return d.f();
    }

    protected final void e()
        throws XmlPullParserException, IOException
    {
        d.d();
    }

    protected final String f()
        throws XmlPullParserException, IOException
    {
        StringBuilder stringbuilder;
        j j1;
        stringbuilder = new StringBuilder();
        j1 = h();
_L6:
        if (!j1.a())
        {
            break MISSING_BLOCK_LABEL_553;
        }
        a.getEventType();
        JVM INSTR tableswitch 2 4: default 56
    //                   2 69
    //                   3 528
    //                   4 511;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_528;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        a.next();
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append('<').append(a(a));
        int k = a.getNamespaceCount(a.getDepth() - 1);
        int l = a.getNamespaceCount(a.getDepth());
        while (k < l) 
        {
            StringBuilder stringbuilder1 = stringbuilder.append(' ');
            int k1 = a.getEventType();
            if (k1 != 2 && k1 != 3)
            {
                throw new XmlPullParserException("Namespace name should only be retrieved on a start or end tag.");
            }
            k1 = a.getDepth();
            if (k < a.getNamespaceCount(k1 - 1) || k >= a.getNamespaceCount(k1))
            {
                throw new XmlPullParserException("Invalid namespace location.");
            }
            String s = a.getNamespacePrefix(k);
            if (TextUtils.isEmpty(s))
            {
                s = "xmlns";
            } else
            {
                s = (new StringBuilder("xmlns:")).append(s).toString();
            }
            stringbuilder1.append(s).append("=\"").append(a.getNamespaceUri(k)).append('"');
            k++;
        }
        k = 0;
        while (k < a.getAttributeCount()) 
        {
            StringBuilder stringbuilder2 = stringbuilder.append(' ');
            int i1 = a.getEventType();
            if (i1 != 2 && i1 != 3)
            {
                throw new XmlPullParserException("Attribute should only be retrieved on a start or end tag.");
            }
            if (k < 0 || k >= a.getAttributeCount())
            {
                throw new XmlPullParserException("Invalid attribute location.");
            }
            String s2 = a.getAttributePrefix(k);
            String s1 = a.getAttributeName(k);
            if (!TextUtils.isEmpty(s2))
            {
                s1 = (new StringBuilder()).append(s2).append(":").append(s1).toString();
            }
            stringbuilder2.append(s1).append("=\"").append(a.getAttributeValue(k)).append('"');
            k++;
        }
        stringbuilder.append('>');
          goto _L7
_L4:
        stringbuilder.append(a.getText());
          goto _L7
        stringbuilder.append("</").append(a(a)).append('>');
          goto _L7
        stringbuilder.append("</").append(a(a)).append('>');
        return stringbuilder.toString();
    }

    protected final String g()
        throws XmlPullParserException
    {
        return a(a);
    }

    protected final j h()
    {
        return new j(a);
    }

    protected final void i()
    {
        if (!e)
        {
            throw new IllegalStateException("Cannot call this method without calling parse.");
        } else
        {
            return;
        }
    }
}
