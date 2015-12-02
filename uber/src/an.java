// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatDelegateImplV7;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

public abstract class an
{

    an()
    {
    }

    public static an a(Activity activity, am am)
    {
        return a(((Context) (activity)), activity.getWindow(), am);
    }

    public static an a(Dialog dialog, am am)
    {
        return a(dialog.getContext(), dialog.getWindow(), am);
    }

    private static an a(Context context, Window window, am am)
    {
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 23)
        {
            return new au(context, window, am);
        }
        if (k >= 14)
        {
            return new as(context, window, am);
        }
        if (k >= 11)
        {
            return new ar(context, window, am);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, am);
        }
    }

    public abstract ActionBar a();

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

    public abstract x i();

    public abstract void j();
}
