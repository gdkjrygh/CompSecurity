// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dv, dc, ek, cf, 
//            ct, cd

public abstract class cu extends dv
{

    private final cd a;
    private final ct b;

    public cu(cd cd, ct ct1)
    {
        a = cd;
        b = ct1;
    }

    private static cf a(dc dc1, cd cd)
    {
        try
        {
            dc1 = dc1.a(cd);
        }
        // Misplaced declaration of an exception variable
        catch (dc dc1)
        {
            ek.a("Could not fetch ad response from ad request service.", dc1);
            return null;
        }
        return dc1;
    }

    public final void a()
    {
        Object obj = d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new cf(0);
_L4:
        c();
        b.a(((cf) (obj)));
        return;
_L2:
        cf cf1 = a(((dc) (obj)), a);
        obj = cf1;
        if (cf1 != null) goto _L4; else goto _L3
_L3:
        obj = new cf(0);
          goto _L4
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public final void b_()
    {
        c();
    }

    public abstract void c();

    public abstract dc d();
}
