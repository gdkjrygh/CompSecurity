// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class gse
    implements np, opv
{

    public final SparseArray a = new SparseArray();

    public gse(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(int i, float f, int j)
    {
        am am1 = c(i);
        if (am1 != null)
        {
            am1.g_(true);
        }
        if (f > 0.0F)
        {
            am am2 = c(i + 1);
            if (am2 != null)
            {
                am2.g_(true);
            }
        }
    }

    public final void a(int i, am am1)
    {
        a.put(i, am1);
    }

    public final void b(int i)
    {
    }

    public final am c(int i)
    {
        return (am)a.get(i);
    }

    public final void c_(int i)
    {
    }
}
