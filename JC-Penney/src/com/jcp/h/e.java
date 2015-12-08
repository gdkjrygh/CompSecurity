// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.text.TextUtils;
import com.google.android.gms.analytics.h;
import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.l;
import com.jcp.JCP;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
{

    public static void a(String s)
    {
        l l1 = JCP.r();
        if (l1 != null)
        {
            l1.a(s);
            l1.a((new j()).a());
        }
    }

    public static void a(String s, String s1, String s2)
    {
        a(s, s1, s2, null);
    }

    public static void a(String s, String s1, String s2, Map map)
    {
        l l1 = JCP.r();
        if (l1 == null) goto _L2; else goto _L1
_L1:
        h h1;
        h1 = new h();
        h1.c(s);
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        h1.b(s1);
_L6:
        if (!TextUtils.isEmpty(s2))
        {
            h1.a(s2);
        }
        l1.a(h1.a());
_L2:
        return;
_L4:
        if (map != null && !map.isEmpty())
        {
            s = new StringBuilder("");
            String s3;
            for (s1 = map.keySet().iterator(); s1.hasNext(); s.append((new StringBuilder()).append(s3).append("=").append((String)map.get(s3)).toString()))
            {
                s3 = (String)s1.next();
                if (s.length() > 0)
                {
                    s.append("|");
                }
            }

            h1.b(s.toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
