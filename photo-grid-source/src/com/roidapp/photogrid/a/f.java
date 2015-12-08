// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import android.content.Context;
import android.os.RemoteException;
import com.a.d.a.a;

// Referenced classes of package com.roidapp.photogrid.a:
//            e, d, l, j

final class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        if (a.b.g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = a.b.g.getPackageName();
        a.b.a("Checking for in-app billing 3 support.");
        if (a.b.h == null) goto _L1; else goto _L3
_L3:
        int i = a.b.h.a(3, ((String) (obj)), "inapp");
        if (i == 0) goto _L5; else goto _L4
_L4:
        try
        {
            if (a.a != null)
            {
                a.a.a(new l(i, "Error checking for billing v3 support."));
            }
            a.b.d = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (a.a != null)
            {
                a.a.a(new l(-1001, "RemoteException while setting up in-app billing."));
            }
            ((RemoteException) (obj)).printStackTrace();
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            if (a.a != null)
            {
                a.a.a(new l(-1001, "NullPointerException while setting up in-app billing."));
            }
            nullpointerexception.printStackTrace();
        }
          goto _L6
_L5:
        a.b.a((new StringBuilder("In-app billing version 3 supported for ")).append(((String) (obj))).toString());
        if (a.b.h == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        i = a.b.h.a(3, ((String) (obj)), "subs");
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        a.b.a("Subscriptions AVAILABLE.");
        a.b.d = true;
_L8:
        a.b.c = true;
_L6:
        if (a.a == null) goto _L1; else goto _L7
_L7:
        a.a.a(new l(0, "Setup successful."));
        return;
        a.b.a((new StringBuilder("Subscriptions NOT AVAILABLE. Response: ")).append(i).toString());
          goto _L8
    }
}
