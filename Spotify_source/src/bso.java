// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ServiceConnection;

public abstract class bso
{

    private static final Object a = new Object();
    private static bso b;

    public bso()
    {
    }

    public static bso a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new bsp(context.getApplicationContext());
            }
        }
        return b;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract void a(String s, ServiceConnection serviceconnection);

    public abstract boolean a(String s, ServiceConnection serviceconnection, String s1);

}
