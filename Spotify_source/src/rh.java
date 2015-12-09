// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

public abstract class rh
{

    rh()
    {
    }

    static rh a(Context context, Window window, rg rg)
    {
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 23)
        {
            return new ro(context, window, rg);
        }
        if (k >= 14)
        {
            return new rm(context, window, rg);
        }
        if (k >= 11)
        {
            return new rl(context, window);
        } else
        {
            return new rq(context, window);
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

    public abstract qq i();

    public abstract void j();
}
