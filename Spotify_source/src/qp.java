// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class qp
    implements pa
{

    private final qq a;
    private final DrawerLayout b;
    private qt c;
    private boolean d;
    private boolean e;

    public qp(Activity activity, DrawerLayout drawerlayout)
    {
        this(activity, drawerlayout, (byte)0);
    }

    private qp(Activity activity, DrawerLayout drawerlayout, byte byte0)
    {
        d = true;
        e = false;
        if (activity instanceof qr)
        {
            a = ((qr)activity).d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new qw(activity, (byte)0);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new qv(activity, (byte)0);
        } else
        {
            a = new qu(activity);
        }
        b = drawerlayout;
        c = new qs(a.b());
        c();
    }

    private void a(int i)
    {
        a.a(0);
    }

    private Drawable c()
    {
        return a.a();
    }

    public final void a()
    {
        if (b.c(0x800003))
        {
            c.a(1.0F);
        } else
        {
            c.a(0.0F);
        }
        if (d)
        {
            Drawable drawable = (Drawable)c;
            b.c(0x800003);
            if (!e && !a.c())
            {
                Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
                e = true;
            }
            a.a(drawable, 0);
        }
    }

    public final void a(View view)
    {
        c.a(1.0F);
        if (d)
        {
            a(0);
        }
    }

    public final void a(View view, float f)
    {
        c.a(Math.min(1.0F, Math.max(0.0F, f)));
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = flag2;
        if (menuitem != null)
        {
            flag = flag2;
            if (menuitem.getItemId() == 0x102002c)
            {
                flag = flag2;
                if (d)
                {
                    menuitem = b.a(0x800003);
                    flag = flag1;
                    if (menuitem != null)
                    {
                        flag = DrawerLayout.f(menuitem);
                    }
                    if (flag)
                    {
                        b.b(0x800003);
                    } else
                    {
                        b.a();
                    }
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final void b()
    {
        c();
        a();
    }

    public final void b(View view)
    {
        c.a(0.0F);
        if (d)
        {
            a(0);
        }
    }
}
