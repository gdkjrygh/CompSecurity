// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ih

public final class id extends ih
{
    public static final class a
    {

        public final int a;
        public final int b;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (a)obj;
                if (((a) (obj)).a == a && ((a) (obj)).b == b)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Integer.valueOf(a), Integer.valueOf(b)
            });
        }

        public a(int i, int j)
        {
            a = i;
            b = j;
        }
    }

}
