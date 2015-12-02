// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b;

import android_src.mms.c.a;
import android_src.mms.c.b;
import org.a.a.b.n;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package android_src.mms.a.b:
//            g, e

public class h extends g
    implements org.a.a.b.h
{

    h(e e, String s)
    {
        super(e, s);
    }

    public n b()
    {
        Object obj = getChildNodes();
        int j = ((NodeList) (obj)).getLength();
        n n1 = null;
        for (int i = 0; i < j; i++)
        {
            if (((NodeList) (obj)).item(i).getNodeName().equals("root-layout"))
            {
                n1 = (n)((NodeList) (obj)).item(i);
            }
        }

        obj = n1;
        if (n1 == null)
        {
            obj = (n)getOwnerDocument().createElement("root-layout");
            ((n) (obj)).b(a.a().b().a());
            ((n) (obj)).a(a.a().b().b());
            appendChild(((Node) (obj)));
        }
        return ((n) (obj));
    }
}
