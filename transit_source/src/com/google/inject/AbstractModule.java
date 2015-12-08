// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.AnnotatedConstantBindingBuilder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.Message;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeListener;

// Referenced classes of package com.google.inject:
//            Module, Binder, TypeLiteral, Key, 
//            Scope, Stage, MembersInjector, Provider

public abstract class AbstractModule
    implements Module
{

    Binder binder;

    public AbstractModule()
    {
    }

    protected void addError(Message message)
    {
        binder.addError(message);
    }

    protected transient void addError(String s, Object aobj[])
    {
        binder.addError(s, aobj);
    }

    protected void addError(Throwable throwable)
    {
        binder.addError(throwable);
    }

    protected AnnotatedBindingBuilder bind(TypeLiteral typeliteral)
    {
        return binder.bind(typeliteral);
    }

    protected AnnotatedBindingBuilder bind(Class class1)
    {
        return binder.bind(class1);
    }

    protected LinkedBindingBuilder bind(Key key)
    {
        return binder.bind(key);
    }

    protected AnnotatedConstantBindingBuilder bindConstant()
    {
        return binder.bindConstant();
    }

    protected void bindListener(Matcher matcher, TypeListener typelistener)
    {
        binder.bindListener(matcher, typelistener);
    }

    protected void bindScope(Class class1, Scope scope)
    {
        binder.bindScope(class1, scope);
    }

    protected Binder binder()
    {
        return binder;
    }

    protected abstract void configure();

    public final void configure(Binder binder1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (binder == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Re-entry is not allowed.");
        binder = (Binder)$Preconditions.checkNotNull(binder1, "builder");
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

    protected void convertToTypes(Matcher matcher, TypeConverter typeconverter)
    {
        binder.convertToTypes(matcher, typeconverter);
    }

    protected Stage currentStage()
    {
        return binder.currentStage();
    }

    protected MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        return binder.getMembersInjector(typeliteral);
    }

    protected MembersInjector getMembersInjector(Class class1)
    {
        return binder.getMembersInjector(class1);
    }

    protected Provider getProvider(Key key)
    {
        return binder.getProvider(key);
    }

    protected Provider getProvider(Class class1)
    {
        return binder.getProvider(class1);
    }

    protected void install(Module module)
    {
        binder.install(module);
    }

    protected void requestInjection(Object obj)
    {
        binder.requestInjection(obj);
    }

    protected transient void requestStaticInjection(Class aclass[])
    {
        binder.requestStaticInjection(aclass);
    }

    protected void requireBinding(Key key)
    {
        binder.getProvider(key);
    }

    protected void requireBinding(Class class1)
    {
        binder.getProvider(class1);
    }
}
