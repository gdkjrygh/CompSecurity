// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.io.o;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.p;
import com.google.g.a.a.m;

public final class l
{

    public static com.google.android.apps.gsa.shared.io.l a(m m1, String s)
    {
        p.a(m1);
        p.a(s);
        com.google.android.apps.gsa.shared.io.m m2 = com.google.android.apps.gsa.shared.io.l.a();
        String s1 = String.valueOf(m1.a);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        s = m2.a(s);
        s.i = 14;
        for (int i = 0; i < m1.b.length; i++)
        {
            s.a(m1.b[i], m1.c[i]);
        }

        if (!m1.f)
        {
            s.a("X-S3-Send-Compressible", "1");
        }
        return s.a();
    }

    private static Integer a(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            L.a(5, "S3NetworkUtils", "Failed to parse error header: %s", new Object[] {
                s
            });
            return null;
        }
        return Integer.valueOf(i);
    }

    public static void a(o o1, String s)
    {
        if (o1.a == 200)
        {
            return;
        }
        String s1 = o1.a("X-Speech-S3-Res-Code", "");
        Integer integer;
        if (TextUtils.isEmpty(s1))
        {
            integer = null;
        } else
        {
            integer = a(s1);
        }
        if (integer != null)
        {
            L.a(5, "S3NetworkUtils", "[%s] response code: %d, internal error header: %s", new Object[] {
                s, Integer.valueOf(o1.a), s1
            });
            throw new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(integer.intValue());
        } else
        {
            L.a(5, "S3NetworkUtils", "[%s] response code: %s", new Object[] {
                s, Integer.valueOf(o1.a)
            });
            throw new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.HttpRecognizeException(o1.a);
        }
    }
}
