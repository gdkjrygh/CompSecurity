// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import android.content.Context;
import android.graphics.Canvas;

// Referenced classes of package android.support.v4.d:
//            c, b, d

public class a
{

    private static final d b;
    private Object a;

    public a(Context context)
    {
        a = b.a(context);
    }

    public void a(int i, int j)
    {
        b.a(a, i, j);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public boolean a(float f)
    {
        return b.a(a, f);
    }

    public boolean a(Canvas canvas)
    {
        return b.a(a, canvas);
    }

    public void b()
    {
        b.b(a);
    }

    public boolean c()
    {
        return b.c(a);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new c();
        } else
        {
            b = new b();
        }
    }
}
