// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import java.io.Serializable;

public class PropertyMetadata
    implements Serializable
{

    public static final PropertyMetadata STD_OPTIONAL;
    public static final PropertyMetadata STD_REQUIRED;
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null);
    private static final long serialVersionUID = -1L;
    protected final String _description;
    protected final Integer _index;
    protected final Boolean _required;

    protected PropertyMetadata(Boolean boolean1, String s, Integer integer)
    {
        _required = boolean1;
        _description = s;
        _index = integer;
    }

    public static PropertyMetadata construct(boolean flag, String s, Integer integer)
    {
        PropertyMetadata propertymetadata;
        PropertyMetadata propertymetadata1;
        if (flag)
        {
            propertymetadata1 = STD_REQUIRED;
        } else
        {
            propertymetadata1 = STD_OPTIONAL;
        }
        propertymetadata = propertymetadata1;
        if (s != null)
        {
            propertymetadata = propertymetadata1.withDescription(s);
        }
        s = propertymetadata;
        if (integer != null)
        {
            s = propertymetadata.withIndex(integer);
        }
        return s;
    }

    protected Object readResolve()
    {
label0:
        {
            PropertyMetadata propertymetadata = this;
            if (_description == null)
            {
                propertymetadata = this;
                if (_index == null)
                {
                    if (_required != null)
                    {
                        break label0;
                    }
                    propertymetadata = STD_REQUIRED_OR_OPTIONAL;
                }
            }
            return propertymetadata;
        }
        if (_required.booleanValue())
        {
            return STD_REQUIRED;
        } else
        {
            return STD_OPTIONAL;
        }
    }

    public PropertyMetadata withDescription(String s)
    {
        return new PropertyMetadata(_required, s, _index);
    }

    public PropertyMetadata withIndex(Integer integer)
    {
        return new PropertyMetadata(_required, _description, integer);
    }

    static 
    {
        STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null);
        STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null);
    }
}
