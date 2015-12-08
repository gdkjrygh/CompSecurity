// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class sw
    implements sb
{

    private sv a;

    sw(sv sv1)
    {
        a = sv1;
        super();
    }

    public final void a(int i)
    {
        rv rv1 = a.a();
        if (rv1 != null)
        {
            rv1.f(i);
        }
    }

    public final void a(Drawable drawable, int i)
    {
        rv rv1 = a.a();
        if (rv1 != null)
        {
            rv1.c(drawable);
            rv1.f(i);
        }
    }

    public final Drawable c()
    {
        yj yj1 = yj.a(a.k(), null, new int[] {
            b.K
        });
        Drawable drawable = yj1.a(0);
        yj1.a.recycle();
        return drawable;
    }

    public final Context d()
    {
        return a.k();
    }

    public final boolean e()
    {
        rv rv1 = a.a();
        return rv1 != null && (rv1.c() & 4) != 0;
    }
}
