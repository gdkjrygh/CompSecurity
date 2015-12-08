// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package b.a:
//            a, ff

public final class hc extends a
{

    private Context a;

    public hc(Context context)
    {
        super("imei");
        a = context;
    }

    public final String g()
    {
        Object obj = (TelephonyManager)a.getSystemService("phone");
        if (!ff.a(a, "android.permission.READ_PHONE_STATE"))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj = ((TelephonyManager) (obj)).getDeviceId();
        return ((String) (obj));
        Exception exception;
        exception;
        return null;
    }
}
