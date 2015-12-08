// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.binder.AnnotatedElementBuilder;

// Referenced classes of package com.google.inject:
//            Binder, TypeLiteral, Key

public interface PrivateBinder
    extends Binder
{

    public abstract AnnotatedElementBuilder expose(TypeLiteral typeliteral);

    public abstract AnnotatedElementBuilder expose(Class class1);

    public abstract void expose(Key key);

    public transient abstract PrivateBinder skipSources(Class aclass[]);

    public abstract PrivateBinder withSource(Object obj);
}
