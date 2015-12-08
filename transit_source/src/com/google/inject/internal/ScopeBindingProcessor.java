// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Scope;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.ScopeBinding;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, Annotations, Errors, InjectorImpl, 
//            State

final class ScopeBindingProcessor extends AbstractProcessor
{

    ScopeBindingProcessor(Errors errors)
    {
        super(errors);
    }

    public Boolean visit(ScopeBinding scopebinding)
    {
        Scope scope = scopebinding.getScope();
        Class class1 = scopebinding.getAnnotationType();
        if (!Annotations.isScopeAnnotation(class1))
        {
            errors.withSource(class1).missingScopeAnnotation();
        }
        if (!Annotations.isRetainedAtRuntime(class1))
        {
            errors.withSource(class1).missingRuntimeRetention(scopebinding.getSource());
        }
        scopebinding = injector.state.getScope((Class)$Preconditions.checkNotNull(class1, "annotation type"));
        if (scopebinding != null)
        {
            errors.duplicateScopes(scopebinding, class1, scope);
        } else
        {
            injector.state.putAnnotation(class1, (Scope)$Preconditions.checkNotNull(scope, "scope"));
        }
        return Boolean.valueOf(true);
    }

    public volatile Object visit(ScopeBinding scopebinding)
    {
        return visit(scopebinding);
    }
}
