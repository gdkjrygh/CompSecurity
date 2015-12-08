// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            o

public final class n
{
    public static final class a
    {

        private final List Mg;
        private final Object Mh;

        public a a(String s, Object obj)
        {
            Mg.add((new StringBuilder()).append((String)o.i(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(Mh.getClass().getSimpleName()).append('{');
            int j = Mg.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)Mg.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        private a(Object obj)
        {
            Mh = o.i(obj);
            Mg = new ArrayList();
        }

    }


    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static a h(Object obj)
    {
        return new a(obj);
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }
}
