// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.Binder;
import com.google.inject.spi.DefaultElementVisitor;
import com.google.inject.spi.Element;
import java.util.Iterator;

// Referenced classes of package com.google.inject.util:
//            Modules

private static class binder extends DefaultElementVisitor
{

    protected final Binder binder;

    protected volatile Object visitOther(Element element)
    {
        return visitOther(element);
    }

    protected Void visitOther(Element element)
    {
        element.applyTo(binder);
        return null;
    }

    void writeAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((Element)iterable.next()).acceptVisitor(this)) { }
    }

    (Binder binder1)
    {
        binder = binder1;
    }
}
