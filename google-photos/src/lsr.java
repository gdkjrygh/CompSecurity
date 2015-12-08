// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class lsr extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;

    public lsr()
    {
        super(b, new String[] {
            c, d
        });
    }

    public final ksp a(Map map)
    {
        Object obj = (ksp)map.get(c);
        ksp ksp1 = (ksp)map.get(d);
        if (obj == null || obj == ltw.f() || ksp1 == null || ksp1 == ltw.f())
        {
            return ltw.f();
        }
        byte byte0 = 64;
        if (ltw.d((ksp)map.get(e)).booleanValue())
        {
            byte0 = 66;
        }
        map = (ksp)map.get(f);
        int i;
        if (map != null)
        {
            map = ltw.c(map);
            if (map == ltw.b())
            {
                return ltw.f();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return ltw.f();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = ltw.a(((ksp) (obj)));
            obj = ltw.a(ksp1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return ltw.f();
        }
        ksp1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = ksp1;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = ksp1;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return ltw.f();
        map = ltw.a(map);
        return map;
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.B.toString();
        c = ksf.f.toString();
        d = ksf.g.toString();
        e = ksf.s.toString();
        f = ksf.r.toString();
    }
}
