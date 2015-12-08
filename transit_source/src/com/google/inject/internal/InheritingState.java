// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.spi.TypeListenerBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            State, WeakKeySet, Errors, BindingImpl

final class InheritingState
    implements State
{

    private final WeakKeySet blacklistedKeys = new WeakKeySet();
    private final List converters = $Lists.newArrayList();
    private final Map explicitBindings;
    private final Map explicitBindingsMutable = $Maps.newLinkedHashMap();
    private final List listenerBindings = $Lists.newArrayList();
    private final Object lock;
    private final State parent;
    private final Map scopes = $Maps.newHashMap();

    InheritingState(State state)
    {
        explicitBindings = Collections.unmodifiableMap(explicitBindingsMutable);
        parent = (State)$Preconditions.checkNotNull(state, "parent");
        if (state == State.NONE)
        {
            state = this;
        } else
        {
            state = ((State) (state.lock()));
        }
        lock = state;
    }

    public void addConverter(TypeConverterBinding typeconverterbinding)
    {
        converters.add(typeconverterbinding);
    }

    public void addTypeListener(TypeListenerBinding typelistenerbinding)
    {
        listenerBindings.add(typelistenerbinding);
    }

    public void blacklist(Key key, Object obj)
    {
        parent.blacklist(key, obj);
        blacklistedKeys.add(key, obj);
    }

    public TypeConverterBinding getConverter(String s, TypeLiteral typeliteral, Errors errors, Object obj)
    {
        TypeConverterBinding typeconverterbinding = null;
label0:
        for (Object obj1 = this; obj1 != State.NONE; obj1 = ((State) (obj1)).parent())
        {
            Iterator iterator = ((State) (obj1)).getConvertersThisLevel().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                TypeConverterBinding typeconverterbinding1 = (TypeConverterBinding)iterator.next();
                if (typeconverterbinding1.getTypeMatcher().matches(typeliteral))
                {
                    if (typeconverterbinding != null)
                    {
                        errors.ambiguousTypeConversion(s, obj, typeliteral, typeconverterbinding, typeconverterbinding1);
                    }
                    typeconverterbinding = typeconverterbinding1;
                }
            } while (true);
        }

        return typeconverterbinding;
    }

    public Iterable getConvertersThisLevel()
    {
        return converters;
    }

    public BindingImpl getExplicitBinding(Key key)
    {
        Binding binding = (Binding)explicitBindings.get(key);
        if (binding != null)
        {
            return (BindingImpl)binding;
        } else
        {
            return parent.getExplicitBinding(key);
        }
    }

    public Map getExplicitBindingsThisLevel()
    {
        return explicitBindings;
    }

    public Scope getScope(Class class1)
    {
        Scope scope = (Scope)scopes.get(class1);
        if (scope != null)
        {
            return scope;
        } else
        {
            return parent.getScope(class1);
        }
    }

    public Map getScopes()
    {
        return scopes;
    }

    public Set getSourcesForBlacklistedKey(Key key)
    {
        return blacklistedKeys.getSources(key);
    }

    public List getTypeListenerBindings()
    {
        List list = parent.getTypeListenerBindings();
        ArrayList arraylist = new ArrayList(list.size() + 1);
        arraylist.addAll(list);
        arraylist.addAll(listenerBindings);
        return arraylist;
    }

    public boolean isBlacklisted(Key key)
    {
        return blacklistedKeys.contains(key);
    }

    public Object lock()
    {
        return lock;
    }

    public State parent()
    {
        return parent;
    }

    public void putAnnotation(Class class1, Scope scope)
    {
        scopes.put(class1, scope);
    }

    public void putBinding(Key key, BindingImpl bindingimpl)
    {
        explicitBindingsMutable.put(key, bindingimpl);
    }
}
