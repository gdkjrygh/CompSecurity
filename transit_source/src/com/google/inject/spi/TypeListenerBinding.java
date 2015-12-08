// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.matcher.Matcher;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor, TypeListener

public final class TypeListenerBinding
    implements Element
{

    private final TypeListener listener;
    private final Object source;
    private final Matcher typeMatcher;

    TypeListenerBinding(Object obj, TypeListener typelistener, Matcher matcher)
    {
        source = obj;
        listener = typelistener;
        typeMatcher = matcher;
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).bindListener(typeMatcher, listener);
    }

    public TypeListener getListener()
    {
        return listener;
    }

    public Object getSource()
    {
        return source;
    }

    public Matcher getTypeMatcher()
    {
        return typeMatcher;
    }
}
