// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;


// Referenced classes of package com.fitbit.galileo.ui.sync:
//            b, SyncUICase

static class UICase
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.fitbit.bluetooth.support.toothSupportStatus.SupportLevel.values().length];
        try
        {
            b[com.fitbit.bluetooth.support.toothSupportStatus.SupportLevel.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[SyncUICase.values().length];
        try
        {
            a[SyncUICase.i.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SyncUICase.m.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SyncUICase.n.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SyncUICase.o.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
