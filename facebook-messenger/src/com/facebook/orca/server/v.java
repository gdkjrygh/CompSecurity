// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;


public final class v extends Enum
{

    private static final v $VALUES[];
    public static final v STORE_PACKS;
    public static final v USER_PACKS;
    private String mFieldName;

    private v(String s, int i, String s1)
    {
        super(s, i);
        mFieldName = s1;
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/facebook/orca/server/v, s);
    }

    public static v[] values()
    {
        return (v[])$VALUES.clone();
    }

    public String getFieldName()
    {
        return mFieldName;
    }

    static 
    {
        USER_PACKS = new v("USER_PACKS", 0, "owned_packs");
        STORE_PACKS = new v("STORE_PACKS", 1, "available_packs");
        $VALUES = (new v[] {
            USER_PACKS, STORE_PACKS
        });
    }
}
