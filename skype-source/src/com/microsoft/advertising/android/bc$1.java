// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;

// Referenced classes of package com.microsoft.advertising.android:
//            bc, AdWebView, an

final class c
    implements c
{

    final bc a;
    private final String b;
    private final String c;

    public final void a(String s)
    {
label0:
        {
            if (!TextUtils.isEmpty(b) && b.equalsIgnoreCase("proxy"))
            {
                if (!s.equalsIgnoreCase("exception"))
                {
                    break label0;
                }
                a.a.c("response", "Could not read uri content");
            }
            return;
        }
        a.a.k().a(c, s);
    }

    View(bc bc1, String s, String s1)
    {
        a = bc1;
        b = s;
        c = s1;
        super();
    }
}
