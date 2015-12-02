// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b.a;

import android_src.mms.a.b.e;
import org.a.a.b.f;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class a extends DefaultHandler
{

    private f a;
    private Node b;

    public a()
    {
    }

    public void a()
    {
        a = new e();
        b = a;
    }

    public f b()
    {
        return a;
    }

    public void characters(char ac[], int i, int j)
    {
    }

    public void endElement(String s, String s1, String s2)
    {
        b = b.getParentNode();
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
    {
        s = a.createElement(s1);
        if (attributes != null)
        {
            for (int i = 0; i < attributes.getLength(); i++)
            {
                s.setAttribute(attributes.getLocalName(i), attributes.getValue(i));
            }

        }
        b.appendChild(s);
        b = s;
    }
}
