// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.content.Context;
import android.graphics.Bitmap;
import p.ap.h;
import p.q.g;
import p.s.k;
import p.t.c;

// Referenced classes of package p.ab:
//            c

public abstract class d
    implements g
{

    private c a;

    public d(Context context)
    {
        this(p.l.g.a(context).a());
    }

    public d(c c1)
    {
        a = c1;
    }

    protected abstract Bitmap a(c c1, Bitmap bitmap, int i, int j);

    public final k a(k k1, int i, int j)
    {
        if (!h.a(i, j))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot apply transformation on width: ").append(i).append(" or height: ").append(j).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
        }
        Bitmap bitmap = (Bitmap)k1.b();
        int l = i;
        if (i == 0x80000000)
        {
            l = bitmap.getWidth();
        }
        i = j;
        if (j == 0x80000000)
        {
            i = bitmap.getHeight();
        }
        Bitmap bitmap1 = a(a, bitmap, l, i);
        if (bitmap.equals(bitmap1))
        {
            return k1;
        } else
        {
            return c.a(bitmap1, a);
        }
    }
}
