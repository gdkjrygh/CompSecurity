// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;

// Referenced classes of package com.android.slyce.a:
//            aj, ay, am

public class ax
    implements e
{

    static final boolean c;
    StringBuilder a;
    ay b;

    public ax()
    {
        a = new StringBuilder();
    }

    public void a(am am, aj aj1)
    {
        do
        {
            byte byte0;
label0:
            {
                if (aj1.d() > 0)
                {
                    byte0 = aj1.i();
                    if (byte0 != 10)
                    {
                        break label0;
                    }
                    if (!c && b == null)
                    {
                        throw new AssertionError();
                    }
                    b.a(a.toString());
                    a = new StringBuilder();
                }
                return;
            }
            a.append((char)byte0);
        } while (true);
    }

    public void a(ay ay1)
    {
        b = ay1;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/ax.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
