// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TabLayout

public static final class f
{

    private Drawable a;
    private CharSequence b;
    private CharSequence c;
    private int d;
    private View e;
    private final TabLayout f;

    static TabLayout a(f f1)
    {
        return f1.f;
    }

    public final f a(View view)
    {
        e = view;
        if (d >= 0)
        {
            TabLayout.a(f, d);
        }
        return this;
    }

    public final d a(CharSequence charsequence)
    {
        b = charsequence;
        if (d >= 0)
        {
            TabLayout.a(f, d);
        }
        return this;
    }

    public final View a()
    {
        return e;
    }

    final void a(int i)
    {
        d = i;
    }

    public final Drawable b()
    {
        return a;
    }

    public final int c()
    {
        return d;
    }

    public final CharSequence d()
    {
        return b;
    }

    public final void e()
    {
        f.a(this);
    }

    public final CharSequence f()
    {
        return c;
    }

    (TabLayout tablayout)
    {
        d = -1;
        f = tablayout;
    }
}
