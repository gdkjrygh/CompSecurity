// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.paypal.android.sdk.payments.PayPalService;
import java.util.Iterator;
import java.util.List;

public final class bzp
    implements Runnable
{

    private Context a;

    public bzp(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        PayPalService.y();
        Object obj = a;
        new ccu();
        obj = new bsx(((Context) (obj)), "AndroidBasePrefs");
        btl.a(((bsx) (obj)));
        bto.a(((bsx) (obj)));
        String s;
        for (Iterator iterator = (new bzq()).iterator(); iterator.hasNext(); bur.b(s))
        {
            s = (String)iterator.next();
            bsy bsy1 = new bsy(((bsx) (obj)), s);
            bsy1.b();
            bsy1.c();
        }

        obj = new Intent("com.paypal.android.sdk.clearAllUserData");
        byq.a(a).a(((Intent) (obj)));
        PayPalService.y();
    }
}
