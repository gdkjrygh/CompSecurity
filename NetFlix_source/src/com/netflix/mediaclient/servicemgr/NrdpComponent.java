// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public final class NrdpComponent extends Enum
{

    private static final NrdpComponent $VALUES[];
    public static final NrdpComponent MdxLib;
    public static final NrdpComponent NrdApp;
    public static final NrdpComponent NrdLib;

    private NrdpComponent(String s, int i)
    {
        super(s, i);
    }

    public static NrdpComponent valueOf(String s)
    {
        return (NrdpComponent)Enum.valueOf(com/netflix/mediaclient/servicemgr/NrdpComponent, s);
    }

    public static NrdpComponent[] values()
    {
        return (NrdpComponent[])$VALUES.clone();
    }

    static 
    {
        NrdLib = new NrdpComponent("NrdLib", 0);
        NrdApp = new NrdpComponent("NrdApp", 1);
        MdxLib = new NrdpComponent("MdxLib", 2);
        $VALUES = (new NrdpComponent[] {
            NrdLib, NrdApp, MdxLib
        });
    }
}
