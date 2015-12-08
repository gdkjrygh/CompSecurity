// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class sa
    implements qn
{

    public boolean a;
    private final sb b;
    private final DrawerLayout c;
    private se d;
    private final int e;
    private final int f;
    private boolean g;

    public sa(Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this(activity, null, drawerlayout, null, i, j);
    }

    private sa(Activity activity, Toolbar toolbar, DrawerLayout drawerlayout, Drawable drawable, int i, int j)
    {
        a = true;
        g = false;
        if (activity instanceof sc)
        {
            b = ((sc)activity).d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            b = new sh(activity);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b = new sg(activity);
        } else
        {
            b = new sf(activity);
        }
        c = drawerlayout;
        e = i;
        f = j;
        d = new sd(activity, b.d());
        c();
    }

    private void a(int i)
    {
        b.a(i);
    }

    public final void a()
    {
        if (c.e(0x800003))
        {
            d.a(1.0F);
        } else
        {
            d.a(0.0F);
        }
        if (a)
        {
            Drawable drawable = (Drawable)d;
            int i;
            if (c.e(0x800003))
            {
                i = f;
            } else
            {
                i = e;
            }
            if (!g && !b.e())
            {
                Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
                g = true;
            }
            b.a(drawable, i);
        }
    }

    public void a(View view)
    {
        d.a(1.0F);
        if (a)
        {
            a(f);
        }
    }

    public void a(View view, float f1)
    {
        d.a(Math.min(1.0F, Math.max(0.0F, f1)));
    }

    public void b()
    {
        DrawerLayout drawerlayout = c;
        View view = drawerlayout.b(0x800003);
        boolean flag;
        if (view != null)
        {
            flag = drawerlayout.g(view);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            DrawerLayout drawerlayout1 = c;
            View view1 = drawerlayout1.b(0x800003);
            if (view1 == null)
            {
                throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(DrawerLayout.c(0x800003)).toString());
            } else
            {
                drawerlayout1.e(view1);
                return;
            }
        } else
        {
            c.d(0x800003);
            return;
        }
    }

    public void b(View view)
    {
        d.a(0.0F);
        if (a)
        {
            a(e);
        }
    }

    public final Drawable c()
    {
        return b.c();
    }
}
