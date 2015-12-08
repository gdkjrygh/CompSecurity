// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.content.Context;
import java.util.Locale;

// Referenced classes of package com.pandora.android.iap:
//            a

class a
    implements com.pandora.android.countdown.
{

    final a a;

    public String a(long l, long l1)
    {
        int j = (int)l / 3600;
        if (j < 24)
        {
            StringBuilder stringbuilder = new StringBuilder();
            int j1 = (int)l - j * 3600;
            int k = j1 / 60;
            int i = k;
            if (j1 - k * 60 > 0)
            {
                i = k + 1;
            }
            if (i > 59)
            {
                i = j + 1;
                j = 0;
            } else
            {
                int i1 = i;
                i = j;
                j = i1;
            }
            if (i > 0)
            {
                stringbuilder.append(i);
                String s;
                if (j > 0)
                {
                    s = "h ";
                } else
                {
                    s = "h";
                }
                stringbuilder.append(s);
            }
            if (j > 0)
            {
                stringbuilder.append(j);
                stringbuilder.append("m");
            }
            return String.format(Locale.getDefault(), com.pandora.android.iap.a.f(a).getString(0x7f08007e), new Object[] {
                stringbuilder.toString()
            });
        } else
        {
            i = (int)l1 / 0x15180;
            j = (int)Math.ceil((double)j / 24D);
            return String.format(Locale.getDefault(), com.pandora.android.iap.a.f(a).getString(0x7f08007f), new Object[] {
                com.pandora.android.iap.a.j()[i - j]
            });
        }
    }

    n.c.a(a a1)
    {
        a = a1;
        super();
    }
}
