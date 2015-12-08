// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;


// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

static final class A
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.brightcove.player.model.es().length];
        try
        {
            c[com.brightcove.player.model.RLINE.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        b = new int[com.brightcove.player.model.().length];
        try
        {
            b[com.brightcove.player.model..()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        a = new int[com.brightcove.player.model.().length];
        try
        {
            a[com.brightcove.player.model..()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
