// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.AnnotatedConstantBindingBuilder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.Message;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeListener;

// Referenced classes of package com.google.inject:
//            TypeLiteral, Key, Scope, Stage, 
//            MembersInjector, Provider, Module, PrivateBinder

public interface Binder
{

    public abstract void addError(Message message);

    public transient abstract void addError(String s, Object aobj[]);

    public abstract void addError(Throwable throwable);

    public abstract AnnotatedBindingBuilder bind(TypeLiteral typeliteral);

    public abstract AnnotatedBindingBuilder bind(Class class1);

    public abstract LinkedBindingBuilder bind(Key key);

    public abstract AnnotatedConstantBindingBuilder bindConstant();

    public abstract void bindListener(Matcher matcher, TypeListener typelistener);

    public abstract void bindScope(Class class1, Scope scope);

    public abstract void convertToTypes(Matcher matcher, TypeConverter typeconverter);

    public abstract Stage currentStage();

    public abstract void disableCircularProxies();

    public abstract MembersInjector getMembersInjector(TypeLiteral typeliteral);

    public abstract MembersInjector getMembersInjector(Class class1);

    public abstract Provider getProvider(Key key);

    public abstract Provider getProvider(Class class1);

    public abstract void install(Module module);

    public abstract PrivateBinder newPrivateBinder();

    public abstract void requestInjection(TypeLiteral typeliteral, Object obj);

    public abstract void requestInjection(Object obj);

    public transient abstract void requestStaticInjection(Class aclass[]);

    public abstract void requireExplicitBindings();

    public transient abstract Binder skipSources(Class aclass[]);

    public abstract Binder withSource(Object obj);
}
