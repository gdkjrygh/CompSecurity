// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.utils.ad;
import com.tinder.utils.h;
import com.tinder.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

final class a
    implements com.android.volley.
{

    final ManagerLiveRail a;

    public final void a(Object obj)
    {
        int j;
        j = 0;
        obj = (String)obj;
        a.p = ((String) (obj));
        a.o = XPathFactory.newInstance().newXPath();
        float f;
        Object obj1;
        XPathExpressionException xpathexpressionexception;
        NamedNodeMap namednodemap;
        try
        {
            obj = ManagerLiveRail.b(a);
            a.m = (String)a.o.evaluate(ManagerLiveRail.c(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.b = (String)a.o.evaluate(ManagerLiveRail.d(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.c = (String)a.o.evaluate(ManagerLiveRail.e(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.d = (String)a.o.evaluate(ManagerLiveRail.f(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.e = (String)a.o.evaluate(ManagerLiveRail.g(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.g = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.h(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
            a.h = (String)a.o.evaluate(com.tinder.managers.ManagerLiveRail.i(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
            obj = ManagerLiveRail.b(a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.r.a();
            return;
        }
        a.l = (String)a.o.evaluate(ManagerLiveRail.j(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
_L1:
        obj1 = a.l;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        a.l = (String)a.o.evaluate(ManagerLiveRail.k(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
_L2:
        if (h.a(a.l))
        {
            a.l = null;
        }
        obj = ManagerLiveRail.b(a);
        obj = (NodeList)a.o.evaluate(ManagerLiveRail.l(), ((org.xml.sax.InputSource) (obj)), XPathConstants.NODESET);
        f = ((NodeList) (obj)).getLength();
_L3:
        if ((float)j >= f)
        {
            break MISSING_BLOCK_LABEL_598;
        }
        obj1 = ((NodeList) (obj)).item(j);
        namednodemap = ((Node) (obj1)).getAttributes();
        if (!namednodemap.getNamedItem("type").getNodeValue().equals("video/webm") || Integer.parseInt(namednodemap.getNamedItem("width").getNodeValue()) < ad.a(a.a) && (float)j != f - 1.0F)
        {
            break MISSING_BLOCK_LABEL_891;
        }
        a.i = ((Node) (obj1)).getTextContent();
        break MISSING_BLOCK_LABEL_891;
        xpathexpressionexception;
        a.l = (String)a.o.evaluate(ManagerLiveRail.k(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
          goto _L1
        obj;
        a.l = null;
          goto _L2
        obj;
        a.r.a();
        return;
        obj = ManagerLiveRail.b(a);
        a.f = (String)a.o.evaluate(ManagerLiveRail.m(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
        obj = ManagerLiveRail.b(a);
        a.j = (String)a.o.evaluate(ManagerLiveRail.n(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
        obj = ManagerLiveRail.b(a);
        a.k = (String)a.o.evaluate(ManagerLiveRail.o(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING);
        obj = ManagerLiveRail.b(a);
        obj = ((String)a.o.evaluate(ManagerLiveRail.p(), ((org.xml.sax.InputSource) (obj)), XPathConstants.STRING)).split(":");
        if (obj.length != 3)
        {
            a.r.a();
            return;
        }
        a.n = Integer.parseInt(obj[0]) * 60 * 60;
        ManagerLiveRail managerliverail = a;
        managerliverail.n = managerliverail.n + Integer.parseInt(obj[1]) * 60;
        managerliverail = a;
        j = managerliverail.n;
        managerliverail.n = Integer.parseInt(obj[2]) + j;
        for (obj = (new ArrayList() {

        final ManagerLiveRail._cls2 a;

            
            {
                a = ManagerLiveRail._cls2.this;
                super();
                add(Integer.valueOf(a.a.n));
                add(a.a.h);
                add(a.a.i);
                add(a.a.m);
            }
    }).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (h.a(((Iterator) (obj)).next().toString()))
            {
                a.r.a();
                return;
            }
        }

        toString();
        a.q.a();
        return;
        j++;
          goto _L3
    }

    a(ManagerLiveRail managerliverail)
    {
        a = managerliverail;
        super();
    }
}
