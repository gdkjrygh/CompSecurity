// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$ImmutableMap;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.spi.TypeListenerBinding;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            Errors, BindingImpl

interface State
{

    public static final State NONE = new State() {

        public void addConverter(TypeConverterBinding typeconverterbinding)
        {
            throw new UnsupportedOperationException();
        }

        public void addTypeListener(TypeListenerBinding typelistenerbinding)
        {
            throw new UnsupportedOperationException();
        }

        public void blacklist(Key key, Object obj)
        {
        }

        public TypeConverterBinding getConverter(String s, TypeLiteral typeliteral, Errors errors, Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public Iterable getConvertersThisLevel()
        {
            return $ImmutableSet.of();
        }

        public BindingImpl getExplicitBinding(Key key)
        {
            return null;
        }

        public Map getExplicitBindingsThisLevel()
        {
            throw new UnsupportedOperationException();
        }

        public Scope getScope(Class class1)
        {
            return null;
        }

        public Map getScopes()
        {
            return $ImmutableMap.of();
        }

        public Set getSourcesForBlacklistedKey(Key key)
        {
            throw new UnsupportedOperationException();
        }

        public List getTypeListenerBindings()
        {
            return $ImmutableList.of();
        }

        public boolean isBlacklisted(Key key)
        {
            return true;
        }

        public Object lock()
        {
            throw new UnsupportedOperationException();
        }

        public State parent()
        {
            throw new UnsupportedOperationException();
        }

        public void putAnnotation(Class class1, Scope scope)
        {
            throw new UnsupportedOperationException();
        }

        public void putBinding(Key key, BindingImpl bindingimpl)
        {
            throw new UnsupportedOperationException();
        }

    };

    public abstract void addConverter(TypeConverterBinding typeconverterbinding);

    public abstract void addTypeListener(TypeListenerBinding typelistenerbinding);

    public abstract void blacklist(Key key, Object obj);

    public abstract TypeConverterBinding getConverter(String s, TypeLiteral typeliteral, Errors errors, Object obj);

    public abstract Iterable getConvertersThisLevel();

    public abstract BindingImpl getExplicitBinding(Key key);

    public abstract Map getExplicitBindingsThisLevel();

    public abstract Scope getScope(Class class1);

    public abstract Map getScopes();

    public abstract Set getSourcesForBlacklistedKey(Key key);

    public abstract List getTypeListenerBindings();

    public abstract boolean isBlacklisted(Key key);

    public abstract Object lock();

    public abstract State parent();

    public abstract void putAnnotation(Class class1, Scope scope);

    public abstract void putBinding(Key key, BindingImpl bindingimpl);

}
