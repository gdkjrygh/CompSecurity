// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.binder;

import com.google.inject.Scope;

public interface ScopedBindingBuilder
{

    public abstract void asEagerSingleton();

    public abstract void in(Scope scope);

    public abstract void in(Class class1);
}
