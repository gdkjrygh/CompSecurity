// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;


// Referenced classes of package com.android.slyce.a:
//            ah, aj, ap

public class av extends ah
{

    static final boolean g;

    public av(ap ap)
    {
        super(ap);
        a(0);
    }

    public final void a(aj aj1)
    {
        if (!b() || d() == 0x7fffffff)
        {
            aj aj2 = b(aj1);
            if (!g && aj1 != null && aj2 != aj1 && !aj1.c())
            {
                throw new AssertionError();
            }
            super.a(aj2, true);
            if (aj1 != null)
            {
                aj1.m();
                return;
            }
        }
    }

    public aj b(aj aj1)
    {
        return aj1;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/av.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
