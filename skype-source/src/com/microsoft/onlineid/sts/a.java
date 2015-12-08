// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import com.microsoft.onlineid.internal.e.f;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.sts:
//            b

public final class a
{

    private final f a;
    private final Context b;

    public a(Context context)
    {
        b = context;
        a = new f(context);
    }

    public final b a(String s)
    {
        for (Iterator iterator = a.e().iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (s.equalsIgnoreCase(b1.d()))
            {
                return b1;
            }
        }

        return null;
    }

    public final Set a(Set set)
    {
        Set set1 = a.e();
        if (set != null && !set.isEmpty())
        {
            Iterator iterator = set1.iterator();
            while (iterator.hasNext()) 
            {
                if (set.contains(((b)iterator.next()).d()))
                {
                    iterator.remove();
                }
            }
        }
        return set1;
    }

    public final boolean a()
    {
        return a.d();
    }

    public final b b(String s)
    {
        return a.a(s);
    }

    public final Set b()
    {
        return a.e();
    }
}
