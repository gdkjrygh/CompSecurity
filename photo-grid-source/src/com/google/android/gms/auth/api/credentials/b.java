// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            c, PasswordSpecification

public final class b
{

    private final TreeSet a = new TreeSet();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private int d;
    private int e;

    public b()
    {
        d = 12;
        e = 16;
    }

    private static TreeSet a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new c((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
        }
        TreeSet treeset = new TreeSet();
        s = s.toCharArray();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            char c1 = s[i];
            if (PasswordSpecification.a(c1))
            {
                throw new c((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
            }
            treeset.add(Character.valueOf(c1));
        }

        return treeset;
    }

    public final b a()
    {
        d = 12;
        e = 16;
        return this;
    }

    public final b a(String s)
    {
        a.addAll(a(s, "allowedChars"));
        return this;
    }

    public final PasswordSpecification b()
    {
        if (a.isEmpty())
        {
            throw new c("no allowed characters specified");
        }
        Iterator iterator = c.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Integer)iterator.next()).intValue() + i) { }
        if (i > e)
        {
            throw new c("required character count cannot be greater than the max password size");
        }
        boolean aflag[] = new boolean[95];
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext();)
        {
            char ac[] = ((String)iterator1.next()).toCharArray();
            int k = ac.length;
            int j = 0;
            while (j < k) 
            {
                char c1 = ac[j];
                if (aflag[c1 - 32])
                {
                    throw new c((new StringBuilder("character ")).append(c1).append(" occurs in more than one required character set").toString());
                }
                aflag[c1 - 32] = true;
                j++;
            }
        }

        return new PasswordSpecification(1, PasswordSpecification.a(a), b, c, d, e);
    }

    public final b b(String s)
    {
        s = a(s, "requiredChars");
        b.add(PasswordSpecification.a(s));
        c.add(Integer.valueOf(1));
        return this;
    }
}
