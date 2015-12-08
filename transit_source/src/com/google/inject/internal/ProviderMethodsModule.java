// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.Message;
import com.google.inject.util.Modules;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal:
//            ProviderMethod, Errors, UniqueAnnotations, Annotations

public final class ProviderMethodsModule
    implements Module
{
    private static final class LogProvider
        implements Provider
    {

        private final String name;

        public volatile Object get()
        {
            return get();
        }

        public Logger get()
        {
            return Logger.getLogger(name);
        }

        public LogProvider(Method method)
        {
            name = (new StringBuilder()).append(method.getDeclaringClass().getName()).append(".").append(method.getName()).toString();
        }
    }


    private final Object _flddelegate;
    private final TypeLiteral typeLiteral;

    private ProviderMethodsModule(Object obj)
    {
        _flddelegate = $Preconditions.checkNotNull(obj, "delegate");
        typeLiteral = TypeLiteral.get(_flddelegate.getClass());
    }

    public static Module forModule(Module module)
    {
        return forObject(module);
    }

    public static Module forObject(Object obj)
    {
        if (obj instanceof ProviderMethodsModule)
        {
            return Modules.EMPTY_MODULE;
        } else
        {
            return new ProviderMethodsModule(obj);
        }
    }

    public void configure(Binder binder)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = getProviderMethods(binder).iterator(); iterator.hasNext(); ((ProviderMethod)iterator.next()).configure(binder)) { }
        break MISSING_BLOCK_LABEL_43;
        binder;
        throw binder;
        this;
        JVM INSTR monitorexit ;
    }

    ProviderMethod createProviderMethod(Binder binder, Method method)
    {
        Binder binder1 = binder.withSource(method);
        Object obj = new Errors(method);
        java.util.ArrayList arraylist = $Lists.newArrayList();
        java.util.ArrayList arraylist1 = $Lists.newArrayList();
        List list = typeLiteral.getParameterTypes(method);
        Annotation aannotation[][] = method.getParameterAnnotations();
        for (int i = 0; i < list.size(); i++)
        {
            Key key = getKey(((Errors) (obj)), (TypeLiteral)list.get(i), method, aannotation[i]);
            binder = key;
            if (key.equals(Key.get(java/util/logging/Logger)))
            {
                binder = Key.get(java/util/logging/Logger, UniqueAnnotations.create());
                binder1.bind(binder).toProvider(new LogProvider(method));
            }
            arraylist.add(Dependency.get(binder));
            arraylist1.add(binder1.getProvider(binder));
        }

        binder = getKey(((Errors) (obj)), typeLiteral.getReturnType(method), method, method.getAnnotations());
        Class class1 = Annotations.findScopeAnnotation(((Errors) (obj)), method.getAnnotations());
        for (obj = ((Errors) (obj)).getMessages().iterator(); ((Iterator) (obj)).hasNext(); binder1.addError((Message)((Iterator) (obj)).next())) { }
        return new ProviderMethod(binder, method, _flddelegate, $ImmutableSet.copyOf(arraylist), arraylist1, class1);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ProviderMethodsModule) && ((ProviderMethodsModule)obj)._flddelegate == _flddelegate;
    }

    Key getKey(Errors errors, TypeLiteral typeliteral, Member member, Annotation aannotation[])
    {
        errors = Annotations.findBindingAnnotation(errors, member, aannotation);
        if (errors == null)
        {
            return Key.get(typeliteral);
        } else
        {
            return Key.get(typeliteral, errors);
        }
    }

    public List getProviderMethods(Binder binder)
    {
        java.util.ArrayList arraylist = $Lists.newArrayList();
        for (Class class1 = _flddelegate.getClass(); class1 != java/lang/Object; class1 = class1.getSuperclass())
        {
            Method amethod[] = class1.getDeclaredMethods();
            int j = amethod.length;
            for (int i = 0; i < j; i++)
            {
                Method method = amethod[i];
                if (method.isAnnotationPresent(com/google/inject/Provides))
                {
                    arraylist.add(createProviderMethod(binder, method));
                }
            }

        }

        return arraylist;
    }

    public int hashCode()
    {
        return _flddelegate.hashCode();
    }
}
