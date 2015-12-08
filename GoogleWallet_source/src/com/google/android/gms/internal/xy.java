// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ye, ya, yb, xx

public abstract class xy extends ye
{

    protected ya aYj;

    public xy()
    {
    }

    protected final boolean a(xy xy1)
    {
        if (aYj == null || aYj.isEmpty())
        {
            return xy1.aYj == null || xy1.aYj.isEmpty();
        } else
        {
            return aYj.equals(xy1.aYj);
        }
    }

    protected int c()
    {
        int j = 0;
        int k;
        if (aYj != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= aYj.size())
                {
                    break;
                }
                i += aYj.mr(j).c();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int vL()
    {
        if (aYj == null || aYj.isEmpty())
        {
            return 0;
        } else
        {
            return aYj.hashCode();
        }
    }

    public void writeTo(xx xx)
        throws IOException
    {
        if (aYj != null)
        {
            int i = 0;
            while (i < aYj.size()) 
            {
                aYj.mr(i).writeTo(xx);
                i++;
            }
        }
    }
}
