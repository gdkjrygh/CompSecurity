// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            i, l

public final class k
{

    private final String a;

    public k(String s)
    {
        a = s;
    }

    public final boolean a(String s, Intent intent)
    {
        if (s != null && intent != null)
        {
            p.o();
            String s1 = com.google.android.gms.ads.internal.purchase.i.b(intent);
            p.o();
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            }
            if (s1 != null && intent != null)
            {
                p.o();
                if (!s.equals(i.a(s1)))
                {
                    b.c("Developer payload not match.");
                    return false;
                }
                if (a != null)
                {
                    s = a;
                    boolean flag;
                    if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(intent))
                    {
                        b.a("Purchase verification failed: missing data.");
                        flag = false;
                    } else
                    {
                        flag = l.a(l.a(s), s1, intent);
                    }
                    if (!flag)
                    {
                        b.c("Fail to verify signature.");
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
