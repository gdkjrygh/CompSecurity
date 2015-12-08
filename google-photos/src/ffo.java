// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;

public final class ffo
    implements android.view.View.OnClickListener
{

    private DrawerMenuFragment a;

    public ffo(DrawerMenuFragment drawermenufragment)
    {
        a = drawermenufragment;
        super();
    }

    public final void onClick(View view)
    {
        if (DrawerMenuFragment.f(a).a(false))
        {
            view = DrawerMenuFragment.g(a).getString(b.od);
            nfw nfw1 = DrawerMenuFragment.c(a);
            ngg ngg1 = new ngg();
            ngg1.g = true;
            ngm ngm1 = new ngm();
            ngm1.a = view;
            nfw1.a(ngg1.a(ngl, ngm1.a()));
        }
    }
}
