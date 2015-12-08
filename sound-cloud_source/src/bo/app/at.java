// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;

// Referenced classes of package bo.app:
//            be, ao, cb

public final class at
    implements b
{

    final ao a;

    public at(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (be)obj;
        ao.g(a).a(((be) (obj)).a);
    }
}
