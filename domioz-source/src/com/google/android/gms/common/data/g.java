// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ap;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class g
{

    protected final DataHolder a;
    protected int b;
    private int c;

    public g(DataHolder dataholder, int i)
    {
        a = (DataHolder)ap.a(dataholder);
        boolean flag;
        if (i >= 0 && i < a.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag);
        b = i;
        c = a.a(b);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof g)
        {
            obj = (g)obj;
            flag = flag1;
            if (an.a(Integer.valueOf(((g) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (an.a(Integer.valueOf(((g) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((g) (obj)).a == a)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a
        });
    }
}
