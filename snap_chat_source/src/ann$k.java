// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

static final class a
    implements ano, anq
{

    private final int a;

    public final int a()
    {
        return a != 1 ? 20 : 4;
    }

    public final int a(anp anp1, String s, int i)
    {
        Map map;
        String s3;
        Iterator iterator;
        map = alv.b();
        s3 = s.substring(i);
        s = null;
        iterator = map.keySet().iterator();
_L2:
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s2 = (String)iterator.next();
        if (!s3.startsWith(s2))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_120;
            }
            s1 = s2;
        }
_L3:
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            anp1.a((alw)map.get(s));
            return s.length() + i;
        } else
        {
            return ~i;
        }
        s1 = s;
          goto _L3
    }

    public final void a(StringBuffer stringbuffer, long l, alr alr, int i, alw alw1, Locale locale)
    {
        l -= i;
        if (alw1 == null) goto _L2; else goto _L1
_L1:
        a;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 48
    //                   1 127;
           goto _L2 _L3 _L4
_L2:
        alr = "";
_L6:
        stringbuffer.append(alr);
        return;
_L3:
        alr = locale;
        if (locale == null)
        {
            alr = Locale.getDefault();
        }
        locale = alw1.a(l);
        if (locale == null)
        {
            alr = alw1.c;
        } else
        {
            locale = alw.b.b(alr, alw1.c, locale);
            alr = locale;
            if (locale == null)
            {
                alr = alw.b(alw1.b(l));
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        alr = locale;
        if (locale == null)
        {
            alr = Locale.getDefault();
        }
        locale = alw1.a(l);
        if (locale == null)
        {
            alr = alw1.c;
        } else
        {
            locale = alw.b.a(alr, alw1.c, locale);
            alr = locale;
            if (locale == null)
            {
                alr = alw.b(alw1.b(l));
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
    {
    }

    public final int b()
    {
        return a != 1 ? 20 : 4;
    }

    (int i)
    {
        a = i;
    }
}
