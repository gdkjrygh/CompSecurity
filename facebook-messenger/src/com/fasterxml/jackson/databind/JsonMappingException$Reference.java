// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import java.io.Serializable;

public class _fieldName
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected String _fieldName;
    protected Object _from;
    protected int _index;

    public String getFieldName()
    {
        return _fieldName;
    }

    public Object getFrom()
    {
        return _from;
    }

    public int getIndex()
    {
        return _index;
    }

    public void setFieldName(String s)
    {
        _fieldName = s;
    }

    public void setFrom(Object obj)
    {
        _from = obj;
    }

    public void setIndex(int i)
    {
        _index = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Class class1;
        Package package1;
        if (_from instanceof Class)
        {
            class1 = (Class)_from;
        } else
        {
            class1 = _from.getClass();
        }
        package1 = class1.getPackage();
        if (package1 != null)
        {
            stringbuilder.append(package1.getName());
            stringbuilder.append('.');
        }
        stringbuilder.append(class1.getSimpleName());
        stringbuilder.append('[');
        if (_fieldName != null)
        {
            stringbuilder.append('"');
            stringbuilder.append(_fieldName);
            stringbuilder.append('"');
        } else
        if (_index >= 0)
        {
            stringbuilder.append(_index);
        } else
        {
            stringbuilder.append('?');
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    protected ()
    {
        _index = -1;
    }

    public _index(Object obj)
    {
        _index = -1;
        _from = obj;
    }

    public _from(Object obj, int i)
    {
        _index = -1;
        _from = obj;
        _index = i;
    }

    public _index(Object obj, String s)
    {
        _index = -1;
        _from = obj;
        if (s == null)
        {
            throw new NullPointerException("Can not pass null fieldName");
        } else
        {
            _fieldName = s;
            return;
        }
    }
}
