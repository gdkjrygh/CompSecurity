// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            Picasso, r

abstract class com.squareup.picasso.a
{
    static final class a extends WeakReference
    {

        final com.squareup.picasso.a a;

        public a(com.squareup.picasso.a a1, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            a = a1;
        }
    }


    final Picasso a;
    final r b;
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

    com.squareup.picasso.a(Picasso picasso, Object obj, r r, int i1, int j1, int k1, Drawable drawable, 
            String s, Object obj1, boolean flag)
    {
        a = picasso;
        b = r;
        if (obj == null)
        {
            picasso = null;
        } else
        {
            picasso = new a(this, obj, picasso.k);
        }
        c = picasso;
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

    abstract void a(Bitmap bitmap, Picasso.LoadedFrom loadedfrom);

    void b()
    {
        l = true;
    }

    Object c()
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
