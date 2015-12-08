// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.p;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            f, e, d, h, 
//            i, g, c

public class a
    implements p
{

    private static final c a;
    private final Activity b;
    private final g c;
    private final DrawerLayout d;
    private boolean e;
    private Drawable f;
    private Drawable g;
    private i h;
    private final int i;
    private final int j;
    private final int k;
    private Object l;

    public a(Activity activity, DrawerLayout drawerlayout, int i1, int j1, int k1)
    {
        boolean flag;
        if (!a(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(activity, drawerlayout, flag, i1, j1, k1);
    }

    public a(Activity activity, DrawerLayout drawerlayout, boolean flag, int i1, int j1, int k1)
    {
        e = true;
        b = activity;
        float f1;
        if (activity instanceof h)
        {
            c = ((h)activity).a();
        } else
        {
            c = null;
        }
        d = drawerlayout;
        i = i1;
        j = j1;
        k = k1;
        f = b();
        g = android.support.v4.a.a.a(activity, i1);
        h = new i(this, g, null);
        activity = h;
        if (flag)
        {
            f1 = 0.3333333F;
        } else
        {
            f1 = 0.0F;
        }
        activity.b(f1);
    }

    static Activity a(a a1)
    {
        return a1.b;
    }

    private static boolean a(Context context)
    {
        return context.getApplicationInfo().targetSdkVersion >= 21 && android.os.Build.VERSION.SDK_INT >= 21;
    }

    public void a()
    {
        if (d.f(0x800003))
        {
            h.a(1.0F);
        } else
        {
            h.a(0.0F);
        }
        if (e)
        {
            i i1 = h;
            int j1;
            if (d.f(0x800003))
            {
                j1 = k;
            } else
            {
                j1 = j;
            }
            a(((Drawable) (i1)), j1);
        }
    }

    public void a(int i1)
    {
    }

    void a(Drawable drawable, int i1)
    {
        if (c != null)
        {
            c.a(drawable, i1);
            return;
        } else
        {
            l = a.a(l, b, drawable, i1);
            return;
        }
    }

    public void a(View view)
    {
        h.a(1.0F);
        if (e)
        {
            b(k);
        }
    }

    public void a(View view, float f1)
    {
        float f2 = h.a();
        if (f1 > 0.5F)
        {
            f1 = Math.max(f2, Math.max(0.0F, f1 - 0.5F) * 2.0F);
        } else
        {
            f1 = Math.min(f2, f1 * 2.0F);
        }
        h.a(f1);
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem != null && menuitem.getItemId() == 0x102002c && e)
        {
            if (d.g(0x800003))
            {
                d.e(0x800003);
            } else
            {
                d.d(0x800003);
            }
            return true;
        } else
        {
            return false;
        }
    }

    Drawable b()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return a.a(b);
        }
    }

    void b(int i1)
    {
        if (c != null)
        {
            c.a(i1);
            return;
        } else
        {
            l = a.a(l, b, i1);
            return;
        }
    }

    public void b(View view)
    {
        h.a(0.0F);
        if (e)
        {
            b(j);
        }
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 18)
        {
            a = new f(null);
        } else
        if (i1 >= 11)
        {
            a = new e(null);
        } else
        {
            a = new d(null);
        }
    }
}
