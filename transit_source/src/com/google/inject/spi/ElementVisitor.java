// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binding;

// Referenced classes of package com.google.inject.spi:
//            DisableCircularProxiesOption, InjectionRequest, MembersInjectorLookup, Message, 
//            PrivateElements, ProviderLookup, RequireExplicitBindingsOption, ScopeBinding, 
//            StaticInjectionRequest, TypeConverterBinding, TypeListenerBinding

public interface ElementVisitor
{

    public abstract Object visit(Binding binding);

    public abstract Object visit(DisableCircularProxiesOption disablecircularproxiesoption);

    public abstract Object visit(InjectionRequest injectionrequest);

    public abstract Object visit(MembersInjectorLookup membersinjectorlookup);

    public abstract Object visit(Message message);

    public abstract Object visit(PrivateElements privateelements);

    public abstract Object visit(ProviderLookup providerlookup);

    public abstract Object visit(RequireExplicitBindingsOption requireexplicitbindingsoption);

    public abstract Object visit(ScopeBinding scopebinding);

    public abstract Object visit(StaticInjectionRequest staticinjectionrequest);

    public abstract Object visit(TypeConverterBinding typeconverterbinding);

    public abstract Object visit(TypeListenerBinding typelistenerbinding);
}
