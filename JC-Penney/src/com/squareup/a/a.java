// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.a:
//            b, ak, ax, aq, 
//            ar

abstract class a
{

    final ak a;
    final ax b;
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

    a(ak ak1, Object obj, ax ax1, int i1, int j1, int k1, Drawable drawable, 
            String s, Object obj1, boolean flag)
    {
        a = ak1;
        b = ax1;
        if (obj == null)
        {
            ak1 = null;
        } else
        {
            ak1 = new b(this, obj, ak1.i);
        }
        c = ak1;
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

    abstract void a(Bitmap bitmap, aq aq);

    void b()
    {
        l = true;
    }

    ax c()
    {
        return b;
    }

    Object d()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.get();
        }
    }

    String e()
    {
        return i;
    }

    boolean f()
    {
        return l;
    }

    boolean g()
    {
        return k;
    }

    int h()
    {
        return e;
    }

    int i()
    {
        return f;
    }

    ak j()
    {
        return a;
    }

    ar k()
    {
        return b.r;
    }

    Object l()
    {
        return j;
    }
}
