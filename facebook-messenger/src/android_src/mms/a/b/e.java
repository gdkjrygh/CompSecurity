// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b;

import android_src.mms.a.b;
import org.a.a.b.c;
import org.a.a.b.f;
import org.a.a.b.g;
import org.a.a.b.h;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

// Referenced classes of package android_src.mms.a.b:
//            f, o, i, h, 
//            p, n, m, k, 
//            g

public class e extends b
    implements f
{

    c b;

    public e()
    {
    }

    public g a()
    {
        Object obj;
label0:
        {
            Node node = getFirstChild();
            if (node != null)
            {
                obj = node;
                if (node instanceof g)
                {
                    break label0;
                }
            }
            obj = createElement("smil");
            appendChild(((Node) (obj)));
        }
        return (g)obj;
    }

    public void a(float f1)
    {
        b.a(f1);
    }

    public g b()
    {
        Object obj;
label0:
        {
            g g1 = a();
            Node node = g1.getFirstChild();
            if (node != null)
            {
                obj = node;
                if (node instanceof g)
                {
                    break label0;
                }
            }
            obj = createElement("head");
            g1.appendChild(((Node) (obj)));
        }
        return (g)obj;
    }

    public g c()
    {
        Object obj;
label0:
        {
            g g1 = a();
            Node node = b().getNextSibling();
            if (node != null)
            {
                obj = node;
                if (node instanceof g)
                {
                    break label0;
                }
            }
            obj = createElement("body");
            g1.appendChild(((Node) (obj)));
        }
        b = new android_src.mms.a.b.f(this, (g)obj);
        return (g)obj;
    }

    public Element createElement(String s)
    {
        s = s.toLowerCase();
        if (s.equals("text") || s.equals("img") || s.equals("video"))
        {
            return new o(this, s);
        }
        if (s.equals("audio"))
        {
            return new i(this, s);
        }
        if (s.equals("layout"))
        {
            return new android_src.mms.a.b.h(this, s);
        }
        if (s.equals("root-layout"))
        {
            return new p(this, s);
        }
        if (s.equals("region"))
        {
            return new n(this, s);
        }
        if (s.equals("ref"))
        {
            return new m(this, s);
        }
        if (s.equals("par"))
        {
            return new k(this, s);
        } else
        {
            return new android_src.mms.a.b.g(this, s);
        }
    }

    public h d()
    {
        g g1 = b();
        Node node;
        for (node = g1.getFirstChild(); node != null && !(node instanceof h); node = node.getNextSibling()) { }
        Object obj = node;
        if (node == null)
        {
            obj = new android_src.mms.a.b.h(this, "layout");
            g1.appendChild(((Node) (obj)));
        }
        return (h)obj;
    }

    public Element getDocumentElement()
    {
        return a();
    }
}
