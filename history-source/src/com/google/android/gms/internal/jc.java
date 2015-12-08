// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            kj, jv

public final class jc extends kj
{
    public static final class a
    {

        public final int Mt;
        public final int Mu;

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
            if (((a) (obj)).Mt != Mt)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((a) (obj)).Mu == Mu) goto _L4; else goto _L5
_L5:
            return false;
        }

        public int hashCode()
        {
            return jv.hashCode(new Object[] {
                Integer.valueOf(Mt), Integer.valueOf(Mu)
            });
        }

        public a(int i, int j)
        {
            Mt = i;
            Mu = j;
        }
    }


    public jc()
    {
        super(10);
    }
}
