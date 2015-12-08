// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import com.google.android.apps.photos.timemachine.TimeMachineFragment;

public final class ivs
    implements dhf
{

    private TimeMachineFragment a;

    public ivs(TimeMachineFragment timemachinefragment)
    {
        a = timemachinefragment;
        super();
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = TimeMachineFragment.c(a).a(TimeMachineFragment.a(a)).b();
        dhw dhw1 = TimeMachineFragment.d(a);
        dhx dhx1 = new dhx();
        dhx1.a = false;
        dhw1.a(menuitem, dhx1);
    }
}
