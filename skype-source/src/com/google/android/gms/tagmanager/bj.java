// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

final class bj extends o
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public bj()
    {
        super(a, new String[] {
            b, c
        });
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj = (com.google.android.gms.internal.h.a)map.get(b);
        com.google.android.gms.internal.h.a a1 = (com.google.android.gms.internal.h.a)map.get(c);
        if (obj == null || obj == com.google.android.gms.tagmanager.cl.f() || a1 == null || a1 == com.google.android.gms.tagmanager.cl.f())
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        byte byte0 = 64;
        if (cl.d((com.google.android.gms.internal.h.a)map.get(d)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.h.a)map.get(e);
        int i;
        if (map != null)
        {
            map = cl.c(map);
            if (map == cl.b())
            {
                return com.google.android.gms.tagmanager.cl.f();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return com.google.android.gms.tagmanager.cl.f();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = cl.a(((com.google.android.gms.internal.h.a) (obj)));
            obj = cl.a(a1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        a1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = a1;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = a1;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return com.google.android.gms.tagmanager.cl.f();
        map = cl.a(map);
        return map;
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.M.toString();
        b = f.p.toString();
        c = f.q.toString();
        d = f.bh.toString();
        e = f.bb.toString();
    }
}
