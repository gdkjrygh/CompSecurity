// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            am

public final class ak
{
    public static final class a
    {

        private final List a;
        private final Object b;

        public a a(String s, Object obj)
        {
            a.add((new StringBuilder()).append((String)am.a(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(b.getClass().getSimpleName()).append('{');
            int j = a.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)a.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        private a(Object obj)
        {
            b = am.a(obj);
            a = new ArrayList();
        }

        a(Object obj, _cls1 _pcls1)
        {
            this(obj);
        }
    }


    public static transient int a(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static a a(Object obj)
    {
        return new a(obj, null);
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }
}
