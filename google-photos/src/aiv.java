// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class aiv extends DefaultHandler
{

    private aio a;
    private boolean b;
    private String c;

    public aiv(aio aio1)
    {
        b = false;
        c = null;
        a = aio1;
    }

    private static String a(Attributes attributes, String s)
    {
        attributes = attributes.getValue(s);
        if (attributes == null)
        {
            throw new SAXException((new StringBuilder(String.valueOf(s).length() + 32)).append("Required attribute '").append(s).append("' not found!").toString());
        } else
        {
            return attributes;
        }
    }

    private static void a(String s, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder(String.valueOf(s).length() + 32)).append("Required value '").append(s).append("' not specified!").toString());
        } else
        {
            return;
        }
    }

    private void a(Attributes attributes)
    {
        String s = a(attributes, "class");
        c = a(attributes, "name");
        a.a(new aim(s, c));
    }

    private static Object b(Attributes attributes)
    {
        String s = attributes.getValue("stringValue");
        if (s != null)
        {
            return s;
        }
        s = attributes.getValue("booleanValue");
        if (s != null)
        {
            return Boolean.valueOf(Boolean.parseBoolean(s));
        }
        s = attributes.getValue("intValue");
        if (s != null)
        {
            return Integer.valueOf(Integer.parseInt(s));
        }
        s = attributes.getValue("floatValue");
        if (s != null)
        {
            return Float.valueOf(Float.parseFloat(s));
        }
        s = attributes.getValue("floatsValue");
        if (s != null)
        {
            attributes = TextUtils.split(s, ",");
            float af[] = new float[attributes.length];
            for (int i = 0; i < attributes.length; i++)
            {
                af[i] = Float.parseFloat(attributes[i]);
            }

            return af;
        }
        attributes = attributes.getValue("varValue");
        if (attributes != null)
        {
            return new ait(attributes);
        } else
        {
            return null;
        }
    }

    public final void endElement(String s, String s1, String s2)
    {
        if (s1.equals("graph"))
        {
            b = false;
        } else
        if (s1.equals("filter"))
        {
            c = null;
            return;
        }
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
    {
        if (s1.equals("graph"))
        {
            if (b)
            {
                throw new SAXException("Found more than one graph element in XML!");
            } else
            {
                b = true;
                return;
            }
        }
        if (!b)
        {
            throw new SAXException((new StringBuilder(String.valueOf(s1).length() + 50)).append("Encountered '").append(s1).append("' element outside of 'graph' element!").toString());
        }
        if (s1.equals("import"))
        {
            s = a(attributes, "package");
            a.a(new air(s));
            return;
        }
        if (s1.equals("library"))
        {
            s = a(attributes, "name");
            a.a(new aii(s));
            return;
        }
        if (!s1.equals("connect")) goto _L2; else goto _L1
_L1:
        s = attributes.getValue("source");
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.split(":");
        if (s.length != 2) goto _L6; else goto _L5
_L5:
        String s3;
        s2 = s[0];
        s3 = s[1];
_L13:
        s = attributes.getValue("target");
        if (s == null) goto _L8; else goto _L7
_L7:
        s = s.split(":");
        if (s.length != 2) goto _L10; else goto _L9
_L9:
        s1 = s[0];
        s = s[1];
_L11:
        String s5 = attributes.getValue("sourceSlot");
        String s4 = attributes.getValue("targetSlot");
        if (s5 != null)
        {
            s2 = String.valueOf(s5);
            if (s2.length() != 0)
            {
                s2 = "sourceSlot_".concat(s2);
            } else
            {
                s2 = new String("sourceSlot_");
            }
            a.a(new aij(s2, s5));
            attributes = "frame";
        } else
        {
            attributes = s3;
        }
        if (s4 != null)
        {
            s = String.valueOf(s4);
            if (s.length() != 0)
            {
                s = "targetSlot_".concat(s);
            } else
            {
                s = new String("targetSlot_");
            }
            a.a(new aik(s, s4));
            s3 = "frame";
            s1 = s;
        } else
        {
            s3 = s;
        }
        a("sourceFilter", s2);
        a("sourcePort", attributes);
        a("targetFilter", s1);
        a("targetPort", s3);
        a.a(new aip(s2, attributes, s1, s3));
        return;
_L6:
        throw new RuntimeException("'source' tag needs to have format \"filter:port\"! Alternatively, you may use the form 'sourceFilter=\"filter\" sourcePort=\"port\"'.");
_L4:
        s2 = attributes.getValue("sourceFilter");
        s3 = attributes.getValue("sourcePort");
        continue; /* Loop/switch isn't completed */
_L10:
        throw new RuntimeException("'target' tag needs to have format \"filter:port\"! Alternatively, you may use the form 'targetFilter=\"filter\" targetPort=\"port\"'.");
_L8:
        s1 = attributes.getValue("targetFilter");
        s = attributes.getValue("targetPort");
          goto _L11
_L2:
        if (s1.equals("var"))
        {
            s = a(attributes, "name");
            s1 = ((String) (b(attributes)));
            a.a(new ail(s, s1));
            return;
        }
        if (s1.equals("filter"))
        {
            a(attributes);
            return;
        }
        if (s1.equals("metafilter"))
        {
            a(attributes);
            s2 = a(attributes, "graphResource");
            s1 = attributes.getValue("resourceType");
            s = s1;
            if (s1 == null)
            {
                s = "raw";
            }
            s1 = a;
            s = new aiq(c, s2, s);
            ((aio) (s1)).a.add(s);
            return;
        }
        if (s1.equals("input"))
        {
            if (c == null)
            {
                throw new SAXException("Found 'input' element outside of 'filter' element!");
            }
            s = a(attributes, "name");
            s1 = ((String) (b(attributes)));
            if (s1 == null)
            {
                s1 = c;
                throw new SAXException((new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s1).length())).append("No value specified for input '").append(s).append("' of filter '").append(s1).append("'!").toString());
            } else
            {
                a.a(new ais(c, s, s1));
                return;
            }
        }
        throw new SAXException((new StringBuilder(String.valueOf(s1).length() + 23)).append("Unknown XML element '").append(s1).append("'!").toString());
        if (true) goto _L13; else goto _L12
_L12:
    }
}
