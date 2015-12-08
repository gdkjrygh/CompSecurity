// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class kbp extends kbr
{

    private int a;
    private Bundle b;
    private kbo c;

    protected kbp(kbo kbo1, int i, Bundle bundle)
    {
        c = kbo1;
        super(kbo1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }

    protected abstract void a(ConnectionResult connectionresult);

    protected final void a(Object obj)
    {
        Object obj1 = null;
        if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
        kbo.a(c, 1, null);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            kbo.a(c, 1, null);
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
                kbo.a(c, 1, null);
                a(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            kbo.a(c, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract boolean a();
}
