// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


public final class m extends Enum
{

    private static final m $VALUES[];
    public static final m BOOTSTRAP;
    public static final m DEFAULT;
    public static final m PROD;

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/http/protocol/m, s);
    }

    public static m[] values()
    {
        return (m[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new m("DEFAULT", 0);
        PROD = new m("PROD", 1);
        BOOTSTRAP = new m("BOOTSTRAP", 2);
        $VALUES = (new m[] {
            DEFAULT, PROD, BOOTSTRAP
        });
    }
}
