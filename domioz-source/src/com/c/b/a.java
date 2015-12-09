// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.c.b:
//            b, aj, aw, ap

abstract class a
{

    final aj a;
    final aw b;
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

    a(aj aj1, Object obj, aw aw, int i1, int j1, int k1, Drawable drawable, 
            String s, Object obj1, boolean flag)
    {
        a = aj1;
        b = aw;
        if (obj == null)
        {
            aj1 = null;
        } else
        {
            aj1 = new b(this, obj, aj1.i);
        }
        c = aj1;
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

    abstract void a(Bitmap bitmap, ap ap);

    void b()
    {
        l = true;
    }

    final Object c()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.get();
        }
    }
}
