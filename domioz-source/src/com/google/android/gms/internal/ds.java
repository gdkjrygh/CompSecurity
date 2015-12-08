// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            a, dq, fj, dt

public final class ds
{

    private final String a;

    public final boolean a(String s, Intent intent)
    {
        Object obj = null;
        if (s == null || intent == null)
        {
            return false;
        }
        com.google.android.gms.internal.a.i();
        String s1;
        if (intent == null)
        {
            s1 = null;
        } else
        {
            s1 = intent.getStringExtra("INAPP_PURCHASE_DATA");
        }
        com.google.android.gms.internal.a.i();
        if (intent == null)
        {
            intent = obj;
        } else
        {
            intent = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        }
        if (s1 == null || intent == null)
        {
            return false;
        }
        com.google.android.gms.internal.a.i();
        if (!s.equals(dq.a(s1)))
        {
            fj.e("Developer payload not match.");
            return false;
        }
        if (a != null)
        {
            s = a;
            boolean flag;
            if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(intent))
            {
                fj.b("Purchase verification failed: missing data.");
                flag = false;
            } else
            {
                flag = dt.a(dt.a(s), s1, intent);
            }
            if (!flag)
            {
                fj.e("Fail to verify signature.");
                return false;
            }
        }
        return true;
    }
}
