// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ijb
    implements ikj
{

    ijb()
    {
    }

    public final ekf a(int i, Object obj)
    {
        boolean flag = false;
        obj = (qgg)obj;
        if (((qgg) (obj)).e == null)
        {
            i = 0;
        } else
        {
            i = ((qgg) (obj)).e.a;
        }
        if (((qgg) (obj)).e != null)
        {
            flag = true;
        }
        return new eew(flag, i);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return eev;
    }
}
