// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import fc;
import fd;

public abstract class ActionBar
{

    public ActionBar()
    {
    }

    public fc a(fd fd)
    {
        return null;
    }

    public abstract void a();

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

    public abstract void a(int i);

    public abstract void a(int i, int j);

    public void a(Configuration configuration)
    {
    }

    public void a(Drawable drawable)
    {
    }

    public abstract void a(View view, LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract void a(boolean flag);

    public boolean a(int i, KeyEvent keyevent)
    {
        return false;
    }

    public abstract int b();

    public void b(int i)
    {
    }

    public abstract void b(CharSequence charsequence);

    public abstract void b(boolean flag);

    public abstract void c();

    public void c(int i)
    {
    }

    public void c(CharSequence charsequence)
    {
    }

    public abstract void c(boolean flag);

    public Context d()
    {
        return null;
    }

    public abstract void d(boolean flag);

    public void e()
    {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void e(boolean flag)
    {
    }

    public void f(boolean flag)
    {
    }

    public boolean f()
    {
        return false;
    }

    public void g(boolean flag)
    {
    }

    public boolean g()
    {
        return false;
    }
}
