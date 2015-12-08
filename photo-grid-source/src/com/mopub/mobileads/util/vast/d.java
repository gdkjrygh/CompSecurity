// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import org.w3c.dom.Node;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            XmlUtils, b

final class d
{

    final b a;
    private final Node b;

    d(b b1, Node node)
    {
        a = b1;
        super();
        if (node == null)
        {
            throw new IllegalArgumentException("Media node cannot be null");
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
        return XmlUtils.c(b, "type");
    }

    final String d()
    {
        return XmlUtils.a(b);
    }
}
