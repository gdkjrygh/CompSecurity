// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;


// Referenced classes of package com.fitbit.home.ui.tiles:
//            c

static class e.State
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.customui.hGauge.State.values().length];
        try
        {
            a[com.fitbit.customui.hGauge.State.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.customui.hGauge.State.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
