// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            yf, xx

public abstract class ye
{

    protected volatile int aYu;

    public ye()
    {
        aYu = -1;
    }

    protected int c()
    {
        return 0;
    }

    public final int getCachedSize()
    {
        if (aYu < 0)
        {
            getSerializedSize();
        }
        return aYu;
    }

    public final int getSerializedSize()
    {
        int i = c();
        aYu = i;
        return i;
    }

    public String toString()
    {
        return yf.f(this);
    }

    public void writeTo(xx xx)
        throws IOException
    {
    }
}
