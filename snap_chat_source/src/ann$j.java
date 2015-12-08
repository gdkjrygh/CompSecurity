// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

static final class ang.String extends Enum
    implements ano, anq
{

    public static final c a;
    private static Set b;
    private static int c;
    private static final til.Set d[];

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(ann$j, s);
    }

    public static final ang.String[] values()
    {
        return ([])d.clone();
    }

    public final int a()
    {
        return c;
    }

    public final int a(anp anp1, String s, int i)
    {
        String s3;
        Iterator iterator;
        s3 = s.substring(i);
        s = null;
        iterator = b.iterator();
_L2:
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s2 = (String)iterator.next();
        if (!s3.startsWith(s2))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_104;
            }
            s1 = s2;
        }
_L3:
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            anp1.a(alw.a(s));
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
        if (alw1 != null)
        {
            alr = alw1.c;
        } else
        {
            alr = "";
        }
        stringbuffer.append(alr);
    }

    public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
    {
    }

    public final int b()
    {
        return c;
    }

    static 
    {
        a = new <init>("INSTANCE");
        d = (new d[] {
            a
        });
        b = alw.b();
        Iterator iterator = b.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = Math.max(i, ((String)iterator.next()).length())) { }
        c = i;
    }

    private (String s)
    {
        super(s, 0);
    }
}
