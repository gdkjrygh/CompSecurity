// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

public abstract class su
{

    su()
    {
    }

    static su a(Context context, Window window, st st)
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 23)
        {
            return new tb(context, window, st);
        }
        if (j >= 14)
        {
            return new sz(context, window, st);
        }
        if (j >= 11)
        {
            return new sy(context, window, st);
        } else
        {
            return new td(context, window, st);
        }
    }

    public abstract aav a(aaw aaw);

    public abstract rv a();

    public abstract void a(int j);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract boolean b(int j);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract sb h();

    public abstract void i();
}
