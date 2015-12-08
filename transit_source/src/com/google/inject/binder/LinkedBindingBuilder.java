// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.binder;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import java.lang.reflect.Constructor;

// Referenced classes of package com.google.inject.binder:
//            ScopedBindingBuilder

public interface LinkedBindingBuilder
    extends ScopedBindingBuilder
{

    public abstract ScopedBindingBuilder to(Key key);

    public abstract ScopedBindingBuilder to(TypeLiteral typeliteral);

    public abstract ScopedBindingBuilder to(Class class1);

    public abstract ScopedBindingBuilder toConstructor(Constructor constructor);

    public abstract ScopedBindingBuilder toConstructor(Constructor constructor, TypeLiteral typeliteral);

    public abstract void toInstance(Object obj);

    public abstract ScopedBindingBuilder toProvider(Key key);

    public abstract ScopedBindingBuilder toProvider(Provider provider);

    public abstract ScopedBindingBuilder toProvider(TypeLiteral typeliteral);

    public abstract ScopedBindingBuilder toProvider(Class class1);
}
