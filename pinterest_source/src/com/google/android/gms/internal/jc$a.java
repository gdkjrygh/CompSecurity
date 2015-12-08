// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            jv

public final class Mu
{

    public final int Mt;
    public final int Mu;

    public final boolean equals(Object obj)
    {
        if (obj instanceof Mu)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (Mu)obj;
            if (((Mu) (obj)).Mt == Mt && ((Mt) (obj)).Mu == Mu)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(Mt), Integer.valueOf(Mu)
        });
    }

    public (int i, int j)
    {
        Mt = i;
        Mu = j;
    }
}
