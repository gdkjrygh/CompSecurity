// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;
import com.google.android.apps.photos.home.HomeActivity;

public final class fog extends sa
{

    private HomeActivity b;

    public fog(HomeActivity homeactivity, Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        b = homeactivity;
        super(activity, drawerlayout, i, j);
    }

    public final void a(View view)
    {
        super.a(view);
        if (HomeActivity.g(b) != null)
        {
            HomeActivity.g(b).e(true);
            HomeActivity.g(b).g_(true);
        }
    }

    public final void a(View view, float f)
    {
        super.a(view, (float)Math.floor(f));
    }

    public final void b(View view)
    {
        super.b(view);
        if (HomeActivity.g(b) != null)
        {
            HomeActivity.g(b).e(false);
            HomeActivity.g(b).g_(false);
        }
    }
}
