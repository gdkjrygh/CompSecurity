// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.wobs.common;


public final class Entrypoint extends Enum
{

    private static final Entrypoint $VALUES[];
    public static final Entrypoint DISCOVERABLE_DETAILS;
    public static final Entrypoint EXPANDED;
    public static final Entrypoint HERE_AND_NOW;
    public static final Entrypoint LIST;
    public static final Entrypoint MY_WALLET_TILE;
    private final String entrypointName;

    private Entrypoint(String s, int i, String s1)
    {
        super(s, i);
        entrypointName = s1;
    }

    public static Entrypoint valueOf(String s)
    {
        return (Entrypoint)Enum.valueOf(com/google/commerce/wobs/common/Entrypoint, s);
    }

    public static Entrypoint[] values()
    {
        return (Entrypoint[])$VALUES.clone();
    }

    public final String toString()
    {
        return entrypointName;
    }

    static 
    {
        EXPANDED = new Entrypoint("EXPANDED", 0, "g_expanded");
        HERE_AND_NOW = new Entrypoint("HERE_AND_NOW", 1, "g_here_and_now");
        DISCOVERABLE_DETAILS = new Entrypoint("DISCOVERABLE_DETAILS", 2, "g_discoverable_details");
        LIST = new Entrypoint("LIST", 3, "g_list");
        MY_WALLET_TILE = new Entrypoint("MY_WALLET_TILE", 4, "g_my_wallet_tile");
        $VALUES = (new Entrypoint[] {
            EXPANDED, HERE_AND_NOW, DISCOVERABLE_DETAILS, LIST, MY_WALLET_TILE
        });
    }
}
