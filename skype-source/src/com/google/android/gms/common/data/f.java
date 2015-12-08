// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class f
{

    protected final DataHolder a;
    protected int b;
    private int c;

    public f(DataHolder dataholder, int i)
    {
        a = (DataHolder)y.a(dataholder);
        boolean flag;
        if (i >= 0 && i < a.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag);
        b = i;
        c = a.a(b);
    }

    public final boolean a(String s)
    {
        return a.a.containsKey(s);
    }

    protected final int b(String s)
    {
        return a.a(s, b, c);
    }

    protected final String c(String s)
    {
        return a.b(s, b, c);
    }

    protected final byte[] d(String s)
    {
        return a.c(s, b, c);
    }

    protected final boolean e(String s)
    {
        return a.d(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof f)
        {
            obj = (f)obj;
            flag = flag1;
            if (x.a(Integer.valueOf(((f) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (x.a(Integer.valueOf(((f) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((f) (obj)).a == a)
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
