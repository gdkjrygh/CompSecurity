// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            lw, ly, lj, ll, 
//            lk

class lm extends lw
{

    final lj a;

    private lm(lj lj1)
    {
        a = lj1;
        super(lj1, null);
    }

    lm(lj lj1, lk lk)
    {
        this(lj1);
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof ly)
        {
            obj = (ly)obj;
            return lj.a(a, ((ly) (obj)).a(), ((ly) (obj)).b(), ((ly) (obj)).c());
        } else
        {
            return false;
        }
    }

    public Iterator iterator()
    {
        return new ll(a, null);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof ly)
        {
            obj = (ly)obj;
            return lj.b(a, ((ly) (obj)).a(), ((ly) (obj)).b(), ((ly) (obj)).c());
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a.e();
    }
}
