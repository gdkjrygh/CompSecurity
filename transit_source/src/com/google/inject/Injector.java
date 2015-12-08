// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject:
//            Module, TypeLiteral, Key, Binding, 
//            MembersInjector, Provider

public interface Injector
{

    public abstract Injector createChildInjector(Iterable iterable);

    public transient abstract Injector createChildInjector(Module amodule[]);

    public abstract List findBindingsByType(TypeLiteral typeliteral);

    public abstract Map getAllBindings();

    public abstract Binding getBinding(Key key);

    public abstract Binding getBinding(Class class1);

    public abstract Map getBindings();

    public abstract Binding getExistingBinding(Key key);

    public abstract Object getInstance(Key key);

    public abstract Object getInstance(Class class1);

    public abstract MembersInjector getMembersInjector(TypeLiteral typeliteral);

    public abstract MembersInjector getMembersInjector(Class class1);

    public abstract Injector getParent();

    public abstract Provider getProvider(Key key);

    public abstract Provider getProvider(Class class1);

    public abstract Map getScopeBindings();

    public abstract Set getTypeConverterBindings();

    public abstract void injectMembers(Object obj);
}
