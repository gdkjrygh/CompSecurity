// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;


// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationDrawerActivity, HomeNavigationItem

class a
    implements Runnable
{

    final HomeNavigationItem a;
    final HomeNavigationDrawerActivity b;

    public void run()
    {
        a.a(b);
    }

    (HomeNavigationDrawerActivity homenavigationdraweractivity, HomeNavigationItem homenavigationitem)
    {
        b = homenavigationdraweractivity;
        a = homenavigationitem;
        super();
    }
}
