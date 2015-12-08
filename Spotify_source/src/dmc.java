// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public final class dmc
{

    public static String a(Set set, String s, long l)
    {
        gfq gfq1;
        Iterator iterator;
        long l1;
        ctz.a(set);
        Object obj = null;
        l1 = 0L;
        gfq1 = new gfq();
        iterator = set.iterator();
        set = obj;
_L2:
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)iterator.next();
        long l3;
        gfq1.a(s1);
        l3 = gfq1.b();
        long l2;
        l2 = l3;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        boolean flag = s.startsWith(s1);
        l2 = l3;
        if (flag)
        {
            l2 = l3 + l;
        }
        if (l2 > l1)
        {
            set = s1;
            l1 = l2;
        }
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        Assertion.c((new StringBuilder("Tried to stat path ")).append(s1).append(" but failed with exception: ").append(ioexception.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return set;
    }
}
