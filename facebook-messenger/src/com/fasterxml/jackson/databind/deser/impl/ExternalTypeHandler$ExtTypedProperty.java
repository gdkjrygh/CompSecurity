// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

final class _typePropertyName
{

    private final SettableBeanProperty _property;
    private final String _typePropertyName;

    public SettableBeanProperty getProperty()
    {
        return _property;
    }

    public String getTypePropertyName()
    {
        return _typePropertyName;
    }

    public boolean hasTypePropertyName(String s)
    {
        return s.equals(_typePropertyName);
    }

    public (SettableBeanProperty settablebeanproperty, String s)
    {
        _property = settablebeanproperty;
        _typePropertyName = s;
    }
}
