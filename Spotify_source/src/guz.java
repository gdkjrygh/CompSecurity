// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;

public abstract class guz
{

    public final Picasso a;
    public final gvz b;
    final WeakReference c;
    final boolean d;
    final int e;
    final Drawable f;
    public final String g;
    final Object h;
    public boolean i;
    public boolean j;

    guz(Picasso picasso, Object obj, gvz gvz, int k, Drawable drawable, String s, Object obj1, 
            boolean flag)
    {
        a = picasso;
        b = gvz;
        if (obj == null)
        {
            picasso = null;
        } else
        {
            picasso = new gva(this, obj, picasso.e);
        }
        c = picasso;
        d = flag;
        e = k;
        f = drawable;
        g = s;
        if (obj1 == null)
        {
            obj1 = this;
        }
        h = obj1;
    }

    public abstract void a();

    public abstract void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom);

    public void b()
    {
        j = true;
    }

    public Object c()
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
