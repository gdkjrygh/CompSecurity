// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            n, k, t, v

abstract class l extends n
{

    public final int a;
    public final Bundle b;
    final k c;

    protected l(k k1, int i, Bundle bundle)
    {
        c = k1;
        super(k1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }

    private void a(ConnectionResult connectionresult)
    {
        k.a(c).a(connectionresult);
    }

    protected final void a(Object obj)
    {
        Object obj1 = null;
        if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
        k.a(c, 1);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            obj = obj1;
            if (b != null)
            {
                obj = (PendingIntent)b.getParcelable("pendingIntent");
            }
            if (k.f(c) != null)
            {
                v v1 = k.g(c);
                String s1 = c.e();
                p p1 = k.f(c);
                c.g();
                v1.a(s1, p1);
                k.h(c);
            }
            k.a(c, 1);
            a(new ConnectionResult(a, ((PendingIntent) (obj))));
            return;

        case 0: // '\0'
            if (!a())
            {
                if (k.f(c) != null)
                {
                    obj = k.g(c);
                    String s = c.e();
                    p p = k.f(c);
                    c.g();
                    ((v) (obj)).a(s, p);
                    k.h(c);
                }
                k.a(c, 1);
                a(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            k.a(c, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract boolean a();
}
