// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;


class 
{

    static final int $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[];

    static 
    {
        $SwitchMap$com$dominos$fragments$map$MapInterface$MapType = new int[.values().length];
        try
        {
            $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$fragments$map$MapInterface$MapType[.SATELLITE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
