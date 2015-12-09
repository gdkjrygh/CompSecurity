// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;

import com.nuance.dragon.toolkit.d.b.e;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio:
//            l, e, h

public abstract class b
{

    private final e a = new e();

    public b()
    {
    }

    public abstract int a(l l);

    public abstract com.nuance.dragon.toolkit.audio.e a();

    public void a(l l, List list)
    {
        do
        {
            h h = b(l);
            if (h != null)
            {
                list.add(h);
            } else
            {
                return;
            }
        } while (true);
    }

    public abstract int b();

    public abstract h b(l l);

    protected abstract void c(l l);

    public abstract boolean c();

    protected abstract void d(l l);

    public final List e(l l)
    {
        int i = a(l);
        if (i == 0)
        {
            return a;
        } else
        {
            ArrayList arraylist = new ArrayList(i);
            a(l, arraylist);
            return arraylist;
        }
    }
}
