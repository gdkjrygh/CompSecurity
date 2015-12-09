// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.galileo.ui.sync.SyncUICase;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

static class 
{

    static final int a[];

    static 
    {
        a = new int[SyncUICase.values().length];
        try
        {
            a[SyncUICase.g.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SyncUICase.j.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SyncUICase.l.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SyncUICase.e.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
