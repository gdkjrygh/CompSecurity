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
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null, null);
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final Boolean _required;

    protected PropertyMetadata(Boolean boolean1, String s, Integer integer, String s1)
    {
label0:
        {
            super();
            _required = boolean1;
            _description = s;
            _index = integer;
            if (s1 != null)
            {
                boolean1 = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            boolean1 = null;
        }
        _defaultValue = boolean1;
    }

    public static PropertyMetadata construct(boolean flag, String s, Integer integer, String s1)
    {
        if (s != null || integer != null || s1 != null)
        {
            return new PropertyMetadata(Boolean.valueOf(flag), s, integer, s1);
        }
        if (flag)
        {
            return STD_REQUIRED;
        } else
        {
            return STD_OPTIONAL;
        }
    }

    public PropertyMetadata withDescription(String s)
    {
        return new PropertyMetadata(_required, s, _index, _defaultValue);
    }

    static 
    {
        STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null, null);
        STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null, null);
    }
}
