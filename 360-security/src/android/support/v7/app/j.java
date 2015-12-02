// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar

class j extends android.support.v7.app.ActionBar
{

    final Activity a;
    final ActionBar.a b;
    final ActionBar c;
    private ArrayList d;

    public j(Activity activity, ActionBar.a a1)
    {
        this(activity, a1, true);
    }

    j(Activity activity, ActionBar.a a1, boolean flag)
    {
        d = new ArrayList();
        a = activity;
        b = a1;
        c = activity.getActionBar();
        if (flag && (c() & 4) != 0)
        {
            f(true);
        }
    }

    public View a()
    {
        return c.getCustomView();
    }

    public void a(int i)
    {
        c.setCustomView(i);
    }

    public void a(Drawable drawable)
    {
        c.setBackgroundDrawable(drawable);
    }

    public void a(View view, ActionBar.LayoutParams layoutparams)
    {
        android.app.ActionBar.LayoutParams layoutparams1 = new android.app.ActionBar.LayoutParams(layoutparams);
        layoutparams1.gravity = layoutparams.a;
        c.setCustomView(view, layoutparams1);
    }

    public void a(CharSequence charsequence)
    {
        c.setTitle(charsequence);
    }

    public void a(boolean flag)
    {
        c.setDisplayUseLogoEnabled(flag);
    }

    public CharSequence b()
    {
        return c.getTitle();
    }

    public void b(boolean flag)
    {
        c.setDisplayShowHomeEnabled(flag);
    }

    public int c()
    {
        return c.getDisplayOptions();
    }

    public void c(boolean flag)
    {
        c.setDisplayHomeAsUpEnabled(flag);
    }

    public Context d()
    {
        return c.getThemedContext();
    }

    public void d(boolean flag)
    {
        c.setDisplayShowTitleEnabled(flag);
    }

    public void e(boolean flag)
    {
        c.setDisplayShowCustomEnabled(flag);
    }

    public void f(boolean flag)
    {
        c.setHomeButtonEnabled(flag);
    }
}
