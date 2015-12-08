// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

private abstract class b extends b
{

    public final int a;
    public final Bundle b;
    final m c;

    protected abstract void a(ConnectionResult connectionresult);

    protected void a(Boolean boolean1)
    {
        Object obj = null;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        m.zza(c, 1, null);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            m.zza(c, 1, null);
            boolean1 = obj;
            if (b != null)
            {
                boolean1 = (PendingIntent)b.getParcelable("pendingIntent");
            }
            a(new ConnectionResult(a, boolean1));
            return;

        case 0: // '\0'
            if (!a())
            {
                m.zza(c, 1, null);
                a(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            m.zza(c, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(Object obj)
    {
        a((Boolean)obj);
    }

    protected abstract boolean a();

    protected void b()
    {
    }

    protected ult(m m1, int i, Bundle bundle)
    {
        c = m1;
        super(m1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }
}
