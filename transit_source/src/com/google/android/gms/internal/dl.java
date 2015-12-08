// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dm

public final class dl
{
    public static final class a
    {

        private final List lj;
        private final Object lk;

        public a a(String s, Object obj)
        {
            lj.add((new StringBuilder()).append((String)dm.e(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(lk.getClass().getSimpleName()).append('{');
            int j = lj.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)lj.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        private a(Object obj)
        {
            lk = dm.e(obj);
            lj = new ArrayList();
        }

    }


    public static a d(Object obj)
    {
        return new a(obj);
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }
}
