// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

public final class cbv extends bex
{

    private final cbs a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public cbv(cbs cbs1)
    {
        Object obj;
        obj = null;
        super();
        a = cbs1;
        cbs1 = a.a();
        if (cbs1 == null) goto _L2; else goto _L1
_L1:
        cbs1 = (Drawable)bye.a(cbs1);
_L3:
        b = cbs1;
        double d1;
        double d2;
        try
        {
            cbs1 = a.b();
        }
        // Misplaced declaration of an exception variable
        catch (cbs cbs1)
        {
            bka.b("Failed to get uri.", cbs1);
            cbs1 = obj;
        }
        c = cbs1;
        d1 = 1.0D;
        d2 = a.c();
        d1 = d2;
_L4:
        d = d1;
        return;
        cbs1;
        bka.b("Failed to get drawable.", cbs1);
_L2:
        cbs1 = null;
          goto _L3
        cbs1;
        bka.b("Failed to get scale.", cbs1);
          goto _L4
    }

    public final Drawable a()
    {
        return b;
    }

    public final Uri b()
    {
        return c;
    }

    public final double c()
    {
        return d;
    }
}
