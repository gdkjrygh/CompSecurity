// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gt;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class e
{

    protected final DataHolder a_;
    protected final int b;
    private final int c;

    public e(DataHolder dataholder, int i)
    {
        a_ = (DataHolder)gt.a(dataholder);
        boolean flag;
        if (i >= 0 && i < dataholder.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gt.a(flag);
        b = i;
        c = dataholder.a(b);
    }

    public final boolean a_(String s)
    {
        return a_.a(s);
    }

    protected final long b(String s)
    {
        return a_.a(s, b, c);
    }

    protected final int c(String s)
    {
        return a_.b(s, b, c);
    }

    protected final boolean d(String s)
    {
        return a_.d(s, b, c);
    }

    protected final String e(String s)
    {
        return a_.c(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (gq.a(Integer.valueOf(((e) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (gq.a(Integer.valueOf(((e) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((e) (obj)).a_ == a_)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected final byte[] f(String s)
    {
        return a_.e(s, b, c);
    }

    protected final Uri g(String s)
    {
        return a_.f(s, b, c);
    }

    protected final boolean h(String s)
    {
        return a_.g(s, b, c);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a_
        });
    }
}
