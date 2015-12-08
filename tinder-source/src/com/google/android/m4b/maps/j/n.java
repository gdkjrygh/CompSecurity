// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.Context;
import android.content.ServiceConnection;

// Referenced classes of package com.google.android.m4b.maps.j:
//            o

public abstract class n
{

    private static final Object a = new Object();
    private static n b;

    public n()
    {
    }

    public static n a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new o(context.getApplicationContext());
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
