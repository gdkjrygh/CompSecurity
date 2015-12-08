// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.PrivateElements;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, CreationListener, ErrorsException, BindingImpl, 
//            InjectorImpl, State, Errors, InternalContext

final class ExposedKeyFactory
    implements InternalFactory, CreationListener
{

    private BindingImpl _flddelegate;
    private final Key key;
    private final PrivateElements privateElements;

    ExposedKeyFactory(Key key1, PrivateElements privateelements)
    {
        key = key1;
        privateElements = privateelements;
    }

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return _flddelegate.getInternalFactory().get(errors, internalcontext, dependency, flag);
    }

    public void notify(Errors errors)
    {
        BindingImpl bindingimpl = ((InjectorImpl)privateElements.getInjector()).state.getExplicitBinding(key);
        if (bindingimpl.getInternalFactory() == this)
        {
            errors.withSource(bindingimpl.getSource()).exposedButNotBound(key);
            return;
        } else
        {
            _flddelegate = bindingimpl;
            return;
        }
    }
}
