// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class kxm
{

    static kyz a;
    private static final Object b = new Object();

    public kxm(Context context)
    {
        a = a(context);
    }

    private static kyz a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = b.a(context.getApplicationContext(), null);
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

}
