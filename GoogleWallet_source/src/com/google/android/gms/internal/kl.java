// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kn

public final class kl
{
    public static final class a
    {

        private final List Wu;
        private final Object Wv;

        public final a a(String s, Object obj)
        {
            Wu.add((new StringBuilder()).append((String)kn.k(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(Wv.getClass().getSimpleName()).append('{');
            int k = Wu.size();
            for (int i = 0; i < k; i++)
            {
                stringbuilder.append((String)Wu.get(i));
                if (i < k - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        private a(Object obj)
        {
            Wv = kn.k(obj);
            Wu = new ArrayList();
        }

    }


    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static a j(Object obj)
    {
        return new a(obj);
    }
}
