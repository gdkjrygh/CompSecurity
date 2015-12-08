// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


final class aj extends Enum
{

    public static final aj AD;
    public static final aj EMPTY;
    private static final aj a[];

    private aj(String s, int i)
    {
        super(s, i);
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(com/mopub/nativeads/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])a.clone();
    }

    static 
    {
        EMPTY = new aj("EMPTY", 0);
        AD = new aj("AD", 1);
        a = (new aj[] {
            EMPTY, AD
        });
    }
}
