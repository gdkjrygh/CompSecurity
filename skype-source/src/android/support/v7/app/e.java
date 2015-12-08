// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            i, h, g, AppCompatDelegateImplV7, 
//            d, ActionBar

public abstract class e
{

    e()
    {
    }

    public static e a(Activity activity, d d1)
    {
        return a(((Context) (activity)), activity.getWindow(), d1);
    }

    public static e a(Dialog dialog, d d1)
    {
        return a(dialog.getContext(), dialog.getWindow(), d1);
    }

    private static e a(Context context, Window window, d d1)
    {
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 23)
        {
            return new i(context, window, d1);
        }
        if (k >= 14)
        {
            return new h(context, window, d1);
        }
        if (k >= 11)
        {
            return new g(context, window, d1);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, d1);
        }
    }

    public abstract ActionBar a();

    public abstract a a(android.support.v7.view.a.a a1);

    public abstract void a(int k);

    public abstract void a(Configuration configuration);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract boolean b(int k);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract a.a i();

    public abstract void j();
}
