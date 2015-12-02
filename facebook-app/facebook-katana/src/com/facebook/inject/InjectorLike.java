// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.inject.Key;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.facebook.inject:
//            FbInjector, Lazy, AssistedProvider

public interface InjectorLike
{

    public abstract FbInjector getApplicationInjector();

    public abstract Map getBinders();

    public abstract Provider getContextAwareProvider(Key key);

    public abstract Provider getContextAwareProvider(Class class1);

    public abstract Provider getContextAwareProvider(Class class1, Class class2);

    public abstract FbInjector getInjector();

    public abstract Object getInstance(Key key);

    public abstract Object getInstance(Class class1);

    public abstract Object getInstance(Class class1, Class class2);

    public abstract Lazy getLazy(Key key);

    public abstract Lazy getLazy(Class class1);

    public abstract Lazy getLazy(Class class1, Class class2);

    public abstract Lazy getLazySet(Class class1);

    public abstract Lazy getLazySet(Class class1, Class class2);

    public abstract FbInjector getModuleInjector(Class class1);

    public abstract Object getNamedInstance(Class class1, String s);

    public abstract AssistedProvider getOnDemandAssistedProviderForStaticDi(Class class1);

    public abstract int getProcessIdentifier();

    public abstract Provider getProvider(Key key);

    public abstract Provider getProvider(Class class1);

    public abstract Provider getProvider(Class class1, Class class2);

    public abstract Set getSet(Class class1);

    public abstract Set getSet(Class class1, Class class2);

    public abstract Provider getSetProvider(Class class1);

    public abstract Provider getSetProvider(Class class1, Class class2);

    public abstract boolean hasBinding(Key key);

    public abstract boolean hasBinding(Class class1);

    public abstract boolean hasBinding(Class class1, Class class2);

    public abstract boolean hasNamedBinding(Class class1, String s);
}
