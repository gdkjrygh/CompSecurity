// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;


public final class UIMode extends Enum
{

    private static final UIMode $VALUES[];
    public static final UIMode jfk;
    public static final UIMode member;
    public static final UIMode nonmember;

    private UIMode(String s, int i)
    {
        super(s, i);
    }

    public static UIMode valueOf(String s)
    {
        return (UIMode)Enum.valueOf(com/netflix/mediaclient/service/logging/client/model/UIMode, s);
    }

    public static UIMode[] values()
    {
        return (UIMode[])$VALUES.clone();
    }

    static 
    {
        jfk = new UIMode("jfk", 0);
        member = new UIMode("member", 1);
        nonmember = new UIMode("nonmember", 2);
        $VALUES = (new UIMode[] {
            jfk, member, nonmember
        });
    }
}
