// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ebi
    implements ebh
{

    ebi()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (ozs)obj;
        if (((ozs) (obj)).b.c.length > 0 && ((ozs) (obj)).b.c[0].b != null && ((ozs) (obj)).b.c[0].b.f.length > 0 && ((ozs) (obj)).b.c[0].b.f[0].a == 6)
        {
            obj = esm.c;
        } else
        if (((ozs) (obj)).b.a.length > 0 && ((ozs) (obj)).b.a[0].e != null && ((ozs) (obj)).b.a[0].e.a == 8)
        {
            obj = esm.d;
        } else
        {
            obj = esm.b;
        }
        return new hkf(((esm) (obj)));
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return hkf;
    }
}
