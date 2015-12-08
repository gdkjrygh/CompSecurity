// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class bsd extends bsf
{

    private int a;
    private Bundle b;
    private bsc c;

    protected bsd(bsc bsc1, int i, Bundle bundle)
    {
        c = bsc1;
        super(bsc1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }

    protected abstract void a(ConnectionResult connectionresult);

    protected final void a(Object obj)
    {
        Object obj1 = null;
        if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
        bsc.a(c, 1);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            bsc.a(c, 1);
            obj = obj1;
            if (b != null)
            {
                obj = (PendingIntent)b.getParcelable("pendingIntent");
            }
            a(new ConnectionResult(a, ((PendingIntent) (obj))));
            return;

        case 0: // '\0'
            if (!a())
            {
                bsc.a(c, 1);
                a(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            bsc.a(c, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract boolean a();
}
