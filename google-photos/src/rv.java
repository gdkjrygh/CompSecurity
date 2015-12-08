// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SpinnerAdapter;

public abstract class rv
{

    public rv()
    {
    }

    public aav a(aaw aaw)
    {
        return null;
    }

    public abstract View a();

    public void a(float f1)
    {
        if (f1 != 0.0F)
        {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public abstract void a(int j);

    public void a(Configuration configuration)
    {
    }

    public abstract void a(Drawable drawable);

    public abstract void a(View view);

    public abstract void a(View view, rw rw);

    public abstract void a(SpinnerAdapter spinneradapter, rx rx);

    public abstract void a(CharSequence charsequence);

    public abstract void a(boolean flag);

    public boolean a(int j, KeyEvent keyevent)
    {
        return false;
    }

    public abstract CharSequence b();

    public abstract void b(int j);

    public abstract void b(Drawable drawable);

    public void b(CharSequence charsequence)
    {
    }

    public abstract void b(boolean flag);

    public abstract int c();

    public abstract void c(int j);

    public void c(Drawable drawable)
    {
    }

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(int j);

    public abstract void d(boolean flag);

    public abstract void e();

    public void e(int j)
    {
    }

    public void e(boolean flag)
    {
    }

    public void f(int j)
    {
    }

    public void f(boolean flag)
    {
    }

    public abstract boolean f();

    public Context g()
    {
        return null;
    }

    public void g(boolean flag)
    {
    }

    public boolean h()
    {
        return false;
    }

    public boolean i()
    {
        return false;
    }
}
