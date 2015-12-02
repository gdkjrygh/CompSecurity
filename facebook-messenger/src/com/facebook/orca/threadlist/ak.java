// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


final class ak extends Enum
{

    private static final ak $VALUES[];
    public static final ak LOADING;
    public static final ak LOAD_MORE;
    public static final ak LOAD_MORE_PLACEHOLDER;
    public static final ak NONE;

    private ak(String s, int i)
    {
        super(s, i);
    }

    public static ak valueOf(String s)
    {
        return (ak)Enum.valueOf(com/facebook/orca/threadlist/ak, s);
    }

    public static ak[] values()
    {
        return (ak[])$VALUES.clone();
    }

    static 
    {
        NONE = new ak("NONE", 0);
        LOAD_MORE_PLACEHOLDER = new ak("LOAD_MORE_PLACEHOLDER", 1);
        LOAD_MORE = new ak("LOAD_MORE", 2);
        LOADING = new ak("LOADING", 3);
        $VALUES = (new ak[] {
            NONE, LOAD_MORE_PLACEHOLDER, LOAD_MORE, LOADING
        });
    }
}
