// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.text.TextUtils;

public final class bio
{

    private final String a;

    public bio(String s)
    {
        a = s;
    }

    public final boolean a(String s, Intent intent)
    {
        if (s != null && intent != null)
        {
            bkv.o();
            String s1 = bim.b(intent);
            bkv.o();
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            }
            if (s1 != null && intent != null)
            {
                bkv.o();
                if (!s.equals(bim.a(s1)))
                {
                    bka.e("Developer payload not match.");
                    return false;
                }
                if (a != null)
                {
                    s = a;
                    boolean flag;
                    if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(intent))
                    {
                        bka.b("Purchase verification failed: missing data.");
                        flag = false;
                    } else
                    {
                        flag = bip.a(bip.a(s), s1, intent);
                    }
                    if (!flag)
                    {
                        bka.e("Fail to verify signature.");
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
