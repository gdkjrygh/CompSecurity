// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.a.b;
import com.actionbarsherlock.a.d;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            a, c, b

public class l extends a
    implements d
{

    private a d;
    private c e;

    public l(Context context, a a1, c c1)
    {
        super(context);
        d = a1;
        e = c1;
    }

    public void a(com.actionbarsherlock.internal.view.menu.b b1)
    {
        d.a(b1);
    }

    public void a(boolean flag)
    {
        d.a(flag);
    }

    boolean a(a a1, b b1)
    {
        return super.a(a1, b1) || d.a(a1, b1);
    }

    public d b(Drawable drawable)
    {
        e.a(drawable);
        return this;
    }

    public d b(View view)
    {
        return (d)super.a(view);
    }

    public boolean b(c c1)
    {
        return d.b(c1);
    }

    public d c(Drawable drawable)
    {
        return (d)super.a(drawable);
    }

    public d d(CharSequence charsequence)
    {
        return (d)super.c(charsequence);
    }

    public boolean d()
    {
        return d.d();
    }

    public boolean e()
    {
        return d.e();
    }

    public d k(int i)
    {
        e.b(i);
        return this;
    }

    public d l(int i)
    {
        return (d)super.j(i);
    }

    public d m(int i)
    {
        return (d)super.i(i);
    }

    public a n()
    {
        return d;
    }

    public b q()
    {
        return e;
    }
}
