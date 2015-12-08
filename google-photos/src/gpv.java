// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class gpv
    implements Runnable
{

    private gpu a;

    gpv(gpu gpu1)
    {
        a = gpu1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = gpu.a(a).iterator(); iterator.hasNext(); ((gpz)iterator.next()).a()) { }
    }
}
