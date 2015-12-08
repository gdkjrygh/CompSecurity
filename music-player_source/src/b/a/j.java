// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import java.util.Arrays;

// Referenced classes of package b.a:
//            et, eh, ia

public final class j
{

    private int a;
    private final long b = 60000L;

    public j()
    {
        a = 0;
    }

    public final long a()
    {
        switch (a)
        {
        default:
            return 0L;

        case 1: // '\001'
            return 0xdbba00L;

        case 2: // '\002'
            return 0x1b77400L;

        case 3: // '\003'
            return 0x5265c00L;
        }
    }

    public final et a(Context context, et et1)
    {
        if (et1 == null)
        {
            context = null;
        } else
        {
            if (a == 1)
            {
                et1.i();
                return et1;
            }
            if (a == 2)
            {
                long l = System.currentTimeMillis();
                eh eh1 = new eh();
                eh1.a(ia.c(context));
                eh1.a(l);
                eh1.b(l + 60000L);
                eh1.c(60000L);
                et1.a(Arrays.asList(new eh[] {
                    eh1
                }));
                et1.i();
                return et1;
            }
            context = et1;
            if (a == 3)
            {
                et1.a(null);
                et1.i();
                return et1;
            }
        }
        return context;
    }

    public final void a(int i)
    {
        if (i >= 0 && i <= 3)
        {
            a = i;
        }
    }

    public final boolean b()
    {
        return a != 0;
    }
}
