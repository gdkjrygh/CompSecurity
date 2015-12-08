// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.encode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.zxing.client.android.encode:
//            Formatter

abstract class ContactEncoder
{

    ContactEncoder()
    {
    }

    static void doAppend(StringBuilder stringbuilder, StringBuilder stringbuilder1, String s, String s1, Formatter formatter, char c)
    {
        s1 = trim(s1);
        if (s1 != null)
        {
            stringbuilder.append(s).append(':').append(formatter.format(s1)).append(c);
            stringbuilder1.append(s1).append('\n');
        }
    }

    static void doAppendUpToUnique(StringBuilder stringbuilder, StringBuilder stringbuilder1, String s, Iterable iterable, int i, Formatter formatter, Formatter formatter1, char c)
    {
        if (iterable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        HashSet hashset;
        Iterator iterator;
        int j;
        j = 0;
        hashset = new HashSet(2);
        iterator = iterable.iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        String s1 = trim((String)iterator.next());
        if (s1 == null || s1.isEmpty() || hashset.contains(s1)) goto _L5; else goto _L4
_L4:
        stringbuilder.append(s).append(':').append(formatter1.format(s1)).append(c);
        if (formatter == null)
        {
            iterable = s1;
        } else
        {
            iterable = formatter.format(s1);
        }
        stringbuilder1.append(iterable).append('\n');
        j++;
        if (j == i) goto _L1; else goto _L6
_L6:
        hashset.add(s1);
          goto _L5
    }

    static String trim(String s)
    {
        if (s == null)
        {
            return null;
        }
        String s1 = s.trim();
        s = s1;
        if (s1.isEmpty())
        {
            s = null;
        }
        return s;
    }

    abstract String[] encode(Iterable iterable, String s, Iterable iterable1, Iterable iterable2, Iterable iterable3, Iterable iterable4, String s1);
}
