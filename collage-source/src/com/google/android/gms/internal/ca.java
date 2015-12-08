// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ji, la

public class ca
    implements ji
{

    private int a;
    private int b;
    private final int c;
    private final float d;

    public ca()
    {
        this(2500, 1, 1.0F);
    }

    public ca(int i, int j, float f)
    {
        a = i;
        c = j;
        d = f;
    }

    public int a()
    {
        return a;
    }

    public void a(la la1)
        throws la
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        if (!c())
        {
            throw la1;
        } else
        {
            return;
        }
    }

    public int b()
    {
        return b;
    }

    protected boolean c()
    {
        return b <= c;
    }
}
