// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster;

import android.os.Handler;
import android.os.RemoteException;
import java.util.List;

public abstract class b extends com.qihoo360.mobilesafe.core.c.b
{

    private static final String a = "pbca";
    private Handler b;
    private long c;

    public b(Handler handler)
    {
        b = null;
        b = handler;
    }

    static long a(b b1)
    {
        return b1.c;
    }

    public void a()
        throws RemoteException
    {
        super.a();
        c = System.currentTimeMillis();
    }

    public abstract void a(List list);

    public void a(List list, boolean flag)
        throws RemoteException
    {
        super.a(list, flag);
        if (b != null)
        {
            b.post(new Runnable(list) {

                final List a;
                final b b;

                public void run()
                {
                    b.a(a);
                    com.qihoo.security.support.b.b(11321, (int)(System.currentTimeMillis() - b.a(b)));
                }

            
            {
                b = b.this;
                a = list;
                super();
            }
            });
        }
    }

    public abstract void a_(int i, int j);

    public void b(int i, int j)
        throws RemoteException
    {
        super.b(i, j);
        if (b != null)
        {
            b.post(new Runnable(i, j) {

                final int a;
                final int b;
                final b c;

                public void run()
                {
                    c.a_(a, b);
                }

            
            {
                c = b.this;
                a = i;
                b = j;
                super();
            }
            });
        }
    }

}
