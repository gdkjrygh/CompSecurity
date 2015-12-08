// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            h

public abstract class z extends h
{

    protected z(String s, m m)
    {
        super(s, m);
    }

    public final boolean a()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (z)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((z) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((z) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + 31;
    }
}
