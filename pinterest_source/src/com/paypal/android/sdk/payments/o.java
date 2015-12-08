// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Bundle;
import com.paypal.android.sdk.bN;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            m

class o
{

    private static final String a = com/paypal/android/sdk/payments/o.getSimpleName();

    o()
    {
    }

    public static m a(Bundle bundle)
    {
        String s = bundle.getString("authAccount");
        String s1 = bundle.getString("code");
        String s2 = bundle.getString("nonce");
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s3 = (String)iterator.next();
            Object obj = bundle.get(s3);
            if (obj == null)
            {
                String.format("%s:null", new Object[] {
                    s3
                });
            } else
            {
                String.format("%s:%s (%s)", new Object[] {
                    s3, obj.toString(), obj.getClass().getName()
                });
            }
        }

        return new m(s2, new bN(s1, null), s);
    }

}
