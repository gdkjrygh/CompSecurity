// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;


public final class h extends Enum
{

    private static final h $VALUES[];
    public static final h INCLUDE_CONSTRUCTORS;
    public static final h INCLUDE_FIELDS;
    public static final h INCLUDE_METHODS;
    public static final h INCLUDE_SUPERCLASSES;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/common/w/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        INCLUDE_SUPERCLASSES = new h("INCLUDE_SUPERCLASSES", 0);
        INCLUDE_CONSTRUCTORS = new h("INCLUDE_CONSTRUCTORS", 1);
        INCLUDE_METHODS = new h("INCLUDE_METHODS", 2);
        INCLUDE_FIELDS = new h("INCLUDE_FIELDS", 3);
        $VALUES = (new h[] {
            INCLUDE_SUPERCLASSES, INCLUDE_CONSTRUCTORS, INCLUDE_METHODS, INCLUDE_FIELDS
        });
    }
}
