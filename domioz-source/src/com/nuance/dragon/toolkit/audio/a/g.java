// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.c;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.e;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            h

public abstract class g extends c
{

    private l a;
    private boolean b;
    private boolean c;
    private final Handler d = new Handler();

    public g()
    {
    }

    static l a(g g1)
    {
        return g1.a;
    }

    static boolean b(g g1)
    {
        return g1.c;
    }

    static boolean c(g g1)
    {
        g1.c = false;
        return false;
    }

    static boolean d(g g1)
    {
        return g1.b;
    }

    public final int a(l l1)
    {
        if (l1 == a)
        {
            return b();
        } else
        {
            return 0;
        }
    }

    public void a(b b1)
    {
        if (b && b1.c())
        {
            b = false;
        }
        super.a(b1);
    }

    public final void a(l l1, List list)
    {
        if (l1 == a)
        {
            a(list);
        }
    }

    protected void a(List list)
    {
        do
        {
            h h1 = e();
            if (h1 != null)
            {
                list.add(h1);
            } else
            {
                return;
            }
        } while (true);
    }

    public final h b(l l1)
    {
        if (l1 == a)
        {
            return e();
        } else
        {
            return null;
        }
    }

    protected final void c(l l1)
    {
        a = l1;
        d.post(new com.nuance.dragon.toolkit.audio.a.h(this, l1));
    }

    protected final void d(l l1)
    {
        if (l1 == a)
        {
            a = null;
            return;
        } else
        {
            com.nuance.dragon.toolkit.d.e.c(this, "Wrong sink disconnected");
            return;
        }
    }

    protected abstract h e();

    protected final void f()
    {
        if (a != null)
        {
            a.a(this);
        }
    }

    protected final void g()
    {
        if (a != null)
        {
            a.a();
            return;
        } else
        {
            c = true;
            return;
        }
    }

    protected final void h()
    {
label0:
        {
            if (!b)
            {
                if (a == null)
                {
                    break label0;
                }
                a.b(this);
            }
            return;
        }
        b = true;
    }
}
