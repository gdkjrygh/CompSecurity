// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import com.facebook.common.w.d;
import com.facebook.common.w.n;
import java.text.CollationKey;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.Locale;

// Referenced classes of package com.facebook.user.a:
//            n

public class k
    implements com.facebook.user.a.n
{

    private static final RuleBasedCollator a;
    private static final RuleBasedCollator b;

    public k()
    {
    }

    private static String b(String s)
    {
        char ac[] = s.toCharArray();
        int i = 0;
        int j;
        int l;
        for (j = 0; i < ac.length; j = l)
        {
            char c = ac[i];
            l = j;
            if (Character.isLetterOrDigit(c))
            {
                ac[j] = c;
                l = j + 1;
            }
            i++;
        }

        if (j != ac.length)
        {
            s = new String(ac, 0, j);
        }
        return s;
    }

    public String a(String s)
    {
        s = n.a(s);
        return d.a(a.getCollationKey(b(s)).toByteArray(), true);
    }

    static 
    {
        a = (RuleBasedCollator)Collator.getInstance(Locale.getDefault());
        a.setStrength(0);
        a.setDecomposition(1);
        b = (RuleBasedCollator)Collator.getInstance(Locale.getDefault());
        b.setStrength(2);
    }
}
