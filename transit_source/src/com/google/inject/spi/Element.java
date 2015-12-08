// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;

// Referenced classes of package com.google.inject.spi:
//            ElementVisitor

public interface Element
{

    public abstract Object acceptVisitor(ElementVisitor elementvisitor);

    public abstract void applyTo(Binder binder);

    public abstract Object getSource();
}
