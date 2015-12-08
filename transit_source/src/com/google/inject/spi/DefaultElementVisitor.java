// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binding;

// Referenced classes of package com.google.inject.spi:
//            ElementVisitor, DisableCircularProxiesOption, InjectionRequest, MembersInjectorLookup, 
//            Message, PrivateElements, ProviderLookup, RequireExplicitBindingsOption, 
//            ScopeBinding, StaticInjectionRequest, TypeConverterBinding, TypeListenerBinding, 
//            Element

public abstract class DefaultElementVisitor
    implements ElementVisitor
{

    public DefaultElementVisitor()
    {
    }

    public Object visit(Binding binding)
    {
        return visitOther(binding);
    }

    public Object visit(DisableCircularProxiesOption disablecircularproxiesoption)
    {
        return visitOther(disablecircularproxiesoption);
    }

    public Object visit(InjectionRequest injectionrequest)
    {
        return visitOther(injectionrequest);
    }

    public Object visit(MembersInjectorLookup membersinjectorlookup)
    {
        return visitOther(membersinjectorlookup);
    }

    public Object visit(Message message)
    {
        return visitOther(message);
    }

    public Object visit(PrivateElements privateelements)
    {
        return visitOther(privateelements);
    }

    public Object visit(ProviderLookup providerlookup)
    {
        return visitOther(providerlookup);
    }

    public Object visit(RequireExplicitBindingsOption requireexplicitbindingsoption)
    {
        return visitOther(requireexplicitbindingsoption);
    }

    public Object visit(ScopeBinding scopebinding)
    {
        return visitOther(scopebinding);
    }

    public Object visit(StaticInjectionRequest staticinjectionrequest)
    {
        return visitOther(staticinjectionrequest);
    }

    public Object visit(TypeConverterBinding typeconverterbinding)
    {
        return visitOther(typeconverterbinding);
    }

    public Object visit(TypeListenerBinding typelistenerbinding)
    {
        return visitOther(typelistenerbinding);
    }

    protected Object visitOther(Element element)
    {
        return null;
    }
}
