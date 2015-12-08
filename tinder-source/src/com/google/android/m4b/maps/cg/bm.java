// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.y.j;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public final class bm
{
    public static final class a
    {

        int a;
        public final Bitmap b;

        public a(Bitmap bitmap)
        {
            b = (Bitmap)j.a(bitmap);
            a = 1;
        }
    }


    private final Map a = ax.b();
    private final Context b;

    bm(Context context)
    {
        b = (Context)j.a(context, "processContext");
    }

    public final void a(bl bl1)
    {
        a a1 = (a)a.get(bl1);
        if (a1 == null)
        {
            a1 = new a(bl1.a(b));
            a.put(bl1, a1);
            return;
        } else
        {
            a1.a = a1.a + 1;
            return;
        }
    }

    public final a b(bl bl1)
    {
        return (a)a.get(bl1);
    }

    public final void c(bl bl1)
    {
        a a1 = (a)a.get(bl1);
        boolean flag;
        if (a1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Released unknown imageData reference");
        if (a1.a == 1)
        {
            a.remove(bl1);
            return;
        } else
        {
            a1.a = a1.a - 1;
            return;
        }
    }
}
