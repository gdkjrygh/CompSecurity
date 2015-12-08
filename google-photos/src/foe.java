// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import com.google.android.apps.photos.home.HomeActivity;

public final class foe
    implements nug
{

    private HomeActivity a;

    public foe(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public final void b_(Object obj)
    {
        if (((hyy)obj).b())
        {
            HomeActivity.e(a).a(1);
            return;
        } else
        {
            HomeActivity.e(a).a(0);
            return;
        }
    }
}
