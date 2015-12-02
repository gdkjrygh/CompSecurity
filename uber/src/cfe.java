// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

abstract class cfe
{

    final cgh a;
    final cgr b;
    final WeakReference c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    cfe(cgh cgh1, Object obj, cgr cgr1, int i1, int j1, int k1, Drawable drawable, 
            String s, Object obj1, boolean flag)
    {
        a = cgh1;
        b = cgr1;
        if (obj == null)
        {
            cgh1 = null;
        } else
        {
            cgh1 = new cff(this, obj, cgh1.i);
        }
        c = cgh1;
        e = i1;
        f = j1;
        d = flag;
        g = k1;
        h = drawable;
        i = s;
        if (obj1 == null)
        {
            obj1 = this;
        }
        j = obj1;
    }

    abstract void a();

    abstract void a(Bitmap bitmap, cgl cgl);

    void b()
    {
        l = true;
    }

    final cgr c()
    {
        return b;
    }

    final Object d()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.get();
        }
    }

    final String e()
    {
        return i;
    }

    final boolean f()
    {
        return l;
    }

    final boolean g()
    {
        return k;
    }

    final int h()
    {
        return e;
    }

    final int i()
    {
        return f;
    }

    final cgh j()
    {
        return a;
    }

    final int k()
    {
        return b.r;
    }

    final Object l()
    {
        return j;
    }
}
