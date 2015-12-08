// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.b:
//            O

public final class A extends O
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
            return zzw.hashCode(new Object[] {
                Integer.valueOf(a), Integer.valueOf(b)
            });
        }

        public a(int i, int j)
        {
            a = i;
            b = j;
        }
    }


    public A()
    {
        super(10);
    }
}
