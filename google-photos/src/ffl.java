// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;

public final class ffl
    implements Runnable
{

    private DrawerMenuFragment a;

    public ffl(DrawerMenuFragment drawermenufragment)
    {
        a = drawermenufragment;
        super();
    }

    public final void run()
    {
        DrawerMenuFragment.b(a).a(fnl.a(DrawerMenuFragment.a(a).b()));
    }
}
