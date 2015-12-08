// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ebf
    implements ebh
{

    ebf()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (ozs)obj;
        if (b.a(((ozs) (obj)).b.c) || ((ozs) (obj)).b.c[0].b == null || ((ozs) (obj)).b.c[0].b.h == null)
        {
            return null;
        } else
        {
            return new iks(((ozs) (obj)).b.c[0].b.h);
        }
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return iks;
    }
}
