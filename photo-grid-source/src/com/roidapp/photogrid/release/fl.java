// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            fm, fi, ih

final class fl
    implements fm
{

    final int a;
    final fi b;

    fl(fi fi1, int i)
    {
        b = fi1;
        a = i;
        super();
    }

    public final void a(int i)
    {
        fi.b(b, i);
        ((View)fi.h(b).get(a - 1)).findViewById(0x7f0d0493).setVisibility(8);
        if (i > 0)
        {
            ((View)fi.h(b).get(i)).findViewById(0x7f0d0493).setVisibility(0);
        }
    }

    public final void a(boolean flag)
    {
        fi.a(b, flag);
        if (fi.f(b))
        {
            fi fi1 = b;
            int i;
            if (fi.g(b))
            {
                i = 0;
            } else
            {
                i = 1;
            }
            fi.a(fi1, i);
        } else
        {
            fi fi2 = b;
            byte byte0;
            if (fi.g(b))
            {
                byte0 = 2;
            } else
            {
                byte0 = 3;
            }
            fi.a(fi2, byte0);
        }
        fi.i(b);
        ih.C().c(fi.j(b));
        ih.C().f(fi.g(b));
    }
}
