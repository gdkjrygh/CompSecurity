// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.n;

// Referenced classes of package com.google.android.gms.internal:
//            ja

public final class iz extends ja
{
    public static final class a
    {

        public final int Lp;
        public final int Lq;

        public boolean equals(Object obj)
        {
            boolean flag1 = true;
            if (obj instanceof a) goto _L2; else goto _L1
_L1:
            boolean flag = false;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (this == obj) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            if (((a) (obj)).Lp != Lp)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((a) (obj)).Lq == Lq) goto _L4; else goto _L5
_L5:
            return false;
        }

        public int hashCode()
        {
            return n.hashCode(new Object[] {
                Integer.valueOf(Lp), Integer.valueOf(Lq)
            });
        }

        public a(int i, int j)
        {
            Lp = i;
            Lq = j;
        }
    }


    public iz()
    {
        super(10);
    }
}
