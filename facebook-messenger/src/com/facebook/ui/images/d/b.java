// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Rect;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.ui.images.d:
//            d, c

public class b
{

    private final float a;
    private final float b;
    private final float c;
    private final c d;

    b(d d1)
    {
        boolean flag1 = true;
        super();
        a = d1.a();
        b = d1.b();
        c = d1.c();
        d = d1.d();
        boolean flag;
        if (b >= 0.0F && b <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (c >= 0.0F && c <= 1.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkNotNull(d);
    }

    public String a()
    {
        Joiner joiner = Joiner.on(":");
        float f = a;
        float f1 = b;
        float f2 = c;
        String s;
        if (d != null)
        {
            s = d.name();
        } else
        {
            s = "";
        }
        return joiner.join(Float.valueOf(f), Float.valueOf(f1), new Object[] {
            Float.valueOf(f2), s
        });
    }

    public void a(Rect rect, int i, int j, Rect rect1)
    {
        c c1;
        int k;
        int l;
        l = rect.width();
        k = rect.height();
        float f = (float)l / (float)k;
        c c2 = d;
        c1 = c2;
        if (c2 == c.DEFAULT)
        {
            if (rect.width() > rect.height())
            {
                c1 = c.CENTER;
            } else
            {
                c1 = c.TOP_OR_LEFT;
            }
        }
        if (f <= a) goto _L2; else goto _L1
_L1:
        if (l <= i) goto _L4; else goto _L3
_L3:
        i = Math.max(i, Math.max((int)((float)k * a), (int)((1.0F - b) * (float)l)));
        j = k;
_L6:
        if (l > i)
        {
            if (c1 == c.CENTER)
            {
                l = (l - i) / 2;
                i += l;
            } else
            if (c1 == c.TOP_OR_LEFT)
            {
                l = 0;
            } else
            {
                int i1 = l - i;
                i = l;
                l = i1;
            }
        } else
        {
            i = l;
            l = 0;
        }
        if (k > j)
        {
            if (c1 == c.CENTER)
            {
                k = (k - j) / 2;
                j = k + j;
            } else
            if (c1 == c.TOP_OR_LEFT)
            {
                k = 0;
            } else
            {
                int j1 = k - j;
                j = k;
                k = j1;
            }
        } else
        {
            j = k;
            k = 0;
        }
        rect1.set(rect.left + l, k + rect.top, rect.left + i, j + rect.top);
        return;
_L2:
        if (k > j)
        {
            j = Math.max(j, Math.max((int)((float)l / a), (int)((1.0F - c) * (float)k)));
            i = l;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        j = k;
        i = l;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
