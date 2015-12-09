// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;


class ac
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.brightcove.player.model.StyledElement.TextDecoration.values().length];
        try
        {
            c[com.brightcove.player.model.StyledElement.TextDecoration.UNDERLINE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        b = new int[com.brightcove.player.model.StyledElement.FontWeight.values().length];
        try
        {
            b[com.brightcove.player.model.StyledElement.FontWeight.BOLD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        a = new int[com.brightcove.player.model.StyledElement.FontStyle.values().length];
        try
        {
            a[com.brightcove.player.model.StyledElement.FontStyle.ITALIC.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
