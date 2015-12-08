// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;


// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationDrawerActivity, HomeNavigationItem

static class 
{

    static final int a[];

    static 
    {
        a = new int[HomeNavigationItem.values().length];
        try
        {
            a[HomeNavigationItem.g.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[HomeNavigationItem.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[HomeNavigationItem.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
