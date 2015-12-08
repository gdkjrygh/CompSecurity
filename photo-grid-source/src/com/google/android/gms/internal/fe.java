// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ws, xm

public final class fe
    implements ws
{

    private int a;
    private int b;
    private final int c;
    private final float d;

    public fe()
    {
        this((byte)0);
    }

    private fe(byte byte0)
    {
        a = 2500;
        c = 1;
        d = 1.0F;
    }

    public final int a()
    {
        return a;
    }

    public final void a(xm xm)
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        boolean flag;
        if (b <= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw xm;
        } else
        {
            return;
        }
    }

    public final int b()
    {
        return b;
    }
}
