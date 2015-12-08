// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.b;
import java.util.ArrayList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a, d

final class c
    implements Runnable
{

    final int a;
    final a b;

    c(a a1, int i)
    {
        b = a1;
        a = i;
        super();
    }

    public final void run()
    {
label0:
        {
            boolean flag1 = false;
            if (!com.nuance.dragon.toolkit.audio.b.a.d(b))
            {
                return;
            }
            b b1 = com.nuance.dragon.toolkit.audio.b.a.e(b);
            ArrayList arraylist;
            int i;
            boolean flag;
            if (b1 != null)
            {
                arraylist = new ArrayList();
                i = com.nuance.dragon.toolkit.audio.b.a.a(b, b1, a, arraylist);
            } else
            {
                arraylist = null;
                i = 0;
            }
            com.nuance.dragon.toolkit.audio.b.a.a(b, a - i);
            flag = flag1;
            if (com.nuance.dragon.toolkit.audio.b.a.f(b) <= 0)
            {
                break label0;
            }
            if (b1 != null)
            {
                flag = flag1;
                if (b1.c())
                {
                    break label0;
                }
            }
            com.nuance.dragon.toolkit.audio.b.a.a(b, 0);
            flag = true;
        }
        b.a.post(new d(this, arraylist, flag));
    }
}
