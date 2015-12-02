// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            jc, ja, jg

class jb
    implements Iterator
{

    final Iterator a;
    final ja b;

    jb(ja ja, Iterator iterator)
    {
        b = ja;
        a = iterator;
        super();
    }

    public jg a()
    {
        return new jc(this, (java.util.Map.Entry)a.next());
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        a.remove();
    }
}
