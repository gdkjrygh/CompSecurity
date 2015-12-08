// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class lang.Object
    implements Runnable
{

    private sX a;

    public final void run()
    {
        for (Iterator iterator = sX.d(a).iterator(); iterator.hasNext(); ((Es)iterator.next()).x_()) { }
    }

    >(sX sx)
    {
        a = sx;
        super();
    }
}
