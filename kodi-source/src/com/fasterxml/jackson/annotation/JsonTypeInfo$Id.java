// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonTypeInfo

public static final class _defaultPropertyName extends Enum
{

    private static final CUSTOM $VALUES[];
    public static final CUSTOM CLASS;
    public static final CUSTOM CUSTOM;
    public static final CUSTOM MINIMAL_CLASS;
    public static final CUSTOM NAME;
    public static final CUSTOM NONE;
    private final String _defaultPropertyName;

    public static _defaultPropertyName valueOf(String s)
    {
        return (_defaultPropertyName)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$Id, s);
    }

    public static _defaultPropertyName[] values()
    {
        return (_defaultPropertyName[])$VALUES.clone();
    }

    public String getDefaultPropertyName()
    {
        return _defaultPropertyName;
    }

    static 
    {
        NONE = new <init>("NONE", 0, null);
        CLASS = new <init>("CLASS", 1, "@class");
        MINIMAL_CLASS = new <init>("MINIMAL_CLASS", 2, "@c");
        NAME = new <init>("NAME", 3, "@type");
        CUSTOM = new <init>("CUSTOM", 4, null);
        $VALUES = (new .VALUES[] {
            NONE, CLASS, MINIMAL_CLASS, NAME, CUSTOM
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _defaultPropertyName = s1;
    }
}
