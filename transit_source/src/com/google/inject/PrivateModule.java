// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.AnnotatedConstantBindingBuilder;
import com.google.inject.binder.AnnotatedElementBuilder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.Message;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeListener;

// Referenced classes of package com.google.inject:
//            Module, PrivateBinder, Binder, TypeLiteral, 
//            Key, Scope, Stage, MembersInjector, 
//            Provider

public abstract class PrivateModule
    implements Module
{

    private PrivateBinder binder;

    public PrivateModule()
    {
    }

    protected final void addError(Message message)
    {
        binder.addError(message);
    }

    protected final transient void addError(String s, Object aobj[])
    {
        binder.addError(s, aobj);
    }

    protected final void addError(Throwable throwable)
    {
        binder.addError(throwable);
    }

    protected final AnnotatedBindingBuilder bind(TypeLiteral typeliteral)
    {
        return binder.bind(typeliteral);
    }

    protected final AnnotatedBindingBuilder bind(Class class1)
    {
        return binder.bind(class1);
    }

    protected final LinkedBindingBuilder bind(Key key)
    {
        return binder.bind(key);
    }

    protected final AnnotatedConstantBindingBuilder bindConstant()
    {
        return binder.bindConstant();
    }

    protected void bindListener(Matcher matcher, TypeListener typelistener)
    {
        binder.bindListener(matcher, typelistener);
    }

    protected final void bindScope(Class class1, Scope scope)
    {
        binder.bindScope(class1, scope);
    }

    protected final PrivateBinder binder()
    {
        return binder;
    }

    protected abstract void configure();

    public final void configure(Binder binder1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (binder != null)
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Re-entry is not allowed.");
        binder = (PrivateBinder)binder1.skipSources(new Class[] {
            com/google/inject/PrivateModule
        });
        configure();
        binder = null;
        this;
        JVM INSTR monitorexit ;
        return;
        binder1;
        binder = null;
        throw binder1;
        binder1;
        this;
        JVM INSTR monitorexit ;
        throw binder1;
    }

    protected final void convertToTypes(Matcher matcher, TypeConverter typeconverter)
    {
        binder.convertToTypes(matcher, typeconverter);
    }

    protected final Stage currentStage()
    {
        return binder.currentStage();
    }

    protected final AnnotatedElementBuilder expose(TypeLiteral typeliteral)
    {
        return binder.expose(typeliteral);
    }

    protected final AnnotatedElementBuilder expose(Class class1)
    {
        return binder.expose(class1);
    }

    protected final void expose(Key key)
    {
        binder.expose(key);
    }

    protected MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        return binder.getMembersInjector(typeliteral);
    }

    protected MembersInjector getMembersInjector(Class class1)
    {
        return binder.getMembersInjector(class1);
    }

    protected final Provider getProvider(Key key)
    {
        return binder.getProvider(key);
    }

    protected final Provider getProvider(Class class1)
    {
        return binder.getProvider(class1);
    }

    protected final void install(Module module)
    {
        binder.install(module);
    }

    protected final void requestInjection(Object obj)
    {
        binder.requestInjection(obj);
    }

    protected final transient void requestStaticInjection(Class aclass[])
    {
        binder.requestStaticInjection(aclass);
    }

    protected final void requireBinding(Key key)
    {
        binder.getProvider(key);
    }

    protected final void requireBinding(Class class1)
    {
        binder.getProvider(class1);
    }
}
