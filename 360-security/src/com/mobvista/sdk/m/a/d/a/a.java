// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.graphics.drawable.Drawable;
import com.mobvista.sdk.m.a.f.b;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            c, b, l, n

public final class a
{

    private static a a;
    private l b;
    private c c;

    private a(c c1)
    {
        b(c1);
    }

    public static int a(Drawable drawable)
    {
        return (int)((float)drawable.getIntrinsicWidth() * com.mobvista.sdk.m.a.f.b.c()) * (int)((float)drawable.getIntrinsicHeight() * com.mobvista.sdk.m.a.f.b.c());
    }

    public static a a(c c1)
    {
        if (a == null)
        {
            a = new a(c1);
        }
        return a;
    }

    private void b(c c1)
    {
        c = c1;
        if (c.b)
        {
            b = new com.mobvista.sdk.m.a.d.a.b(this, c.a);
        }
    }

    public final Drawable a(String s)
    {
        Drawable drawable = null;
        if (b != null)
        {
            drawable = (Drawable)b.a(s);
        }
        return drawable;
    }

    public final void a()
    {
        if (b != null)
        {
            b.a();
            com.mobvista.sdk.m.a.b.a.a.b("ImageCache", "Memory cache cleared");
        }
    }

    public final void a(String s, Drawable drawable)
    {
        while (s == null || drawable == null || b == null) 
        {
            return;
        }
        if (com/mobvista/sdk/m/a/d/a/n.isInstance(drawable))
        {
            ((n)drawable).a(true);
        }
        b.b(s, drawable);
    }
}
