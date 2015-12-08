// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            kw, kp

public abstract class kv
{

    protected int n;

    public kv()
    {
        n = -1;
    }

    public int a()
    {
        if (n < 0)
        {
            b();
        }
        return n;
    }

    public void a(kp kp)
    {
    }

    public int b()
    {
        n = 0;
        return 0;
    }

    public String toString()
    {
        return kw.a(this);
    }
}
