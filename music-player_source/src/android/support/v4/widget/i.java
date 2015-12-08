// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

// Referenced classes of package android.support.v4.widget:
//            k, j, l

public final class i
{

    private static final l b;
    private Object a;

    public i(Context context)
    {
        a = b.a(context);
    }

    public final void a(int i1, int j1)
    {
        b.a(a, i1, j1);
    }

    public final boolean a()
    {
        return b.a(a);
    }

    public final boolean a(float f)
    {
        return b.a(a, f);
    }

    public final boolean a(Canvas canvas)
    {
        return b.a(a, canvas);
    }

    public final void b()
    {
        b.b(a);
    }

    public final boolean c()
    {
        return b.c(a);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new k();
        } else
        {
            b = new j();
        }
    }
}
