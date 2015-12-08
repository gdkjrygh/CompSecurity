// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            XmlUtils, b

final class c
{

    final b a;
    private final Node b;

    c(b b1, Node node)
    {
        a = b1;
        super();
        if (node == null)
        {
            throw new IllegalArgumentException("Companion node cannot be null");
        } else
        {
            b = node;
            return;
        }
    }

    final Integer a()
    {
        return XmlUtils.b(b, "width");
    }

    final Integer b()
    {
        return XmlUtils.b(b, "height");
    }

    final String c()
    {
        return XmlUtils.c(XmlUtils.a(b, "StaticResource"), "creativeType");
    }

    final String d()
    {
        return XmlUtils.a(XmlUtils.a(b, "StaticResource"));
    }

    final String e()
    {
        return XmlUtils.a(XmlUtils.a(b, "CompanionClickThrough"));
    }

    final List f()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = XmlUtils.a(b, "TrackingEvents");
        if (obj == null)
        {
            return arraylist;
        }
        obj = XmlUtils.a(((Node) (obj)), "Tracking", "event", Arrays.asList(new String[] {
            "creativeView"
        })).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Node node = (Node)((Iterator) (obj)).next();
            if (node.getFirstChild() != null)
            {
                arraylist.add(node.getFirstChild().getNodeValue().trim());
            }
        } while (true);
        return arraylist;
    }
}
