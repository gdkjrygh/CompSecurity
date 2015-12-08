// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cn, cm, do

final class cp
    implements Runnable
{

    final do a;
    final cn b;

    cp(cn cn1, do do1)
    {
        b = cn1;
        a = do1;
        super();
    }

    public final void run()
    {
        synchronized (cn.a(b))
        {
            cn.b(b).a(a);
        }
    }
}
