// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.Key;
import com.google.inject.internal.Errors;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Sets;
import java.util.Iterator;
import java.util.Set;

class Node
{

    private int appliedScope;
    private Class appliedScopeAnnotation;
    private int effectiveScope;
    private Node effectiveScopeDependency;
    private final Key key;
    private Set users;

    Node(Key key1)
    {
        appliedScope = 0x7fffffff;
        effectiveScope = 0x80000000;
        users = $ImmutableSet.of();
        key = key1;
    }

    private void setEffectiveScope(int i, Node node)
    {
        if (effectiveScope >= i)
        {
            return;
        } else
        {
            effectiveScope = i;
            effectiveScopeDependency = node;
            pushScopeToUsers();
            return;
        }
    }

    public void addUser(Node node)
    {
        if (users.isEmpty())
        {
            users = $Sets.newHashSet();
        }
        users.add(node);
    }

    Node effectiveScopeDependency()
    {
        return effectiveScopeDependency;
    }

    boolean isEffectiveScopeAppliedScope()
    {
        return appliedScope == effectiveScope;
    }

    boolean isScopedCorrectly()
    {
        return appliedScope >= effectiveScope;
    }

    void pushScopeToUsers()
    {
        for (Iterator iterator = users.iterator(); iterator.hasNext(); ((Node)iterator.next()).setEffectiveScope(effectiveScope, this)) { }
    }

    void setScopeRank(int i, Class class1)
    {
        appliedScope = i;
        effectiveScope = i;
        appliedScopeAnnotation = class1;
    }

    public String toString()
    {
        if (appliedScopeAnnotation != null)
        {
            return (new StringBuilder()).append(Errors.convert(key)).append(" in @").append(appliedScopeAnnotation.getSimpleName()).toString();
        } else
        {
            return Errors.convert(key).toString();
        }
    }
}
